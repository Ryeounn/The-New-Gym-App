package form;

import app.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class ForgetPasswordForm extends javax.swing.JFrame {

    public ForgetPasswordForm() {
        initComponents();
        btnShow.setOpaque(true);
        btnShow.setContentAreaFilled(true);
        btnShow.setBorderPainted(false);
        btnShow.setFocusPainted(false);
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    System.out.println(ex);
                }
                break;
            }
        }
    }

    ForgetPasswordForm(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        lbPhone = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbErrorUsername = new javax.swing.JLabel();
        lbErrorPhone = new javax.swing.JLabel();
        lbErrorEmail = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forget Password");

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtUserMouseMoved(evt);
            }
        });

        lbPhone.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbPhone.setText("Phone");

        lbUser.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbUser.setText("Username");

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtPhone.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtPhoneMouseMoved(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbEmail.setText("Email");

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(0, 102, 102));
        lbTitle.setText(" FORGET PASSWORD");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtEmail.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtEmailMouseMoved(evt);
            }
        });

        lbErrorUsername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorUsername.setForeground(new java.awt.Color(255, 0, 0));

        lbErrorPhone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorPhone.setForeground(new java.awt.Color(255, 0, 0));

        lbErrorEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbErrorEmail.setForeground(new java.awt.Color(255, 0, 0));

        btnShow.setBackground(new java.awt.Color(0, 102, 102));
        btnShow.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("SHOW PASSWORD");
        btnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        lbBack.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lbBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menubackLogin.png"))); // NOI18N
        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lbTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbErrorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUser)
                                .addComponent(txtPhone)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(lbErrorPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(lbErrorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnShow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(lbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbTitle))
                    .addComponent(lbBack))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbErrorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean checkManager() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        try {
            String sql = "select Username,Password,Firstname,Lastname,Phone,Email from Manager where Username=? AND Phone=? AND Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, phone);
            ps.setString(3, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("Username").equals(uName) && rs.getString("Phone").equals(phone) && rs.getString("Email").equals(email)) {
                    JOptionPane.showMessageDialog(this, "Hello, " + rs.getString("Firstname") + " " + rs.getString("Lastname") + "\n\nUsername: " + rs.getString("Username") + "\nPassword: " + rs.getString("Password"));
                    returnForm();
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkEmployee() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        try {
            String sql = "select UsernameEmp,Password,Firstname,Lastname,Phone,Email from Employee where UsernameEmp=? AND Phone=? AND Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, phone);
            ps.setString(3, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UsernameEmp").equals(uName) && rs.getString("Phone").equals(phone) && rs.getString("Email").equals(email)) {
                    JOptionPane.showMessageDialog(this, "Hello, " + rs.getString("Firstname") + " " + rs.getString("Lastname") + "\n\nUsername: " + rs.getString("UsernameEmp") + "\nPassword: " + rs.getString("Password"));
                    returnForm();
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkCustomer() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        try {
            String sql = "select UsernameCus,Password,Firstname,Lastname,Phone,Email from Customer where UsernameCus=? AND Phone=? AND Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, phone);
            ps.setString(3, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UsernameCus").equals(uName) && rs.getString("Phone").equals(phone) && rs.getString("Email").equals(email)) {
                    JOptionPane.showMessageDialog(this, "Hello, " + rs.getString("Firstname") + " " + rs.getString("Lastname") + "\n\nUsername: " + rs.getString("UsernameCus") + "\nPassword: " + rs.getString("Password"));
                    returnForm();
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checkPT() {
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        try {
            String sql = "select UsernamePT,Password,Firstname,Lastname,Phone,Email from PT where UsernamePT=? AND Phone=? AND Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ps.setString(2, phone);
            ps.setString(3, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("UsernamePT").equals(uName) && rs.getString("Phone").equals(phone) && rs.getString("Email").equals(email)) {
                    JOptionPane.showMessageDialog(this, "Hello, " + rs.getString("Firstname") + " " + rs.getString("Lastname") + "\n\nUsername: " + rs.getString("UsernamePT") + "\nPassword: " + rs.getString("Password"));
                    returnForm();
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public int returnForm() {
        if (JOptionPane.OK_OPTION == 0) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginForm().setVisible(true);
                }
            });
            this.setVisible(false);
        }
        return 0;
    }

    private boolean checktxtUserManager() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Username from Manager where Username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUsername.setText("Username match");
                lbErrorUsername.setForeground(Color.green);
                return true;
            } else {
                lbErrorUsername.setText("Can't find Username");
                lbErrorUsername.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserEmp() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameEmp from Employee where UsernameEmp=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUsername.setText("Username match");
                lbErrorUsername.setForeground(Color.green);
                return true;
            } else {
                lbErrorUsername.setText("Can't find Username");
                lbErrorUsername.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserPT() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernamePT from PT where UsernamePT=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUsername.setText("Username match");
                lbErrorUsername.setForeground(Color.green);
                return true;
            } else {
                lbErrorUsername.setText("Can't find Username");
                lbErrorUsername.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtUserCustomer() {
        String uName = txtUser.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select UsernameCus from Customer where UsernameCus=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, uName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorUsername.setText("Username match");
                lbErrorUsername.setForeground(Color.green);
                return true;
            } else {
                lbErrorUsername.setText("Can't find Username");
                lbErrorUsername.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPhoneManager() {
        String phone = txtPhone.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Phone from Manager where Phone=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPhone.setText("Phone match");
                lbErrorPhone.setForeground(Color.green);
                return true;
            } else {
                lbErrorPhone.setText("Can't find Phone");
                lbErrorPhone.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPhoneEmp() {
        String phone = txtPhone.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Phone from Employee where Phone=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPhone.setText("Phone match");
                lbErrorPhone.setForeground(Color.green);
                return true;
            } else {
                lbErrorPhone.setText("Can't find Phone");
                lbErrorPhone.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPhonePT() {
        String phone = txtPhone.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Phone from PT where Phone=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPhone.setText("Phone match");
                lbErrorPhone.setForeground(Color.green);
                return true;
            } else {
                lbErrorPhone.setText("Can't find Phone");
                lbErrorPhone.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtPhoneCustomer() {
        String phone = txtPhone.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Phone from Customer where Phone=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorPhone.setText("Phone match");
                lbErrorPhone.setForeground(Color.green);
                return true;
            } else {
                lbErrorPhone.setText("Can't find Phone");
                lbErrorPhone.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtEmailManager() {
        String email = txtEmail.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Email from Manager where Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorEmail.setText("Email match");
                lbErrorEmail.setForeground(Color.green);
                return true;
            } else {
                lbErrorEmail.setText("Can't find Email");
                lbErrorEmail.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtEmailEmp() {
        String email = txtEmail.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Email from Employee where Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorEmail.setText("Email match");
                lbErrorEmail.setForeground(Color.green);
                return true;
            } else {
                lbErrorEmail.setText("Can't find Email");
                lbErrorEmail.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtEmailPT() {
        String email = txtEmail.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Email from PT where Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorEmail.setText("Email match");
                lbErrorEmail.setForeground(Color.green);
                return true;
            } else {
                lbErrorEmail.setText("Can't find Email");
                lbErrorEmail.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private boolean checktxtEmailCustomer() {
        String email = txtEmail.getText();
        try {
            Connection conn = MainConnection.getConnection();
            String sql = "select Email from Customer where Email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lbErrorEmail.setText("Email match");
                lbErrorEmail.setForeground(Color.green);
                return true;
            } else {
                lbErrorEmail.setText("Can't find Email");
                lbErrorEmail.setForeground(Color.red);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        Connection conn = MainConnection.getConnection();
        boolean flag = false;
        String uName = txtUser.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        if (uName.equals("")) {
            lbErrorUsername.setText("Username can't blank");
            txtUser.requestFocus();
            flag = true;
        } else {
            lbErrorUsername.setText(null);
        }
        if (phone.equals("")) {
            lbErrorPhone.setText("Phone can't blank");
            flag = true;
        } else {
            lbErrorPhone.setText(null);
        }
        if (email.equals("")) {
            lbErrorEmail.setText("Email can't blank");
            flag = true;
        } else {
            lbErrorEmail.setText(null);
        }

        if (!flag) {
            if (checkManager()) {

            } else if (checkEmployee()) {

            } else if (checkPT()) {

            } else if (checkCustomer()) {

            } else {
                lbErrorUsername.setText("Information doesn't exist");
                lbErrorUsername.setForeground(Color.red);
                lbErrorPhone.setText("Information doesn't exist");
                lbErrorPhone.setForeground(Color.red);
                lbErrorEmail.setText("Information doesn't exist");
                lbErrorEmail.setForeground(Color.red);
            }
        }

    }//GEN-LAST:event_btnShowActionPerformed

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_lbBackMouseClicked

    private void txtUserMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseMoved
        String uName = txtUser.getText();
        boolean flag = false;
        if (uName.equals("")) {
            lbErrorUsername.setText("Username can't blank");
            lbErrorUsername.setForeground(Color.red);
            flag = true;
        }
        if (!flag) {
            if (checktxtUserManager()) {

            } else if (checktxtUserEmp()) {

            } else if (checktxtUserPT()) {

            } else if (checktxtUserCustomer()) {

            } else {
                lbErrorUsername.setText("Username doesn't exist");
            }
        }
    }//GEN-LAST:event_txtUserMouseMoved

    private void txtPhoneMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseMoved
        String phone = txtPhone.getText();
        boolean flag = false;
        if (phone.equals("")) {
            lbErrorPhone.setText("Phone can't blank");
            lbErrorPhone.setForeground(Color.red);
            flag = true;
        }
        if (!flag) {
            if (checktxtPhoneManager()) {

            } else if (checktxtPhoneEmp()) {

            } else if (checktxtPhonePT()) {

            } else if (checktxtPhoneCustomer()) {

            } else {
                lbErrorPhone.setText("Phone doesn't exist");
            }
        }
    }//GEN-LAST:event_txtPhoneMouseMoved

    private void txtEmailMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseMoved
        String email = txtEmail.getText();
        boolean flag = false;
        if (email.equals("")) {
            lbErrorEmail.setText("Email can't blank");
            lbErrorEmail.setForeground(Color.red);
            flag = true;
        }
        if (!flag) {
            if (checktxtEmailManager()) {

            } else if (checktxtEmailEmp()) {

            } else if (checktxtEmailPT()) {

            } else if (checktxtEmailCustomer()) {

            } else {
                lbErrorEmail.setText("Email doesn't exist");
            }
        }
    }//GEN-LAST:event_txtEmailMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbErrorEmail;
    private javax.swing.JLabel lbErrorPhone;
    private javax.swing.JLabel lbErrorUsername;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
