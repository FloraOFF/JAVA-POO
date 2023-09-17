package jasistemapagamentoempregado;

import java.io.IOException;
import java.util.ArrayList;

//Classe EmpreArray
public class EmpreArray {
    private ArrayList<Empregado> empregados = new ArrayList<>();

    //Método inserirAssalariado()
    public void inserirAssalariado(double salario, String Pnome, String Unome, String cpf) {
        Empregado assalari = new EmpregadoAssalariado(salario, Pnome, Unome, cpf);
        empregados.add(assalari);
    }//Fim do método inserirAssalariado()

    //Método inserirComissionado()
    public void inserirComissionado (double vendas, double porcentagem, String Pnome, String Unome, String cpf) {
        Empregado comissi = new EmpregadoComissionado(vendas, porcentagem, Pnome, Unome, cpf);
        empregados.add(comissi);
    }//Fim do método inserirComissionado()

    //Método inserirHorista()
    public void inserirHorista (double horas, double valorH, String Pnome, String Unome, String cpf) {
        Empregado hori = new EmpregadoHorista(horas, valorH, Pnome, Unome, cpf);
        empregados.add(hori);
    }//Fim do método inserirHorista()

    //Método excluirEmpregado()
    public void excluirEmpregado (String CPF) {
        try {
            if (empregados.isEmpty()) {
                System.out.println("\n\nNão há nenhum empregado cadastrado.");
            } else{
                for (int i = 0; i < empregados.size(); i++) {
                    if (empregados.get(i).getCpfEmpregado().equals(CPF)) {
                        empregados.remove(i);
                    }
                }
            }
        } catch (ExceptionInInitializerError e) {
           System.out.printf("\n\nErro ao excluir funcionário: %s", e.getMessage());
        }
    }//Fim do método excluirEmpregado()

    //Método exibirEmpregado()
    public void exibirEmpregado () {
        if (empregados.isEmpty()) {
            System.out.println("\n\nNão há nenhum empregado cadastrado.");
        } else {
            for (Empregado emp : empregados) {
                if (emp instanceof EmpregadoAssalariado) {
                    System.out.println(((EmpregadoAssalariado) emp).toString()); //downcast empregado => empregadoassalariado
                } else if (emp instanceof EmpregadoComissionado) {
                    System.out.println(((EmpregadoComissionado) emp).toString());
                } else if (emp instanceof EmpregadoHorista) {
                    System.out.println(((EmpregadoHorista) emp).toString());
                }
            }
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//Fim do método exibirEmpregado()
    
    //Método buscarEmpregado()
    public Empregado buscarEmpregado(String CPF) {
        for (Empregado emp : empregados) {
            if (emp.getCpfEmpregado().equals(CPF)) {
                System.out.printf("\n\nEmpregado encontrado!\n\n");
                if (emp instanceof EmpregadoAssalariado) {
                    System.out.println(((EmpregadoAssalariado) emp).toString());
                } else if (emp instanceof EmpregadoComissionado) {
                    System.out.println(((EmpregadoComissionado) emp).toString());
                } else if (emp instanceof EmpregadoHorista) {
                    System.out.println(((EmpregadoHorista) emp).toString());
                }
            } else {
                System.out.printf("\n\nNão foi encontrado nenhum empregado com o CPF %s.", CPF);
            }
        }
        
        return null;
    }//Fim do método buscarEmpregado()
}//Fim da classe EmpreArray
