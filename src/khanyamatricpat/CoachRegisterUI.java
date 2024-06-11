/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package khanyamatricpat;

/**
 *
 * @author 24khanyam
 */
public class CoachRegisterUI extends javax.swing.JFrame {

    /**
     * Creates new form CoachRegister
     */
    public CoachRegisterUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coachregisterlbl = new javax.swing.JLabel();
        firstnamelbl = new javax.swing.JLabel();
        firstnametf = new javax.swing.JTextField();
        surnamelbl = new javax.swing.JLabel();
        IDnumberlbl = new javax.swing.JLabel();
        whatsappnumlbl = new javax.swing.JLabel();
        qualificationdropdown = new javax.swing.JComboBox<>();
        surnametf = new javax.swing.JTextField();
        IDnumbertf = new javax.swing.JTextField();
        SAcodelbl = new javax.swing.JLabel();
        whatsappnumtf = new javax.swing.JTextField();
        qualificationlbl = new javax.swing.JLabel();
        whatsappDetailscb = new javax.swing.JCheckBox();
        helpbtn = new javax.swing.JButton();
        signUpbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coachregisterlbl.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        coachregisterlbl.setText("Coach Register:");

        firstnamelbl.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        firstnamelbl.setText("First Name:");

        firstnametf.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        firstnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametfActionPerformed(evt);
            }
        });

        surnamelbl.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        surnamelbl.setText("Surname");

        IDnumberlbl.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        IDnumberlbl.setText("ID Number");

        whatsappnumlbl.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        whatsappnumlbl.setText("Whatsapp Number:");

        qualificationdropdown.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        qualificationdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilates", "Personal Trainer", "Yoga", "Cycling", "Aerobics" }));
        qualificationdropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationdropdownActionPerformed(evt);
            }
        });

        surnametf.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        IDnumbertf.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        SAcodelbl.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        SAcodelbl.setText("+27");

        whatsappnumtf.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        qualificationlbl.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        qualificationlbl.setText("Qualification");

        whatsappDetailscb.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        whatsappDetailscb.setText("I Want My Gym ID Whatsapped To Me ");

        helpbtn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        helpbtn.setText("need help?");

        signUpbtn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        signUpbtn.setText("Sign Up");

        backbtn.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        backbtn.setText("back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addComponent(whatsappDetailscb)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qualificationlbl)
                                .addGap(142, 142, 142)
                                .addComponent(qualificationdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(coachregisterlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(whatsappnumlbl)
                                        .addGap(54, 54, 54)
                                        .addComponent(SAcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(whatsappnumtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstnamelbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(firstnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(surnamelbl)
                                            .addComponent(IDnumberlbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDnumbertf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(surnametf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpbtn)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(signUpbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(coachregisterlbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelbl)
                    .addComponent(firstnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnamelbl)
                    .addComponent(surnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDnumberlbl)
                    .addComponent(IDnumbertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whatsappnumlbl)
                    .addComponent(SAcodelbl)
                    .addComponent(whatsappnumtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qualificationdropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualificationlbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whatsappDetailscb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(helpbtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backbtn))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametfActionPerformed

    private void qualificationdropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationdropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationdropdownActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(CoachRegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoachRegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoachRegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoachRegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoachRegisterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDnumberlbl;
    private javax.swing.JTextField IDnumbertf;
    private javax.swing.JLabel SAcodelbl;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel coachregisterlbl;
    private javax.swing.JLabel firstnamelbl;
    private javax.swing.JTextField firstnametf;
    private javax.swing.JButton helpbtn;
    private javax.swing.JComboBox<String> qualificationdropdown;
    private javax.swing.JLabel qualificationlbl;
    private javax.swing.JButton signUpbtn;
    private javax.swing.JLabel surnamelbl;
    private javax.swing.JTextField surnametf;
    private javax.swing.JCheckBox whatsappDetailscb;
    private javax.swing.JLabel whatsappnumlbl;
    private javax.swing.JTextField whatsappnumtf;
    // End of variables declaration//GEN-END:variables
}