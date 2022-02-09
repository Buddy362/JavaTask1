package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("C:/Users/LENOVO/Downloads/file1.txt"));
        Scanner sc2 = new Scanner(new File("C:/Users/LENOVO/Downloads/file2.txt"));
        int x, y;
        Shape shape1 = new Shape();
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point p1 = new Point(x, y);
            shape1.addPoint(p1);
        }
        System.out.println(shape1.calcPerimeter());
        System.out.println(shape1.longestSide());
        System.out.println(shape1.avg());
        Shape shape2 = new Shape();
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point p2 = new Point(x, y);
            shape2.addPoint(p2);
        }
        System.out.println(shape2.calcPerimeter()); 
        System.out.println(shape2.longestSide());
        System.out.println(shape2.avg());

    }
}
