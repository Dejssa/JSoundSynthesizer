package SoundGenerator;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;
import java.util.Queue;

/**
 * Class provide generation of bit sound like windows beep (WINAPI 7,8,8.1,10), but with more options.
 * @version 1.2
 * @author Dejss
 */
class PlaySL{

    private Clip soundLine;

    public PlaySL(JSoundSynthesizer soundLineClass) throws IOException, LineUnavailableException {
        this.soundLine = soundLineClass.getSoundLine();
    }

    public void startSoundLine(){
        Thread player = new Thread(new Player());
        player.start();
    }


    private class Player implements Runnable{

        @Override
        public void run() {
                long sleepTime = (soundLine.getMicrosecondLength()/1000);

                if(soundLine != null) {
                    System.out.println("Sound length (ms): " + sleepTime);
                    soundLine.start();
                    long s = System.nanoTime();

                    while (soundLine.isOpen()){
                        try {
                            Thread.sleep(sleepTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        soundLine.close();
                    }
                    System.out.println("time : " + (System.nanoTime() - s) / 1000000000.0);

                }


        }

    }

}

