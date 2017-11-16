import SoundGenerator.JSoundSynthesizer;

import javax.sound.sampled.*;
import java.io.IOException;

public class PiratesOfTheCaribbean {
 // 1 string
       Integer _1_0 = 320;
       Integer _1_1 = 350;
       Integer _1_2 = 370;
       Integer _1_3 = 392;
       Integer _1_4 = 415;
       Integer _1_5 = 440;
       Integer _1_6 = 466;
       // 2 string
       Integer _2_0 = 247;
       Integer _2_1 = 262;
       Integer _2_2 = 277;
       Integer _2_3 = 294;
       Integer _2_4 = 311;

       //Integer E4 = 329.63;
       Integer F4 = 349;
       //Integer G4 = 391.995;

       // 3 string
       Integer _3_0 = 196;
       Integer _3_1 = 208;
       Integer _3_2 = 220;
       Integer _3_3 = 233;
       //Integer _3_4 = 247;
       //Integer B3 = 246.94;
       Integer C4 = 261;
       Integer D4 = 294;

       // 4 string
       Integer _4_0  = 147;
       Integer _4_1  = 156;
       Integer _4_2  = 165;
       Integer _4_3  = 175;
       Integer _4_4  = 185;
       //Integer G3 = 196.00;
       Integer A3 =     220;

       // 5 string
       Integer A2 = 110;
       Integer B2 = 123;
       Integer C3 = 131;
       //Integer D3 = 146.832;


       // 6 string
       Integer E2 = 82;

       Integer part = 600;

       Integer full = part;
       Integer half = part/2;
       Integer quarter = part/4;
       Integer quartQuart = part/16;
    public void play() throws IOException, LineUnavailableException {
        song().play();
    }


    private static JSoundSynthesizer song() throws IOException, LineUnavailableException {
        // 1 string
        int E4 = 320;
        int G4 = 392;
        int G4_s = 415;
        int A4 = 440;
        int A4_s = 466;

        // 2 string
        int B3 = 247;

        //int E4 = 329.63;
        int F4 = 349;
        //int G4 = 391.995;

        // 3 string
        int G3 = 196;

        int B3_b = 247;
        //int B3 = 246.94;
        int C4 = 261;
        int D4 = 294;

        // 4 string
        int D3 = 147;

        //int G3 = 196.00;
        int A3 = 	220;

        // 5 string
        int A2 = 110;
        int B2 = 123;
        int C3 = 131;
        //int D3 = 146.832;


        // 6 string
        int E2 = 82;

        int part = 400;

        int full = part;
        int half = part/2;
        int quarter = part/4;
        int quartQuart = part/16;

        JSoundSynthesizer sound = new JSoundSynthesizer();

        sound.addTone(D3,half);
        sound.addPause(half);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,half);
        sound.addPause(full);

        sound.addTone(D3,half);
        sound.addPause(half);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,half);
        sound.addPause(full);

        sound.addTone(D3,half);
        sound.addPause(half);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,half);
        sound.addPause(full);

        sound.addTone(D3,half);
        sound.addPause(half);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);


        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);

        sound.addTone(D3,half);
        sound.addPause(full);

        sound.addTone((D3+D4)/2,half);
        sound.addPause(full);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);
        sound.addTone(C4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addTone(E4,quarter);
        sound.addPause(quarter);

        sound.addTone(F4,quarter);
        sound.addPause(quarter);

        sound.addTone(F4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(F4,quarter);
        sound.addPause(quarter);

        sound.addTone(G4,quarter);
        sound.addPause(quarter);

        sound.addTone(E4	,quarter);
        sound.addPause(quarter);

        sound.addTone(E4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addTone(C4,quarter);
        sound.addPause(quarter);

        sound.addTone(C4,half);
        sound.addTone(D4,half);

        sound.addPause(half);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);
        sound.addTone(C4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addTone(E4,quarter);
        sound.addPause(quarter);

        sound.addTone(F4,quarter);
        sound.addPause(quarter);

        sound.addTone(F4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(F4,quarter);
        sound.addPause(quarter);

        sound.addTone(G4,quarter);
        sound.addPause(quarter);

        sound.addTone(E4	,quarter);
        sound.addPause(quarter);

        sound.addTone(E4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addTone(C4,quarter);
        sound.addPause(quarter);

        sound.addTone(C4,half);
        sound.addTone(D4,half);

        sound.addTone(D3,quarter);
        sound.addPause(quarter);
        sound.addTone(C4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(D4,quarter);
        sound.addPause(quarter);
        sound.addTone(F4,quarter);
        sound.addPause(quarter);
        sound.addTone(G4,quarter);
        sound.addPause(quarter);
        sound.addTone(G4,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(G4,quarter);
        sound.addPause(quarter);
        sound.addTone(A4,quarter);
        sound.addPause(quarter);
        sound.addTone(A4_s,quarter);
        sound.addPause(quarter);
        sound.addTone(A4_s,quarter);
        sound.addPause(quarter);

        sound.addPause(half);

        sound.addTone(A4,quarter);
        sound.addPause(quarter);
        sound.addTone(G4,quarter);
        sound.addPause(quarter);
        sound.addTone(A4,quarter);
        sound.addPause(quarter);
        sound.addTone(D4,quarter);
        sound.addPause(quarter);
        
        return sound;
    }
}


