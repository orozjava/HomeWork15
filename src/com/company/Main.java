package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        Circle circle = new Circle();
        Circle.area(rd.nextDouble());
        Circle.circumference(rd.nextDouble());

    }

}
