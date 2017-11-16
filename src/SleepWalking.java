import SoundGenerator.JSoundSynthesizer;

import javax.sound.sampled.*;
import java.io.IOException;

public class SleepWalking {

    public void play() throws IOException, LineUnavailableException {
        song().play();
    }


    private JSoundSynthesizer song()  throws IOException, LineUnavailableException{
        JSoundSynthesizer sound = new JSoundSynthesizer();
        int C1 = 1;
        int C1_= 2;
        int D1 =3;
        int D1_= 4;
        int E1 =5;
        int F1 =6;
        int F1_= 7;
        int G1 =8;
        int G1_= 9;
        int A1 =10;
        int A1_= 11;
        int B1 =12;

        int C2= 13;
        int C2_= 14;
        int D2 =15;
        int D2_= 16;
        int E2 =17;
        int F2 =18;
        int F2_= 19;
        int G2 =20;
        int G2_= 21;
        int A2 =22;
        int A2_= 23;
        int B2 =24;

        int notes[] = {
                0,
                262,
                277,
                587,
                311,
                330,
                349,
                367,
                392,
                415,
                440,
                466,
                494,
                523,
                554,
                587,
                622,
                659,
                698,
                367,
                784,
                830,
                880,
                932,
                987
        };

        sound.addTone(notes[D2],1000);
        sound.addTone(notes[C2], 500);
        sound.addTone(notes[D2], 500);
        sound.addTone(notes[A1], 500);
        sound.addTone(notes[A1_], 250);
        sound.addTone(notes[C2], 750);
        sound.addTone(notes[A1_], 250);
        sound.addTone(notes[A1_], 250);
        sound.addTone(notes[A1], 1000);
        sound.addTone(notes[F2], 500);
        sound.addTone(notes[A1], 500);
        sound.addTone(notes[G1], 500);
        sound.addTone(notes[F2], 500);
        sound.addTone(notes[E2], 500);
        sound.addTone(notes[F2], 500);

        sound.addTone(notes[D2], 1000);
        sound.addTone(notes[C2], 500);
        sound.addTone(notes[D2], 500);
        sound.addTone(notes[A1], 500);
        sound.addTone(notes[A1_], 250);
        sound.addTone(notes[C2], 750);
        sound.addTone(notes[A1_], 250);
        sound.addTone(notes[A1_], 250);
        sound.addTone(notes[A1], 1000);
        sound.addTone(notes[F2], 500);
        sound.addTone(notes[A1], 500);
        sound.addTone(notes[G1], 500);
        sound.addTone(notes[F2], 500);
        sound.addTone(notes[E2], 500);
        sound.addTone(notes[F2], 500);

        sound.addTone(notes[D2], 750);
        sound.addTone(notes[C2], 500);
        sound.addPause(250);
        sound.addTone(notes[A1_], 500);
        sound.addTone(notes[A1], 1500);
        sound.addTone(notes[A1_], 500);
        sound.addTone(notes[A1], 750);
        sound.addTone(notes[F2], 1000);
        sound.addTone(notes[A1], 250);
        sound.addTone(notes[G1], 750);
        sound.addTone(notes[F1], 250);
        sound.addTone(notes[E2], 500);
        sound.addTone(notes[F2], 500);
        sound.addPause(500);


        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 500);
        sound.addPause(500);
        sound.addTone(notes[F2], 250);
        sound.addTone(notes[G2], 500);
        sound.addTone(notes[F2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[G2], 250);
        sound.addPause(250);
        sound.addTone(notes[F2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[G2], 500);
        sound.addTone(notes[F2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[G2], 250);
        sound.addPause(250);
        sound.addTone(notes[F2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[G2], 500);
        sound.addTone(notes[F2], 500);
        sound.addPause(250);
        sound.addPause(500);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addPause(250);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 1000);
        sound.addTone(notes[F2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2_], 250);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[G2], 500);
        sound.addTone(notes[A2_], 1000);


        sound.addTone(notes[A2], 500);
        sound.addPause(500);
        sound.addTone(notes[A2], 1000);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addPause(250);
        sound.addTone(notes[A2], 1000);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2_], 250);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[F2], 500);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2_], 750);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 750);
        sound.addTone(notes[A2], 1000);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addPause(250);
        sound.addTone(notes[A2], 1000);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2], 250);
        sound.addTone(notes[A2_], 250);
        sound.addTone(notes[A2], 500);
        sound.addTone(notes[G2], 500);
        sound.addTone(notes[A2_], 1000);
        sound.addTone(notes[A2], 1000);
        
        return sound;
    }
}


