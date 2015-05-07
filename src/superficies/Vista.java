package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Vista {

    private static Scanner sc1, sc2, sc3;
    static float result;

    public Vista() {

    }

    /**
     * 
     * @param type to get "type" then can print the messaje.
     */
    public static void printFinally(Modelo type) {
        switch (type.getType()) {
            case "square":
                JOptionPane.showMessageDialog(null, "The area for your square: " + result);
                break;
            case "circle":
                JOptionPane.showMessageDialog(null, "Your Circles area is " + result);
                break;
            case "triangle":
                JOptionPane.showMessageDialog(null, "Your triangle area is: " + result);
                break;
            case "rectangle":
                JOptionPane.showMessageDialog(null, "The area for your rectangle is: " + result);
                break;
        }
    }

    /**
     * 
     * @param type "class Modelo" then getType
     * @return result 
     */
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
     * Capture parameters to start the program
     */
    public static void run() {
        Modelo contenedor = new Modelo();
        contenedor.shapeType = JOptionPane.showInputDialog("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        contenedor.sideLength = Float.parseFloat(JOptionPane.showInputDialog("Side Length"));
        contenedor.sideHeight = Float.parseFloat(JOptionPane.showInputDialog("Side Height"));
        contenedor.setResult(choose(contenedor));
        printFinally(contenedor);
    }

}
