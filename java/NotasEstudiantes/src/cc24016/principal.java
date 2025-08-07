package cc24016;

import javax.swing.JOptionPane;

public class principal {
    public static void main(String [] arg){
        int opcion=0;
      Estudiante estudiantes= new Estudiante(); 
      estudiantes.inicializar();
      do{
          opcion=Integer.parseInt(JOptionPane.showInputDialog("opciones:\n1.registrar estudiante\n2.registrar calificaciones\n3.ver datos y calificaciones\ncualquier otro numero para salir"));
          switch(opcion){
              case 1:
                  estudiantes.RegistrarEstudiante();
                  break;
              case 2:
                  estudiantes.RegistrarNotas();
                  break;
              case 3:
                  estudiantes.verCalificaciones();
                  break;
          }
      }while(opcion>0 && opcion<4);
      
    }

}
