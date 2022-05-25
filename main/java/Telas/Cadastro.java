package Telas;

import Cliente.Cliente;
import Conexão.ClienteSQL;
import Conexão.Conexao;
import Controlador.ControladorCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Cadastro extends javax.swing.JFrame {

    private final ControladorCadastro controlador;

    
    public Cadastro() {
        initComponents();
        controlador = new ControladorCadastro(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldendereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldsenha = new javax.swing.JPasswordField();
        jTextFieldsaldo = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcpfActionPerformed(evt);
            }
        });

        jTextFieldendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldenderecoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Endereco");

        jTextFieldnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Saldo");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Senha");

        jTextFieldsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldnome, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jTextFieldendereco)
                            .addComponent(jTextFieldcpf)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jPasswordFieldsenha)
                            .addComponent(jTextFieldsaldo))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcpfActionPerformed
        
    }//GEN-LAST:event_jTextFieldcpfActionPerformed

    private void jTextFieldenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldenderecoActionPerformed
        
    }//GEN-LAST:event_jTextFieldenderecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       controlador.salvaCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsaldoActionPerformed
        
    }//GEN-LAST:event_jTextFieldsaldoActionPerformed

    private void jTextFieldnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnomeActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    public JPasswordField getjPasswordFieldsenha() {
        return jPasswordFieldsenha;
    }

    public void setjPasswordFieldsenha(JPasswordField jPasswordFieldsenha) {
        this.jPasswordFieldsenha = jPasswordFieldsenha;
    }

    public JTextField getjTextFieldcpf() {
        return jTextFieldcpf;
    }

    public void setjTextFieldcpf(JTextField jTextFieldcpf) {
        this.jTextFieldcpf = jTextFieldcpf;
    }

    public JTextField getjTextFieldendereco() {
        return jTextFieldendereco;
    }

    public void setjTextFieldendereco(JTextField jTextFieldendereco) {
        this.jTextFieldendereco = jTextFieldendereco;
    }

    public JTextField getjTextFieldnome() {
        return jTextFieldnome;
    }

    public void setjTextFieldnome(JTextField jTextFieldnome) {
        this.jTextFieldnome = jTextFieldnome;
    }

    public JTextField getjTextFieldsaldo() {
        return jTextFieldsaldo;
    }

    public void setjTextFieldsaldo(JTextField jTextFieldsaldo) {
        this.jTextFieldsaldo = jTextFieldsaldo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldsenha;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldcpf;
    private javax.swing.JTextField jTextFieldendereco;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldsaldo;
    // End of variables declaration//GEN-END:variables
}
