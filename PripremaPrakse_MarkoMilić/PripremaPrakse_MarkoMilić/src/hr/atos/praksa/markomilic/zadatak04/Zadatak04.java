package hr.atos.praksa.markomilic.zadatak04;

public class Zadatak04 {

	public Zadatak04() {
		
		int[] numberArray = { 2, 4, 9, 10, 13 };
		
		for(int i=0;i<numberArray.length;i++) {
			if(numberArray[i] % 2 == 0) {
				System.out.println(numberArray[i] + " je paran broj");
			}else {
				System.out.println(numberArray[i] + " je neparan broj");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Zadatak04();

	}

}
