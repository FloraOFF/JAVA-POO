package jaarraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

//Classe Metodos
public class Metodos {
    Scanner input = new Scanner (System.in);
    ArrayList<String> agenda = new ArrayList<>();

    //Método inserirArray()
    public void inserirArray() {
        int index = 0;
        String confirm;

        do {
            System.out.printf("\n\nInserindo Dados no Array");
            System.out.printf("\n\nOBS: Para inserção informe 'nome; telefone': ");
            
            String inputDados = input.nextLine();
            
            if (!inputDados.isEmpty()) {
                agenda.add(index, inputDados);
                index++;
            } else {
                System.out.printf("\n\nEntrada inválida. Tente novamente!");
            }
            
            System.out.printf("\n\nDeseja continuar inserindo? Sim = S Não = qualquer tecla: ");
            confirm = input.nextLine();
        } while (confirm.equalsIgnoreCase("S"));
    }//Fim do método inserirArray()

    //Método exibirArray()
    public void exibirArray() {
        System.out.printf("\n\nExibindo Array!");
        int i = 0;
        Iterator<String> iterator = agenda.iterator();
        while (iterator.hasNext()) {
            System.out.printf ("\n\nÍndice: %d - "
                + "Pessoa/Telefone: %s."
                + "\n\n", i, iterator.next());
            i++;
        }
    }//Fim do método exibirArray()

    //Método removerArray()
    public void removerArray() {
        System.out.printf("\n\nRemovendo no Array!");
        int index;
        System.out.printf ("\n\nInforme um index para "
                + "remoção de informações: ");
        index = input.nextInt();
        
        try {
            agenda.remove(index);
        } catch(IndexOutOfBoundsException e) {
            System.out.printf ("\n\nPosição "
                    + "não localizada! Index inválido!");
        }
    }//Fim do método removerArray()

    //Método mostrarArrayIndex()
    public void mostrarArrayIndex() {
        System.out.printf("\n\nExibindo Informação do Array pelo Index!");
        int index;
        System.out.printf ("\n\nInforme index "
        + "para impressão das informações: ");

        index = input.nextInt();

        try {
            System.out.printf ("\n\nÍndice: %d - "
                + "Pessoa/Telefone: %s."
                + "", index, agenda.get(index));
        } catch(IndexOutOfBoundsException e) {
            System.out.printf ("\n\nPosição "
                    + "não localizada! Index válido!");
        }
    }//Fim do método mostrarArrayIndex()

    //Método alterarArray()
    public void alterarArray () {
        int index;
        String nome;
        System.out.printf("\n\nAlterando Informações do Array pelo Index!");

        System.out.printf("\n\nInforme index para impreesão das informações: ");
        index = input.nextInt();

        System.out.printf ("\n\nÍndice: %d - Pessoa/Telefone: %s.", index, agenda.get(index));
        input.nextLine();
        System.out.printf("\n\n\nInforme novo nome; telefone: ");
        nome = input.nextLine();
        
        try {
            agenda.set(index, nome);

            System.out.printf("\n\nElemento no array com novas informações: \n%d Índice;\n"
            +"%s.", index, agenda.get(index));
        } catch(IndexOutOfBoundsException e) {
            System.out.printf ("\n\nPosição "
                    + "não localizada! Index válido!");
        }
    }//Fim do método alterarArray()

}//Fim da classe Menu
