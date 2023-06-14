package hashmapA5;


import java.util.*;


public class PrincipalApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
	
	HashMap<String,Integer> suspenso = new HashMap<>();
	int nalumnos,nota,cont;
	boolean salir=false;
	String nombre;
	System.out.println("¿Cuantos alumnos tiene la asignatura?");
	nalumnos=sc.nextInt();
	
	for (int i = 0 ; i<nalumnos ; i++) {
		System.out.println("introduzca el nombre del alumno");
		 nombre = sc.next();
		 nota = (int)(0+Math.random()*11);
		System.out.println("El alumno "+nombre+" ha sacado de nota un "+ nota);
		
		if (nota < 5) {
			suspenso.put(nombre,nota);
		}
		
		
		
		
	}//fin bucle
	
	do {
	System.out.println("Que desea hacer");
	System.out.println("1. Imprimir alumnos suspensos");
	System.out.println("2. Buscar a un alumno suspenso");
	System.out.println("3. Agregar a un alumno suspenso");
	System.out.println("4. Eliminar a un alumno suspenso");
	int opcion=sc.nextInt();
	
	
	
	switch(opcion) {
	
	
	case 1:
		for (Map.Entry<String,Integer> entrada : suspenso.entrySet()) {
		System.out.println(entrada.getKey()+ " tiene de nota un " + entrada.getValue());
	}
		System.out.println("Desea continuar? 1.si, 2.no");
		 cont=sc.nextInt();
		if (cont==2) {
		System.out.println("Hasta la vista");
		salir=true;}
		break;
		
		
	case 2: 
		System.out.println("Introduce el nombre del alumno");
		nombre=sc.next();
		if (suspenso.containsKey(nombre)) {
			System.out.println("El alumno está suspenso");
		}else {
			System.out.println("El alumno está aprobado");
		}
		System.out.println("Desea continuar? 1.si, 2.no");
		 cont=sc.nextInt();
		if (cont==2) {
		System.out.println("Hasta la vista");
		salir=true;}
		break;
		
		
	case 3: 
		System.out.println("Introduce el nombre del alumno ");
		nombre=sc.next();
		System.out.println("Introduce su nota");
		nota=sc.nextInt();
		if (nota<5) {
			suspenso.put(nombre, nota);
		}else {
			System.out.println("El alumno está aporbado y no se puede añadir");
		}
		System.out.println("Desea continuar? 1.si, 2.no");
		 cont=sc.nextInt();
		if (cont==2) {
		System.out.println("Hasta la vista");
		salir=true;}
		break;	
		
	case 4: 
		System.out.println("Introduce un alumno a eliminar de la lista de suspensos porque recupero");
		nombre=sc.next();
		 if (suspenso.containsKey(nombre)) {
			 suspenso.remove(nombre);
		 }
		 System.out.println("Desea continuar? 1.si, 2.no");
		 cont=sc.nextInt();
		if (cont==2) {
		System.out.println("Hasta la vista");
		salir=true;}
		break;
		
	case 5:
		
		System.out.println("Hasta la vista");
		salir=true;
		break;
		
		
		
	}//fin menu
	
	}while(salir!=true);

	
	
	
	
	}//fin main
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
