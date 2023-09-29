package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		/*Crear*/
		//String empleado = new EmpleadoController().createEmpleado("Rodrigez","James Bond","25","M","2400");
		//String empleado = new EmpleadoController().createEmpleado("Motta","Olivia Flor","90","F","1080");
		
		/*Eliminar*/
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		
		/*Actualizar*/
		//String empleado = new EmpleadoController().updateEmpleado(2,"Motta Flores","Olivia Flor","30","F","1400");
		
		/*Leer*/
		String empleado = new EmpleadoController().getEmpleado(1);
		
		System.out.println(empleado);

	}

}
