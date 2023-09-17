/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jareajustesalarial;

//import javax.swing.ButtonGroup;
//import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
//import javax.xml.transform.Source;

/**
 *
 * @author Aluno
 */

//Classe Metodos
public class Metodos {

    //Atributos
    private double novoSalarioBrutoBase, salarioBruto, novoSalarioLiquido;
    int resposta;
    String novoSalBrutoBase, novoSalLiquido;
    
    //Método calcularReajusteSalarial()
    public void calcularReajusteSalarial (String nomeFuncionario, double salarioBrutoAtual, double valorCargo, String sindicalizado) {
        //JanelaPrincipal jp = new JanelaPrincipal();
        //Salário < R$ 5.000,00
        if (salarioBrutoAtual < 5000) {
            resposta = JOptionPane.showConfirmDialog(null, 
                    "O nome do funcionário ("+nomeFuncionario+") e "
                            + "o salário bruto informado em R$ "
                            + "("+salarioBrutoAtual+") estão corretos?");
            if (resposta == JOptionPane.YES_OPTION) {
                novoSalarioBrutoBase = salarioBrutoAtual + 
                        (salarioBrutoAtual * 0.1);

                salarioBruto = novoSalarioBrutoBase + valorCargo;
                
                    //É sindicalizado
                if (sindicalizado == "sindicalizado") {
                        novoSalarioLiquido = salarioBruto - 
                                (salarioBruto * 0.14) - (salarioBruto * 0.01);
                }else //Não sindicalizado
                        novoSalarioLiquido = salarioBruto - (salarioBruto * 0.14);

                novoSalBrutoBase = Double.toString(novoSalarioBrutoBase);
                novoSalLiquido = Double.toString(novoSalarioLiquido);

            } else {
                JOptionPane.showMessageDialog(null, ""
                        + "Informe os novos dados!");
                JanelaPrincipal.limpar();
            } 
            //Salário >= R$ 5.000,00 e < R$ 10.000,00
        }else if (salarioBrutoAtual >= 5000 && salarioBrutoAtual < 10000) {
            resposta = JOptionPane.showConfirmDialog(null, 
                    "O nome do funcionário ("+nomeFuncionario+") e "
                            + "o salário bruto informado em R$ "
                            + "("+salarioBrutoAtual+") estão corretos?");
            
            if (resposta == JOptionPane.YES_OPTION) {
                novoSalarioBrutoBase = salarioBrutoAtual + 
                        (salarioBrutoAtual * 0.07);

                salarioBruto = novoSalarioBrutoBase + valorCargo;
                
                    //É sindicalizado
                if (sindicalizado == "sindicalizado") {
                    novoSalarioLiquido = salarioBruto - 
                                (salarioBruto * 0.14) - (salarioBruto * 0.01);
                } else //Não sindicalizado
                        novoSalarioLiquido = salarioBruto - (salarioBruto * 0.14);
      
                novoSalBrutoBase = Double.toString(novoSalarioBrutoBase);
                novoSalLiquido = Double.toString(novoSalarioLiquido);
                
            } else {
                JOptionPane.showMessageDialog(null, ""
                        + "Informe os novos dados!");
                JanelaPrincipal.limpar();
            }
            //Salário >= R$ 10.000,00
        }else if (salarioBrutoAtual >= 1000) {
            resposta = JOptionPane.showConfirmDialog(null, 
                    "O nome do funcionário ("+nomeFuncionario+") e "
                            + "o salário bruto informado em R$ "
                            + "("+salarioBrutoAtual+") estão corretos?");
            
            if (resposta == JOptionPane.YES_OPTION) {
                novoSalarioBrutoBase = salarioBrutoAtual + 
                        (salarioBrutoAtual * 0.05);

                salarioBruto = novoSalarioBrutoBase + valorCargo;
                
                    //É sindicalizado
                if (sindicalizado == "sindicalizado") {
                    novoSalarioLiquido = salarioBruto - 
                                (salarioBruto * 0.14) - (salarioBruto * 0.01);
                } else //Não sindicalizado
                        novoSalarioLiquido = salarioBruto - (salarioBruto * 0.14);
                
                novoSalBrutoBase = Double.toString(novoSalarioBrutoBase);
                novoSalLiquido = Double.toString(novoSalarioLiquido);
            } else {
                JOptionPane.showMessageDialog(null, ""
                        + "Informe os novos dados!");
                JanelaPrincipal.limpar();
            }
        } 
    }//Fim do método calcularReajusteSalarial()  

    //Método sair()
    public void sair () {
        int op;
        op = JOptionPane.showConfirmDialog(null, ""
                + "Deseja realmente sair?");
        if (op == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Obrigado "
                + "por utilizar nosso sistema!");
            System.exit(0);
        }
        else
            JOptionPane.showMessageDialog(null, ""
                    + "Continue utilizando nosso sistema!");
    }//Fim do método sair()

}//Fim da classe Metodos
