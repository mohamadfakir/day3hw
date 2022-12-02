package com.linecomparisionproblem;

import java.util.Scanner;

public class LineComparison {

        public static void main(String[] args) {
            System.out.println("~~WELCOME TO LINE COMPARISON COMPUTATION PROGRAM~~");
            Scanner sc = new Scanner(System.in);// creating object
            System.out.println("Enter Value X1 X2 Y1 Y2");  //Printing enter values

            //Input integers and calling the nextInt
            Scanner scanner = null;
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int y2 = scanner.nextInt();
            double length;

            length = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            System.out.println("Length Of line: "+length);

        }
    }

