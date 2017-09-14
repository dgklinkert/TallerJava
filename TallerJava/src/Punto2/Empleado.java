package Punto2;

public class Empleado {
	
	private String nombre, documento;
	

	private Cargo idCargo;
	
	public Empleado (String nombre, String documento, Cargo id)
	{
		this.idCargo = id;
		this.nombre = nombre;
		this.documento = documento;
	}
	
	public double getSalary() 
	{
		return idCargo.getSalario();
	}

	public void setId(Cargo id) 
	{
		this.idCargo = id;
	}
	
	public String getDocumento() 
	{
		return documento;
	}

	public void setDocumento(String documento)
	{
		this.documento = documento;
	}
	
}
