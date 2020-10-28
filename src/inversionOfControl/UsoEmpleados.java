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
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());*/
		Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		contexto.close();
	}
}