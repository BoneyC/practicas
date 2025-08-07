
package cc24016;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class grafico extends javax.swing.JFrame {
    private String usuarios[][]= new String [100][5];//1 ID 2 nombres 3 apellidos 4 fecha de nacimiento 5 credito
   private int contador=1;
   private String salida="ID\tNombres\tApellidos\tFecha de nacimiento\tCredito\n";
    public grafico() {
        initComponents();
    }
public void wipe(){
    txtID.setText("");
    txtName.setText("");
    txtLast.setText("");
    txtDay.setText("");
    txtMes.setText("");
    txtYear.setText("");
    txtCredit.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        lblLast = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        lblCredit = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHoja = new javax.swing.JTextArea();
        btnRecuperar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        txtMes = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnWipe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        txtID.setEditable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblName.setText("nombre/s:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtLast.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastKeyTyped(evt);
            }
        });

        lblLast.setText("apellido/s:");

        lblBirthday.setText("fecha de nacimiento:");

        txtDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDayKeyTyped(evt);
            }
        });

        lblCredit.setText("credito:");

        txtCredit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditKeyTyped(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtHoja.setEditable(false);
        txtHoja.setColumns(20);
        txtHoja.setRows(5);
        jScrollPane1.setViewportView(txtHoja);

        btnRecuperar.setText("recuperar");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });

        btnVer.setText("ver todos");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });

        jLabel2.setText("/");

        jLabel3.setText("/");

        btnWipe.setText("limpiar");
        btnWipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRecuperar)
                        .addGap(84, 84, 84)
                        .addComponent(btnVer)
                        .addGap(82, 82, 82)
                        .addComponent(btnWipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCredit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCredit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtLast, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLast))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirthday)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredit)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnRecuperar)
                    .addComponent(btnVer)
                    .addComponent(btnWipe))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        salida="ID\tNombres\tApellidos\tFecha de nacimiento\tCredito\n";
        if(contador<100){
        String ID=String.valueOf(contador);
        usuarios[contador][0]=ID+"\t";
        String nombre=txtName.getText();
        usuarios[contador][1]=nombre+"\t";
        String apellidos=txtLast.getText();
        usuarios[contador][2]=apellidos+"\t";
        String dia=txtDay.getText();
        String mes=txtMes.getText();
        String año=txtYear.getText();
        usuarios[contador][3]=dia+"/"+mes+"/"+año+"\t";
        String credito=txtCredit.getText();
        usuarios[contador][4]=credito+"\t";;
        if(!nombre.equals("")){
            if(!apellidos.equals("")){
                if(!dia.equals("")){
                    if(1<=Integer.valueOf(dia)&&31>=Integer.valueOf(dia)){
                        if(!mes.equals("")){
                            if(1<=Integer.valueOf(mes)&&12>=Integer.valueOf(mes)){
                            if(!año.equals("")){
                                if(1924<=Integer.valueOf(año)&&2006>=Integer.parseInt(año)){
                                    if(!credito.equals("")){
                                        if(0.0<=Double.valueOf(credito)&&10000.0>=Double.valueOf(credito)){
                                            contador++;
                                          txtID.setText(String.valueOf(contador));
                                          salida=salida+ID+"\t"+nombre+"\t"+apellidos+"\t"+dia+"/"+mes+"/"+año+"\t\t"+credito;
                                          txtHoja.setText(salida);
                                          //guardar archivo///////////////////////////////////////////////
                                          String ruta="D:\\CC24016\\src\\documentos\\"+ID+".txt";
        String contenido=salida;
        
        File archivo = new File(ruta);
        if (archivo.exists()==false){
            try {
                archivo.createNewFile();
                FileWriter escritura = new FileWriter(archivo);
                try (BufferedWriter datos = new BufferedWriter(escritura)){
                    datos.write(contenido);
                    JOptionPane.showMessageDialog(null, "Archivo creado con éxito");
                }
                catch(Exception e){
                    System.out.println("Excepción: "+e);
                }
            } catch (IOException ex) {
                System.out.println("Excepción: "+ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El archivo ya existe");
        }
        //fin archivo///////////////////////////////////////////////////////////////////////////////////////
                                        }else{
                                            txtCredit.setText("min 0.0 max 10000.0"); 
                                        }
                                    }else{
                                        txtCredit.setText("no puede estar vacio");
                                    }
                                }else{
                                    txtYear.setText("año invalido");
                                }
                            }else{
                                txtYear.setText("no puede estar vacio");
                            }
                        }else{
                            txtMes.setText("error");
                        }
                        }else{
                          txtMes.setText("error");  
                        }
                    }else{
                       txtDay.setText("error"); 
                    }
                }else{
                    txtDay.setText("error");
                }
            }else{
              txtLast.setText("no puede estar vacio");  
            }
        }else{
         txtName.setText("no puede estar vacio");   
        }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        String support=String.valueOf(contador-1);
        String ruta="D:\\CC24016\\src\\documentos\\"+support+".txt";
        String salidaR="";
        JTextArea hoja = new JTextArea();
        
        File documento = new File(ruta);
        try {
            Scanner objeto = new Scanner(documento);
            while (objeto.hasNextLine()==true){
                salidaR=salidaR+objeto.nextLine()+"\n";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Excepción: "+ex);
        }
        txtHoja.setText(salidaR);
        
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnWipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWipeActionPerformed
        wipe();
    }//GEN-LAST:event_btnWipeActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        salida="ID\tNombres\tApellidos\tFecha de nacimiento\tCredito\n";
        for(int i=0;i<100;i++){
           for(int j=0;j<5;j++){
             salida=salida+usuarios[i][j];  
           }  
           salida=salida+"\n";
         }
        txtHoja.setText(salida);
    }//GEN-LAST:event_btnVerActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char tecla = evt.getKeyChar();
if(!Character.isLetter(tecla)&& !(tecla==evt.VK_SPACE)){
     evt.consume();   
    }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastKeyPressed
     
    }//GEN-LAST:event_txtLastKeyPressed

    private void txtDayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayKeyTyped
        char tecla= evt.getKeyChar();
if(tecla<'0' || tecla>'9'){
    evt.consume();
}
    }//GEN-LAST:event_txtDayKeyTyped

    private void txtLastKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastKeyTyped
        char tecla = evt.getKeyChar();
if(!Character.isLetter(tecla)&& !(tecla==evt.VK_SPACE)){
     evt.consume();   
    }
    }//GEN-LAST:event_txtLastKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        char tecla= evt.getKeyChar();
if(tecla<'0' || tecla>'9'){
    evt.consume();
}
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
        char tecla= evt.getKeyChar();
if(tecla<'0' || tecla>'9'){
    evt.consume();
}
    }//GEN-LAST:event_txtYearKeyTyped

    private void txtCreditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditKeyTyped
       char tecla= evt.getKeyChar();
if((tecla<'0') || (tecla>'9')&& (Character.isLetter(tecla)) ){
   if(tecla=='.'){
       
   }else{
    evt.consume();
   }
}
    }//GEN-LAST:event_txtCreditKeyTyped

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
            java.util.logging.Logger.getLogger(grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnWipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblLast;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextArea txtHoja;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
