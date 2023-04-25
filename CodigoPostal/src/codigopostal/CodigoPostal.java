package codigopostal;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Este programa identifica la región geográfica de acuerdo con el código
 * postal.
 *
 */

public class CodigoPostal {
     Scanner stdIn = new Scanner(System.in);
        String cp; //c.p. introducido por el usuario
        public void switchh(){
     System.out.print("Introduzca código postal: ");
        cp = stdIn.nextLine();
        switch (cp.charAt(0)) {
            case '0':
                System.out.println(cp + " Esta en Colon");
                break;
            case '2':
                System.out.println(cp + " Estas en la terminal");
                break;
            case '3':
                System.out.println(cp + " está en la Costa Este.");
                break;
            case '4':
                System.out.println(cp + " Esta en el centro");
                break;
            case '5':
                System.out.println(cp + " Esta en Metepec");
                break;
            case '6':
                System.out.println(
                        cp + " está en el área del Plano Central.");
                break;
            case '7':
                System.out.println(cp + " está en el Sur.");
                break;
            case '8':
                System.out.println(cp +" Esta en capu ");
                break;
            case '9':
                System.out.println(cp + " está en el Oeste.");
                break;
            default:
                System.out.println(cp + " es un código postal inválido.");
        } // fin del switch

    
}
       
    public static void main(String[] args) {
        CodigoPostal switchh =  new CodigoPostal ();
        switchh.switchh();
    } // fin del main;
} // fin de la clase CodigoPostal
