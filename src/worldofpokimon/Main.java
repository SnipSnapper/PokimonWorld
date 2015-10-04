/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofpokimon;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ceess
 */
public class Main extends javax.swing.JFrame {
    Connection connection = null;
    Statement stmt = null;
    String yolo;
    String username;
    String password;
    String logInUsername;
    String logInPassword;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/dev1",
            "postgres", "lollipop");
        } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainScreen = new javax.swing.JPanel();
        registerScreenButton = new javax.swing.JButton();
        loginScreenButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registerScreen = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        usernameField = new javax.swing.JFormattedTextField();
        passwordText = new javax.swing.JLabel();
        firstNameText = new javax.swing.JLabel();
        firstNameField = new javax.swing.JFormattedTextField();
        lastNameText = new javax.swing.JLabel();
        lastNameField = new javax.swing.JFormattedTextField();
        IBANText = new javax.swing.JLabel();
        IBANField = new javax.swing.JFormattedTextField();
        passwordField = new javax.swing.JPasswordField();
        loginScreen = new javax.swing.JPanel();
        logInButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logInUsernameField = new javax.swing.JFormattedTextField();
        logInPasswordField = new javax.swing.JPasswordField();
        userScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 0));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        mainPanel.setLayout(new java.awt.CardLayout());

        mainScreen.setMaximumSize(new java.awt.Dimension(480, 440));
        mainScreen.setMinimumSize(new java.awt.Dimension(480, 440));
        mainScreen.setPreferredSize(new java.awt.Dimension(480, 440));

        registerScreenButton.setText("Register");
        registerScreenButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerScreenButton.setMaximumSize(new java.awt.Dimension(100, 25));
        registerScreenButton.setMinimumSize(new java.awt.Dimension(100, 25));
        registerScreenButton.setPreferredSize(new java.awt.Dimension(100, 25));
        registerScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerScreenButtonActionPerformed(evt);
            }
        });

        loginScreenButton.setText("Log In");
        loginScreenButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginScreenButton.setMaximumSize(new java.awt.Dimension(100, 25));
        loginScreenButton.setMinimumSize(new java.awt.Dimension(100, 25));
        loginScreenButton.setPreferredSize(new java.awt.Dimension(100, 25));
        loginScreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginScreenButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("World of Pokimon");

        javax.swing.GroupLayout mainScreenLayout = new javax.swing.GroupLayout(mainScreen);
        mainScreen.setLayout(mainScreenLayout);
        mainScreenLayout.setHorizontalGroup(
            mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainScreenLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGroup(mainScreenLayout.createSequentialGroup()
                        .addComponent(loginScreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerScreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91))
        );
        mainScreenLayout.setVerticalGroup(
            mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainScreenLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(267, 267, 267)
                .addGroup(mainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerScreenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginScreenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        mainPanel.add(mainScreen, "mainScreen");

        registerScreen.setMaximumSize(new java.awt.Dimension(480, 440));
        registerScreen.setMinimumSize(new java.awt.Dimension(480, 440));
        registerScreen.setPreferredSize(new java.awt.Dimension(480, 440));

        registerButton.setText("Register");
        registerButton.setMaximumSize(new java.awt.Dimension(80, 25));
        registerButton.setMinimumSize(new java.awt.Dimension(80, 25));
        registerButton.setPreferredSize(new java.awt.Dimension(80, 25));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(130, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(130, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 40));

        usernameText.setText("username");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordText.setText("password");

        firstNameText.setText("first name");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        lastNameText.setText("last name");

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        IBANText.setText("IBAN");

        IBANField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IBANFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerScreenLayout = new javax.swing.GroupLayout(registerScreen);
        registerScreen.setLayout(registerScreenLayout);
        registerScreenLayout.setHorizontalGroup(
            registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerScreenLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerScreenLayout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerScreenLayout.createSequentialGroup()
                        .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerScreenLayout.createSequentialGroup()
                                .addComponent(firstNameText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerScreenLayout.createSequentialGroup()
                                .addComponent(lastNameText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerScreenLayout.createSequentialGroup()
                                .addComponent(IBANText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IBANField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerScreenLayout.createSequentialGroup()
                                .addComponent(passwordText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerScreenLayout.createSequentialGroup()
                                    .addComponent(usernameText)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(163, 163, 163))))
        );
        registerScreenLayout.setVerticalGroup(
            registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerScreenLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText))
                .addGap(11, 11, 11)
                .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameText)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameText)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IBANText)
                    .addComponent(IBANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        mainPanel.add(registerScreen, "registerScreen");

        loginScreen.setPreferredSize(new java.awt.Dimension(480, 439));

        logInButton.setText("Log In");
        logInButton.setMaximumSize(new java.awt.Dimension(80, 25));
        logInButton.setMinimumSize(new java.awt.Dimension(80, 25));
        logInButton.setPreferredSize(new java.awt.Dimension(80, 25));
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Log In");

        jLabel6.setText("Username");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Password");
        jLabel7.setMaximumSize(new java.awt.Dimension(48, 14));
        jLabel7.setMinimumSize(new java.awt.Dimension(48, 14));
        jLabel7.setPreferredSize(new java.awt.Dimension(48, 14));

        logInUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInUsernameFieldActionPerformed(evt);
            }
        });

        logInPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginScreenLayout = new javax.swing.GroupLayout(loginScreen);
        loginScreen.setLayout(loginScreenLayout);
        loginScreenLayout.setHorizontalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginScreenLayout.createSequentialGroup()
                        .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logInPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(logInUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addGap(0, 160, Short.MAX_VALUE))
            .addGroup(loginScreenLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        loginScreenLayout.setVerticalGroup(
            loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginScreenLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(63, 63, 63)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(logInUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(loginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        mainPanel.add(loginScreen, "loginScreen");

        userScreen.setMaximumSize(new java.awt.Dimension(480, 440));
        userScreen.setMinimumSize(new java.awt.Dimension(480, 440));
        userScreen.setPreferredSize(new java.awt.Dimension(480, 440));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Screen");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(130, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(130, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(130, 30));

        logOutButton.setText("Log Out");
        logOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logOutButton.setMaximumSize(new java.awt.Dimension(80, 25));
        logOutButton.setMinimumSize(new java.awt.Dimension(80, 25));
        logOutButton.setPreferredSize(new java.awt.Dimension(80, 25));
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userScreenLayout = new javax.swing.GroupLayout(userScreen);
        userScreen.setLayout(userScreenLayout);
        userScreenLayout.setHorizontalGroup(
            userScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userScreenLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        userScreenLayout.setVerticalGroup(
            userScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userScreenLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        mainPanel.add(userScreen, "userScreen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginScreenButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "loginScreen");
    }//GEN-LAST:event_loginScreenButtonActionPerformed

    private void registerScreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerScreenButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "registerScreen");
    }//GEN-LAST:event_registerScreenButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        getRegistration();
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "mainScreen");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "mainScreen");
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        getUser();
    }//GEN-LAST:event_logInButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void IBANFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IBANFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IBANFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void logInUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logInUsernameFieldActionPerformed

    private void logInPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logInPasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void getRegistration()
    {
        
        String reg_username = usernameField.getText();
        String reg_password = passwordField.getText();
        String reg_firstName = firstNameField.getText();      
        String reg_lastName = lastNameField.getText();
        String reg_iban = IBANField.getText();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Users WHERE user_name = '" + reg_username + "';" );
            while ( rs.next() ) {
                username = rs.getString("user_name");
                password  = rs.getString("password");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*if(reg_username.equals(reg_username)){
            System.out.println("het werkt");
        } else{
            Users s = new Users();
            System.out.println(reg_username);
            s.setUserName(reg_username);
            s.setPassword(reg_password);
            s.setFirstName(reg_firstName);
            s.setLastName(reg_lastName);
            s.setIban(reg_iban);
            persist(s);
        }*/
        
    }
    public void getUser(){
        
    try{
    stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery( "SELECT * FROM Users;" );
    while ( rs.next() ) {
            username = rs.getString("user_name");
            password  = rs.getString("password");
            
    }
    }
    catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
    }
    logInUsername = logInUsernameField.getText();
    logInPassword = logInPasswordField.getText();
    if(username.equals(logInUsername) && password.equals(logInPassword)){
            CardLayout card = (CardLayout)mainPanel.getLayout();
            card.show(mainPanel, "userScreen");
        }else{
            System.out.println("username or password doesn't match");
        }
    }
    
    public static void persist(Object object) 
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WorldOfPokimonPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField IBANField;
    private javax.swing.JLabel IBANText;
    private javax.swing.JFormattedTextField firstNameField;
    private javax.swing.JLabel firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField lastNameField;
    private javax.swing.JLabel lastNameText;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField logInPasswordField;
    private javax.swing.JFormattedTextField logInUsernameField;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel loginScreen;
    private javax.swing.JButton loginScreenButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerScreen;
    private javax.swing.JButton registerScreenButton;
    private javax.swing.JPanel userScreen;
    private javax.swing.JFormattedTextField usernameField;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables

}
