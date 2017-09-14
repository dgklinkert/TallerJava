package Punto2;

import java.util.HashMap;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idNominaEmp = 0;
		Cargo cargoAnalista = new Cargo();
		Cargo cargoAxuliar = new Cargo();
		cargoAnalista.setSalario(3000);
		cargoAxuliar.setSalario(1000);
		Empleado emp1 = new Empleado("David","1128277934",cargoAnalista);
		Empleado emp2 = new Empleado("Daniel","1125498564",cargoAxuliar);
		Empleado emp3 = new Empleado("Juan","99421",cargoAxuliar);
		Empleado emp4 = new Empleado("Pedro","78945",cargoAnalista);
		Empleado emp5 = new Empleado("Miguel","13183153",cargoAxuliar);
		
		HashMap<String,Empleado> empleadosNomina = new HashMap<String,Empleado>();
		
		Nomina nomina = new Nomina(empleadosNomina);
		idNominaEmp = nomina.IdEmp(idNominaEmp);
		empleadosNomina.put(Integer.toString(idNominaEmp),emp1);
		idNominaEmp = nomina.IdEmp(idNominaEmp);
		empleadosNomina.put(Integer.toString(idNominaEmp),emp2);
		idNominaEmp = nomina.IdEmp(idNominaEmp);
		empleadosNomina.put(Integer.toString(idNominaEmp),emp3);
		idNominaEmp = nomina.IdEmp(idNominaEmp);
		empleadosNomina.put(Integer.toString(idNominaEmp),emp4);
		idNominaEmp = nomina.IdEmp(idNominaEmp);
		empleadosNomina.put(Integer.toString(idNominaEmp),emp5);
		
		
		double nominaTotal = nomina.CalcularNomina();
		System.out.println("La nomina Total es " + nominaTotal);
		
	}
	

}
