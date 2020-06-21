/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coeur;

import Sonoteque.Sonotheque;


/**
 *
 * @author aleja
 */
public class principales extends javax.swing.JFrame {

    /**
     * Creates new form principales
     */
    public principales() {
        initComponents();
        this.setLocationRelativeTo(null);
       
       
    }




     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabelNetwork = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelMessage = new javax.swing.JLabel();
        jComboBoxChoose = new javax.swing.JComboBox<>();
        jButtonClose = new javax.swing.JButton();
        jButtonSend = new javax.swing.JButton();
        jLabelFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(2, 21, 38));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNetwork.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNetwork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNetwork.setForeground(new java.awt.Color(51, 255, 153));
        jLabelNetwork.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 320, 60));

        jPanel2.setBackground(new java.awt.Color(2, 21, 38));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUser.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(51, 255, 153));
        jLabelUser.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 320, 90));

        jPanel1.setBackground(new java.awt.Color(2, 21, 38));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelMessage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMessage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(51, 255, 153));
        jLabelMessage.setText("<html>Bienvenue : Cette application vise à identifier une touche de piano (numéro et note de musique) à partir d'un fichier sonore d'entrée.   <br>  Rappel :  <br>A->La  B->Si  C->Do  D->Ré  ,E->Mi  F->Fa  G->"
            + "Sol. <br> Veuillez sélectionner un fichier à télécharger :  </html>");
        jLabelMessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jComboBoxChoose.setBackground(new java.awt.Color(2, 21, 38));
        jComboBoxChoose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxChoose.setForeground(new java.awt.Color(255, 0, 204));
        jComboBoxChoose.setMaximumRowCount(52);
        jComboBoxChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A0.wav", "A1.wav", "A2.wav", "A3.wav", "A4.wav", "A5.wav", "A6.wav", "A7.wav", "B0.wav", "B1.wav", "B2.wav", "B3.wav", "B4.wav", "B5.wav", "B6.wav", "B7.wav", "C1.wav", "C2.wav", "C3.wav", "C4.wav", "C5.wav", "C6.wav", "C7.wav", "C8.wav", "D1.wav", "D2.wav", "D3.wav", "D4.wav", "D5.wav", "D6.wav", "D7.wav", "E1.wav", "E2.wav", "E3.wav", "E4.wav", "E5.wav", "E6.wav", "E7.wav", "F1.wav", "F2.wav", "F3.wav", "F4.wav", "F5.wav", "F6.wav", "F7.wav", "G1.wav", "G2.wav", "G3.wav", "G4.wav", "G5.wav", "G6.wav", "G7.wav" }));
        jComboBoxChoose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBoxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 140));

        jButtonClose.setBackground(new java.awt.Color(153, 0, 153));
        jButtonClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(255, 153, 255));
        jButtonClose.setText("X");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jButtonSend.setBackground(new java.awt.Color(150, 0, 153));
        jButtonSend.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSend.setForeground(new java.awt.Color(255, 153, 255));
        jButtonSend.setText("Envoyer");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        String Path=System.getProperty("user.dir");
        jLabelFond.setIcon(new javax.swing.ImageIcon(Path+"\\src\\main\\java\\images\\fondo1.png"));
        getContentPane().add(jLabelFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jComboBoxChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxChooseActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
      
        
        SoundCreatorText(jComboBoxChoose.getSelectedItem().toString());
       
        
    }//GEN-LAST:event_jButtonSendActionPerformed

    public void SoundCreatorText(String name )
    {
        Sonotheque son=new Sonotheque(name);
        jLabelUser.setText("<html>Lecture du fichier WAV "+name+"<br>"+ "Frequence: "+son.frequence+"<br>"+"échantillons à "+son.length+"</html>");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
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
            java.util.logging.Logger.getLogger(principales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principales().setVisible(true);
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JComboBox<String> jComboBoxChoose;
    private javax.swing.JLabel jLabelFond;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNetwork;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
