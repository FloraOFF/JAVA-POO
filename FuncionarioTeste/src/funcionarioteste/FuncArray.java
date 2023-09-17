package funcionarioteste;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Class FuncArray
public class FuncArray {
    //Atributos e instancias
    private Funcionario funcionario;
    
    ArrayList<Funcionario> Funcionariox = new ArrayList<Funcionario>();
    Scanner input = new Scanner(System.in);

    //Método inserirArray()
    public void inserirArray (String nome, int cod, double sal, double horas) {
        Funcionario funcionario = new Funcionario(nome, cod, sal, horas);
        Funcionariox.add(funcionario);
    }//Fim do método inserirArray()

    //Método excluirArray()
    public void excluirArray (int codA) {
        try {
            for (int i = 0; i < Funcionariox.size(); i++) {
                if (Funcionariox.get(i).getCodigoFuncionario() == codA) {
                    Funcionariox.remove(i);
                }
            }
        } catch (ExceptionInInitializerError e) {
            System.out.printf("\n\nErro ao excluir funcionário: %s", e.getMessage());
        }
    }//Fim do método excluirArray()

    //Método alterarArray()
    public void alterarArray (int op, int codB) {
        try {
            for (int j = 0; j < Funcionariox.size(); j++) {
                if (Funcionariox.get(j).getCodigoFuncionario() == codB) {
                    if (op == 1) { //Alterar somente nome
                        Funcionariox.get(j).setNomeFuncionario(input.nextLine());
                    } else if (op == 2) { //Alterar somente código
                        Funcionariox.get(j).setCodigoFuncionario(input.nextInt());
                    } else if (op == 3) { //Alterar somente salário
                        Funcionariox.get(j).setSalarioFuncionario(input.nextDouble());
                    } else if (op == 4) { //Alterar somente horasExtras
                        Funcionariox.get(j).setHorasExtrasFuncionario(input.nextDouble());
                    } else if (op == 5) {
                        Funcionariox.get(j).setNomeFuncionario(input.nextLine());
                        Funcionariox.get(j).setCodigoFuncionario(input.nextInt());
                        Funcionariox.get(j).setSalarioFuncionario(input.nextDouble());
                        Funcionariox.get(j).setHorasExtrasFuncionario(input.nextDouble());
                    } else {
                        System.out.printf("\n\nInforme uma opção válida");
                    }
                }
            }
        } catch (ExceptionInInitializerError e) {
            System.out.printf("\n\nErro ao alterar funcionário: %s", e.getMessage());
        }
    }//Fim do método alterarArray()
    
    //Método exibirArray()
    public void exibirArray () {
        if (Funcionariox.isEmpty()) {
            System.out.println("\nNão há nenhum funcionário cadastrado.");
        } else {
            for (int w = 0; w < Funcionariox.size(); w++) {
                funcionario = Funcionariox.get(w);
                funcionario.displayMessage();
            }
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//Fim do método exibirArray()
}//Fim da classe FuncArray
