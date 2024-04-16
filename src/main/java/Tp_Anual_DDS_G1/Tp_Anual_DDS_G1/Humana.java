package Tp_Anual_DDS_G1.Tp_Anual_DDS_G1;

public class Humana implements estadoPersona{
	public void colaborar() {
		
	}
	
	public FormularioHumano completarFormulario(String nombre,String apellido,String contacto,Date fechaDeNacimiento,String direccion){
		FormularioHumano formularioNuevo = new FormularioHumano(nombre,apellido,contacto,fechaDeNacimiento,direccion);
	}
}
