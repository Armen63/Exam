package am.aca.Exam.controller;

import am.aca.Exam.comman.model.StaticVariables;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Armen on 9/6/2016.
 */
public class Controller {
    StaticVariables var = new StaticVariables();

    public void executor() {
        Scanner input = new Scanner(System.in);
        String comman;
        comman = input.nextLine();

        System.out.println(var.welcome);

        while (true) {
            switch (comman) {
                case "Sign Up":
                    signUp();
                    break;
                case "Sign In":
                    signIn();
                    break;
                case "Play":
                    play();
                    break;
                case "Pause":
                    pause();
                    break;
                case "Random Music":
                    randomMusic();
                    break;
                case "Next Music":
                    nextMusic();
                    break;
                case "Previos Music":
                    preiosMusic();
                    break;
                case "Random Song":
                    randomSong();
                    break;
                case "Suggest music":
                    suggestMusic();
                    break;
                case "Stop":
                    stop();
                    break;
                case "Mark":
                    markedMusics(); //inch vor kerp nshi  mi qnai ergu dranq lsi
                    break;
                case "Search":
                    search();
                    break;

            }
        }
    }

    private void search() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); // miacni et erg@

    }

    private void markedMusics() {
    }

    private void stop() {
    }

    private void play() {
    }

    private void suggestMusic() {
        Scanner scann = new Scanner(System.in);
        System.out.print(var.mood);
        if(scann.nextLine().equals("Urax"))
            urax();
        else if(scann.nextLine().equals("txoor"))
            txur();
        else if(scann.nextLine().equals("mijin"))
            mijin();
    }

    private void mijin() { // chgitem tramadrutyunic vonc kaxvac piti lini gnahatum@ vor ergerr@ daskargi bayc mitq ekav senc :)
    }

    private void txur() {
    }

    private void urax() {
    }

    private void randomSong() {
    }

    private void preiosMusic() {
    }

    private void nextMusic() {
    }

    private void randomMusic() {
    }

    private void signUp() {
    }
    private void signIn(){
        
    }
    private void pause(){
        
    }
    
    
}