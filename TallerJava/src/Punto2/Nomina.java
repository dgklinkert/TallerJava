package Punto2;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Nomina {
	private int id;
	private Date fecha;
	private HashMap<String, Empleado> empleados;
	private Empleado emp;
	
	public Nomina (HashMap<String, Empleado>  empleados)
	{
		this.empleados = empleados;
	}
	
	public int IdEmp(int i)
	{
		return i += 1;
	}
	
	public double CalcularNomina()
	{	
		double salario = 0;
		Iterator<?> it = this.empleados.entrySet().iterator();
		while (it.hasNext()) 
		{
			Map.Entry e = (Map.Entry)it.next();
			emp = (Empleado) e.getValue();
			salario += emp.getSalary();
			System.out.println(e.getKey() + " " + emp.getSalary()+ " "+emp.getDocumento());
		}
				
		return salario;
	}
}
