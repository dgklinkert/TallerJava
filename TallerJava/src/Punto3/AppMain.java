package Punto3;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	
	public static void main(String[] args) 
	{
	  List<Integer> enteros = new ArrayList<Integer>();	
	
	  MathHelper math1 = new MathHelper(enteros);
	  math1.AddElement(5);
	  math1.AddElement(1);
	  math1.AddElement(20);
	  math1.AddElement(5);
	  math1.AddElement(3);
	  math1.AddElement(5);
	  math1.removeElement(5);
	}
}
