package com.vda.company;

import java.util.Scanner;

public class Main {
    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);
    static int [][] battlefield1 = new int[10][10];
    static int [][] battlefield2 = new int[10][10];

    public static void main(String[] args) {
       // System.out.println("Player 1, please enter your name:");
       // playerName1=scanner.nextLine();
       // System.out.println("Player 2, please enter your name:");
       // playerName2=scanner.nextLine();
        drawField();
        }

        public static void drawField(){
        System.out.println();
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for(int i=0;i<10;i++){
            System.out.println(i + " - - - - - - - - - -");
        }
    }
}

