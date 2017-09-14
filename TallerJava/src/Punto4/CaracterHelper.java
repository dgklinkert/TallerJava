package Punto4;

import java.util.HashMap;


public class CaracterHelper
{
	char [] letras;
	private ICaracterDibujable Icaracter;
	private HashMap<Character,ICaracterDibujable> caracteres;
	public CaracterHelper(String palabra)
	{
		letras = palabra.toUpperCase().toCharArray();
		this.caracteres = new HashMap<Character,ICaracterDibujable>();
		for(int i = 0; i< letras.length;i++)
		{
			implementarLetra(letras[i]);
			if (Icaracter != null)
				caracteres.put(letras[i], Icaracter);
		}

	}
	
	public void dibujar(String palabra)
	{
		letras = palabra.toUpperCase().toCharArray();
		for(int i = 0; i< letras.length;i++)
		{
			 Icaracter = (ICaracterDibujable)caracteres.get(letras[i]);
			if (Icaracter == null)
				System.out.println("no es posible dibujar la letra " + letras[i]);
			else
				Icaracter.dibujar(letras[0]);
			Icaracter = null;
		}
	}
	
	public ICaracterDibujable implementarLetra(char letra)
	{
		switch(letra) 
		{
		   case 'A' :
		      Icaracter = new letraA();
		      break; 
		   
		   case 'I' :
			   Icaracter = new letraI();
			   break; 
				
		   case 'B' :
			  Icaracter = new letraB();
			  break; 
		
		   case 'T' :
			  Icaracter = new letraT();
			  break; 
			 
		   default:
			   Icaracter = null;
		 
		}
		return Icaracter;
	}
}
