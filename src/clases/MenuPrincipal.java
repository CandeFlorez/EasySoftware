/*
 * PROYECTO DE AULA.
 * PROGRAMA PARA EL SEGUIMIENTO Y CONTROL DE CARTERA, INGRESOS Y EGRESOS EN EL NEGOCIO REMI
 */
package clases;

/**
 *
 * @author EASY SOFTWARE
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        botonCartera = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonIngresosEgresos = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        logoPrograma = new javax.swing.JLabel();
        mensajeDeBienvenida = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EASY SOFTWARE");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCartera.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonCartera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono cartera.png"))); // NOI18N
        botonCartera.setText("CARTERA");
        botonCartera.setContentAreaFilled(false);
        botonCartera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCartera.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono cartera.png"))); // NOI18N
        botonCartera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartera icono.png"))); // NOI18N
        botonCartera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonCartera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarteraActionPerformed(evt);
            }
        });
        getContentPane().add(botonCartera, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 165, 133));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EGRESOS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        botonIngresosEgresos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonIngresosEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresos y egresos 2.png"))); // NOI18N
        botonIngresosEgresos.setText("INGRESOS Y");
        botonIngresosEgresos.setActionCommand("");
        botonIngresosEgresos.setContentAreaFilled(false);
        botonIngresosEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonIngresosEgresos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresos y egresos 2.png"))); // NOI18N
        botonIngresosEgresos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ingresos y egresos 1.png"))); // NOI18N
        botonIngresosEgresos.setVerifyInputWhenFocusTarget(false);
        botonIngresosEgresos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonIngresosEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonIngresosEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresosEgresosActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresosEgresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 165, 133));

        botonAyuda.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda 2.png"))); // NOI18N
        botonAyuda.setText("AYUDA");
        botonAyuda.setContentAreaFilled(false);
        botonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAyuda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda 2.png"))); // NOI18N
        botonAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda 1.png"))); // NOI18N
        botonAyuda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(botonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 165, 136));

        botonSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir 2.png"))); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.setContentAreaFilled(false);
        botonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir 2.png"))); // NOI18N
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir 1.png"))); // NOI18N
        botonSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 165, 136));

        logoPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoEasysoftwarec.png"))); // NOI18N
        getContentPane().add(logoPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 160));

        mensajeDeBienvenida.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        mensajeDeBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeDeBienvenida.setText("BIENVENIDO A EASY SOFTWARE");
        mensajeDeBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(mensajeDeBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 435, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresosEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresosEgresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIngresosEgresosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       //Con esta linea de codigo el programa finalizara
        if(evt.getSource() == botonSalir){
           System.exit(0);
       }
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        if(evt.getSource()== botonAyuda){
            //con este metodo se accedera a la ventana ayuda
            Ayuda mensajero = new Ayuda();
            mensajero.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_botonAyudaActionPerformed

    private void botonCarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarteraActionPerformed
        // Con este metodo 
        if(evt.getSource() == botonCartera){
            ControlDeCartera mensajero = new ControlDeCartera();
            mensajero.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonCarteraActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonCartera;
    private javax.swing.JButton botonIngresosEgresos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoPrograma;
    private javax.swing.JLabel mensajeDeBienvenida;
    // End of variables declaration//GEN-END:variables
}