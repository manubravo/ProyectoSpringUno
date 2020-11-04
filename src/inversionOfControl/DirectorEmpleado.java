package inversionOfControl;

public class DirectorEmpleado implements Empleados {
	
//	Creaci�n de campo tipo creaci�nInforme (interfaz)
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
	
//	M�TODOS INIT Y DESTROY
	public void metodoInicial() {
		System.out.println("Dentro del m�todo INIT. Aqu� ir�an las tareas a ejectuar y antes de que el BEAN est� listo");
	}
	public void metodoFinal() {
		System.out.println("Dentro del m�todo DESTROY. Aqu� ir�an las tareas a ejectuar y despu�s de que el BEAN est� listo");
	}
}
