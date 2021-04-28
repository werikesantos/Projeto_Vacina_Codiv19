package br.com.sobrevida.vacinaSARSCoV2.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author WERIKE
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private String email;
    private String senha;
    
    public TelaPrincipal() {
        initComponents();
        
        //SE ALTO AJUSTA AO TAMANHO DO MONITOR
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //ALTERANDO O ICONE PADRAO DO JAVA
        Utilitario utilitario = new Utilitario();
        utilitario.inserirIcone(this);
    }
    
    public TelaPrincipal(String email, String senha) {
       this.email = email;
       this.senha = senha;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCidadaoCadastro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnTiposVacinas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        trocarPerfil = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vacinação SARS-COV-2");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 740));
        setPreferredSize(new java.awt.Dimension(1366, 740));

        jDesktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktop.setMaximumSize(new java.awt.Dimension(1366, 768));
        jDesktop.setMinimumSize(new java.awt.Dimension(1280, 720));
        jDesktop.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jButton13.setText("Carteira de vacina");
        jPanel1.add(jButton13);
        jButton13.setBounds(50, 420, 260, 70);

        jButton11.setText("Cadastrar Doses");
        jPanel1.add(jButton11);
        jButton11.setBounds(50, 300, 260, 70);

        jButton12.setText("Cadastrar Vacina");
        jPanel1.add(jButton12);
        jButton12.setBounds(50, 180, 260, 70);

        jButton10.setText("Cadastrar Cidadão");
        jPanel1.add(jButton10);
        jButton10.setBounds(50, 60, 260, 70);

        usuario.setText("Seja bem vindo, werike!");
        usuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(usuario);
        usuario.setBounds(210, 10, 200, 15);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 47, 61));
        jLabel2.setText("Powered by Group Seven LTDA ® ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 660, 210, 15);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\Projeto_Vacina_Codiv19\\PROJETO\\vacinaSARS-CoV-2\\src\\main\\java\\br\\com\\sobrevida\\vacinaSARSCoV2\\view\\image\\transparente.png")); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, -10, 370, 810);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\Projeto_Vacina_Codiv19\\PROJETO\\vacinaSARS-CoV-2\\src\\main\\java\\br\\com\\sobrevida\\vacinaSARSCoV2\\view\\image\\painel1.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-1250, -20, 1660, 870);

        jDesktop.add(jPanel1);
        jPanel1.setBounds(1000, 0, 370, 780);

        jLabel9.setText("Setor de segurança publica");
        jDesktop.add(jLabel9);
        jLabel9.setBounds(680, 280, 150, 40);

        jLabel8.setText("Setor de educação");
        jDesktop.add(jLabel8);
        jLabel8.setBounds(370, 280, 110, 40);

        jLabel7.setText("Gestantes cadastrados");
        jDesktop.add(jLabel7);
        jLabel7.setBounds(60, 280, 130, 40);

        jLabel6.setText("Crianças cadastrados");
        jDesktop.add(jLabel6);
        jLabel6.setBounds(680, 70, 110, 40);

        jLabel5.setText("Adultos cadastrados");
        jDesktop.add(jLabel5);
        jLabel5.setBounds(370, 70, 110, 40);

        jLabel3.setText("Idosos cadastrados");
        jDesktop.add(jLabel3);
        jLabel3.setBounds(80, 70, 110, 40);

        jLabel4.setText("20");
        jDesktop.add(jLabel4);
        jLabel4.setBounds(260, 150, 20, 30);
        jDesktop.add(jButton1);
        jButton1.setBounds(56, 65, 260, 150);
        jDesktop.add(jButton9);
        jButton9.setBounds(676, 485, 260, 150);
        jDesktop.add(jButton8);
        jButton8.setBounds(366, 485, 260, 150);
        jDesktop.add(jButton7);
        jButton7.setBounds(56, 485, 260, 150);
        jDesktop.add(jButton6);
        jButton6.setBounds(676, 275, 260, 150);
        jDesktop.add(jButton5);
        jButton5.setBounds(366, 275, 260, 150);
        jDesktop.add(jButton3);
        jButton3.setBounds(56, 275, 260, 150);
        jDesktop.add(jButton4);
        jButton4.setBounds(676, 65, 260, 150);
        jDesktop.add(jButton2);
        jButton2.setBounds(366, 65, 260, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\xampp\\htdocs\\Projeto_Vacina_Codiv19\\PROJETO\\vacinaSARS-CoV-2\\src\\main\\java\\br\\com\\sobrevida\\vacinaSARSCoV2\\View\\Image\\painel1.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jDesktop.add(jLabel1);
        jLabel1.setBounds(-250, -20, 1920, 870);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1280, 720));

        jMenu1.setText("Cadastro");

        btnCidadaoCadastro.setText("Cidadão");
        btnCidadaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCidadaoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(btnCidadaoCadastro);

        jMenuItem1.setText("Vacinação");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vacinas");

        btnTiposVacinas.setText("Tipos de vacinas");
        btnTiposVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiposVacinasActionPerformed(evt);
            }
        });
        jMenu2.add(btnTiposVacinas);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Sistema");
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Sair");

        trocarPerfil.setText("Trocar perfil");
        trocarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trocarPerfilMouseClicked(evt);
            }
        });
        trocarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarPerfilActionPerformed(evt);
            }
        });
        jMenu3.add(trocarPerfil);

        sair.setText("Exit");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu3.add(sair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCidadaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCidadaoCadastroActionPerformed
        CidadaoCadastro cidadaoCadastro = new CidadaoCadastro();
        jDesktop.add(cidadaoCadastro);
        cidadaoCadastro.setVisible(true);
    }//GEN-LAST:event_btnCidadaoCadastroActionPerformed

    private void btnTiposVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiposVacinasActionPerformed
        TipoVacinaCadastro tipoVacinaCadastro = new TipoVacinaCadastro();
        jDesktop.add(tipoVacinaCadastro);
        tipoVacinaCadastro.setVisible(true);
    }//GEN-LAST:event_btnTiposVacinasActionPerformed

    private void trocarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trocarPerfilMouseClicked
        
    }//GEN-LAST:event_trocarPerfilMouseClicked

    private void trocarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarPerfilActionPerformed
        JOptionPane.showMessageDialog(null, "O programa será reiniciado!" 
            ,"Atenção", JOptionPane.WARNING_MESSAGE);
        
        TelaPrincipal.this.dispose();
        new TelaPrincipal().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Carregar carregar = new Carregar();
        carregar.setVisible(true);
    }//GEN-LAST:event_trocarPerfilActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        JOptionPane.showMessageDialog(null, "O programa será Finalizado!" 
            ,"Atenção", JOptionPane.WARNING_MESSAGE);
        
        TelaPrincipal.this.dispose();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_sairActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        
    }//GEN-LAST:event_sairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCidadaoCadastro;
    private javax.swing.JMenuItem btnTiposVacinas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem trocarPerfil;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
