package com.codegym;

public class Main {

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 5, 5);
        System.out.println(moveablePoint);
        for (int i = 0; i < 10; i++) {
            moveablePoint.move();
            System.out.println(moveablePoint);
        }
    }
}
