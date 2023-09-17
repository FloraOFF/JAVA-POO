/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jainterface;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aluno
 */
public class Metodos {
    JTable Table;
    JTextField Field1;
    JTextField Field2;
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    
    //Método carregarMatriz()
    public int[][] carregarMatriz (int qLinhas, int qColunas) {
        int[][]matrizA = new int[qLinhas][qColunas];
        for (int i = 0; i < qLinhas; i++) {
            for (int j = 0; j < qColunas; j++) {
                matrizA[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(null, 
                                "Informe o elemento na posição "
                                        + "A["+i+"]["+j+"]:"));
            }
        }
        return matrizA;
    }//fim do método carregarMatriz()
    
    //Método carregarTabela()(
    public void carregarTabela (int mat[][], int qLinhas, int qColunas) {
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        model.setRowCount(qLinhas);
        model.setColumnCount(qColunas);
        for (int i = 0; i < qLinhas; i++) {
            for (int j = 0; j < qColunas; j++) {
                Table.setValueAt(mat[i][j], i, j);
            }
        }
    }//fim do método carregarTabela()
    
    //Método limpar()
    public void limpar () {
        int op;
        op = JOptionPane.showConfirmDialog(null, ""
                + "Deseja realmente limpar tudo?");
        if (op == JOptionPane.YES_OPTION) {
            Field1.setText("");
            Field2.setText("");
            int[][]matriz = new int[0][0];
            matriz = this.carregarMatriz(0, 0);
            this.carregarTabela (matriz, 0, 0);
        }
        else
            JOptionPane.showMessageDialog(null, ""
                    + "Continue utilizando nosso sistema!");
        
    }//fim do método limpar()
    
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
        
    } //fim do método sair()
   
}
