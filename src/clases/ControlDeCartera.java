/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Invitado
 */
public class ControlDeCartera extends javax.swing.JFrame {

    /**
     * Creates new form ControlDeCartera
     */
    public ControlDeCartera() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCliente = new javax.swing.JButton();
        botonAbono = new javax.swing.JButton();
        botonDeuda = new javax.swing.JButton();
        botonVolverAMenuPrincipal = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 550));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cliente2.png"))); // NOI18N
        botonCliente.setText("CLIENTE");
        botonCliente.setToolTipText("");
        botonCliente.setContentAreaFilled(false);
        botonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCliente.setMaximumSize(new java.awt.Dimension(160, 170));
        botonCliente.setMinimumSize(new java.awt.Dimension(160, 170));
        botonCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cliente2.png"))); // NOI18N
        botonCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cliente1.png"))); // NOI18N
        botonCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });
        jPanel1.add(botonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 340));

        botonAbono.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonAbono.setForeground(new java.awt.Color(255, 255, 255));
        botonAbono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Deuda2.png"))); // NOI18N
        botonAbono.setText("DEUDAS");
        botonAbono.setContentAreaFilled(false);
        botonAbono.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        botonAbono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAbono.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Deuda2.png"))); // NOI18N
        botonAbono.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Deuda1.png"))); // NOI18N
        botonAbono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(botonAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 260, 340));

        botonDeuda.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonDeuda.setForeground(new java.awt.Color(255, 255, 255));
        botonDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Abono_2.png"))); // NOI18N
        botonDeuda.setText("ABONOS");
        botonDeuda.setToolTipText("");
        botonDeuda.setContentAreaFilled(false);
        botonDeuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDeuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDeuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Abono_2.png"))); // NOI18N
        botonDeuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Abono_1.png"))); // NOI18N
        botonDeuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeudaActionPerformed(evt);
            }
        });
        jPanel1.add(botonDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 280, 340));

        botonVolverAMenuPrincipal.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        botonVolverAMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverAMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras 2.png"))); // NOI18N
        botonVolverAMenuPrincipal.setText("MENU PRINCIPAL");
        botonVolverAMenuPrincipal.setContentAreaFilled(false);
        botonVolverAMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolverAMenuPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVolverAMenuPrincipal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras 2.png"))); // NOI18N
        botonVolverAMenuPrincipal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras 1.png"))); // NOI18N
        botonVolverAMenuPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonVolverAMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolverAMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 90));

        botonAyuda.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        botonAyuda.setForeground(new java.awt.Color(255, 255, 255));
        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda 2.png"))); // NOI18N
        botonAyuda.setText("AYUDA");
        botonAyuda.setContentAreaFilled(false);
        botonAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAyuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda 2.png"))); // NOI18N
        botonAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda 1.png"))); // NOI18N
        botonAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });
        jPanel1.add(botonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 420, -1, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeudaActionPerformed

    }//GEN-LAST:event_botonDeudaActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        
            VistaCliente mensajero = new VistaCliente();
            mensajero.setVisible(true);
            this.setVisible(false);

        
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonVolverAMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAMenuPrincipalActionPerformed
        //Con esta line de codigo vuelvo al menu o clase principal
        if (evt.getSource() == botonVolverAMenuPrincipal) {

            MenuPrincipal mensajero = new MenuPrincipal();
            mensajero.setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_botonVolverAMenuPrincipalActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        //Con esta line de codigo vuelvo a la clase ayuda
        if (evt.getSource() == botonAyuda) {

            Ayuda mensajero = new Ayuda();
            mensajero.setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_botonAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(ControlDeCartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlDeCartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlDeCartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlDeCartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlDeCartera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbono;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonDeuda;
    private javax.swing.JButton botonVolverAMenuPrincipal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}