package br.com.sobrevida.vacinaSARSCoV2.view;

import br.com.sobrevida.vacinaSARSCoV2.controller.UsuarioController;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;


/**
 *
 * @author WERIKE
 */
public class TelaLogin extends javax.swing.JFrame {
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);

        //ALTERANDO O ICONE PADRAO DO JAVA
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/image/sobrevidaIcone1.png")).getImage());
        
        carga.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBotao = new javax.swing.JButton();
        loginSenha = new javax.swing.JPasswordField();
        mostraSenha = new javax.swing.JTextField();
        boxMostraSenha = new javax.swing.JCheckBox();
        loginEmail = new javax.swing.JTextField();
        linkResetCadastro = new javax.swing.JLabel();
        linkCadastroUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sobrevida - Login");
        setMaximumSize(new java.awt.Dimension(800, 510));
        setMinimumSize(new java.awt.Dimension(800, 510));
        setPreferredSize(new java.awt.Dimension(800, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        carga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/carga1.gif"))); // NOI18N
        jPanel1.add(carga);
        carga.setBounds(635, 60, 40, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(231, 214, 214), 1, true));
        jPanel2.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(116, 116, 134));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 66, 85));
        jLabel5.setText("Email address");
        jLabel5.setMaximumSize(new java.awt.Dimension(35, 17));
        jLabel5.setMinimumSize(new java.awt.Dimension(35, 17));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(35, 20, 110, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 66, 85));
        jLabel4.setText("Password");
        jLabel4.setMaximumSize(new java.awt.Dimension(35, 17));
        jLabel4.setMinimumSize(new java.awt.Dimension(35, 17));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(35, 90, 100, 20);

        loginBotao.setBackground(new java.awt.Color(226, 226, 235));
        loginBotao.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        loginBotao.setForeground(new java.awt.Color(75, 75, 91));
        loginBotao.setText("Login");
        loginBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBotaoMouseClicked(evt);
            }
        });
        loginBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBotaoActionPerformed(evt);
            }
        });
        jPanel2.add(loginBotao);
        loginBotao.setBounds(170, 150, 90, 40);

        loginSenha.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        loginSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        loginSenha.setOpaque(false);
        loginSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginSenhaKeyPressed(evt);
            }
        });
        jPanel2.add(loginSenha);
        loginSenha.setBounds(35, 110, 230, 30);

        mostraSenha.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        mostraSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mostraSenha.setOpaque(false);
        mostraSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraSenhaActionPerformed(evt);
            }
        });
        mostraSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mostraSenhaKeyPressed(evt);
            }
        });
        jPanel2.add(mostraSenha);
        mostraSenha.setBounds(35, 110, 230, 30);

        boxMostraSenha.setBackground(new java.awt.Color(255, 255, 255));
        boxMostraSenha.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        boxMostraSenha.setForeground(new java.awt.Color(113, 113, 122));
        boxMostraSenha.setText("Show password");
        boxMostraSenha.setMaximumSize(new java.awt.Dimension(35, 17));
        boxMostraSenha.setMinimumSize(new java.awt.Dimension(35, 17));
        boxMostraSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMostraSenhaActionPerformed(evt);
            }
        });
        boxMostraSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxMostraSenhaKeyPressed(evt);
            }
        });
        jPanel2.add(boxMostraSenha);
        boxMostraSenha.setBounds(34, 150, 120, 31);

        loginEmail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        loginEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        loginEmail.setOpaque(false);
        loginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmailActionPerformed(evt);
            }
        });
        loginEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginEmailKeyPressed(evt);
            }
        });
        jPanel2.add(loginEmail);
        loginEmail.setBounds(35, 40, 230, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(250, 180, 300, 210);

        linkResetCadastro.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        linkResetCadastro.setForeground(new java.awt.Color(48, 47, 61));
        linkResetCadastro.setText("RESET PASSWORD");
        linkResetCadastro.setPreferredSize(new java.awt.Dimension(35, 17));
        linkResetCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkResetCadastroMouseClicked(evt);
            }
        });
        jPanel1.add(linkResetCadastro);
        linkResetCadastro.setBounds(420, 390, 110, 40);

        linkCadastroUsuario.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        linkCadastroUsuario.setForeground(new java.awt.Color(48, 47, 61));
        linkCadastroUsuario.setText("CREATE FREE ACCOUNT");
        linkCadastroUsuario.setPreferredSize(new java.awt.Dimension(35, 17));
        linkCadastroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkCadastroUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(linkCadastroUsuario);
        linkCadastroUsuario.setBounds(270, 390, 130, 40);

        jLabel3.setBackground(new java.awt.Color(51, 44, 52));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(95, 101, 110));
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 140, 120, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo1.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(28, 52, 450, 90);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 47, 61));
        jLabel2.setText("Powered by W4 Group LTDA ® ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(626, 465, 180, 15);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparente.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 40, 600, 410);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/vacina.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 800, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 810, 530);

        getAccessibleContext().setAccessibleDescription("Sobrevida - Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkResetCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkResetCadastroMouseClicked
        TelaLogin.this.dispose();
        new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaLoginReset telaLoginReset = new TelaLoginReset();
        telaLoginReset.setVisible(true);
    }//GEN-LAST:event_linkResetCadastroMouseClicked

    private void linkCadastroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkCadastroUsuarioMouseClicked
        TelaLogin.this.dispose();
        new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaLoginCadastro telaLoginCadastro = new TelaLoginCadastro();
        telaLoginCadastro.setVisible(true);
    }//GEN-LAST:event_linkCadastroUsuarioMouseClicked

    private void loginEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginEmailKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            new Thread(){
                int i=0;

                public void run(){

                    while(i<100){
                        i = i+5;
                        try{
                            carga.setVisible(true);
                            sleep(200);//600
                        }catch (Exception e){

                        }
                    }

                    String email = (loginEmail.getText());
                    String senha = new String(loginSenha.getPassword());

                    UsuarioController usuarioController = new UsuarioController();
                    boolean logar = usuarioController.logar(email, senha, false);

                    if(logar == true){
                        carga.setVisible(false);
                        TelaLogin.this.dispose();
                        new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        Carregar1 carregar1 = new Carregar1();
                        carregar1.setVisible(true);
                    }else{
                        carga.setVisible(false);
                        //TRAR ERRO!!!!!!!!!!!!!!! avisoTelaLogin.setVisible(true);
                        loginEmail.setText("");
                        loginSenha.setText("");
                        mostraSenha.setText("");
                    }
                }
            }.start();
        }
    }//GEN-LAST:event_loginEmailKeyPressed

    private void loginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailActionPerformed

    }//GEN-LAST:event_loginEmailActionPerformed

    private void boxMostraSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxMostraSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            new Thread(){
                int i=0;

                public void run(){

                    while(i<100){
                        i = i+5;
                        try{
                            carga.setVisible(true);
                            sleep(200);//600
                        }catch (Exception e){

                        }
                    }

                    String email = (loginEmail.getText());
                    String senha = new String(loginSenha.getPassword());

                    UsuarioController usuarioController = new UsuarioController();
                    boolean logar = usuarioController.logar(email, senha, false);

                    if(logar == true){
                        carga.setVisible(false);
                        TelaLogin.this.dispose();
                        new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        Carregar1 carregar1 = new Carregar1();
                        carregar1.setVisible(true);
                    }else{
                        carga.setVisible(false);
                        //TRAR ERRO!!!!!!!!!!!!!!! avisoTelaLogin.setVisible(true);
                        loginEmail.setText("");
                        loginSenha.setText("");
                        mostraSenha.setText("");
                    }
                }
            }.start();
        }
    }//GEN-LAST:event_boxMostraSenhaKeyPressed

    private void boxMostraSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMostraSenhaActionPerformed
        String senha = new String(loginSenha.getPassword());
        if(boxMostraSenha.isSelected()){
            mostraSenha.setVisible(true);
            mostraSenha.setText(senha);
            loginSenha.setVisible(false);
        }else{
            mostraSenha.setVisible(false);
            loginSenha.setVisible(true);
        }
    }//GEN-LAST:event_boxMostraSenhaActionPerformed

    private void mostraSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mostraSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            new Thread(){
                int i=0;

                public void run(){

                    while(i<100){
                        i = i+5;
                        try{
                            carga.setVisible(true);
                            sleep(200);//600
                        }catch (Exception e){

                        }
                    }

                    String email = (loginEmail.getText());
                    String senha = new String(loginSenha.getPassword());

                    UsuarioController usuarioController = new UsuarioController();
                    boolean logar = usuarioController.logar(email, senha, false);

                    if(logar == true){
                        carga.setVisible(false);
                        TelaLogin.this.dispose();
                        new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        Carregar1 carregar1 = new Carregar1();
                        carregar1.setVisible(true);
                    }else{
                        carga.setVisible(false);
                        //TRAR ERRO!!!!!!!!!!!!!!! avisoTelaLogin.setVisible(true);
                        loginEmail.setText("");
                        loginSenha.setText("");
                        mostraSenha.setText("");
                    }
                }
            }.start();
        }
    }//GEN-LAST:event_mostraSenhaKeyPressed

    private void mostraSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraSenhaActionPerformed

    }//GEN-LAST:event_mostraSenhaActionPerformed

    private void loginSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            new Thread(){
                int i=0;

                public void run(){

                    while(i<100){
                        i = i+5;
                        try{
                            carga.setVisible(true);
                            sleep(200);//600
                        }catch (Exception e){

                        }
                    }

                    String email = (loginEmail.getText());
                    String senha = new String(loginSenha.getPassword());

                    UsuarioController usuarioController = new UsuarioController();
                    boolean logar = usuarioController.logar(email, senha, false);

                    if(logar == true){
                        carga.setVisible(false);
                        TelaLogin.this.dispose();
                        new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        Carregar1 carregar1 = new Carregar1();
                        carregar1.setVisible(true);
                    }else{
                        carga.setVisible(false);
                        //TRAR ERRO!!!!!!!!!!!!!!! avisoTelaLogin.setVisible(true);
                        loginEmail.setText("");
                        loginSenha.setText("");
                        mostraSenha.setText("");
                    }
                }
            }.start();
        }
    }//GEN-LAST:event_loginSenhaKeyPressed

    private void loginBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBotaoActionPerformed

        new Thread(){
            int i=0;

            public void run(){

                while(i<100){
                    i = i+5;
                    try{
                        carga.setVisible(true);
                        sleep(200);//600
                    }catch (Exception e){

                    }
                }

                String email = (loginEmail.getText());
                String senha = new String(loginSenha.getPassword());

                UsuarioController usuarioController = new UsuarioController();
                boolean logar = usuarioController.logar(email, senha, false);

                if(logar == true){
                    carga.setVisible(false);
                    TelaLogin.this.dispose();
                    new TelaLogin().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Carregar1 carregar1 = new Carregar1();
                    carregar1.setVisible(true);
                }else{
                    carga.setVisible(false);
                    //TRAR ERRO!!!!!!!!!!!!!!! avisoTelaLogin.setVisible(true);
                    loginEmail.setText("");
                    loginSenha.setText("");
                    mostraSenha.setText("");
                }
            }
        }.start();
    }//GEN-LAST:event_loginBotaoActionPerformed

    private void loginBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBotaoMouseClicked

    }//GEN-LAST:event_loginBotaoMouseClicked
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxMostraSenha;
    private javax.swing.JLabel carga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel linkCadastroUsuario;
    private javax.swing.JLabel linkResetCadastro;
    private javax.swing.JButton loginBotao;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JPasswordField loginSenha;
    private javax.swing.JTextField mostraSenha;
    // End of variables declaration//GEN-END:variables
}
