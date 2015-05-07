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

    public Vista() {
        
    }

    public static float choose(Modelo type) {
        float resultado;
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        switch (type.getType()) {
            case "square":
                resultado = type.getNum1() * type.getNum2();
                break;
            case "circle":
                resultado = type.getNum1() * type.getNum2();
                resultado = (float) (3.14159265 * resultado);
                break;
            case "triangle":
                resultado = (float) (0.5 * type.getNum1() * type.getNum2());;
                break;
            case "rectangle":
                resultado = type.getNum1() * type.getNum2();
                break;
            default:
                resultado = 0;
        }
        return resultado;
    }

    /**
     *
     * @return float number to use.
     */
    public static float setNumber() {
        sc = new Scanner(System.in);
        System.out.println("what is the length?");
        return sc.nextFloat();
    }

}
