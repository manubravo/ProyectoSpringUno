package inversionOfControl;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;

	@Override
	public String getTareas() {
		return "Gestiono agenda de JEFES";
	}
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el SECRETARIO " + this.informeNuevo.getInformes();
	}

}
