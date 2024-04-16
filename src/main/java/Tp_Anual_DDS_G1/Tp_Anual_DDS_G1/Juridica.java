package Tp_Anual_DDS_G1.Tp_Anual_DDS_G1;

public class Juridica implements estadoPersona{
	public void colaborar() {
		
	}
	public void donar(){

	}
	public void donarDinero(){
		
	}
	public FormularioJuridico completarFormulario(String razonSocial,TipoEmpresa tipo,String rubro){
		FormularioJuridico formularioNuevo = new FormularioJuridico(razonSocial,tipo,rubro);
	}
}
