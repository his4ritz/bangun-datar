/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jLabel1 = new javax.swing.JLabel();
        tpersegi = new javax.swing.JButton();
        tpersegipanjang = new javax.swing.JButton();
        tlingkaran = new javax.swing.JButton();
        tsegitiga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("APLIKASI BANGUN DATAR");

        tpersegi.setBackground(new java.awt.Color(204, 204, 255));
        tpersegi.setText("persegi");
        tpersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpersegiActionPerformed(evt);
            }
        });

        tpersegipanjang.setBackground(new java.awt.Color(204, 204, 255));
        tpersegipanjang.setText("persegi panjang");
        tpersegipanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpersegipanjangActionPerformed(evt);
            }
        });

        tlingkaran.setBackground(new java.awt.Color(204, 204, 255));
        tlingkaran.setText("lingkaran");
        tlingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlingkaranActionPerformed(evt);
            }
        });

        tsegitiga.setBackground(new java.awt.Color(204, 204, 255));
        tsegitiga.setText("segitiga");
        tsegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsegitigaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpersegipanjang)
                            .addComponent(tpersegi)
                            .addComponent(tlingkaran)
                            .addComponent(tsegitiga))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(tpersegi)
                .addGap(24, 24, 24)
                .addComponent(tpersegipanjang)
                .addGap(18, 18, 18)
                .addComponent(tlingkaran)
                .addGap(18, 18, 18)
                .addComponent(tsegitiga)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tpersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpersegiActionPerformed
        // TODO add your handling code here:
        new persegi().setVisible(true);
    }//GEN-LAST:event_tpersegiActionPerformed

    private void tpersegipanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpersegipanjangActionPerformed
        // TODO add your handling code here:
        new persegipanjang().setVisible(true);
    }//GEN-LAST:event_tpersegipanjangActionPerformed

    private void tlingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlingkaranActionPerformed
      new lingkaran().setVisible(true);
    }//GEN-LAST:event_tlingkaranActionPerformed

    private void tsegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsegitigaActionPerformed
           // TODO add your handling code here:
           new segitiga().setVisible(true);
    }//GEN-LAST:event_tsegitigaActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tlingkaran;
    private javax.swing.JButton tpersegi;
    private javax.swing.JButton tpersegipanjang;
    private javax.swing.JButton tsegitiga;
    // End of variables declaration//GEN-END:variables
}
