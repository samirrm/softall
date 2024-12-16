
package soft_all;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        //Imagem de ícone da janela    
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\SoftAll\\src\\Imagens\\Icones pequenos\\principal.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        BDSoftAllPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("BDSoftAllPU").createEntityManager();
        entradas_1Query = java.beans.Beans.isDesignTime() ? null : BDSoftAllPUEntityManager.createQuery("SELECT e FROM Entradas_1 e");
        entradas_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : entradas_1Query.getResultList();
        saidas_1Query = java.beans.Beans.isDesignTime() ? null : BDSoftAllPUEntityManager.createQuery("SELECT s FROM Saidas_1 s");
        saidas_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : saidas_1Query.getResultList();
        Painel_de_Botoes = new javax.swing.JPanel();
        bt_Entradas = new javax.swing.JButton();
        bt_Saidas = new javax.swing.JButton();
        bt_Relatorios = new javax.swing.JButton();
        bt_Cadastro = new javax.swing.JButton();
        bt_Calculadora = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_Saidas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Entradas = new javax.swing.JTable();
        bt_AtualizaDados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_NovaEntrada = new javax.swing.JMenuItem();
        jMenu_NovaSaida = new javax.swing.JMenuItem();
        jMenu_GerarRelatorio = new javax.swing.JMenuItem();
        jMenu_EditarCadastro = new javax.swing.JMenuItem();
        jMenu_Calculadora = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - Soft All");

        bt_Entradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dollar-stats-icon.png"))); // NOI18N
        bt_Entradas.setToolTipText("Novas Entradas");
        bt_Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntradasActionPerformed(evt);
            }
        });

        bt_Saidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coins-icon.png"))); // NOI18N
        bt_Saidas.setToolTipText("Novas Saídas");
        bt_Saidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SaidasActionPerformed(evt);
            }
        });

        bt_Relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Printer-icon.png"))); // NOI18N
        bt_Relatorios.setToolTipText("Imprimir Relatórios");
        bt_Relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RelatoriosActionPerformed(evt);
            }
        });

        bt_Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/person-icon.png"))); // NOI18N
        bt_Cadastro.setToolTipText("Editar Cadastro");
        bt_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadastroActionPerformed(evt);
            }
        });

        bt_Calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calculation-icon.png"))); // NOI18N
        bt_Calculadora.setToolTipText("Calculadora");
        bt_Calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CalculadoraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Entradas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Saídas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gerar Relatórios");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cadastro de Usuário");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Calculadora");

        javax.swing.GroupLayout Painel_de_BotoesLayout = new javax.swing.GroupLayout(Painel_de_Botoes);
        Painel_de_Botoes.setLayout(Painel_de_BotoesLayout);
        Painel_de_BotoesLayout.setHorizontalGroup(
            Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_de_BotoesLayout.createSequentialGroup()
                .addGroup(Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_de_BotoesLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_de_BotoesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_Entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Saidas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Relatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_de_BotoesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bt_Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_de_BotoesLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57))))
        );
        Painel_de_BotoesLayout.setVerticalGroup(
            Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_de_BotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(Painel_de_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_Calculadora)
                    .addComponent(bt_Cadastro)
                    .addComponent(bt_Relatorios)
                    .addComponent(bt_Saidas)
                    .addComponent(bt_Entradas))
                .addGap(912, 912, 912))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Últimas Entradas:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Últimas Saídas:");

        tb_Saidas.setAutoCreateRowSorter(true);
        tb_Saidas.setToolTipText("Exibe todas as saídas cadastradas no banco");
        tb_Saidas.setName("Últimas Saídas"); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, saidas_1List, tb_Saidas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataDeOperacao}"));
        columnBinding.setColumnName("Data De Operacao");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedenteSacado}"));
        columnBinding.setColumnName("Cedente Sacado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${referente}"));
        columnBinding.setColumnName("Referente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(tb_Saidas);
        if (tb_Saidas.getColumnModel().getColumnCount() > 0) {
            tb_Saidas.getColumnModel().getColumn(0).setResizable(false);
            tb_Saidas.getColumnModel().getColumn(1).setResizable(false);
            tb_Saidas.getColumnModel().getColumn(2).setResizable(false);
            tb_Saidas.getColumnModel().getColumn(3).setResizable(false);
            tb_Saidas.getColumnModel().getColumn(4).setResizable(false);
        }

        tb_Entradas.setAutoCreateRowSorter(true);
        tb_Entradas.setToolTipText("Exibe todas as entradas cadastradas no banco");

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, entradas_1List, tb_Entradas);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataDeOperacao}"));
        columnBinding.setColumnName("Data De Operacao");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedenteSacado}"));
        columnBinding.setColumnName("Cedente Sacado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${referente}"));
        columnBinding.setColumnName("Referente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tb_Entradas);
        if (tb_Entradas.getColumnModel().getColumnCount() > 0) {
            tb_Entradas.getColumnModel().getColumn(0).setResizable(false);
            tb_Entradas.getColumnModel().getColumn(1).setResizable(false);
            tb_Entradas.getColumnModel().getColumn(2).setResizable(false);
            tb_Entradas.getColumnModel().getColumn(3).setResizable(false);
            tb_Entradas.getColumnModel().getColumn(4).setResizable(false);
            tb_Entradas.getColumnModel().getColumn(4).setPreferredWidth(10);
        }
        tb_Entradas.revalidate();

        bt_AtualizaDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/available-updates-24.png"))); // NOI18N
        bt_AtualizaDados.setText("Atualizar Dados");
        bt_AtualizaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AtualizaDadosActionPerformed(evt);
            }
        });

        jMenuBar1.setToolTipText("Menu Principal - Soft All");

        jMenu1.setText("Arquivo   ");

        jMenu_NovaEntrada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        jMenu_NovaEntrada.setText("Nova Entrada");
        jMenu_NovaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_NovaEntradaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_NovaEntrada);

        jMenu_NovaSaida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        jMenu_NovaSaida.setText("Nova Saída");
        jMenu_NovaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_NovaSaidaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_NovaSaida);

        jMenu_GerarRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        jMenu_GerarRelatorio.setText("Gerar Relatório");
        jMenu_GerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_GerarRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_GerarRelatorio);

        jMenu_EditarCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        jMenu_EditarCadastro.setText("Editar Cadastro");
        jMenu_EditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_EditarCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_EditarCadastro);

        jMenu_Calculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.SHIFT_MASK));
        jMenu_Calculadora.setText("Calculadora");
        jMenu_Calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_CalculadoraActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_Calculadora);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda   ");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setText("Sobre");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu3MouseEntered(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_AtualizaDados)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Painel_de_Botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jScrollPane1)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_de_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_AtualizaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EntradasActionPerformed
        telaEntradas telaE = new telaEntradas();
        telaE.setVisible(true);
    }//GEN-LAST:event_bt_EntradasActionPerformed

    private void bt_SaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SaidasActionPerformed
        telaSaidas telaS;
        try {
            telaS = new telaSaidas();
            telaS.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bt_SaidasActionPerformed

    private void bt_RelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RelatoriosActionPerformed
        Relatorios telaRelatorio = new Relatorios();
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_bt_RelatoriosActionPerformed

    private void bt_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadastroActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_bt_CadastroActionPerformed

    private void bt_CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CalculadoraActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start calc.exe");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"ERRO AO UTILIZAR A CALCULADORA!\n"+ex);
        }
    }//GEN-LAST:event_bt_CalculadoraActionPerformed

    private void jMenu_NovaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_NovaEntradaActionPerformed
        telaEntradas telaE = new telaEntradas();
        telaE.setVisible(true);
    }//GEN-LAST:event_jMenu_NovaEntradaActionPerformed

    private void jMenu_NovaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_NovaSaidaActionPerformed
        telaSaidas telaS;
        try {
            telaS = new telaSaidas();
            telaS.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenu_NovaSaidaActionPerformed

    private void jMenu_GerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_GerarRelatorioActionPerformed
        Relatorios telaRelatorio = new Relatorios();
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_jMenu_GerarRelatorioActionPerformed

    private void jMenu_EditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_EditarCadastroActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jMenu_EditarCadastroActionPerformed

    private void jMenu_CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_CalculadoraActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start calc.exe");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao chamar a calculadora do sistema!"+ex);
        }
    }//GEN-LAST:event_jMenu_CalculadoraActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            Runtime.getRuntime().exec("cmd /c start C:\\SoftAll\\src\\Manual\\manual.pdf");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao visualizar o manual do sistema!"+ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        SairSistema ext = new SairSistema();
        ext.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseEntered

    }//GEN-LAST:event_jMenu3MouseEntered

    private void bt_AtualizaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AtualizaDadosActionPerformed
        dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_bt_AtualizaDadosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager BDSoftAllPUEntityManager;
    private javax.swing.JPanel Painel_de_Botoes;
    private javax.swing.JButton bt_AtualizaDados;
    private javax.swing.JButton bt_Cadastro;
    private javax.swing.JButton bt_Calculadora;
    private javax.swing.JButton bt_Entradas;
    private javax.swing.JButton bt_Relatorios;
    private javax.swing.JButton bt_Saidas;
    private java.util.List<soft_all.Entradas_1> entradas_1List;
    private javax.persistence.Query entradas_1Query;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenu_Calculadora;
    private javax.swing.JMenuItem jMenu_EditarCadastro;
    private javax.swing.JMenuItem jMenu_GerarRelatorio;
    private javax.swing.JMenuItem jMenu_NovaEntrada;
    private javax.swing.JMenuItem jMenu_NovaSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.util.List<soft_all.Saidas_1> saidas_1List;
    private javax.persistence.Query saidas_1Query;
    private javax.swing.JTable tb_Entradas;
    private javax.swing.JTable tb_Saidas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public void AtualizaFrame(){
//        dispose();
        MenuPrincipal.getWindows();
        tb_Entradas.repaint();
        tb_Entradas.validate();
        tb_Saidas.repaint();
        tb_Saidas.validate();
} 
    
}
