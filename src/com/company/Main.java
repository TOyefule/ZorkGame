package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int counter = 0;
    public static int total_money;
    public static ArrayList<String> contains = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("!-------------------------------!");
        System.out.println("!*******************************!");
        System.out.println("!*****WELCOME TO THE PROGRAM****!");
        System.out.println("!*******************************!");
        System.out.println("!-------------------------------!");
        foyer();

    }
    public static void foyer() {
        counter++;
        while(true){
            System.out.println("You are in the Foyer");
            System.out.println("What room wold you like to travel to?..(NORTH|N)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();
            if (choice.equalsIgnoreCase("N")||choice.equalsIgnoreCase("North")){
                frontroom();
            }else if (choice.equalsIgnoreCase("q")){
                exit();
            }
            else {
                System.out.println("please enter the correct inputs");
            }
        }
    }
    public static void frontroom(){
        counter++;
        while(true){
            System.out.println("You are in the Front Room");
            System.out.println("What room wold you like to travel to?..(SOUTH|S)(WEST|W)(EAST|E)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = " ";
            choice = direction.nextLine();
            if (choice.equalsIgnoreCase("S")||choice.equalsIgnoreCase("SOUTH")){
                foyer();}
            else if (choice.equalsIgnoreCase("W")||choice.equalsIgnoreCase("WEST")){
                    library();}
            else if (choice.equalsIgnoreCase("E")||choice.equalsIgnoreCase("EAST")){
                        kitchen();}
            else if (choice.equalsIgnoreCase("q")){
                exit();
            }
            else {
                System.out.println("please enter the correct inputs");
            }
        }
    }
    public static void library() {
        counter++;
        while (true){
            System.out.println("You are in the Library");
            System.out.println("What room wold you like to travel to?..(EAST|E)(NORTH|N)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();
            if (choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("EAST")) {
                frontroom();}
            else if (choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("NORTH")) {
                dining_room();}
             else if (choice.equalsIgnoreCase("q")) {
               exit();
            } else {
                System.out.println("please enter the correct inputs");
            }
        }
    }
    public static void kitchen(){
        counter++;
        while (true){
            System.out.println("You are in the Kitchen");
            System.out.println("What room wold you like to travel to?..(WEST|W)(NORTH|N)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();
            if (choice.equalsIgnoreCase("W") || choice.equalsIgnoreCase("WEST")) {
                frontroom();}
            else if (choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("NORTH")) {
                parlor();}
            else if (choice.equalsIgnoreCase("q")) {
                exit();
            } else {
                System.out.println("please enter the correct inputs");
            }
        }
    }
    public static void dining_room(){
        counter++;
        while (true){
            System.out.println("You are in the Dining Room");
            System.out.println("What room wold you like to travel to?..(WEST|W)(NORTH|N)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();
            if (choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("NORTH")) {
                library();}
            else if (choice.equalsIgnoreCase("W") || choice.equalsIgnoreCase("WEST")) {
                library();}
            else if (choice.equalsIgnoreCase("q")) {
                exit();}
            else {
                System.out.println("please enter the correct inputs");
            }
        }
    }
    public static void vault(){
        counter++;
        int rand = (int) (Math.random()*100+1);
        while (true){
            System.out.println("You are in the Vault");
            System.out.println("What room wold you like to travel to?..(EAST|E)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();
            if (choice.equalsIgnoreCase("East")||(choice.equalsIgnoreCase("E"))){
                if(rand<=75) { parlor(); }
                else if (rand > 75) { secret_room(); }
            }
            else if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
                System.out.println("please enter the correct inputs");
            }
        }
    }
    public static void parlor(){
        counter++;
        while(true){
            System.out.println("You are in the Parlor");
            System.out.println("What room wold you like to travel to?..(WEST|W)(SOUTH|S)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();

            if (choice.equalsIgnoreCase("W") || choice.equalsIgnoreCase("WEST")) {
                vault(); }
            if (choice.equalsIgnoreCase("S") || choice.equalsIgnoreCase("SOUTH")) {
                kitchen(); }
            else if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
                System.out.println("please enter the correct inputs");
        }
        }
    }
    public static void secret_room(){
        counter++;
        while(true){
            System.out.println("You are in the Secret Room");
            System.out.println("What room wold you like to travel to?..(WEST|W)");
            System.out.println("Press Q to exit Room");
            Scanner direction = new Scanner(System.in);
            String choice = "";
            choice = direction.nextLine();

            if (choice.equalsIgnoreCase("W") || choice.equalsIgnoreCase("WEST")) {
                secret_room(); }
            else if (choice.equalsIgnoreCase("q")) {
                exit();
            } else {
                System.out.println("please enter the correct inputs");
        }
        }

    }
    public static void exit(){
        System.out.println("YOU HAVE VISITED "+counter+" ROOM");
        System.out.println("YOU HAVE $"+total_money+" AMOUNT OF MONEY");
        System.out.println("THE ITEMS YOU HAVE SEEN INCLUDE: " +contains);
        System.out.println("Thank you for playing");
        System.exit(0);

}

}
