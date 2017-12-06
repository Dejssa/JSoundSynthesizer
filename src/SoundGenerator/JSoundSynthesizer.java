package SoundGenerator;


import javax.sound.sampled.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Class provide generation of bit sound like windows beep (WINAPI 7,8,8.1,10), but with more options.
 * @version 1.2
 * @author Dejss
 */
public class JSoundSynthesizer {

    private Clip soundLine;
    private List<byte[]> soundByte = new ArrayList<>();
    private int size = 0;


    private boolean reverse = false;
    private int channel = 2;
    private double angleMult = 1;
    private int sampleRate = 8000;
    private double sampleRateSec = 592.59;

    public void setAngleMult(double angleMult) {
        if(angleMult >= 0.1)
            this.angleMult = angleMult;
    }

    public void setSampleRate(int sampleRate) {
        if(sampleRate >= 0) {
            this.sampleRate = sampleRate;
            sampleRateSec = sampleRate/13.5;
        }
    }

    public void useTwoChannels(boolean twoChannel) {
        this.channel = twoChannel ? 2 : 1;
    }

    public void makeReverse(){
        this.reverse = true;
    }

    public void addTone(int frequency, int duration){
        generateTone(frequency, duration);
    }

    public void addPause(int duration){
        generateTone(sampleRate, duration);
    }

    private byte[] reverseSoundLine(byte[] buff){
        byte[] revers = new byte[this.size];
        for (int i = 0; i < this.size; i++) {
            revers[i] = buff[this.size-1-i];
        }
        return revers;
    }

    Clip  getSoundLine() throws LineUnavailableException{
        return soundLine;
    }

    private void generateTone(int frequency, int duration){

        int intFPW = this.sampleRate/frequency;

        double toByteSize = this.sampleRate/ this.sampleRateSec;
        System.out.println(toByteSize);

        int sizeOfTone = (int)toByteSize*duration;

        byte[] buff = new byte[sizeOfTone];

        for(int i=0; i<sizeOfTone; i++){
            double angle = ((i*2)/((float)intFPW))*(Math.PI);
            buff[i]=getByteValue(this.angleMult*angle);
        }

        this.size+=buff.length;

        soundByte.add(buff);
    }

    private void genBuffer(List<byte[]> buff) throws LineUnavailableException, IOException {

        AudioFormat formatOfPart = new AudioFormat(
                this.sampleRate,
                8,
                this.channel,
                true,
                false
        );

        byte[] newBuff = new byte[this.size];

        int position = 0;

        for (int i = 0; i < buff.size(); i++) {
            System.arraycopy(buff.get(i),0,newBuff,position,buff.get(i).length);
            position+=buff.get(i).length;
        }

        if(reverse)
            newBuff = reverseSoundLine(newBuff);

        byte[] b = newBuff;

        AudioInputStream ais = new AudioInputStream(new ByteArrayInputStream(b), formatOfPart, newBuff.length);

        soundLine.open( ais );
    }

    public void play() throws IOException, LineUnavailableException {
        soundLine = AudioSystem.getClip();
        genBuffer(soundByte);
        PlaySL playSL = new PlaySL(this);
        playSL.startSoundLine();
    }

    /**
     * Finding point in sinusoidal motion
     */
    private static byte getByteValue(double angle) {
        int maxVol = 127;
        return (Integer.valueOf((int)Math.round(Math.cos(angle)*maxVol))).byteValue();
    }

}
