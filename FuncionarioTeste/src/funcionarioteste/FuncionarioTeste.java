/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionarioteste;

//import java.util.Scanner;

//Classe FuncionarioTeste
public class FuncionarioTeste {

    //Método main()
    public static void main(String[] args) {
        Menu m = new Menu();
        
        int control;
        do {
            m.menu();
            control = m.getControle();
        } while (control != 0);
        
        System.out.printf ("\n\nObrigado por utilizar nosso programa!\n\n");
        System.out.println(); 
    }//Fim do método main()
}//Fim da classe FuncionarioTeste
