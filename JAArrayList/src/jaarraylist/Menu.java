package jaarraylist;

import java.util.Scanner;

//Classe Menu
public class Menu {
    private int controle = 1;
    private int op;
    
    Scanner input = new Scanner (System.in);
    Metodos metodos = new Metodos();                                                                                                               
    
    //Método menu()
    public void menu() {
        System.out.printf ("\n\nEste programa "
                + "manipula uma agenda telefonica!");

        System.out.printf("\n\nMenu");
        System.out.printf("\n\nInforme uma opção para manipulação do Array!");
        System.out.printf("\n\n1 - Inserir no Array");
        System.out.printf("\n\n2 - Exibir Array");
        System.out.printf("\n\n3 - Remover no Array");
        System.out.printf("\n\n4 - Busca Index no Array");
        System.out.printf("\n\n5 - Altera no Array");
        System.out.printf("\n\n6 - Sair do Sistema");
        System.out.printf("\n\nInforme uma das opções válidas: ");
        
        op = input.nextInt();

        switch (op) {
            case 1:
                metodos.inserirArray();
            break;

            case 2:
                metodos.exibirArray();
            break;

            case 3:
                metodos.removerArray();
            break;

            case 4:
                metodos.mostrarArrayIndex();
            break;

            case 5:
                metodos.alterarArray();
            break;

            case 6: 
                System.out.printf("\n\nSaindo do sistema...");
                setControle(0);
            break;

            default: System.out.printf("\n\nInforme uma opção válida!");
            break;
        }
    }//Fim do método menu

    //Método getControle()
    public int getControle() {
        return controle;
    }//Fim do método getControle()

    //Método setControle()
    public void setControle(int controle) {
        this.controle = controle;
    }//Fim do método setControle()
}
        