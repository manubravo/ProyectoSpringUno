package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
//		Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
//		Obtención del BEAN
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getInforme());
		
//		Cerrar el CONTEXTO
		contexto.close();
	}
}