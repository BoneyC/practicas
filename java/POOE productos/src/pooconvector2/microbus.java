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
public class microbus {
    private int filas=10;
   private String[][] asientos= new String[filas][4];;
   int j,i;
   private String salida;
   
   private int disponibles=filas*4;
   
   public void inicializar (){
       int posicion=1;
          for(j=0;j<4;j++){
              for(i=0;i<10;i++){
              this.asientos[i][j]=(String.valueOf(posicion)+(".vacio"));
              posicion++;
          }
      } 
   }
   public String salida(){
       this.salida="";
          for(j=0;j<4;j++){
              for(i=0;i<10;i++){
              this.salida=this.salida+asientos[i][j]+"\t";
          }
          this.salida=this.salida+"\n\n";
      } 
          return salida;
   }
   public void asignar(int cuantos){
       if(this.disponibles>0 && cuantos<=this.disponibles){
           while(0!=cuantos){
               while(disponibles!=i*j){
                   
               
           this.asientos[i][j]="ocupado";    
         JOptionPane.showMessageDialog(null,cuantos);  
           cuantos--;
           this.disponibles--;
           }
           }
       }
           
   }
   
   
}