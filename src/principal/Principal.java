package principal;

import personas.Personas;

public class Principal {

	public static void main(String[] args) {
		/*Nota: considero Area como el nombre del sector que define id Sector*/
		
		System.out.println("   Carga Inicial de Personas (no se define ni id sector ni categoria vacaciones) \n");
		
		Personas p1 = new Personas("Dario","Martinez","32162151","Comercial",28,33);
		Personas p2 = new Personas("Raul","Gonzalez","45120140","Atencion al publico",14,17);
		Personas p3 = new Personas("Andrea","Lopez","44178852","Ventas",7,18);
		Personas p4 = new Personas("Camila","Maza","28142788","Programador",30,40);
		Personas p5 = new Personas("Renzo","Alamo","46124447","Atencion al publico",14,16);
		Personas p6 = new Personas("Irina","Pons","44159879","Atencion al publico",7,18);
		Personas p7 = new Personas("Matias","Rivadeneira","33514866","Finanzas",14,29);
		Personas p8 = new Personas("Pilar","Almada","31447558","Programador",35,36);
		Personas p9 = new Personas("Alejandro","Cravero","46999784","Ventas",7,15);
		Personas p10 = new Personas("Santiago","Ruarte","45251478","Limpieza",21,17);

		System.out.println("Persona 01: " + p1.getPersona());
		System.out.println("Persona 02: " + p2.getPersona());
		System.out.println("Persona 03: " + p3.getPersona());
		System.out.println("Persona 04: " + p4.getPersona());
		System.out.println("Persona 05: " + p5.getPersona());
		System.out.println("Persona 06: " + p6.getPersona());
		System.out.println("Persona 07: " + p7.getPersona());
		System.out.println("Persona 08: " + p8.getPersona());
		System.out.println("Persona 09: " + p9.getPersona());
		System.out.println("Persona 10: " + p10.getPersona());
		
		
		System.out.println("\n   Se elimina personas menores de 18 años \n");
		
		System.out.println("Persona 01: " + p1.eliminarMenor18());
		System.out.println("Persona 02: " + p2.eliminarMenor18());
		System.out.println("Persona 03: " + p3.eliminarMenor18());
		System.out.println("Persona 04: " + p4.eliminarMenor18());
		System.out.println("Persona 05: " + p5.eliminarMenor18());
		System.out.println("Persona 06: " + p6.eliminarMenor18());
		System.out.println("Persona 07: " + p7.eliminarMenor18());
		System.out.println("Persona 08: " + p8.eliminarMenor18());
		System.out.println("Persona 09: " + p9.eliminarMenor18());
		System.out.println("Persona 10: " + p10.eliminarMenor18());
		
		
		System.out.println("\n   Se actualiza id Sector\n");
		
		System.out.println("Persona 01: " + p1.asignarIdSector(p1.getArea()));
		System.out.println("Persona 02: " + p2.asignarIdSector(p2.getArea()));
		System.out.println("Persona 03: " + p3.asignarIdSector(p3.getArea()));
		System.out.println("Persona 04: " + p4.asignarIdSector(p4.getArea()));
		System.out.println("Persona 05: " + p5.asignarIdSector(p5.getArea()));
		System.out.println("Persona 06: " + p6.asignarIdSector(p6.getArea()));
		System.out.println("Persona 07: " + p7.asignarIdSector(p7.getArea()));
		System.out.println("Persona 08: " + p8.asignarIdSector(p8.getArea()));
		System.out.println("Persona 09: " + p9.asignarIdSector(p9.getArea()));
		System.out.println("Persona 10: " + p10.asignarIdSector(p10.getArea()));
		
		System.out.println("\n   Se actualiza categoría de Vacaciones \n");
		
		System.out.println("Persona 01: " + p1.asignarCategoriaVacaciones(p1.getDiasVacaciones()));
		System.out.println("Persona 02: " + p2.asignarCategoriaVacaciones(p2.getDiasVacaciones()));
		System.out.println("Persona 03: " + p3.asignarCategoriaVacaciones(p3.getDiasVacaciones()));
		System.out.println("Persona 04: " + p4.asignarCategoriaVacaciones(p4.getDiasVacaciones()));
		System.out.println("Persona 05: " + p5.asignarCategoriaVacaciones(p5.getDiasVacaciones()));
		System.out.println("Persona 06: " + p6.asignarCategoriaVacaciones(p6.getDiasVacaciones()));
		System.out.println("Persona 07: " + p7.asignarCategoriaVacaciones(p7.getDiasVacaciones()));
		System.out.println("Persona 08: " + p8.asignarCategoriaVacaciones(p8.getDiasVacaciones()));
		System.out.println("Persona 09: " + p9.asignarCategoriaVacaciones(p9.getDiasVacaciones()));
		System.out.println("Persona 10: " + p10.asignarCategoriaVacaciones(p10.getDiasVacaciones()));

		System.out.println("\n   Personas luego de ejecutar funciones \n");

		System.out.println("Persona 01: " + p1.getPersonaPostFunciones());
		System.out.println("Persona 02: " + p2.getPersonaPostFunciones());
		System.out.println("Persona 03: " + p3.getPersonaPostFunciones());
		System.out.println("Persona 04: " + p4.getPersonaPostFunciones());
		System.out.println("Persona 05: " + p5.getPersonaPostFunciones());
		System.out.println("Persona 06: " + p6.getPersonaPostFunciones());
		System.out.println("Persona 07: " + p7.getPersonaPostFunciones());
		System.out.println("Persona 08: " + p8.getPersonaPostFunciones());
		System.out.println("Persona 09: " + p9.getPersonaPostFunciones());
		System.out.println("Persona 10: " + p10.getPersonaPostFunciones());
		
	}

}
