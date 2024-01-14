
package Vista;

import Controlador.Mensaje;
import java.awt.Color;

/**
 *
 * @author Ilde
 */
public class Inicio extends javax.swing.JFrame {

    private int xRaton;
    private int yRaton;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        PanelFondo = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        TextFieldNumero = new javax.swing.JTextField();
        TextFieldMensaje = new javax.swing.JTextField();
        PanelBoton = new javax.swing.JPanel();
        BotonEnviar = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        PanelCerrar = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelFondo.setBackground(new java.awt.Color(36, 35, 43));
        PanelFondo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelFondo.setForeground(new java.awt.Color(36, 38, 43));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Enviar WhatsApps");
        PanelFondo.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 40));

        TextFieldNumero.setBackground(new java.awt.Color(66, 65, 75));
        TextFieldNumero.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        TextFieldNumero.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldNumero.setText("Introduce el teléfono");
        TextFieldNumero.setToolTipText("");
        TextFieldNumero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        TextFieldNumero.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        TextFieldNumero.setMinimumSize(new java.awt.Dimension(64, 16));
        TextFieldNumero.setName(""); // NOI18N
        TextFieldNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldNumeroFocusGained(evt);
            }
        });
        TextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNumeroKeyTyped(evt);
            }
        });
        PanelFondo.add(TextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 30));

        TextFieldMensaje.setBackground(new java.awt.Color(66, 65, 75));
        TextFieldMensaje.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        TextFieldMensaje.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldMensaje.setText("Introduce el mensaje");
        TextFieldMensaje.setToolTipText("");
        TextFieldMensaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        TextFieldMensaje.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        TextFieldMensaje.setOpaque(true);
        TextFieldMensaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldMensajeFocusGained(evt);
            }
        });
        PanelFondo.add(TextFieldMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 30));

        PanelBoton.setBackground(new java.awt.Color(36, 35, 43));

        BotonEnviar.setBackground(new java.awt.Color(43, 150, 64));
        BotonEnviar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BotonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEnviar.setText("ENVIAR");
        BotonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEnviar.setOpaque(true);
        BotonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelFondo.add(PanelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, 30));

        Barra.setBackground(new java.awt.Color(66, 65, 75));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        PanelCerrar.setBackground(new java.awt.Color(66, 65, 75));
        PanelCerrar.setOpaque(false);

        BotonCerrar.setBackground(new java.awt.Color(66, 65, 75));
        BotonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonCerrar.setText("X");
        BotonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerrar.setOpaque(true);
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelCerrarLayout = new javax.swing.GroupLayout(PanelCerrar);
        PanelCerrar.setLayout(PanelCerrarLayout);
        PanelCerrarLayout.setHorizontalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarLayout.createSequentialGroup()
                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelCerrarLayout.setVerticalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGap(0, 360, Short.MAX_VALUE)
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelFondo.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xRaton = evt.getX();
        yRaton = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xRaton, y - yRaton);
    }//GEN-LAST:event_BarraMouseDragged

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarMouseClicked

    private void BotonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseEntered
        BotonCerrar.setBackground(new Color(204,0,0));
    }//GEN-LAST:event_BotonCerrarMouseEntered

    private void BotonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseExited
        BotonCerrar.setBackground(new Color(66,65,75));
    }//GEN-LAST:event_BotonCerrarMouseExited

    private void BotonEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseEntered
        BotonEnviar.setBackground(new Color(43,177,64));
    }//GEN-LAST:event_BotonEnviarMouseEntered

    private void BotonEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseExited
        BotonEnviar.setBackground(new Color(43,150,64));
    }//GEN-LAST:event_BotonEnviarMouseExited

    private void BotonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseClicked
        String texto, numero;
        
        texto = TextFieldMensaje.getText();
        numero = TextFieldNumero.getText();
        
        Mensaje mensaje = new Mensaje(texto, numero);
        
        mensaje.enviar();
    }//GEN-LAST:event_BotonEnviarMouseClicked

    private void TextFieldNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNumeroFocusGained
        if(TextFieldNumero.getText().equals("Introduce el teléfono")){
            TextFieldNumero.setText("");
        }
        if(TextFieldMensaje.getText().isEmpty()){
            TextFieldMensaje.setText("Introduce el mensaje");
        }
    }//GEN-LAST:event_TextFieldNumeroFocusGained

    private void TextFieldMensajeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMensajeFocusGained
        if(TextFieldMensaje.getText().equals("Introduce el mensaje")){
            TextFieldMensaje.setText("");
        }
        if(TextFieldNumero.getText().isEmpty()){
            TextFieldNumero.setText("Introduce el teléfono");
        }
    }//GEN-LAST:event_TextFieldMensajeFocusGained

    private void TextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNumeroKeyTyped
        char c = evt.getKeyChar();
            
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        if(TextFieldNumero.getText().length()>8){
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldNumeroKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel BotonCerrar;
    private javax.swing.JLabel BotonEnviar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel PanelBoton;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JTextField TextFieldMensaje;
    private javax.swing.JTextField TextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
