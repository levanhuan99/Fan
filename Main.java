package com.codewithme;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("turn on or turn off");
        boolean status=scanner.nextBoolean();

        System.out.println("Enter radius:");
        double radius=scanner.nextDouble();

        System.out.println("Enter color:");
        String color=scanner.next();

        System.out.println("Enter speed:");
        int speed=scanner.nextInt();




        Fan fan=new Fan(speed,radius,color,status);
        if (fan.status()==true){
            System.out.println("Fan is on ."+ fan.getColor()+" color,speed is "+ fan.getSpeed()+",radius is"+fan.getRadius()+" cm");
        }else {
            System.out.println("Fan is off");
        }



    }
}
