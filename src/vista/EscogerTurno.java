
package vista;


public class EscogerTurno extends javax.swing.JDialog {

    private String usuario1, usuario2;
    private String turno;
    
    public EscogerTurno(java.awt.Frame parent, boolean modal, String usuario1, String usuario2) {
        super(parent, modal);
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        //Por defecto sino elige el turno, Jugará el usuario 1 primero. 
        turno = "usuario1";
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String getTurno() {
        return turno;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUsuario1 = new javax.swing.JButton();
        btnUsuario2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Quien juega primero?");

        btnUsuario1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUsuario1.setText(usuario1);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });

        btnUsuario2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUsuario2.setText(usuario2);
        btnUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuario1)
                    .addComponent(btnUsuario2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
        turno = "usuario1";
        dispose();
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario2ActionPerformed
        turno = "usuario2";
        dispose();
    }//GEN-LAST:event_btnUsuario2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EscogerTurno dialog = new EscogerTurno(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JButton btnUsuario2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
