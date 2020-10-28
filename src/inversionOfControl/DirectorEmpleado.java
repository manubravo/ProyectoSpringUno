package inversionOfControl;

public class DirectorEmpleado implements Empleados {
	
//	Creación de campo tipo creaciónInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	private String email;
	private String nombreEmpresa;
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestiono la EMPRESA ENTERA";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el DIRECTOR: " + this.informeNuevo.getInformes();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
