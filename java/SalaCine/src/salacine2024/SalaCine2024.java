package salacine2024;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SalaCine2024 {

    public static void main(String[] args) {

        String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int contador = 1, fila, columna, opcion=1, disponibles = 100, cuantos=0, dondeFila=0, dondeColumna=0;
        String sala[][],sala2[][];
        sala2=new String[10][10];
        sala = new String[10][10];
        JTextArea hoja = new JTextArea();
        String salida,cual;
        boolean encontrado=false;

        //nombrar cada butaca
        for (fila = 0; fila < 10; fila++) {
            for (columna = 0; columna < 10; columna++) {
                sala[fila][columna] = letras[fila] + (columna + 1);
                sala2[fila][columna] = letras[fila] + (columna + 1);
            }
        }

        
        while (opcion >= 1 && opcion <= 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1.Ver Sala\n2.Vender boletos\n3.devolver butaca\nCualquier otro número para Salir"));
            switch (opcion) {
                case 1://ver sala de cine
                    salida = "";
                    for (fila = 0; fila < 10; fila++) {
                        for (columna = 0; columna < 10; columna++) {
                            salida = salida + sala[fila][columna] + "\t";
                        }
                        salida = salida + "\n";
                    }
                    salida = salida + "\t\t\t\tPANTALLA";
                    hoja.setText(salida);
                    JOptionPane.showMessageDialog(null, hoja);
                    break;
                case 2://vender boletos
                    
                    if (disponibles > 0) {
                        if (disponibles >= 10) {
                            
                            cuantos = Integer.parseInt(JOptionPane.showInputDialog("Cuántos boletos desea? (entre 0 y 10)"));
                            if (cuantos >= 1 && cuantos <= 10) {
                                
                                do {
                                    encontrado=false;
                                    salida = "";
                                    for (fila = 0; fila < 10; fila++) {
                                        for (columna = 0; columna < 10; columna++) {
                                            salida = salida + sala[fila][columna] + "\t";
                                        }
                                        salida = salida + "\n";
                                    }
                                    salida = salida + "\t\t\t\tPANTALLA\nCúal Butaca desea?";
                                    hoja.setText(salida);
                                    cual=JOptionPane.showInputDialog(hoja);
                                    //búsqueda de cual en la matriz
                                    if (!cual.equals("X")){
                                    for (fila=0;fila<10;fila++){
                                        for (columna=0;columna<10;columna++){
                                            if (cual.equals(sala[fila][columna])){
                                                dondeFila=fila;
                                                dondeColumna=columna;
                                                encontrado=true;
                                            }
                                        }
                                    }
                                    if (encontrado==true){
                                        sala[dondeFila][dondeColumna]="X";
                                        JOptionPane.showMessageDialog(null, "Butaca asignada");
                                        cuantos=cuantos-1;
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Butaca no encontrada");
                                    }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Las Buatacas ocupadas están marcadas con X");
                                    }
                                } while (cuantos > 0);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error en la cantidad de boletos");
                            }
                        } else {
                            cuantos = Integer.parseInt(JOptionPane.showInputDialog("Cuántos boletos desea? (entre 0 y " + disponibles + ")"));
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay butacas disponibles");
                    }
                    break;
                case 3: //devolucion
                    encontrado=false;
                    salida = "";
                    for (fila = 0; fila < 10; fila++) {
                        for (columna = 0; columna < 10; columna++) {
                            salida = salida + sala[fila][columna] + "\t";
                        }
                        salida = salida + "\n";
                    }
                    salida = salida + "\t\t\t\tPANTALLA";
                    hoja.setText(salida);
                    cual=JOptionPane.showInputDialog(hoja);
                                    //búsqueda de cual en la matriz
                                  
                                    for (fila=0;fila<10;fila++){
                                        for (columna=0;columna<10;columna++){
                                            if (cual.equals(sala2[fila][columna])){
                                                if(sala2[fila][columna].equals(sala[columna][fila])){
                                                    
                                                }else{
                                                dondeFila=fila;
                                                dondeColumna=columna;
                                                encontrado=true;
                                                }
                                            }
                                        }
                                    }
                                    if (encontrado==true){
                                        sala[dondeFila][dondeColumna]=sala2[dondeFila][dondeColumna];
                                        JOptionPane.showMessageDialog(null, "Butaca devuelta");
                                        cuantos=cuantos+1;
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Butaca no encontrada");
                                    }
                                    
            
        
                                
                    break;
        }
                    
            
            
    }
    
    }    
}

    
