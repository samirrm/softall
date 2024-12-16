
package soft_all;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import utilitarios.ConectaBanco;

public class Relatorios extends javax.swing.JFrame {

    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;
    
    public Relatorios() {
        initComponents();        
        setLocationRelativeTo(null);
        //Imagem de ícone da janela    
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\SoftAll\\src\\Imagens\\Printer-icon.png");
        setIconImage(imagemTituloJanela.getImage());
        try {
            con = ConectaBanco.conectabanco();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lb_EmissaodeR = new javax.swing.JLabel();
        jp_PaineldeRelatorios = new javax.swing.JPanel();
        txt_deData = new javax.swing.JTextField();
        txt_ateData = new javax.swing.JTextField();
        lb_de = new javax.swing.JLabel();
        lb_ate = new javax.swing.JLabel();
        lb_tipoderelatorio = new javax.swing.JLabel();
        lb_datadeexpedicao = new javax.swing.JLabel();
        cb_Entradas = new javax.swing.JCheckBox();
        cb_Saidas = new javax.swing.JCheckBox();
        bt_GeralUsuário = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_GerarRelatorio = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emissão de Relatórios");

        lb_EmissaodeR.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lb_EmissaodeR.setText("Emissão de Relatórios");

        jp_PaineldeRelatorios.setToolTipText("Emissão de Relatórios");

        txt_deData.setToolTipText("Digite a data INICIAL do relatório, no formato DD/mm/aaaa");

        txt_ateData.setToolTipText("Digite a data FINAL do relatório, no formato DD/mm/aaaa");

        lb_de.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_de.setText("De:");

        lb_ate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_ate.setText("Até:");

        lb_tipoderelatorio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_tipoderelatorio.setText("Tipo de Relatório:");

        lb_datadeexpedicao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_datadeexpedicao.setText("Data de expedição:");

        cb_Entradas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb_Entradas.setText("Entradas");
        cb_Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_EntradasActionPerformed(evt);
            }
        });

        cb_Saidas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb_Saidas.setText("Saídas");
        cb_Saidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SaidasActionPerformed(evt);
            }
        });

        bt_GeralUsuário.setText("Relatório Geral de Usuários");
        bt_GeralUsuário.setToolTipText("Emite um relatório contendo todos os usuários do sistema e alguns dados vinculados ao sistema.");
        bt_GeralUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GeralUsuárioActionPerformed(evt);
            }
        });

        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_GerarRelatorio.setText("Gerar Relatório");
        bt_GerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_PaineldeRelatoriosLayout = new javax.swing.GroupLayout(jp_PaineldeRelatorios);
        jp_PaineldeRelatorios.setLayout(jp_PaineldeRelatoriosLayout);
        jp_PaineldeRelatoriosLayout.setHorizontalGroup(
            jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                        .addComponent(bt_GeralUsuário)
                        .addContainerGap())
                    .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                        .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_datadeexpedicao)
                            .addComponent(lb_tipoderelatorio))
                        .addGap(30, 30, 30)
                        .addComponent(lb_de)
                        .addGap(18, 18, 18)
                        .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                                .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_Cancelar)
                                    .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                                        .addComponent(txt_deData, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(lb_ate)))
                                .addGap(18, 18, 18)
                                .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ateData, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_GerarRelatorio))
                                .addContainerGap(46, Short.MAX_VALUE))
                            .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                                .addComponent(cb_Entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(cb_Saidas)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jp_PaineldeRelatoriosLayout.setVerticalGroup(
            jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PaineldeRelatoriosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tipoderelatorio)
                    .addComponent(cb_Entradas)
                    .addComponent(cb_Saidas))
                .addGap(33, 33, 33)
                .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_datadeexpedicao)
                    .addComponent(lb_de)
                    .addComponent(txt_deData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_ate)
                    .addComponent(txt_ateData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(bt_GeralUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jp_PaineldeRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_GerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_PaineldeRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lb_EmissaodeR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_EmissaodeR)
                .addGap(52, 52, 52)
                .addComponent(jp_PaineldeRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_GerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GerarRelatorioActionPerformed
    if(txt_deData.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor digite uma data válida no campo 'De' ");        
    }else if(txt_ateData.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor digite uma data válida no campo 'Ate' "); 
    }else{    
        JasperPrint jasperPrint = null;
    try {               
        Statement stm = con.createStatement();         
            //Transformando o tipo de data dd/MM/yyyy para yyyy-MM-dd do campo txt_dedata    
                String dia = txt_deData.getText().substring(0, 2);
                String mes = txt_deData.getText().substring(3, 5);
                String ano = txt_deData.getText().substring(6);
                String DataBD = ano+"-"+mes+"-"+dia;
            //Transformando o tipo de data dd/MM/yyyy para yyyy-MM-dd do campo txt_atedata
                String dia2 = txt_ateData.getText().substring(0, 2);
                String mes2 = txt_ateData.getText().substring(3, 5);
                String ano2 = txt_ateData.getText().substring(6);
                String DataBDd = ano2+"-"+mes2+"-"+dia2;
        // Mapeando os parametros
        HashMap parameters = new HashMap();   
        parameters.put("dt1", "'"+DataBD+"'");
        parameters.put("dt2", "'"+DataBDd+"'");
        String query = "select * from entradas where data_de_operacao between '"+DataBD+"' and '"+DataBDd+"'";       
        ResultSet rst = stm.executeQuery(query);
                
    if(cb_Entradas.isSelected()){        
            JOptionPane.showMessageDialog(this, "RELATÓRIO DE ENTRADAS GERADO COM SUCESSO! ");                
            JasperPrint jp = JasperFillManager.fillReport("C:\\SoftAll\\src\\MyReports\\Entradas.jasper", parameters, con);
            JasperViewer jrv = new JasperViewer(jp,false);
            jrv.setVisible(true); 
        }else if(cb_Saidas.isSelected()){ 
            JOptionPane.showMessageDialog(this, "RELATÓRIO DE SAÍDAS GERADO COM SUCESSO! ");
            JasperPrint jp = JasperFillManager.fillReport("C:\\SoftAll\\src\\MyReports\\Saidas.jasper", parameters, con);    
            JasperViewer jrv = new JasperViewer(jp,false);
            jrv.setVisible(true); 
        }       
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this,"Erro ao gerar relatório! \n"+e);
}    
    }
    }//GEN-LAST:event_bt_GerarRelatorioActionPerformed

    private void bt_GeralUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GeralUsuárioActionPerformed
        // Gera o relatório dos usuário com cadastro no sistema
        JasperPrint jasperPrint = null;
        try {
            Statement stm = con.createStatement();
            String func = "C:\\SoftAll\\src\\MyReports\\Users.jasper";
            jasperPrint = JasperFillManager.fillReport(func, null, con);            
        } catch (SQLException | JRException err) {
            JOptionPane.showMessageDialog(this,"Erro ao gerar relatório de usuários cadastrados no sistema! \n"+err);
        }
        JasperViewer view = new JasperViewer(jasperPrint, false);
        view.setVisible(true);
    }//GEN-LAST:event_bt_GeralUsuárioActionPerformed

    private void cb_SaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SaidasActionPerformed
        cb_Saidas.setSelected(true);
    }//GEN-LAST:event_cb_SaidasActionPerformed

    private void cb_EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_EntradasActionPerformed
        cb_Entradas.setSelected(true);
    }//GEN-LAST:event_cb_EntradasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_GeralUsuário;
    private javax.swing.JButton bt_GerarRelatorio;
    private javax.swing.JCheckBox cb_Entradas;
    private javax.swing.JCheckBox cb_Saidas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jp_PaineldeRelatorios;
    private javax.swing.JLabel lb_EmissaodeR;
    private javax.swing.JLabel lb_ate;
    private javax.swing.JLabel lb_datadeexpedicao;
    private javax.swing.JLabel lb_de;
    private javax.swing.JLabel lb_tipoderelatorio;
    private javax.swing.JTextField txt_ateData;
    private javax.swing.JTextField txt_deData;
    // End of variables declaration//GEN-END:variables
}
