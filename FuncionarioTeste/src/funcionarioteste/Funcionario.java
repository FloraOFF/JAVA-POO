/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioteste;

//Classe Funcionario
public class Funcionario {
    //atributos
    private String nomeFuncionario;
    private int codigoFuncionario;
    private double salarioFuncionario;
    private double horasExtrasFuncionario;
    //private double salarioMensalFuncionario; //salario + horasEntras
    
    //Método Construtor()
    public Funcionario (String nome, int codigo, double salario, 
            double horasExtras) {
        this.nomeFuncionario = nome;
        this.codigoFuncionario = codigo;
        this.salarioFuncionario = salario;
        this.horasExtrasFuncionario = horasExtras;
    } //Fim do método Construtor
    
    //Método setNomeFuncionario()
    public void setNomeFuncionario (String nome) {
        this.nomeFuncionario = nome;
    }//Fim do método setNomeFuncionario()
    
    //Método getNomeFuncionario()
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }//Fim do método getNomeFuncionario()
    
    //Método setCodigoFuncionario()
    public void setCodigoFuncionario (int codigo) {
        this.codigoFuncionario = codigo;
    }//Fim do método setCodigoFuncionario()
    
    //Método getCodigoFuncionario()
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }//Fim do método getCodigoFuncionario()
    
    //Método setSalarioFuncionario()
    public void setSalarioFuncionario (double salario) {
        this.salarioFuncionario = salario;
    }//Fim do método setSalarioFuncionario
    
    //Método getSalarioFuncionario ()
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }//Fim do método getSalarioFuncionario()
    
    //Método setHorasExtrasFuncionario()
    public void setHorasExtrasFuncionario (double horasExtras) {
        this.horasExtrasFuncionario = horasExtras;
    }//Fim do método setHorasExtrasFuncionario()
    
    //Método getHorasExtrasFuncionario()
    public double getHorasExtrasFuncionario() {
        return horasExtrasFuncionario;
    }//Fim do método getHorasExtrasFuncionario()
    
    //Método calcSalarioMensalFuncionario()
    public double calcSalarioMensalFuncionario () {
        return getSalarioFuncionario() + 100.0 * getHorasExtrasFuncionario();
    }//Fim do método calcSalarioMensalFuncionario()
    
    //Método displayMessage()
    public void displayMessage() {
        System.out.printf ("\n\n\nRelatório de Salário do Funcionário: "
                + "\n\n%s: %s"
                + "\n\n%s: %d"
                + "\n\n%s: %.2f"
                + "\n\n%s: %.2f"
                + "\n\n%s: %.2f\n\n",
                
                "Nome do Funcionário", getNomeFuncionario(),
                "Código do Funcionário", getCodigoFuncionario(),
                "Salário do Funcionário (R$)", getSalarioFuncionario(),
                "Banco de Horas-Extras do Funcionário: ",
                getHorasExtrasFuncionario(),
                "Salário Mensal (R$): ", 
                calcSalarioMensalFuncionario()
                );
    }//Fim do método displayMessage()
}//Fim da classe Funcionario
