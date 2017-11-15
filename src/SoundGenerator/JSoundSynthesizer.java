package SoundGenerator;


import javax.sound.sampled.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

/**
 * Class provide generation of bit sound like windows beep (WINAPI 7,8,8.1,10), but with more options.
 * @version 1.2
 * @author Dejss
 */
public class JSoundSynthesizer {

    private Clip soundLine;
    private List<byte[]> soundByte = new ArrayList<>();
    private int size = 0;

    /**
     * angleMult from 0.1
     */
    public double angleMult = 1;
    public int sampleRate = 8000;
    private int channel = 2;
    public void twoChannel(boolean twoChannel) {
        if(twoChannel)
            this.channel = 2;
        else
            this.channel = 1;
    }

    public void addTone(int frequency, int duration) throws LineUnavailableException, IOException {
        generateTone(frequency, duration);
    }

    public void addPause(int duration) throws LineUnavailableException, IOException {
        generateTone(sampleRate, duration);
    }

    Clip  getSoundLine() throws LineUnavailableException{
        return soundLine;
    }

    private void generateTone(int frequency, int duration) throws LineUnavailableException, IOException {

        int intFPW = this.sampleRate/frequency;

        double SRconvert = 592.59;

        double toByteSize = this.sampleRate/SRconvert;

        int sizeOfTone = (int)toByteSize*duration;

        byte[] buff = new byte[sizeOfTone];

        for(int i=0; i<sizeOfTone; i++){
            double angle = ((i*2)/((float)intFPW))*(Math.PI);
            buff[i]=getByteValue(angle);
            buff[(i)]=getByteValue(this.angleMult*angle);
        }
        this.size+=buff.length;

        //System.out.println(buff.length);

        soundByte.add(buff);
    }

    private void generateClip(List<byte[]> buff) throws LineUnavailableException, IOException {
        soundLine = AudioSystem.getClip();

        AudioFormat formatOfPart = new AudioFormat(
                this.sampleRate,
                8,
                this.channel,
                true,
                false
        );
        System.out.println("Byte array size : " + this.size);
        byte[] newBuff = new byte[this.size];
        int position = 0;

        for (int i = 0; i < buff.size(); i++) {
            System.arraycopy(buff.get(i),0,newBuff,position,buff.get(i).length);
            position+=buff.get(i).length;
        }

        //System.out.println(Arrays.toString(newBuff));
        byte[] b = newBuff;
        AudioInputStream ais = new AudioInputStream(new ByteArrayInputStream(b), formatOfPart, newBuff.length);
        soundLine.open( ais );
    }

    public void play() throws IOException, LineUnavailableException {
        generateClip(soundByte);
        PlaySL playSL = new PlaySL(this);
        playSL.startSoundLine();
    }

    /**
     * Finding point in sinusoidal motion
     */
    private static byte getByteValue(double angle) {
        int maxVol = 127;
        return (Integer.valueOf((int)Math.round(Math.sin(angle)*maxVol))).byteValue();
    }
}
