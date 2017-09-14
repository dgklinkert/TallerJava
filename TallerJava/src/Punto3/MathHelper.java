package Punto3;

import java.util.List;

public class MathHelper {

	List<Integer> numeros;
	
	public MathHelper(List<Integer> _numeros)
	{
		this.numeros = _numeros;
	}

	public void AddElement (int elemento)
	{
		this.numeros.add(elemento);
		imprimir();
		Burbuja();
	}
	
	
	public void removeElement(int elemento)
	{
		for(int j=0;j< this.numeros.size();j++)
			if( this.numeros.get(j) == elemento)
			{
				this.numeros.remove(j);
				break;
			}
        imprimir();
        Burbuja();
	}

	public void Burbuja()
	{
        int i, j = 0,e1 = 0,e2;
        for(i=0;i< this.numeros.size()-1;i++)
             for(j=0;j< this.numeros.size()-i-1;j++)
             {
            	  e1 = this.numeros.get(j+1);
        		  e2 = this.numeros.get(j);
                  if( e1 < e2)
                	{
                	   this.numeros.set(j+1, e2);
                	   this.numeros.set(j, e1);
                	}
             }
        imprimir();
	}
	
	public void imprimir(List<Integer> enteros)
	{
		System.out.println(this.numeros.toString());	
	}
	
	public void imprimir()
	{
		System.out.println(this.numeros.toString());	
	}
}
