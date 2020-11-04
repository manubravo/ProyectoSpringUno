package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
//		Carga de XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

//		Petición de BEANS al contenedor SPRING
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria);
		System.out.println(Pablo);
		if (Maria.equals(Pablo)) System.out.println("APUNTAN AL MISMO OBJETO");
		else System.out.println("NO APUNTAN AL MISMO OBJETO");
		contexto.close();
	}
}