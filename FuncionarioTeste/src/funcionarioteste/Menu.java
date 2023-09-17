package funcionarioteste;
import java.util.Scanner;

//Classe Menu
public class Menu {
    //Atributos
    private int controle = 1;
    private int op;
    
    //Instancias
    Scanner input = new Scanner (System.in);
    FuncArray FArray = new FuncArray();

    //Método menu()
    public void menu () {
        String nome;
        int cod, codF;
        double sal, horas; 

        System.out.printf("\n\nEste manipula informações de funcionário em um Array!");
        System.out.printf("\n\nMenu");
        System.out.printf("\n\nInforme uma opção para manipulação do Array!");
        System.out.printf("\n\n1 - Inserir no Array");
        System.out.printf("\n\n2 - Exibir Array");
        System.out.printf("\n\n3 - Remover no Array");
        System.out.printf("\n\n4 - Altera no Array");
        System.out.printf("\n\n5 - Sair do Sistema");
        System.out.printf("\n\nInforme uma das opções válidas: ");
        op = input.nextInt();
    
        switch (op) {
            case 1:
                System.out.printf("\n\nInforme o nome do Funcionário: ");
                nome = input.next();
                System.out.printf("\n\nInforme o código do Funcionário: ");
                cod = input.nextInt();
                System.out.printf("\n\nInforme o salário do Funcionário: ");
                sal = input.nextDouble();
                System.out.printf("\n\nInforme as horas extras do Funcionário: ");    
                horas = input.nextDouble();
                FArray.inserirArray(nome,cod,sal,horas);
            break;

            case 2:
                FArray.exibirArray();
            break;

            case 3:
                System.out.printf("\n\nInforme o código do Funcionário para busca: ");
                FArray.excluirArray(input.nextInt());
            break;

            case 4:
                System.out.printf("\n\nInforme o código do Funcionário para alterar: ");
                codF = input.nextInt();
                System.out.printf("\n\nDeseja: ");
                System.out.printf("\n\n1 - Alterar somente nome");
                System.out.printf("\n\n2 - Alterar somente código");
                System.out.printf("\n\n3 - Alterar somente salário");
                System.out.printf("\n\n4 - Alterar somente horas extras");
                System.out.printf("\n\n5 - Alterar todos os dados");
                System.out.printf("\n\nInforme uma das opções: ");
                op = input.nextInt();
                FArray.alterarArray(codF,op);
            break;

            case 5: 
                System.out.printf("\n\nSaindo do sistema...");
                setControle(0);
            break;

            default: System.out.printf("\n\nInforme uma opção válida!");
            break;
        } 
    }//Fim do método menu()

    //Método getControle()
    public int getControle() {
        return controle;
    }//Fim do método getControle()

    //Método setControle()
    public void setControle(int controle) {
        this.controle = controle;
    }//Fim do método setControle()
}//Fim da classe Menu
