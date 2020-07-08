package hr.atos.praksa.markomilic.zadatak14;

import java.util.Scanner;

public class Zadatak14 {

	public Zadatak14() {

		Scanner userInput = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.print("Odaberi geometrijski oblik za izracun(unesi broj):"
					+ "\n1.Trokut\n2.Kruznica\n3.Pravokutnik\n4.Kradrat\n");
			choice = userInput.nextInt();
		}while(choice != 1 && choice != 2 && choice != 3 && choice != 4 );
		
		switch(choice) {
		case 1:{
			Trokut triangle = new Trokut();
			System.out.print("Unesi velicinu prve stranice:\n");
			triangle.setFirstSide(userInput.nextDouble());
			System.out.print("Unesi velicinu druge stranice:\n");
			triangle.setSecondSide(userInput.nextDouble());
			System.out.print("Unesi velicinu trece stranice:\n");
			triangle.setThirdSide(userInput.nextDouble());
			triangle.calculateTriangle(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide());
			triangle.printResult(triangle.getArea(),triangle.getPerimiter());
			break;
		}
		case 2:{
			Krug circle = new Krug();
			System.out.print("Unesi radius:\\n");
			circle.setRadius(userInput.nextDouble());
			circle.calculateCircle(circle.getRadius());
			circle.printResult(circle.getArea(), circle.getPerimiter());
			break;
		}
		case 3:{
			Pravokutnik rectangle = new Pravokutnik();
			System.out.print("Unesi velicinu prve stranice:\n");
			rectangle.setFirstSide(userInput.nextDouble());
			System.out.print("Unesi velicinu druge stranice:\n");
			rectangle.setSecondSide(userInput.nextDouble());
			rectangle.calculateRectangle(rectangle.getFirstSide(),rectangle.getSecondSide());
			rectangle.printResult(rectangle.getArea(), rectangle.getPerimiter());
			rectangle.getDiagonal(rectangle.getFirstSide(),rectangle.getSecondSide()); 
			break;
		}
		case 4:{
			Kvadrat square = new Kvadrat();
			System.out.print("Unesi velicinu stranice:\n");
			square.setSide(userInput.nextDouble());
			square.calculateSquare(square.getSide());
			square.printResult(square.getArea(), square.getPerimiter());
			square.getDiagonal(square.getSide(),square.getSide()); 
			break;
		}
		}
		
		userInput.close();
}

	
	
	public static void main(String[] args) {

		new Zadatak14();

	}

}
