/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jaarraylist;

/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;*/

//Classe JAArrayList
public class JAArrayList {

    //Método main()
    public static void main(String[] args) {
        Menu M = new Menu();
        int control;
        do {
            M.menu();
            control = M.getControle();
        } while (control != 0);
        
        System.out.printf ("\n\nObrigado por utilizar "
                + "nosso programa!\n\n");
        System.out.println();    

    }//Fim do método main()
    
}//Fim da classe JAArrayList
