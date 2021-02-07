
package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;


public class TelaLogin extends javax.swing.JFrame {

    ConexaoBD con = new ConexaoBD();
    
    public TelaLogin() {
        initComponents();
        con.conexao();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelLoginDeUsuario = new javax.swing.JLabel();
        jLabelFundoTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(80, 260, 80, 30);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(190, 260, 80, 30);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUsuario.setText("Usuário");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(20, 180, 52, 20);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(20, 220, 50, 20);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(80, 180, 190, 30);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(80, 220, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/—Pngtree—medical logo_128-128.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 130, 120);

        jLabelLoginDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelLoginDeUsuario.setText("Login de Usuário");
        getContentPane().add(jLabelLoginDeUsuario);
        jLabelLoginDeUsuario.setBounds(100, 120, 160, 40);

        jLabelFundoTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/doctor-1149149_640.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaLogin);
        jLabelFundoTelaLogin.setBounds(0, 0, 640, 420);

        setSize(new java.awt.Dimension(654, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        /*if(jTextFieldUsuario.getText().equals("admin")&&jPasswordFieldSenha.getText().equals("1234")){//Comando para fazer comparação.Se o usuário e senha estiver correto, a tela de login irá fechar e o sistema abrirá.
        TelaPrincipal tela=new TelaPrincipal();//criado um novo objeto da classe TelaPrincipal
        tela.setVisible(true);//serve para chamar tela quando o botão é clicado.
        dispose();//fecha tela anterior
    }//GEN-LAST:event_jButtonAcessarActionPerformed
        else{
            JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário Invalidos!");
        }*/
        
        try {
            con.executaSql("select *from usuarios where usu_nome='"+jTextFieldUsuario.getText()+"'");
            con.rs.first();
            if(con.rs.getString("usu_senha").equals(jPasswordFieldSenha.getText())){
            TelaPrincipal tela= new TelaPrincipal(jTextFieldUsuario.getText());
            tela.setVisible(true);
            dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário invalidos!");
            }
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário invalidos!"+ex);
        }
    }
    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoTelaLogin;
    private javax.swing.JLabel jLabelLoginDeUsuario;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
