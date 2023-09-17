package jasistemapagamentoempregado;
//import java.util.ArrayList;
import java.util.Scanner;

//Classe Menu
public class Menu {
    //Atributos
    private int op;
    private int controle = 1;

    /**
     * 
     */
    //Instancias
    Scanner input = new Scanner(System.in);
    EmpreArray arr = new EmpreArray();

    //Método menu()
    public void menu (){
        System.out.printf ("\n\n\t\tSistema de Folha de Pagamento");

        System.out.printf("\n\nMENU");
        System.out.printf("\n\n1 - Empregado Assalariado");
        System.out.printf("\n\n2 - Empregado Comissionado");
        System.out.printf("\n\n3 - Empregado Horista");
        System.out.printf("\n\n4 - Sair do Sistema: ");
        System.out.printf("\n\nSelecione opção: ");

        op = input.nextInt();

        double sal, venda, porcen, hora, vHora;
        String pN, uN, cpf;

        switch (op) {
            case 1:
                System.out.printf("\n\nQual operação deseja realizar: ");    
                System.out.printf("\n\n1 - Inserir Empregado");
                System.out.printf("\n\n2 - Exibir Empregado");
                System.out.printf("\n\n3 - Excluir Empregado");
                System.out.printf("\n\n4 - Buscar Empregado");
                System.out.printf("\n\nSelecione opção: ");
                op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.printf("\n\nInforme os dados do empregado:");
                        System.out.printf("\n\nSalário Mensal: ");
                        sal = input.nextDouble();
                        input.nextLine(); 
                        System.out.printf("\n\nPrimeiro Nome: ");
                        pN = input.nextLine();
                        System.out.printf("\n\nSegundo Nome: ");
                        uN = input.nextLine();
                        System.out.printf("\n\nCPF: "); 
                        cpf = input.nextLine();
        
                        arr.inserirAssalariado(sal, pN, uN, cpf);
                    break;
                    case 2: 
                        arr.exibirEmpregado();
                    break;
                    case 3:
                        System.out.printf("\n\nInforme o CPF do empregado para exclusão: ");
                            arr.excluirEmpregado(input.next());
                    break;
                    case 4:
                        System.out.printf("\n\nInforme o CPF do empregado para busca: ");
                            arr.buscarEmpregado(input.next());
                    break;

                    default: 
                        System.out.printf("\n\nInforme uma opção válida");
                    break;
                }

                
            break;
        
            case 2:
                System.out.printf("\n\nQual operação deseja realizar: ");    
                System.out.printf("\n\n1 - Inserir Empregado");
                System.out.printf("\n\n2 - Exibir Empregado");
                System.out.printf("\n\n3 - Excluir Empregado");
                System.out.printf("\n\n4 - Buscar Empregado");
                System.out.printf("\n\nSelecione opção: ");
                op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.printf("\n\nInforme os dados do empregado:");
                        System.out.printf("\n\nVendas Brutas: ");
                        venda = input.nextDouble();
                        System.out.printf("\n\nPorcentagem da Vendas: ");
                        porcen = input.nextDouble();
                        input.nextLine();
                        System.out.printf("\n\nPrimeiro Nome: ");
                        pN = input.nextLine();
                        System.out.printf("\n\nSegundo Nome: ");
                        uN = input.nextLine();
                        System.out.printf("\n\nCPF: "); 
                        cpf = input.nextLine();
                        
        
                        arr.inserirComissionado(venda, porcen, pN, uN, cpf);
                    break;
                    case 2: 
                        arr.exibirEmpregado();
                    break;
                    case 3:
                        System.out.printf("\n\nInforme o CPF do empregado para exclusão: ");
                            arr.excluirEmpregado(input.next());
                    break;
                    case 4:
                        System.out.printf("\n\nInforme o CPF do empregado para busca: ");
                            arr.buscarEmpregado(input.next());
                    break;

                    default: 
                        System.out.printf("\n\nInforme uma opção válida");
                    break;
                }
            break;
        
            case 3:
                System.out.printf("\n\nQual operação deseja realizar: ");    
                System.out.printf("\n\n1 - Inserir Empregado");
                System.out.printf("\n\n2 - Exibir Empregado");
                System.out.printf("\n\n3 - Excluir Empregado");
                System.out.printf("\n\n4 - Buscar Empregado");
                System.out.printf("\n\nSelecione opção: ");
                op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.printf("\n\nInforme os dados do empregado:");
                        System.out.printf("\n\nHoras Trabalhadas: ");
                        hora = input.nextDouble();
                        System.out.printf("\n\nValor da Hora de Trabalho: ");
                        vHora = input.nextDouble();
                        System.out.printf("\n\nPrimeiro Nome: ");
                        pN = input.next();
                        System.out.printf("\n\nSegundo Nome: ");
                        uN = input.next();
                        System.out.printf("\n\nCPF: "); 
                        cpf = input.next();
        
                        arr.inserirHorista(hora, vHora, pN, uN, cpf);
                    break;
                    case 2: 
                        arr.exibirEmpregado();;
                    break;
                    case 3:
                        System.out.printf("\n\nInforme o CPF do empregado para exclusão: ");
                            arr.excluirEmpregado(input.next());
                    break;
                    case 4:
                        System.out.printf("\n\nInforme o CPF do empregado para busca: ");
                            arr.buscarEmpregado(input.next());
                    break;

                    default: 
                        System.out.printf("\n\nInforme uma opção válida");
                    break;
                }
            break;

            case 4: 
                System.out.printf("\n\nSaindo do sistema...");
                setControle(0);
            break;

            default:
                System.out.printf("\n\nInforme uma opção válida");
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
