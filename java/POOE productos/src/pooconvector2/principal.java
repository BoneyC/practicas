/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooconvector2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author boney
 */
public class principal {
    public static void main(String[] arg){
          JTextArea hoja=new JTextArea();
       //cuantas filas
       //columnas siempre son 4
        microbus asientos1=new microbus();
        asientos1.inicializar();
        hoja.setText(asientos1.salida());
        JOptionPane.showMessageDialog(null,hoja);
        asientos1.asignar(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el asiento deseado")));
        hoja.setText(asientos1.salida());
        JOptionPane.showMessageDialog(null,hoja);
        //asignacion automatica de atras hacia delante de derecha a izquierda
        
    }
}
