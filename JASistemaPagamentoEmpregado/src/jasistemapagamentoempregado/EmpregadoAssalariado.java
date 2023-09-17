/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasistemapagamentoempregado;

/**
 *
 * @author Aluno
 */
//Subclasse EmpregadoAssalariado
public class EmpregadoAssalariado extends Empregado {
    //Atributo
    private double salarioMensal;

    //Construtor EmpregadoAssalariado()
    public EmpregadoAssalariado(double salarioMensal, 
            String primeiroNomeEmpregado, String ultimoNomeEmpregado, 
            String cpfEmpregado) {
        super(primeiroNomeEmpregado, ultimoNomeEmpregado, 
                cpfEmpregado);
        setSalarioMensal(salarioMensal);
    }//Fim do EmpregadoAssalariado() 
 
    //Método getSalarioMensal()
    public double getSalarioMensal() {
        return salarioMensal;
    }//Fim do método getSalarioMensal()

    //Método setSalarioMensal()
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal < 0.0 ? 0.0 : salarioMensal;
    }//Fim do método setSalarioMensal()
    
    @Override //Implementei o método abstrato
    //Método salario()
    public double salario() {
        return getSalarioMensal();
    }//Fim do método salario()
    
    @Override //Sobrescrita do método toString()
    public String toString() {
        return String.format("%s: %s\n\n%s: %s\n\n%s: %s\n"
                + "\n%s: %.2f",
                "Primeiro Nome do Empregado", 
                getPrimeiroNomeEmpregado(),
                "Úlitmo Nome do Empregado",
                getUltimoNomeEmpregado(),
                "CPF do Empregado",
                getCpfEmpregado(),
                "Salário do Empregado (R$)",
                salario());
    }//Fim do método toString()
 
}//Fim da subclasse EmpregadoAssalariado
