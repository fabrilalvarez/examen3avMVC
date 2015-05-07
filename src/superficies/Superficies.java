package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo packNumber = new Modelo();
        Vista.setType();
        packNumber.getType();
        packNumber.setNum1(Vista.setLength());
        packNumber.setNum2(Vista.setLength());
        Vista.choose(packNumber);
        Vista.printFinally(packNumber);
       
    }
}
