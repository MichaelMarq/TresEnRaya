
package vista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Main extends javax.swing.JFrame {
    
    private boolean casilla[][] = new boolean[3][3];
    private int matriz[][] = new int[3][3];
    private String turno = "usuario1";
    private int casillaEmpate = 0;
    private String usuario1,usuario2;
    private int vecesGano1 = 0, vecesGano2 = 0, vecesEmpate = 0;


    public Main(String usuario1, String usuario2) {
        
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        
        llenarCasilla();
        llenarMatriz();
        

    }
    
    private void llenarCasilla(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    
    
    private void dibujarX(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
    }
    
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/img/circulo.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnArribaIzquierda = new javax.swing.JButton();
        btnArriba = new javax.swing.JButton();
        btnArribaDerecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnAbajoIzquierda = new javax.swing.JButton();
        btnAbajo = new javax.swing.JButton();
        btnAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comezarNuevo = new javax.swing.JMenuItem();
        tabla = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        btnArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(btnArribaIzquierda);

        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });
        panel.add(btnArriba);

        btnArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(btnArribaDerecha);

        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        panel.add(btnIzquierda);

        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });
        panel.add(btnCentro);

        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });
        panel.add(btnDerecha);

        btnAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(btnAbajoIzquierda);

        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });
        panel.add(btnAbajo);

        btnAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(btnAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comezarNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comezarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comenzarNuevo.png"))); // NOI18N
        comezarNuevo.setText("Comenzar de nuevo");
        comezarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comezarNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comezarNuevo);

        tabla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tabla.png"))); // NOI18N
        tabla.setText("Mostrar tabla de resultados");
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });
        menuJuego.add(tabla);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaIzquierdaActionPerformed
        if(casilla[0][0] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnArribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[0][0] = 2;
                dibujarO(btnArribaIzquierda);
                turno = "usuario1";
            }
            
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArribaIzquierdaActionPerformed

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        if(casilla[0][1] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnArriba);
                matriz[0][1] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[0][1] = 2;
                dibujarO(btnArriba);
                turno = "usuario1";
            }
            
            casilla[0][1] = false;
            comprobarGanador();
        }
        
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaDerechaActionPerformed
        if(casilla[0][2] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[0][2] = 2;
                dibujarO(btnArribaDerecha);
                turno = "usuario1";
            }
            
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArribaDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        if(casilla[1][0] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnIzquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[1][0] = 2;
                dibujarO(btnIzquierda);
                turno = "usuario1";
            }
            
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        if(casilla[1][1] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[1][1] = 2;
                dibujarO(btnCentro);
                turno = "usuario1";
            }
            
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        if(casilla[1][2] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[1][2] = 2;
                dibujarO(btnDerecha);
                turno = "usuario1";
            }
            
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoIzquierdaActionPerformed
        if(casilla[2][0] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnAbajoIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[2][0] = 2;
                dibujarO(btnAbajoIzquierda);
                turno = "usuario1";
            }
            
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoIzquierdaActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        if(casilla[2][1] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnAbajo);
                matriz[2][1] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[2][1] = 2;
                dibujarO(btnAbajo);
                turno = "usuario1";
            }
            
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoDerechaActionPerformed
        if(casilla[2][2] == true){ //Verificar si el boton ah sido presionado
            if(turno.equals("usuario1")){ //Verificar el turno del usuario
                dibujarX(btnAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            }
            else{//turno del usuario 2
                matriz[2][2] = 2;
                dibujarO(btnAbajoDerecha);
                turno = "usuario1";
            }
            
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoDerechaActionPerformed

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        VentanaMostrarResultado resultado = new VentanaMostrarResultado(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        resultado.setVisible(true);
        
    }//GEN-LAST:event_tablaActionPerformed

    private void comezarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comezarNuevoActionPerformed
        vecesGano1 = 0;
        vecesGano2 = 0;
        vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_comezarNuevoActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikihow.com/jugar-al-triqui-(tres-en-raya)"));
            } catch (IOException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador(){
        boolean ganador1 = false;
        boolean ganador2 = false;
        
        //comprobamos si el ganador es el usuario 1
        ganador1 = comprobar(1);
        //comprobamos si el ganador es el usuario 1
        ganador2 = comprobar(2);
        
        if(ganador1 == true){
            vecesGano1++;
            VentanaGanador ganador = new VentanaGanador(this, true, usuario1);
            ganador.setVisible(true);
            
            
            reiniciarJuego();
        }
        else if(ganador2 == true){
            vecesGano2++;
            VentanaGanador ganador = new VentanaGanador(this, true, usuario2);
            ganador.setVisible(true);
            
            reiniciarJuego();
        }
        else{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(matriz[i][j] != 0){
                        casillaEmpate++;
                    }
                }
            }
            if(casillaEmpate == 9){
                vecesEmpate++;
                VentanaEmpate empate = new VentanaEmpate(this, true);
                empate.setVisible(true);
                
                reiniciarJuego();
            }
            else{
                casillaEmpate = 0;
            }
        }

    }
    
    private boolean comprobar(int numero){
        boolean ganador = false;
        
        if(matriz[0][0] == numero && matriz[0][1] == numero && matriz[0][2] == numero){
            ganador = true;
        }
        else if(matriz[1][0] == numero && matriz[1][1] == numero && matriz[1][2] == numero){
            ganador = true;
        }
        else if(matriz[2][0] == numero && matriz[2][1] == numero && matriz[2][2] == numero){
            ganador = true;
        }
        else if(matriz[0][0] == numero && matriz[1][0] == numero && matriz[2][0] == numero){
            ganador = true;
        }
        else if(matriz[0][1] == numero && matriz[1][1] == numero && matriz[2][1] == numero){
            ganador = true;
        }
        else if(matriz[0][2] == numero && matriz[1][2] == numero && matriz[2][2] == numero){
            ganador = true;
        }
        else if(matriz[0][0] == numero && matriz[1][1] == numero && matriz[2][2] == numero){
            ganador = true;
        }
        else if(matriz[0][2] == numero && matriz[1][1] == numero && matriz[2][0] == numero){
            ganador = true;
        }
        
        return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasilla();
        llenarMatriz();
        
        btnArribaIzquierda.setIcon(null);
        btnArriba.setIcon(null);
        btnArribaDerecha.setIcon(null);
        
        btnIzquierda.setIcon(null);
        btnCentro.setIcon(null);
        btnDerecha.setIcon(null);
        
        btnAbajoIzquierda.setIcon(null);
        btnAbajo.setIcon(null);
        btnAbajoDerecha.setIcon(null);

        //Vamos a preguntar al usuario quien juega primero

        juegaPrimero();
        
    }
    
    private void juegaPrimero(){
        EscogerTurno turnoJugador = new EscogerTurno(this, true, usuario1, usuario2);
        turnoJugador.setVisible(true);
        turno = turnoJugador.getTurno();
       
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnAbajoDerecha;
    private javax.swing.JButton btnAbajoIzquierda;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnArribaDerecha;
    private javax.swing.JButton btnArribaIzquierda;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JMenuItem comezarNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem tabla;
    // End of variables declaration//GEN-END:variables
}
