/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RAIN DROPS IT
 */
public class CourseForm extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;

    List<Coursef> pList;
    ManageCourseForm mc;

    public CourseForm() {
        initComponents();
        pList = new ArrayList<>();
        pLabel();
    }
     public CourseForm(ManageCourseForm mc) {
        this.mc=mc;
        initComponents();
    }
//     public void fl(){
//         pList = new ArrayList<>();
//        
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolbd", "root", "nh123456");
//            pst = con.prepareStatement("Select * from product");
//
//            ResultSet rs = pst.executeQuery();
//            while (rs.next()) {
//                pList.add(new Coursef(rs.getString(1), rs.getInt(2), rs.getInt(3),
//                        rs.getDouble(4),rs.getDouble(5)));
//            }
//        } catch (Exception e) {
//        }
//    }

    private void pLabel() {
        //fl();

        pList.add(new Coursef("Java", 400, 40000, 10.00));
        pList.add(new Coursef("C++", 600, 60000, 20.00));
        pList.add(new Coursef("C#", 450, 70000, 25.00));
        pList.add(new Coursef("JavaScript", 250, 15000, 5.00));
        pList.add(new Coursef("Database", 300, 30000, 10.00));
        pList.add(new Coursef("Web Developing", 350, 350000, 15.00));
        pList.add(new Coursef("Networking", 150, 60000, 00.00));
        pList.add(new Coursef("Graphics", 150, 25000, 20.00));
        for (int i = 0; i < pList.size(); i++) {
            jCombo_Label.addItem(pList.get(i).getLabel());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner_Hours = new javax.swing.JSpinner();
        jButton_Insert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Coursef = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Discount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Total = new javax.swing.JTextField();
        jCombo_Label = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Label:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hours:");

        jSpinner_Hours.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner_Hours.setModel(new javax.swing.SpinnerNumberModel(4, 4, 300, 1));

        jButton_Insert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Insert.setText("Insert");
        jButton_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Course fee:");

        jTextField_Coursef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Coursef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CoursefActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Discount:");

        jTextField_Discount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DiscountActionPerformed(evt);
            }
        });
        jTextField_Discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_DiscountKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total:");

        jTextField_Total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jCombo_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCombo_Label.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombo_LabelItemStateChanged(evt);
            }
        });
        jCombo_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_LabelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("  Course Information");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jCombo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jSpinner_Hours, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jTextField_Coursef, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jTextField_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jButton_Insert))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jCombo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jSpinner_Hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTextField_Coursef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jTextField_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton_Insert)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertActionPerformed
        // TODO add your handling code here:
        student();
    }//GEN-LAST:event_jButton_InsertActionPerformed

    private void jCombo_LabelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombo_LabelItemStateChanged
        // TODO add your handling code here:
//         fl();
        jSpinner_Hours.setValue(pList.get(jCombo_Label.getSelectedIndex()).getHour());
        jTextField_Discount.setText(String.valueOf(pList.get(jCombo_Label.getSelectedIndex()).getDiscount()));
        jTextField_Coursef.setText(String.valueOf(pList.get(jCombo_Label.getSelectedIndex()).getCoursefee()));
        // jTextField_Total.setText(String.valueOf(pList.get(jCombo_Label.getSelectedIndex()).getTotal()));  

        int c = Integer.parseInt(jTextField_Coursef.getText());
        double d = Double.parseDouble(jTextField_Discount.getText());
        double b = c * d / 100;
        double t = c - b;
        jTextField_Total.setText(String.valueOf(t));
    }//GEN-LAST:event_jCombo_LabelItemStateChanged

    private void jTextField_DiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DiscountKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_DiscountKeyReleased

    private void jTextField_CoursefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CoursefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CoursefActionPerformed

    private void jCombo_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_LabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_LabelActionPerformed

    private void jTextField_DiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DiscountActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_DiscountActionPerformed
    public void student() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolbd", "root", "nh123456");
            pst = con.prepareStatement("select id from course ORDER BY id DESC LIMIT 1");
            ResultSet rs = pst.executeQuery();
            int id = 0;
            while (rs.next()) {
                id = rs.getInt(1);
            }

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolbd", "root", "nh123456");
            pst = con.prepareStatement("Insert into course values(?,?,?,?,?,?)");

            pst.setInt(1, Integer.parseInt(String.valueOf(id + 1)));
            pst.setString(2, jCombo_Label.getSelectedItem().toString());
            pst.setInt(3, Integer.parseInt(jSpinner_Hours.getValue().toString()));
            pst.setInt(4, Integer.parseInt(jTextField_Coursef.getText()));
            pst.setDouble(5, Double.parseDouble(jTextField_Discount.getText()));
            pst.setDouble(6, Double.parseDouble(jTextField_Total.getText()));

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Insert successfull");
                mc.doshow();
            } else {
                JOptionPane.showMessageDialog(null, "Insert not successfull");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Duplicate entry!");
            System.out.println(e);
//            JOptionPane.showMessageDialog(null, "Duplicate entry!");
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Insert;
    private javax.swing.JComboBox<String> jCombo_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner_Hours;
    private javax.swing.JTextField jTextField_Coursef;
    private javax.swing.JTextField jTextField_Discount;
    private javax.swing.JTextField jTextField_Total;
    // End of variables declaration//GEN-END:variables
}
