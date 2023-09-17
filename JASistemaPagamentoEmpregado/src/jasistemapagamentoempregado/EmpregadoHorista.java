/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasistemapagamentoempregado;

/**
 *
 * @author Aluno
 */
//Subclasse EmpregadoHorista
public class EmpregadoHorista extends Empregado{
    //Atributos
    private double horasTrabalhadas;
    private double valorHoraTrabalho;

    //Construtor EmpregadoHorista
    public EmpregadoHorista(double horasTrabalhadas, 
            double valorHoraTrabalho, 
            String primeiroNomeEmpregado, 
            String ultimoNomeEmpregado, String cpfEmpregado) {
        super(primeiroNomeEmpregado, ultimoNomeEmpregado, 
                cpfEmpregado);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHoraTrabalho(valorHoraTrabalho);
    }//Fim do construtor EmpregadoHorista
    
    //Método getHorasTrabalhadas()
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    } //Fim do método getHorasTrabalhadas()

    //Método setHorasTrabalhadas()
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        //Supondo o máximo de 44 horas semanais = 
        //176 horas mensais
        this.horasTrabalhadas = 
                horasTrabalhadas >= 0.0 
                ? horasTrabalhadas : 0.0;
    }//Fim do método setHorasTrabalhadas()

    //Método getValorHoraTrabalho()
    public double getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }//Fim do método getValorHoraTrabalho()

    //Método setValorHoraTrabalho()
    public void setValorHoraTrabalho(double valorHoraTrabalho) {
        this.valorHoraTrabalho = 
                valorHoraTrabalho > 0.0 ? valorHoraTrabalho : 
                0.0;
    }//Fim do método setValorHoraTrabalho()
    
    //Implementação do método abstrato
    @Override
    //Método salario()
    public double salario() {
        if (getHorasTrabalhadas() <= 176.0)//Sem hora extra
            return getHorasTrabalhadas() * getValorHoraTrabalho();
        else //com hora extra
            return (176.0 * getValorHoraTrabalho()) + 
                    ((getHorasTrabalhadas() - 176.0) * 
                    (getValorHoraTrabalho() * 1.5));
    }//fim do método salário()
    
    @Override //Sobrescrita do método toString()
    public String toString() {
        return String.format("%s: %s\n\n%s: %s\n\n%s: %s\n"
                + "\n%s: %.2f\n\n%s: %.2f\n\n%s: %.2f",
                "Primeiro Nome do Empregado", 
                getPrimeiroNomeEmpregado(),
                "Úlitmo Nome do Empregado",
                getUltimoNomeEmpregado(),
                "CPF do Empregado",
                getCpfEmpregado(),
                "Quantidade Total de Horas Trabalhadas",
                getHorasTrabalhadas(),
                "Valor da Hora-Trabalho (R$)",
                getValorHoraTrabalho(),
                "Salário do Empregado com Base nas "
                        + "Horas Trabalhadas (R$)",
                salario());
    }//Fim do método toString()
    
}//Fim da subclasse EmpregadoHorista
