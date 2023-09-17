/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jasistemapagamentoempregado;

/**
 *
 * @author Aluno
 */

//Classe JASistemaPagamentoEmpregado
public class JASistemaPagamentoEmpregado {

    /**
     * @param args the command line arguments
     */
    
    //Método main()
    public static void main(String[] args) {
        
        Menu menu = new Menu();

        int control;
        do {
                menu.menu();
                control = menu.getControle();
        } while (control != 0);
        
        System.out.printf ("\n\nObrigado por utilizar nosso "
                + "sistema!\n");
        System.out.println();
    }//Fim do método main()
    
}//Fim da classe JASistemaPagamentoEmpregado
