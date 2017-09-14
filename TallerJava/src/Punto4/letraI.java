package Punto4;

public class letraI implements ICaracterDibujable {

	public letraI() {
		
	}

	@Override
	public void dibujar(char letra) {
		System.out.println("__________");
		System.out.println("|__     __|");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println(" __|   |__ ");
		System.out.println("|_________|");

	}

}
