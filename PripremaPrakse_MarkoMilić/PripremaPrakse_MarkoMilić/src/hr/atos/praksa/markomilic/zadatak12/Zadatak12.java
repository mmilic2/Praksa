package hr.atos.praksa.markomilic.zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadatak12 {

	public Zadatak12() throws FileNotFoundException {
		
		Map<String,Integer> wordMap=new HashMap<String, Integer>();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Unesi putanju datoteke:");
		String path = userInput.next();
		userInput.close();
		countWords(path,wordMap);
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(wordMap);
		Zadatak12.printMap(treeMap, path);

		
	}
	
	public static void main(String[] args) {
		
		try {
			new Zadatak12();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void countWords(String path, Map< String, Integer> wordMap) throws FileNotFoundException{
	Scanner file=new Scanner (new File(path));
	while(file.hasNext()){
	String word=file.next().toLowerCase();
	Integer counter=wordMap.get(word);
	if(counter!=null)counter++;
	else counter=1;
	wordMap.put(word,counter);
	}
	file.close();
	}
	static void printRow() {
		for(int i = 0; i < 24;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	static void printMap(Map<String,Integer> treeMap,String file) {
		System.out.print("U datoteci "+file+" se nalaze sljedece rijeci:\n");
		Zadatak12.printRow();
		System.out.print("Rijec (broj ponavljanja)\n");
		Zadatak12.printRow();
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
		    System.out.println(entry.getKey() + " (" + entry.getValue().toString()+")");
		}
		Zadatak12.printRow();
		
	}

	
}
