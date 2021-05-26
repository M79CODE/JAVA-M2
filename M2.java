package m2;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class M2 {
	/*Fase 1
		- Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra. 
		- Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.

	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String name = reader2.nextLine();

		char[] myChars = name.toCharArray();

		for(int i=0; i<myChars.length; i++) {
			if(i == myChars.length-1)
				System.out.print(myChars[i] + ".");
			else
				System.out.print(myChars[i] + ", ");
		}		
	}
	*/

	/* Fase 2
		Canvia la taula per una llista (List<Character>).
		Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’. 
		Si trobes un número, mostra per pantalla: ‘Els noms de persones no contenen números!’.

	public static boolean isNumber(String name) {
		ArrayList<Character> myChars = new ArrayList<Character>();
		boolean isNumber = false;

		for(int i=0; i<name.length(); i++) {			
		myChars.add(name.charAt(i));
		}

		for (Character c:myChars){
			char letter = Character.toLowerCase(c);
			isNumber = (letter >= '0') && (letter <= '9');
			if (isNumber) {
				isNumber = true;
				break;
			}
		}
		return isNumber;
	}


	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String name = reader2.nextLine();
		boolean isNum = isNumber(name);
		char letter;
	    boolean isVocal;
	    boolean isSpace;
		ArrayList<Character> myChars = new ArrayList<Character>();

		if(isNum) {
			System.out.println("¡Los nombres de persona no contienen números!");
		} else if (!isNum) {
			System.out.println("");

			for(int i=0; i<name.length(); i++) {			
			myChars.add(name.charAt(i));
			}

			for (Character ch:myChars){
			  letter = Character.toLowerCase(ch);
			  isVocal = (letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u');
			  isSpace = (letter == ' ');

			  if (isSpace) {
				  System.out.println(ch);
			  } else if (isVocal) {
				  System.out.println(ch + " VOCAL");
			  } else {
				  System.out.println(ch + " CONSONANTE");
			  }
		     }
		}
	}
	*/

	/* Fase 3
		Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.

	public static boolean isNumber(String name) {
		ArrayList<Character> myChars = new ArrayList<Character>();
		boolean isNumber = false;

		for(int i=0; i<name.length(); i++) {			
		myChars.add(name.charAt(i));
		}

		for (Character c:myChars){
			char letter = Character.toLowerCase(c);
			isNumber = (letter >= '0') && (letter <= '9');
			if (isNumber) {
				isNumber = true;
				break;
			}
		}
		return isNumber;
	}

	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String name = reader2.nextLine();
		boolean isNum = isNumber(name);
		char letter;
		ArrayList<Character> myChars = new ArrayList<Character>();
		LinkedHashMap<Character, Integer> lettersRepeat = new LinkedHashMap<Character, Integer>();

		if(isNum) {
			System.out.println("¡Los nombres de persona no contienen números!");
		} else if (!isNum) {
			System.out.println("");

			for(int i=0; i<name.length(); i++) {			
			myChars.add(name.charAt(i));
			}

			for(Character ch:myChars){
				letter = Character.toLowerCase(ch);
				Integer value = lettersRepeat.get(letter);

				lettersRepeat.put(letter, (value == null) ? 1 : value + 1);
			}

			for(Character i:lettersRepeat.keySet()) {
				System.out.println("clave: " + i + " - valor: " + lettersRepeat.get(i));
			}			
		}
	}
	*/

	/* FASE 4
		− Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
		− Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. 
		  És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName.
		FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]

	public static boolean isNumber(String name) {
		ArrayList<Character> myChars = new ArrayList<Character>();
		boolean isNumber = false;

		for(int i=0; i<name.length(); i++) {			
		myChars.add(name.charAt(i));
		}

		for (Character c:myChars){
			char letter = Character.toLowerCase(c);
			isNumber = (letter >= '0') && (letter <= '9');
			if (isNumber) {
				isNumber = true;
				break;
			}
		}
		return isNumber;
	}

	public static void main(String[] args) {
		Scanner reader2 = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String name = reader2.nextLine();
		System.out.print("Introduce tu nombre: ");
		String surname = reader2.nextLine();
		boolean isNum1 = isNumber(name);
		boolean isNum2 = isNumber(surname);
		ArrayList<Character> myCharsName = new ArrayList<Character>();
		ArrayList<Character> myCharsSurname = new ArrayList<Character>();
		ArrayList<Character> myCharsFullName = new ArrayList<Character>();

		if(isNum1 || isNum2) {
			System.out.println("¡Los nombres de persona no contienen números!");
		} else if (!isNum1 && !isNum2) {
			System.out.println("");

			for(int i=0; i<name.length(); i++) {			
			myCharsName.add(name.charAt(i));
			myCharsFullName.add(name.charAt(i));
			if(i==(name.length()-1)) {
				myCharsFullName.add(' ');
			}
			}

			for(int i=0; i<surname.length(); i++) {			
			myCharsSurname.add(surname.charAt(i));
			myCharsFullName.add(surname.charAt(i));
			}
		}	

		System.out.print("FullName: " + myCharsFullName);
	}
	*/

	/* Milestone 2

	   Fase 1
	   Crea una aplicació que dibuixi una escala de números, sent cada línia números començant en 1 i acabant en el número de la línia.
	   Aquest és un exemple, si introduïm un 5 com a alçada:
	   1
	   1 2
	   1 2 3
	   1 2 3 4
	   1 2 3 4 5 

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n;
		int i;
		int j;

		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		reader.close();

		if(n<=0) {
			System.out.println("El número debe ser positivo y mayor o igual a uno.");
		} else {
			for(i=1; i<=n; i++) {
				for(j=1; j<=i; j++) {
					System.out.print(j + " ");
					if(j==i) {
						System.out.println();
					}
				}
			}
		}		
	}
	*/

	/* Fase 2
	   Crea una aplicació que dibuixi una piràmide invertida d'asteriscs. Nosaltres li vam passar l'alçada de la piràmide per teclat.
	   Aquest és un exemple:
	   *********
	    *******
	     *****
	      ***
	       *

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número: ");
	int userNum = scanner.nextInt();
	scanner.close();
	System.out.println();
	int count = 0;

	for(int i=userNum-1; i>=0; i--) {
	    String fila = "";

	    for(int j = 0; j < count; j++) {
		fila += ' ';
	    }

	    for(int k = 0; k<((i*2)+1); k++) {
		fila += '*'; 
	    }

	    count++;
	    System.out.println(fila);
	}		
	}
	*/

	/* Milestone 3
		Exercici: En aquest exercici es proposa un exercici complex de comprovacions i bucles per crear un rellotge digital que mostra l'hora 
		sense parar. A més té un segon d'espera per més realisme.
		− Només necessites 3 variables int (hour, minutes, seconds)
		− El rellotge ha de tenir 6 dígits en tot moment: 00:00:00
		− L’aplicació no ha de finalitzar mai.
		− Per tal que el rellotge trigui un segon has d’implementar: Thread.sleep(1000);
	*/
	public static void main(String[] args) throws Exception {
		int hour = dameHora();
		int minutes = dameMinutos();
		int seconds = dameSegundos();
		while(true) {
	    Thread.sleep(1000);
	    seconds++;

	    if (seconds == 60) {
		minutes++;
		seconds = 0;
	    }

	    if (minutes == 60) {
		hour++;
		minutes = 0;
	    }

	    if (hour == 24) {
		hour = 0;
	    }

	    System.out.println(twoDigits(hour) + ":" + twoDigits(minutes)+ ":" + twoDigits(seconds));
	}	
	}

	public static int dameHora() {
		Calendar horaActual = Calendar.getInstance();
		int hora = horaActual.get(Calendar.HOUR_OF_DAY);
		return hora;
	}

	public static int dameMinutos() {
		Calendar horaActual = Calendar.getInstance();
		int hora = horaActual.get(Calendar.MINUTE);
		return hora;
	}

	public static int dameSegundos() {
		Calendar horaActual = Calendar.getInstance();
		int hora = horaActual.get(Calendar.SECOND);
		return hora;
	}

	 private static String twoDigits(int n) {
		String str = Integer.toString(n);

		if (str.length() < 2) {
		    str = '0' + str;
		}

		return str;
	 }
}
