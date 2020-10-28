package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
//		Creación de objetos de tipo Empleado
//		Empleados e1 = new JefeEmpleado();
//		Empleados e2 = new SecretarioEmpleado();
//		Empleados e1 = new DirectorEmpleado();

//		Visualiza
//		System.out.println(e1.getTareas());
		
//		Carga de XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());

		
//		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
//		System.out.println(Maria.getTareas());
//		System.out.println(Maria.getInforme());
//		System.out.println("EMAIL MARÍA: " + Maria.getEmail());
//		System.out.println("EMPRESA: " + Maria.getNombreEmpresa());
//		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
//		System.out.println("EMAIL PABLO: " + Pablo.getEmail());
//		System.out.println("EMPRESA: " + Pablo.getNombreEmpresa());
		 

		contexto.close();
	}
}