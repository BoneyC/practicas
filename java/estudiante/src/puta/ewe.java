
package puta;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ewe {
   public static void main(String[] arg){
       boolean actividad=false;
       String actividadS;
       estudiante estudiante1=new estudiante();
       estudiante1.setNombre(JOptionPane.showInputDialog("ingrese el nombre del estudiante"));
       estudiante1.setCarnet(JOptionPane.showInputDialog("ingrese el carnet del estudiante"));
       do{
       actividadS=JOptionPane.showInputDialog("el estudiante esta activo?");
       }while(!actividadS.equals("si") && !actividadS.equals("no"));
       if(actividadS.equals("si")){
           actividad=true;
       }else{
           actividad=false;
       }
       estudiante1.setActivo(actividad);
       estudiante1.datos();

       JTextArea hoja= new JTextArea();
   } 
}
