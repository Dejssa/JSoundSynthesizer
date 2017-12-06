import SoundGenerator.JSoundSynthesizer;
import java.util.*;

import javax.sound.sampled.*;
import java.io.IOException;

public class Tests {

    public static void main(String[] args) throws InterruptedException{
        try {
            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()){
                case "Mario":
                    new Mario().play();
                    break;
                case "SleepWalking":
                    new SleepWalking().play();
                    break;
                case "Pirates":
                    new PiratesOfTheCaribbean().play();
                    break;
                default:
                    break;
            }

        } catch (Exception e ) {
            e.printStackTrace();
        }



    }
}


