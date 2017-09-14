
public class Calculadora 
{

	public Calculadora()
	{
		
	}
	void sumar(float a,float b)
	{
	
		a += b;
		System.out.println(a);
	}
	
	void restar(float a,float b)
	{
	
		a -= b;
		System.out.println(a);
	}
	
	void multiplicar(float a,float b)
	{
		
		a = b * a;
		System.out.println(a);
	}
	
	void dividir(float a,float b)
	{
	
		if (b== 0)
			System.out.println("no se permite la division por 0");
		else
		{
			a /= b;
			System.out.println(a);
		}
	}
}
