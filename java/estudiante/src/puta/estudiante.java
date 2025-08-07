package puta;
import javax.swing.JOptionPane;
public class estudiante {
    private String carnet;
    private String nombre;
    private boolean activo;

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
   
    public String getCarnet(){
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
public void datos(){
    String activity="";
    if(activo==true){
        activity="activo";
    }else{
        activity="inactivo";
    }
    JOptionPane.showMessageDialog(null,"Nombre completo: "+nombre+"\nCarnet: "+carnet+"\nestado: "+activity);
}
   
    

   
    
}
