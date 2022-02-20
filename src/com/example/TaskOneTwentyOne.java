/* "Task 1.21" Floor-space of the room

Residents of the Malevia country often experiment with the plan of their rooms.
Rooms can be triangular, rectangular and round. To quickly calculate the floorage
it is required to write a program, which gets the type of the room shape and the
relevant parameters as input - the program should output the area of the resulting room.

The value of 3.14 is used instead of the number π in Malevia.

Input format used by the Malevians:
triangle
a
b
c
where a, b and c — lengths of the triangle sides.

rectangle
a
b
where a and b —lengths of the rectangle sides.

circle
r
where r — circle radius.
 */


package com.example;

import java.util.Scanner;

public class TaskOneTwentyOne {
    public static void main (String[] args) {
        double firstSide, secondSide, thirdSide;
        Scanner scanner = new Scanner(System.in);
        String nameShape = scanner.nextLine();
        switch (nameShape) {
            case "triangle":
                firstSide = scanner.nextDouble();
                secondSide = scanner.nextDouble();
                thirdSide = scanner.nextDouble();
                System.out.println(areaTriangle(firstSide, secondSide, thirdSide));
                break;

            case "rectangle":
                firstSide = scanner.nextDouble();
                secondSide = scanner.nextDouble();
                System.out.println(areaRectangle(firstSide, secondSide));
                break;

            case "circle":
                double numberPi = 3.14;
                double circleRadius = scanner.nextDouble();
                System.out.println(areaCircle(numberPi, circleRadius));
                break;

            default:
                System.out.println("shape is not found");
        }

    }

    public static double areaTriangle (double firstSide, double secndSide, double thirdSide) {
        double halfPerimeter = (firstSide+secndSide+thirdSide)/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter-firstSide)*(halfPerimeter-secndSide)*(halfPerimeter-thirdSide));
        return area;
    }

    public static double areaRectangle (double firstSide, double senondSide) {
        double area = firstSide*senondSide;
        return area;
    }

    public static double areaCircle (double numberPi, double circleRadius) {
        double area = numberPi*(Math.pow(circleRadius, 2));
        return area;
    }

}
