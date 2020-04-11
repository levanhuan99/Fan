package com.codewithme;

public class Fan {
    final int slow=1;
    final int medium=2;
    final int fast=3;
    private int speed;
    private double radius;
    private String color="blue";
    boolean on;

    public Fan(int speed, double radius,String color,boolean on){
        this.speed=speed;
        this.color=color;
        this.radius=radius;
        this.on=on;
    }


    public boolean status(){

        return this.on;
    }
    public double getRadius(){

        return this.radius;
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getColor(){
        return this.color;
    }
}
