/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codes;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.regex.*;
import javax.swing.UIManager;

/**
 *
 * @author Lenovo
 */
public class LoginFrame extends javax.swing.JFrame {

    String id = randomValue();

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        /*ToggleSwitch ts = new ToggleSwitch();
        ts.setLocation(450, 15);
        pnl_signIn.add(ts);*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnl_signIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        ptxt_password = new javax.swing.JPasswordField();
        btn_signIn = new javax.swing.JButton();
        rbtn_admin = new javax.swing.JRadioButton();
        rbtn_user = new javax.swing.JRadioButton();
        cbox_showPw = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        btn_signUp1 = new javax.swing.JButton();
        lbl_email = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        darkMenu = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Password:");

        btn_signIn.setText("Sign In");
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_admin);
        rbtn_admin.setText("Admin");

        buttonGroup1.add(rbtn_user);
        rbtn_user.setText("User");

        cbox_showPw.setText("Show Password");
        cbox_showPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_showPwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_signInLayout = new javax.swing.GroupLayout(pnl_signIn);
        pnl_signIn.setLayout(pnl_signInLayout);
        pnl_signInLayout.setHorizontalGroup(
            pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_signInLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_signInLayout.createSequentialGroup()
                        .addComponent(btn_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_signInLayout.createSequentialGroup()
                        .addComponent(rbtn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_signInLayout.createSequentialGroup()
                        .addGroup(pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_signInLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pnl_signInLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                        .addGroup(pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_signInLayout.createSequentialGroup()
                                .addComponent(ptxt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbox_showPw)))
                        .addGap(113, 113, 113))))
        );
        pnl_signInLayout.setVerticalGroup(
            pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_signInLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptxt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbox_showPw))
                .addGap(27, 27, 27)
                .addGroup(pnl_signInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_user)
                    .addComponent(rbtn_admin))
                .addGap(18, 18, 18)
                .addComponent(btn_signIn)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Login", pnl_signIn);

        jLabel3.setText("Phone Number");

        btn_signUp1.setText("Sign Up");
        btn_signUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signUp1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel5.setText("Name-Surname");

        jLabel6.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btn_signUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_signUp1)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Register", jPanel2);

        jMenu1.setText("Options");

        darkMenu.setText("Dark Mode");
        darkMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkMenuActionPerformed(evt);
            }
        });
        jMenu1.add(darkMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    //Giving random value for complaint IDs.
    public String randomValue() {
        int value = (int) (Math.random() * 9000) + 1000;
        return value + "";
    }

    //Creating connection
    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/BPProjectDB", "username", "123");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        if (rbtn_admin.isSelected()) {
            if (txt_id.getText().equals("001") && ptxt_password.getText().equals("admin")) { //conditions for admin login.
                AdminMain frameAdmin = new AdminMain();
                frameAdmin.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login failed.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (rbtn_user.isSelected()) {
            if (txt_id.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter your ID", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                Connection con;
                try {
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/BPProjectDB", "username", "123");
                    Statement s = con.createStatement();
                    String query = "SELECT * FROM TBL_USER WHERE ID=" + txt_id.getText(); //checking customer IDs
                    ResultSet rs = s.executeQuery(query);

                    if (rs.next()) {
                        CustomerMain frameCustomer = new CustomerMain();
                        frameCustomer.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong ID or password!", "Warning", JOptionPane.WARNING_MESSAGE);

                    }
                } catch (SQLException ex) {
                    System.out.println("Unable to connect database");
                    System.out.println(ex.getMessage());
                }

            }
    }//GEN-LAST:event_btn_signInActionPerformed
    }
    private void cbox_showPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_showPwActionPerformed
        if (cbox_showPw.isSelected()) {
            ptxt_password.setEchoChar((char) 0);
        } else {
            ptxt_password.setEchoChar('*');
        }
    }//GEN-LAST:event_cbox_showPwActionPerformed

    private void btn_signUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signUp1ActionPerformed
        if (txt_name.getText().equals("") || txt_email.getText().equals("") || txt_phone.getText().equals("") || txt_pass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all informations.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection con = getConnection();
                Statement s = con.createStatement();
                String query = "INSERT INTO TBL_USER VALUES (?,?,?,?,?)"; //inserting values to database
                PreparedStatement pst = con.prepareStatement(query);

                boolean isExists = false;
                while (isExists) {
                    id = randomValue();
                    Statement s3 = con.createStatement();
                    String query4 = "SELECT * FROM TBL_COMPLAINTS";
                    ResultSet rs3 = s3.executeQuery(query4);

                    while (rs3.next()) {
                        if (rs3.getString("ID").equals(id)) { //if random value is created before, it will create a new random value.
                            isExists = true;
                            break;
                        }
                    }
                }

                boolean allTrue = false;
                String query1 = "SELECT * FROM TBL_USER WHERE ID=" + id;
                ResultSet rs = s.executeQuery(query1);
                if (rs.next()) {

                } else {
                    pst.setString(1, id);
                    allTrue = false;
                }

                if (txt_name.getText().isEmpty()) {
                    lbl_name.setText("Please fill the area.");

                } else {
                    Matcher matcher;
                    matcher = Pattern.compile("^\\w{2,}\\s\\w{2,}$").matcher(txt_name.getText()); //First name and last name at least 2 letters
                    if (!matcher.find()) {
                        lbl_name.setText("Please enter a valid name.");

                    } else {
                        lbl_name.setText("");
                        pst.setString(2, txt_name.getText()); //saving to database
                        allTrue = false;
                    }
                }

                if (txt_email.getText().isEmpty()) {
                    lbl_email.setText("Please fill the area.");
                } else {
                    Matcher matcher;
                    matcher = Pattern.compile("^[a-zA-Z][\\w]{3,}@(gmail|hotmail)(.com)$").matcher(txt_email.getText()); //at least 3 letters, should contain @, gmail, hotmail.
                    if (!matcher.find()) {
                        lbl_email.setText("Please enter a valid email.");
                    } else {
                        lbl_email.setText("");
                        pst.setString(3, txt_email.getText());
                        allTrue = false;
                    }
                }

                if (txt_pass.getText().isEmpty()) {
                    lbl_pass.setText("Please fill the area.");
                } else {
                    Matcher matcher;
                    matcher = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d]){5,}").matcher(txt_pass.getText()); //at least 1 big letter, one small letter, 1 number. 5 characters at least.
                    if (!matcher.find()) {
                        lbl_pass.setText("Please enter a valid password.");
                    } else {
                        lbl_pass.setText("");
                        pst.setString(4, txt_pass.getText());
                        allTrue = false;
                    }
                }

                if (txt_phone.getText().isEmpty()) {
                    lbl_phone.setText("Please fill the area.");
                } else {
                    Matcher matcher;
                    matcher = Pattern.compile("^\\d{10}$").matcher(txt_phone.getText()); //10 digits
                    if (!matcher.find()) {
                        lbl_phone.setText("Please enter a valid phone number.");
                    } else {
                        lbl_phone.setText("");
                        pst.setString(5, txt_phone.getText());
                        allTrue = true;
                    }

                }
                if (allTrue) {
                    JOptionPane.showMessageDialog(this, "Your registration is completed. Your ID is " + id, "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Please fill all areas correctly", "Error", JOptionPane.WARNING_MESSAGE);
                }
                pst.executeUpdate();
                con.close();
            } catch (SQLException ex) {
                System.out.println("Unable to connect database");
            }
    }//GEN-LAST:event_btn_signUp1ActionPerformed
    }
    private void darkMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkMenuActionPerformed
        if (darkMenu.isSelected()) {
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatDarculaLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                } else {
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            FlatAnimatedLafChange.showSnapshot();
                            FlatIntelliJLaf.setup();
                            FlatLaf.updateUI();
                            FlatAnimatedLafChange.hideSnapshotWithAnimation();
                        }
                    });
                }
    }//GEN-LAST:event_darkMenuActionPerformed
      
    /**
         * @param args the command line arguments
         */

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_signIn;
    private javax.swing.JButton btn_signUp1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbox_showPw;
    private javax.swing.JCheckBoxMenuItem darkMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JPanel pnl_signIn;
    private javax.swing.JPasswordField ptxt_password;
    private javax.swing.JRadioButton rbtn_admin;
    private javax.swing.JRadioButton rbtn_user;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
