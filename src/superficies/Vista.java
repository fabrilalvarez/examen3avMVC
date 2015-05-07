/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Vista {

    private static Scanner sc;
    static float result;

    public Vista() {

    }

    public static void printFinally(Modelo type) {
        switch (type.getType()) {
            case "square":
                System.out.println("The area for your square: " + result);
                break;
            case "circle":
                System.out.println("Your Circles area is " + result);
                break;
            case "triangle":
                System.out.println("Your triangle area is: " + result);
                break;
            case "rectangle":
                System.out.println("The area for your rectangle is: " + result);
                break;
        }
    }

    public static float choose(Modelo type) {
        switch (type.getType()) {
            case "square":
                result = type.getNum1() * type.getNum2();
                break;
            case "circle":
                result = type.getNum1() * type.getNum2();
                result = (float) (3.14159265 * result);
                break;
            case "triangle":
                result = (float) (0.5 * type.getNum1() * type.getNum2());
                break;
            case "rectangle":
                result = type.getNum1() * type.getNum2();

                break;
            default:
                result = 0;
        }
        return result;
    }

    /**
     *
     * @return float number to use.
     */
    public static float setLength() {
        sc = new Scanner(System.in);
        System.out.println("what is the length?");
        return sc.nextFloat();
    }

    /**
     * 
     * @return choose type (square, circle, triangle, rectangle)
     */
    public static String setType() {
        sc = new Scanner(System.in);
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        return sc.next();
    }

}
