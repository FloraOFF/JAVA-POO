/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasistemapagamentoempregado;

/**
 *
 * @author Aluno
 */
//Classe Empregado
public abstract class Empregado extends Object {
    
    //Atributos
    private String primeiroNomeEmpregado;
    private String ultimoNomeEmpregado;
    private String cpfEmpregado;

    //Construtor Empregado ()
    public Empregado(String primeiroNomeEmpregado, String ultimoNomeEmpregado, 
            String cpfEmpregado) {
        this.primeiroNomeEmpregado = primeiroNomeEmpregado;
        this.ultimoNomeEmpregado = ultimoNomeEmpregado;
        this.cpfEmpregado = cpfEmpregado;
    }//Fim do construor Empregado()

    //Método getPrimeiroNomeEmpregado()
    public String getPrimeiroNomeEmpregado() {
        return primeiroNomeEmpregado;
    }//Fim do método getPrimeiroNomeEmpregado()

    //Método setPrimeiroNomeEmpregado()
    public void setPrimeiroNomeEmpregado(String primeiroNomeEmpregado) {
        this.primeiroNomeEmpregado = primeiroNomeEmpregado;
    }//Fim do método setPrimeiroNomeEmpregado()

    //Método getUltimoNomeEmpregado()
    public String getUltimoNomeEmpregado() {
        return ultimoNomeEmpregado;
    }//Fim do método getUltimoNomeEmpregado()

    //Método setUltimoNomeEmpregado()
    public void setUltimoNomeEmpregado(String ultimoNomeEmpregado) {
        this.ultimoNomeEmpregado = ultimoNomeEmpregado;
    }//Fim do método setUltimoNomeEmpregado()

    //Método getCpfEmpregado()
    public String getCpfEmpregado() {
        return cpfEmpregado;
    }//Fim do getCpfEmpregado()

    //Método setCpfEmpregado()
    public void setCpfEmpregado(String cpfEmpregado) {
        this.cpfEmpregado = cpfEmpregado;
    }//Fim do método setCpfEmpregado()
    
    //Usamos @Override para realiar sobrescrita
    @Override
    //Método toString
    public String toString() {
        return String.format("\n\n%s: %s\n\n%s: %s\n\n%s: %s",
                "Primeiro Nome do Empregado", 
                getPrimeiroNomeEmpregado(),
                "Úlitmo Nome do Empregado",
                getUltimoNomeEmpregado(),
                "CPF do Empregado",
                getCpfEmpregado());
    }//Fim do método toString()
    
    //Criar um método abstrato - Realizo sobrescrita em cada subclasse
    public abstract double salario();//Método sem nenhuma implementação
    
    //Toda que possuir pelo menos um método abstrato é, obrigatoriamente,
    //uma classe abstrata
    
    
}//Fim da classe Empregado
