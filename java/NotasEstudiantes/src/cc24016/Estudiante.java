package cc24016;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Estudiante {
    private int tamanioGrupo=5,evaluaciones=4,estudiante,evaluacion,numRegistro=0,posicion;
    private String carnet[]=new String[tamanioGrupo];
    private String salida="";
    private String apellidos[]=new String[tamanioGrupo];
    private String nombres[]=new String[tamanioGrupo];
    private JTextArea hoja= new JTextArea();
  private double notas[][]= new double [tamanioGrupo][evaluaciones];  
public void inicializar(){
    for(int i=0;i<carnet.length;i++){
        this.carnet[i]="vacio";
    }
}
    public void RegistrarEstudiante() {
        if(numRegistro<carnet.length){   
        String carnete="",bandera="bien";
       carnete=JOptionPane.showInputDialog("ingrese su carnet");
       for(int i=0;i<this.carnet.length;i++){
          if(this.carnet[i].equals(carnete)){
              i=this.carnet.length-1;
              bandera="mal";
             JOptionPane.showMessageDialog(null,"ingreso un carnet ya existente ");
          }else{
              bandera="bien";
          }
       }
       if(bandera.equals("bien")){
               this.carnet[numRegistro]=carnete;
               this.apellidos[this.numRegistro]= JOptionPane.showInputDialog("ingrese sus apellidos");
       this.nombres[this.numRegistro]=JOptionPane.showInputDialog("ingrese sus nombres");
       this.numRegistro++;
          }
        }else{
            JOptionPane.showMessageDialog(null,"ya estan los 5 alumnos registrados");
        }
    }
  public void RegistrarNotas(){
      String carnet;
      carnet=JOptionPane.showInputDialog("ingrese el carnet del estudiante para ingresar sus notas");
      for(int i=0;i<this.tamanioGrupo;i++){
          if(carnet.equals(this.carnet[i])){
              for(int j=0;j<this.evaluaciones;j++){
              this.notas[i][j]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota "+(j+1)+" del estudiante: "+this.carnet[i]));
              }
          }
      }
  }
  public void verCalificaciones(){
      double helper=0;
       String carnet;
      carnet=JOptionPane.showInputDialog("ingrese el carnet del estudiante para ver sus datos y notas");
      for(int i=0;i<this.tamanioGrupo;i++){
          if(carnet.equals(this.carnet[i])){
             salida="carnet: "+this.carnet[i]+"\n"+"nombre: "+this.nombres[i]+"\n"+"apellidos: "+this.apellidos[i]+"\nEvaluacion 1\tEvaluacion 2\tEvaluacion 3\tEvaluacion 4\tPromedio\n";
             for(posicion=0;posicion<evaluaciones;posicion++){
                 salida=salida+notas[i][posicion]+"\t";
             }
             for(posicion=0;posicion<evaluaciones;posicion++){
                 helper=helper+notas[i][posicion];
             }
             helper=helper/4;
             salida=salida+helper;
             hoja.setText(salida);
             JOptionPane.showMessageDialog(null,hoja);
          }
      }
      
      
  }
}