package com.revature.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        List<Rectangle> rectangles = new ArrayList<>();

//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter in rectangle name: ");
//            Rectangle rect = new Rectangle(scan.nextLine(), rand.nextInt(1000), rand.nextInt(1000));
//            rectangles.add(rect);
//        }
//
//        System.out.println();
//
//        for (Rectangle rect : rectangles) {
//            System.out.println(rect);
//        }
//
//        System.out.println("\nMax area: " + new Rectangle().findMaxArea(rectangles, new Comparator()));
//        System.out.println("\nMax perimeter: " + new Rectangle().findMaxPerimeter(rectangles, new Comparator()));

        Rectangle rect = new Rectangle("1", -1, -1);

    }
}
