
package vista;


public class VentanaInicial extends javax.swing.JFrame {
    
    private String usuario1;
    private String usuario2;

 
    public VentanaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlNombre1 = new javax.swing.JLabel();
        jlNombre2 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jlMuestra1 = new javax.swing.JLabel();
        jlMuestra2 = new javax.swing.JLabel();
        btnComenzarJuego = new javax.swing.JButton();
        jLNombreDefecto1 = new javax.swing.JLabel();
        jLNombreDefecto2 = new javax.swing.JLabel();
        jLDefecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Tres en Raya");
        panel.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 640, -1));

        jlNombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlNombre1.setText("Nombre del usuario 1:");
        panel.add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 112, -1, 32));

        jlNombre2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlNombre2.setText("Nombre del usuario 2:");
        panel.add(jlNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 50));

        txtNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 114, 234, 32));

        txtNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 234, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tresEnRaya.gif"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, 176));

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jlMuestra1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(jlMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 390, 21));

        jlMuestra2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(jlMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 280, 19));

        btnComenzarJuego.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnComenzarJuego.setText("Comenzar Juego");
        btnComenzarJuego.setVisible(false);
        btnComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarJuegoActionPerformed(evt);
            }
        });
        panel.add(btnComenzarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLNombreDefecto1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLNombreDefecto1.setText("jLabel2");
        jLNombreDefecto1.setVisible(false);
        panel.add(jLNombreDefecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jLNombreDefecto2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLNombreDefecto2.setText("jLabel3");
        jLNombreDefecto2.setVisible(false);
        panel.add(jLNombreDefecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jLDefecto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLDefecto.setText("Nombre por defecto");
        jLDefecto.setVisible(false);
        panel.add(jLDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        usuario1 = txtNombre1.getText();
        usuario2 = txtNombre2.getText();
        btnGuardar.setVisible(false);
        
        if(usuario1.isEmpty()){
            jLDefecto.setVisible(true);
            jLNombreDefecto1.setVisible(true);
            usuario1 = "usuario 1";
            jLNombreDefecto1.setText(usuario1);
            
            if(usuario2.isEmpty()){
                jLNombreDefecto2.setVisible(true);
                usuario2 = "usuario 2";
                jLNombreDefecto2.setText(usuario2);
                
            }
        }
        else if(usuario2.isEmpty()){
            jLDefecto.setVisible(true);
            jLNombreDefecto2.setVisible(true);
            usuario2 = "usuario 2";
            jLNombreDefecto2.setText(usuario2);
            
        }
       
        jlMuestra1.setText(usuario1+", jugará primero su ficha es : X");
        jlMuestra2.setText(usuario2+", su ficha es : O");
        
        btnComenzarJuego.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarJuegoActionPerformed
        Main ventana = new Main(usuario1, usuario2);
        ventana.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnComenzarJuegoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzarJuego;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLDefecto;
    private javax.swing.JLabel jLNombreDefecto1;
    private javax.swing.JLabel jLNombreDefecto2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlMuestra1;
    private javax.swing.JLabel jlMuestra2;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombre2;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
