/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class FrmProyecto extends javax.swing.JFrame {

    /**
     * Creates new form FrmProyecto
     */
    public FrmProyecto() {
        initComponents();
        pnlPrincipal.setBorder(new Fondo());
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnConjuntos = new javax.swing.JMenuItem();
        mnCmdMcm = new javax.swing.JMenuItem();
        mnTorres = new javax.swing.JMenuItem();
        jmiProductoB = new javax.swing.JMenuItem();
        jmiTrayect = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel10.setText("Beltran Geovanny");
        pnlPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 200, -1));

        jLabel13.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel13.setText("Chapi Jimmy");
        pnlPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, -1));

        jLabel12.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel12.setText("Figueroa Washington");
        pnlPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, -1));

        jLabel1.setFont(new java.awt.Font("Batang", 1, 14)); // NOI18N
        jLabel1.setText("INTEGRANTES:");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, -1));

        jMenu1.setText("Archivo");
        jMenu1.setFocusable(false);
        jMenu1.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N

        mnConjuntos.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        mnConjuntos.setText("Conjuntos");
        mnConjuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConjuntosActionPerformed(evt);
            }
        });
        jMenu1.add(mnConjuntos);

        mnCmdMcm.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        mnCmdMcm.setText("MCD MCM");
        mnCmdMcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCmdMcmActionPerformed(evt);
            }
        });
        jMenu1.add(mnCmdMcm);

        mnTorres.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        mnTorres.setText("Torres de Hanoi");
        mnTorres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTorresActionPerformed(evt);
            }
        });
        jMenu1.add(mnTorres);

        jmiProductoB.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jmiProductoB.setText("Matrices  Booleanas");
        jmiProductoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoBActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProductoB);

        jmiTrayect.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jmiTrayect.setText("Trayectorias");
        jmiTrayect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrayectActionPerformed(evt);
            }
        });
        jMenu1.add(jmiTrayect);

        jMenuItem1.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jMenuItem1.setText("Potencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConjuntosActionPerformed
        pnlPrincipal.removeAll();
        Conjuntos frmCon= new Conjuntos();
        frmCon.setVisible(true);
    }//GEN-LAST:event_mnConjuntosActionPerformed

    private void mnCmdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCmdMcmActionPerformed
        pnlPrincipal.removeAll();
        McdyMcm frmmcd= new McdyMcm();
        frmmcd.setVisible(true);
    }//GEN-LAST:event_mnCmdMcmActionPerformed

    private void mnTorresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTorresActionPerformed
       pnlPrincipal.removeAll();
        TorresHanoi frm= new TorresHanoi();
        frm.setVisible(true);
    }//GEN-LAST:event_mnTorresActionPerformed

    private void jmiProductoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoBActionPerformed
        // TODO add your handling code here:
         pnlPrincipal.removeAll();
        Formulario frm= new Formulario();
        frm.setVisible(true);
    }//GEN-LAST:event_jmiProductoBActionPerformed

    private void jmiTrayectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrayectActionPerformed
        // TODO add your handling code here:
         pnlPrincipal.removeAll();
        Principal frm= new Principal();
        frm.setVisible(true);
    }//GEN-LAST:event_jmiTrayectActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        pnlPrincipal.removeAll();
        PrincipalPotencia frm= new PrincipalPotencia();
        frm.setVisible(true);
                  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmiProductoB;
    private javax.swing.JMenuItem jmiTrayect;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnCmdMcm;
    private javax.swing.JMenuItem mnConjuntos;
    private javax.swing.JMenuItem mnTorres;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}