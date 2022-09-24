package com.linecomparison;

import java.util.Scanner;


public class LineComparison {
    public static double lengthOfLine(double x1, double x2, double y1, double y2) { // UC1 to check the Length of the Line
        double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.print("Distance between "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===> ");

        return dis;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line 1 Coordinates:");

        System.out.println("Enter x1 y1:");
        double x1 = sc.nextDouble();
        double y1 = sc. nextDouble();

        System.out.println("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Length of Line1 is : ");// Line1 Length
       double line1 = lengthOfLine(x1,x2,y1,y2);
        System.out.println(line1);

        System.out.println("");
        System.out.println("");
        System.out.println("Enter Line 2 Coordinates:");// Line2 Length

        System.out.println("Enter x1 y1:");
        double a1 = sc.nextDouble();
        double b1 = sc. nextDouble();

        System.out.println("Enter x2 y2: ");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        System.out.print("Length of Line2 is : ");
        double line2 = lengthOfLine(a1,a2,b1,b2);
        System.out.println(line2);

        Double obj1 = line1;
        Double obj2 = line2;
        if(obj1.equals(obj2)){ // UC2 to check equality of line1 and line2
            System.out.println("Lengths of Line1 and Line 2 are same");
        }
        else{
                System.out.println("Lengths of Line1 and Line2 are not same");
            }
        System.out.println();
        System.out.println(obj2.compareTo(obj1));

        // if output is 0 the length is same
        // if output is 1 then the length of line2 is greater than line1
        // if output is -1 then the length of line1 is greater than line2
    }
}
