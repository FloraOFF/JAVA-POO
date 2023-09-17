/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasistemapagamentoempregado;

/**
 *
 * @author Aluno
 */
//Subclasse EmpregadoComissionado
public class EmpregadoComissionado extends Empregado{
    
    //Atributo
    private double vendasBrutas;
    private double porcentagemVendas;

    //Construtor EmpregadoComissionado()
    public EmpregadoComissionado(double vendasBrutas, 
            double porcentagemVendas, 
            String primeiroNomeEmpregado, 
            String ultimoNomeEmpregado, String cpfEmpregado) {
        super(primeiroNomeEmpregado, ultimoNomeEmpregado, 
                cpfEmpregado);
        setVendasBrutas(vendasBrutas);
        setPorcentagemVendas(porcentagemVendas);
    }//Fim do construtor EmpregadoComissionado()

    //Método getVendasBrutas()
    public double getVendasBrutas() {
        return vendasBrutas;
    }//Fim do método getVendasBrutas()

    //Método setVendasBrutas()
    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas < 0.0 ? 0.0 : vendasBrutas;
    }//Fim do método setVendasBrutas()

    //Método getPorcentagemVendas()
    public double getPorcentagemVendas() {
        return porcentagemVendas;
    }//Fim do método getPorcentagemVendas()

    //Método setPorcentagemVendas()
    public void setPorcentagemVendas(double porcentagemVendas) {
        this.porcentagemVendas = 
                (porcentagemVendas > 0.0 && porcentagemVendas < 1.0) ? 
                porcentagemVendas : 0.0;
    }//Fim do método setPorcentagemVendas()
    
    //Implementando a classe abstrata salario()
    @Override
    public double salario () {
        return getVendasBrutas() * getPorcentagemVendas();
    }//Fim da classe salario()
    
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
                "Valor Total de Vendas Brutas (R$)",
                getVendasBrutas(),
                "Porcentagem Sobre as Vendas (%)",
                getPorcentagemVendas() * 100,
                "Salário do Empregado com Base na "
                        + "Comissão de Vendas (R$)",
                salario());
    }//Fim do método toString()
    
}//Fim da subclasse EmpregadoComissionado
