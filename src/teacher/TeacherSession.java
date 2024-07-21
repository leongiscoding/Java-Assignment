/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teacher;

import learningmanagement2.*;

/**
 *
 * @author user
 */
public class TeacherSession extends javax.swing.JFrame {

    //private ProfileSession profileSession;
    /**
     * Creates new form MainSession
     */
    public TeacherSession() {
        initComponents();
        //profileSession = new ProfileSession();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mPanel1 = new javax.swing.JPanel();
        mPanel2 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        btnAcc = new javax.swing.JButton();
        mLabel2 = new javax.swing.JLabel();
        mLabel1 = new javax.swing.JLabel();
        mLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mPanel2.setBackground(new java.awt.Color(45, 155, 240));

        btnProfile.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(65, 75, 178));
        btnProfile.setText("Profile");
        btnProfile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(159, 164, 216), 3, true));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnAcc.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnAcc.setForeground(new java.awt.Color(65, 75, 178));
        btnAcc.setText("Manage Account");
        btnAcc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(159, 164, 216), 3, true));
        btnAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccActionPerformed(evt);
            }
        });

        mLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        mLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mLabel2.setText("Welcome");

        javax.swing.GroupLayout mPanel2Layout = new javax.swing.GroupLayout(mPanel2);
        mPanel2.setLayout(mPanel2Layout);
        mPanel2Layout.setHorizontalGroup(
            mPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addGroup(mPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mPanel2Layout.setVerticalGroup(
            mPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 169, Short.MAX_VALUE))
            .addGroup(mPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(mLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );

        mLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        mLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mLabel1.setText("Class Name");

        mLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        mLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mLabel3.setText("Class ID");

        javax.swing.GroupLayout mPanel1Layout = new javax.swing.GroupLayout(mPanel1);
        mPanel1.setLayout(mPanel1Layout);
        mPanel1Layout.setHorizontalGroup(
            mPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel1Layout.createSequentialGroup()
                .addComponent(mPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(mLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(mLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        mPanel1Layout.setVerticalGroup(
            mPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(mPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        ProfileSession ad = new ProfileSession(); // navigate to Profile
        ad.setVisible(true);  // display JFrame
        dispose();// 
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccActionPerformed
        
    }//GEN-LAST:event_btnAccActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcc;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel mLabel1;
    private javax.swing.JLabel mLabel2;
    private javax.swing.JLabel mLabel3;
    private javax.swing.JPanel mPanel1;
    private javax.swing.JPanel mPanel2;
    // End of variables declaration//GEN-END:variables
}
