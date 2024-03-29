
package vista;

/**
 *
 * @author Usuario
 */
public class VentanaGanador extends javax.swing.JDialog {

    //Atributos
    private String usuario;
    
    public VentanaGanador(java.awt.Frame parent, boolean modal, String usuario) {
        super(parent, modal);
        
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlFelicitaciones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnJugarDeNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlFelicitaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jlFelicitaciones.setForeground(new java.awt.Color(255, 255, 255));
        jlFelicitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFelicitaciones.setText("Felicitaciones "+usuario);
        jPanel1.add(jlFelicitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ganaste!!!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        btnJugarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnJugarDeNuevo.setText("Jugar de nuevo");
        btnJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarDeNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        btnSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ganaste.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 480, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDeNuevoActionPerformed
        dispose();
    }//GEN-LAST:event_btnJugarDeNuevoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGanador dialog = new VentanaGanador(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarDeNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlFelicitaciones;
    // End of variables declaration//GEN-END:variables
}
