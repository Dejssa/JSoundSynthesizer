import SoundGenerator.JSoundSynthesizer;

import javax.sound.sampled.*;
import java.io.IOException;

public class Tests {

    public static void main(String[] args) throws InterruptedException{
        JSoundSynthesizer sound;
        try {
            //sound.addTone(500,500);
            //sound.addTone(450,1000);
            sound = PiratesOfTheCarribian();


            //sound = SleepWalker();

            sound.play();

        } catch (LineUnavailableException e ) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
//    private static JSoundSynthesizer waves() throws IOException, LineUnavailableException{
//        int C1 = 1;
//        int C1_= 2;
//        int D1 =3;
//        int D1_= 4;
//        int E1 =5;
//        int F1 =6;
//        int F1_= 7;
//        int G1 =8;
//        int G1_= 9;
//        int A1 =10;
//        int A1_= 11;
//        int B1 =12;
//
//        int C2= 13;
//        int C2_= 14;
//        int D2 =15;
//        int D2_= 16;
//        int E2 =17;
//        int F2 =18;
//        int F2_= 19;
//        int G2 =20;
//        int G2_= 21;
//        int A2 =22;
//        int A2_= 23;
//        int B2 =24;
//
//        int notes[] = {
//                0,
//                262,
//                277,
//                587,
//                311,
//                330,
//                349,
//                367,
//                392,
//                415,
//                440,
//                466,
//                494,
//                523,
//                554,
//                587,
//                622,
//                659,
//                698,
//                367,
//                784,
//                830,
//                880,
//                932,
//                987
//        };
//
//        JSoundSynthesizer sound = new JSoundSynthesizer(16000);
//
//
//        sound.addTone(notes[D2],1000);
//        sound.addTone(notes[C2], 500);
//        sound.addTone(notes[D2], 500);
//
//        return sound;
//    }
    
    private static JSoundSynthesizer PiratesOfTheCarribian() throws IOException, LineUnavailableException {
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
        sound.angleMult = 0.5;
        sound.sampleRate = 8000;



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


    private static JSoundSynthesizer SleepWalker()  throws IOException, LineUnavailableException{
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

        sound.angleMult = 5.0;
        sound.sampleRate = 8000;

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


