import SoundGenerator.JSoundSynthesizer;

import javax.sound.sampled.*;
import java.io.IOException;
/**
* All tones was getted from http://cncpp.divilabs.com/2013/12/c-code-for-mario-theme-intro-song.html
*/
public class Mario {

   public void play() throws IOException, LineUnavailableException {
        theme().play();
   }

   private JSoundSynthesizer theme(){
      

       JSoundSynthesizer synthesizer = new JSoundSynthesizer();

       synthesizer.addTone (330,100);synthesizer.addPause(100);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (392,100);synthesizer.addPause(700);
       synthesizer.addTone (196,100);synthesizer.addPause(700);
       synthesizer.addTone (262,300);synthesizer.addPause(300);
       synthesizer.addTone (196,300);synthesizer.addPause(300);
       synthesizer.addTone (164,300);synthesizer.addPause(300);
       synthesizer.addTone (220,300);synthesizer.addPause(100);
       synthesizer.addTone (246,100);synthesizer.addPause(300);
       synthesizer.addTone (233,200);
       synthesizer.addTone (220,100);synthesizer.addPause(300);
       synthesizer.addTone (196,100);synthesizer.addPause(150);
       synthesizer.addTone (330,100);synthesizer.addPause(150);
       synthesizer.addTone (392,100);synthesizer.addPause(150);
       synthesizer.addTone (440,100);synthesizer.addPause(300);
       synthesizer.addTone (349,100);synthesizer.addPause(100);
       synthesizer.addTone (392,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(100);
       synthesizer.addTone (247,100);synthesizer.addPause(500);
       synthesizer.addTone (262,300);synthesizer.addPause(300);
       synthesizer.addTone (196,300);synthesizer.addPause(300);
       synthesizer.addTone (164,300);synthesizer.addPause(300);
       synthesizer.addTone (220,300);synthesizer.addPause(100);
       synthesizer.addTone (246,100);synthesizer.addPause(300);
       synthesizer.addTone (233,200);
       synthesizer.addTone (220,100);synthesizer.addPause(300);
       synthesizer.addTone (196,100);synthesizer.addPause(150);
       synthesizer.addTone (330,100);synthesizer.addPause(150);
       synthesizer.addTone (392,100);synthesizer.addPause(150);
       synthesizer.addTone (440,100);synthesizer.addPause(300);
       synthesizer.addTone (349,100);synthesizer.addPause(100);
       synthesizer.addTone (392,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(100);
       synthesizer.addTone (247,100);synthesizer.addPause(900);
       synthesizer.addTone (392,100);synthesizer.addPause(100);
       synthesizer.addTone (370,100);synthesizer.addPause(100);
       synthesizer.addTone (349,100);synthesizer.addPause(100);
       synthesizer.addTone (311,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (207,100);synthesizer.addPause(100);
       synthesizer.addTone (220,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (220,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(500);
       synthesizer.addTone (392,100);synthesizer.addPause(100);
       synthesizer.addTone (370,100);synthesizer.addPause(100);
       synthesizer.addTone (349,100);synthesizer.addPause(100);
       synthesizer.addTone (311,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (523,100);synthesizer.addPause(300);
       synthesizer.addTone (523,100);synthesizer.addPause(100);
       synthesizer.addTone (523,100);synthesizer.addPause(1100);
       synthesizer.addTone (392,100);synthesizer.addPause(100);
       synthesizer.addTone (370,100);synthesizer.addPause(100);
       synthesizer.addTone (349,100);synthesizer.addPause(100);
       synthesizer.addTone (311,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (207,100);synthesizer.addPause(100);
       synthesizer.addTone (220,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (220,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(500);
       synthesizer.addTone (311,300);synthesizer.addPause(300);
       synthesizer.addTone (296,300);synthesizer.addPause(300);
       synthesizer.addTone (262,300);synthesizer.addPause(1300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(300);
       synthesizer.addTone (330,200);synthesizer.addPause(50);
       synthesizer.addTone (262,200);synthesizer.addPause(50);
       synthesizer.addTone (220,200);synthesizer.addPause(50);
       synthesizer.addTone (196,100);synthesizer.addPause(700);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(100);
       synthesizer.addTone (330,100);synthesizer.addPause(700);
       synthesizer.addTone (440,100);synthesizer.addPause(300);
       synthesizer.addTone (392,100);synthesizer.addPause(500);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (294,100);synthesizer.addPause(300);
       synthesizer.addTone (330,200);synthesizer.addPause(50);
       synthesizer.addTone (262,200);synthesizer.addPause(50);
       synthesizer.addTone (220,200);synthesizer.addPause(50);
       synthesizer.addTone (196,100);synthesizer.addPause(700);
        /*Intro*/
       synthesizer.addTone (330,100);synthesizer.addPause(100);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (262,100);synthesizer.addPause(100);
       synthesizer.addTone (330,100);synthesizer.addPause(300);
       synthesizer.addTone (392,100);synthesizer.addPause(700);
       synthesizer.addTone (196,100);synthesizer.addPause(700);
       synthesizer.addTone (196,100);synthesizer.addPause(125);
       synthesizer.addTone (262,100);synthesizer.addPause(125);
       synthesizer.addTone (330,100);synthesizer.addPause(125);
       synthesizer.addTone (392,100);synthesizer.addPause(125);
       synthesizer.addTone (523,100);synthesizer.addPause(125);
       synthesizer.addTone (660,100);synthesizer.addPause(125);
       synthesizer.addTone (784,100);synthesizer.addPause(575);
       synthesizer.addTone (660,100);synthesizer.addPause(575);
       synthesizer.addTone (207,100);synthesizer.addPause(125);
       synthesizer.addTone (262,100);synthesizer.addPause(125);
       synthesizer.addTone (311,100);synthesizer.addPause(125);
       synthesizer.addTone (415,100);synthesizer.addPause(125);
       synthesizer.addTone (523,100);synthesizer.addPause(125);
       synthesizer.addTone (622,100);synthesizer.addPause(125);
       synthesizer.addTone (830,100);synthesizer.addPause(575);
       synthesizer.addTone (622,100);synthesizer.addPause(575);
       synthesizer.addTone (233,100);synthesizer.addPause(125);
       synthesizer.addTone (294,100);synthesizer.addPause(125);
       synthesizer.addTone (349,100);synthesizer.addPause(125);
       synthesizer.addTone (466,100);synthesizer.addPause(125);
       synthesizer.addTone (587,100);synthesizer.addPause(125);
       synthesizer.addTone (698,100);synthesizer.addPause(125);
       synthesizer.addTone (932,100);synthesizer.addPause(575);
       synthesizer.addTone (932,100);synthesizer.addPause(125);
       synthesizer.addTone (932,100);synthesizer.addPause(125);
       synthesizer.addTone (932,100);synthesizer.addPause(125);
       synthesizer.addTone (1046,675);

       return synthesizer;
   }
}


