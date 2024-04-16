package Tp_Anual_DDS_G1.Tp_Anual_DDS_G1;
import java.util.Date;

public class FormularioHumano{
    String nombre;
    String apellido; 
    String contacto;  // (correo electrónico, teléfono, WhatsApp).
    // Opcionales.
    Date fechaDeNacimiento;
    String direccion; 
    
    public FormularioHumano(String nombre,String apellido,String contacto,Date fechaDeNacimiento,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion; 
    }
}
