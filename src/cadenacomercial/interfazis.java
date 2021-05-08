
package cadenacomercial;

import java.awt.Image;
import java.awt.Toolkit;

public class interfazis extends javax.swing.JFrame {

    
    public interfazis() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logosi.png"));
        return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        passJPF = new javax.swing.JPasswordField();
        cuadroTxt = new javax.swing.JLabel();
        userJTF = new javax.swing.JTextField();
        cuadroTxt1 = new javax.swing.JLabel();
        recCB = new javax.swing.JCheckBox();
        recCB.setOpaque(false);
        recuerdameL = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bienv = new javax.swing.JLabel();
        jBr = new javax.swing.JButton();
        jBis = new javax.swing.JButton();
        botonesL = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 51, 51));
        salir.setText("Salir");
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 90, 40));

        passJPF.setForeground(new java.awt.Color(255, 204, 0));
        passJPF.setText("jPasswordField1");
        passJPF.setBorder(null);
        passJPF.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        passJPF.setSelectionColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(passJPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 280, 50));
        passJPF.setOpaque(false);

        cuadroTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        getContentPane().add(cuadroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        userJTF.setFont(new java.awt.Font("Montserrat", 1, 15)); // NOI18N
        userJTF.setForeground(new java.awt.Color(255, 204, 0));
        userJTF.setText("Usuario");
        userJTF.setBorder(null);
        userJTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userJTF.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        userJTF.setSelectionColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(userJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 280, 50));
        userJTF.setOpaque(false);
        userJTF.getAccessibleContext().setAccessibleName("");

        cuadroTxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        getContentPane().add(cuadroTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        recCB.setForeground(new java.awt.Color(255, 255, 255));
        recCB.setBorder(null);
        recCB.setContentAreaFilled(false);
        recCB.setFocusPainted(false);
        recCB.setFocusable(false);
        getContentPane().add(recCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 30, 20));

        recuerdameL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rec.png"))); // NOI18N
        getContentPane().add(recuerdameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chikito.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        bienv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/is.png"))); // NOI18N
        getContentPane().add(bienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 310, 300, -1));

        jBr.setBackground(new java.awt.Color(0, 0, 0));
        jBr.setForeground(java.awt.Color.white);
        jBr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cansh.png"))); // NOI18N
        jBr.setBorderPainted(false);
        jBr.setFocusable(false);
        jBr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBr.setMaximumSize(new java.awt.Dimension(108, 41));
        jBr.setMinimumSize(new java.awt.Dimension(108, 41));
        jBr.setPreferredSize(new java.awt.Dimension(108, 41));
        jBr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrActionPerformed(evt);
            }
        });
        getContentPane().add(jBr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 140, 50));
        jBr.setOpaque(false);

        jBis.setBackground(new java.awt.Color(0, 0, 0));
        jBis.setForeground(java.awt.Color.white);
        jBis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/isch.png"))); // NOI18N
        jBis.setBorderPainted(false);
        jBis.setFocusable(false);
        jBis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBisActionPerformed(evt);
            }
        });
        getContentPane().add(jBis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 140, 50));
        jBis.setOpaque(false);

        botonesL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones.png"))); // NOI18N
        getContentPane().add(botonesL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 0, 940, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jBisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBisActionPerformed

    private void jBrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazis().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienv;
    private javax.swing.JLabel botonesL;
    private javax.swing.JLabel cuadroTxt;
    private javax.swing.JLabel cuadroTxt1;
    private javax.swing.JButton jBis;
    private javax.swing.JButton jBr;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passJPF;
    private javax.swing.JCheckBox recCB;
    private javax.swing.JLabel recuerdameL;
    private javax.swing.JButton salir;
    private javax.swing.JTextField userJTF;
    // End of variables declaration//GEN-END:variables
}