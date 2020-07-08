package hr.atos.praksa.markomilic.zadatak11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Zadatak11 {

	public Zadatak11() throws IOException {
		
		int choice = 0;
		Scanner userInput = new Scanner(System.in);
		
		do {
			System.out.println("Odaberite jezik:");
			System.out.println("1 Hrvatski");
			System.out.println("2 English");
			System.out.println("3 Deutsch");
			choice = userInput.nextInt();
		}while(choice !=1 && choice != 2 && choice != 3);
		Zadatak11.getMessage(choice);
		userInput.close();
		
	}
	
	public static void main(String[] args) {
		
		
		try {
			new Zadatak11();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void getMessage(int choice) throws IOException {
		Properties prop = new Properties();
		FileInputStream inputStream = null;
		String replyMessage = null;
		Scanner reply = null;
		switch(choice) {
			case 1:{
				inputStream = new FileInputStream("hr/atos/praksa/markomilic/zadatak11/hrvatski.properties");
				break;
			}
			case 2:{
				inputStream = new FileInputStream("hr/atos/praksa/markomilic/zadatak11/english.properties");
				break;
			}
			case 3:{
				inputStream = new FileInputStream("hr/atos/praksa/markomilic/zadatak11/deutsch.properties");
				break;
			}
		}
		prop.load(inputStream);
		reply = new Scanner(System.in);
		System.out.println(prop.getProperty("message1"));
		replyMessage = reply.next();
		System.out.println( replyMessage + " " + prop.getProperty("reply1"));
		System.out.println(prop.getProperty("message2"));
		replyMessage = reply.next();
		System.out.println( replyMessage + " " + prop.getProperty("reply2"));
		System.out.println(prop.getProperty("message3"));
		reply.close();
		inputStream.close();
		
			
	}

	
}
