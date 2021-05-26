package provesM2;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class ProvesM2 {
	//Sentencias del Lenguaje
	
	/* Problema 1 
		Haz un programa que según el valor de x (un valor entrado por teclado), indique si es mayor que 10 con el mensaje “demasiado alto” o menor 
		que 10 con el mensaje “demasiado bajo”. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		do {
			System.out.print("Introduce un número: ");
			x = reader.nextInt();
			if(x>10) {
				System.out.println("Número demasiado alto.");
			} else if (x<10) {
				System.out.println("Número demasiado bajo.");
			}
		} while (x != 10);
		
		System.out.println("¡Número 10!");
	}
	*/
	
	/* Problema 2 
		Haz un programa que, según el día de la semana, nos diga “a estudiar toca!” o “por fin descanso!”
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un día de la semana: ");
		String dia = reader.next().toLowerCase();
		
		if(dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("jueves") || dia.equals("viernes")) {
			System.out.println("¡A estudiar toca!");
		} else if(dia.equals("sábado") || dia.equals("domingo")) {
			System.out.println("¡Por fín descanso!");
		}
	}
	*/
	
	/* Problema 3 
		Haz un programa que decida, según el dinero que tengamos, si vamos al videoclub, al cine o nos vamos “al parque…”. 
		Nota: usa condicionales “anidados”.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("¿Cuánto dinero tenemos? ");
		int dinero = reader.nextInt();
		
		if(dinero<5) {
			System.out.println("Vamos al parque.");
		} else if(dinero<10) {
			System.out.println("Vamos al videoclub.");
		} else {
			System.out.println("Vamos al cine.");
		}
	}
	*/
	
	/* Problema 4 
		Muestra por pantalla el resultado de sumar 5 variables, y dile al usuario “te has pasado!” si el resultado es > 100. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0, numero, suma=0;
		
		do {
			System.out.print("Introduce cantidad nº " + (x+1) + ": ");
			numero = reader.nextInt();
			suma = suma + numero;
			if(suma>100) {
				System.out.println("Resultado de la suma: " + suma);
				System.out.println("¡Te has pasado! Fin.");
				break;
			}
			x++;
		} while (suma<=100 && x<5);
		
		if(x == 5) {
			System.out.println("Resultado de la suma: " + suma);
			System.out.println("Secuencia completa.");
		} else {
			System.out.println("Secuencia incompleta");
		}		
	}
	*/
	
	/* Problema 5 
		Toma el ejercicio anterior, y muestra por pantalla si el resultado es múltiplo de 2, 3 o 5. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0, numero, suma=0;
		
		do {
			System.out.print("Introduce cantidad nº " + (x+1) + ": ");
			numero = reader.nextInt();
			suma = suma + numero;
			if(suma>100) {
				System.out.println("Resultado de la suma: " + suma);
				System.out.println("¡Te has pasado!");
				break;
			}
			x++;
		} while (suma<=100 && x<5);
		
		if(x == 5) {
			System.out.println("Resultado de la suma: " + suma);
			System.out.println("Secuencia completa.");
		} else {
			System.out.println("Secuencia incompleta");
		}
		
		if(suma%2 == 0) System.out.println(suma + " es múltiplo de 2.");
		if(suma%3 == 0) System.out.println(suma + " es múltiplo de 3.");
		if(suma%5 == 0) System.out.println(suma + " es múltiplo de 5.");
	}
	*/
	
	/* Problema 6 
		Presenta un menú al usuario donde pueda escoger 5 opciones. Si selecciona cualquiera de ellas, muestra por pantalla: “has escogido la opción X”. 
		Usa un switch. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce una opción [1-5]: ");
		int numero = reader.nextInt();
		
		switch(numero) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("¡No has seleccionado una opción correcta!");
		}
		System.out.println("Has elegido la opción " + numero + ".");
	}
	*/
	
	/* Problema 7 
		¿Qué sucede si quitamos los “break” en el ejercicio anterior? Explica por qué. 
		>> Que no se saldría de la instrucción switch y se ejecutarían el resto de casos (case), visualizándose todos los mensajes. 
	*/
	
	/* Problema 8 
		Haz un bucle que nos muestre todos los números del 1 al 100.
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
	}
	*/
	
	/* Problema 9 
		Muestra ahora la tabla de multiplicar del 37.
	
	public static void main(String[] args) {
		int numero = 37;
		for(int i=1; i<=10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
	}
	*/
	
	/* Problema 10 
		Muestra todos los números pares que haya entre 3 y 99. Nota: “no vale” saltar de 2 en 2, debes usar un if dentro de un bucle. 
	
	public static void main(String[] args) {
		int x = 3;
		System.out.println("Los números pares entre 3 y 99 son:" + "\n");
		
		do {
			if(x%2 == 0) {
				System.out.print(x + " ");
			}
			x++;
		} while (x < 100);
	}
	*/
	
	/* Problema 11 
		¿Qué diferencia hay entre while y do-while? Demuéstralo con un ejemplo. (pista: do-while se ejecuta al menos 1 vez) 
		>> La sentencia while puede realizar entre 0 y n iteraciones. En cambio la sentencia do-while puede realizar entre 1 y n iteraciones, es decir, 
		como mínimo siempre realiza una iteración al encontrarse la condición al final del bucle.
	*/
	
	/* Problema 12 
		Haz un bucle “for” de 1 a 5.000, que termine cuando lleguemos a la vuelta 25. 
		Pista: usa el “break”. 
	
	public static void main(String[] args) {
		for(int i=1; i<=5000; i++) {
			System.out.print(i + " ");
			if(i == 25) {
				break;
			}
		}
	}
	*/
	
	/* Problema 13 
		Haz un bucle “while” que nos cuente los números del 4 al 296. Además, sáltate todos los números que sean múltiplos de 5. 
		Pista: usa el “continue”. 
	
	// Solución 1
	public static void main(String[] args) {
		int i = 3;
		while(i <= 296) {
			i++;
			if(i%5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
	// Solución 2
	public static void main(String[] args) {
		int i = 4;
		while(i <= 296) {
			if(i%5 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
	*/
	
	/* Problema 14 
		Se pretende escribir un programa que determinará si un número es positivo o negativo.
		Dos programadores diferentes han escrito dos programas diferentes, Signo1 y Signo2:
	
	// Signo 1:
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		
		if(a >= 0) {
			System.out.println("positivo");
		}
		System.out.println("negativo");
	}
	
	// Signo 2:
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		
		if(a >= 0) {
			System.out.println("positivo");
		} else {
			System.out.println("negativo");
		}		
	}
	*/
	/* Indica si los dos programas son correctos, si sólo lo es uno de ellos, indica cual, o si ninguno de los dos es correcto. Razonad la respuesta. 
	>> El programa Signo1 está mal programado porqué en cualquier caso diría que el número también es negativo.
	>> En ambos programas falta (System.out.println("Introduce un número: ");), para poder recoger el dato introducido por el usuario, que se guarda en 
		(int a = reader.nextInt();).
	*/
	
	/* Problema 15 
		Respeto a los programas Cond2 y Cond3 que se dan a continuación, responde a las cuestiones siguientes: 
	
	// Cond2:
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce un valor para a: ");
		a = reader.nextInt();
		System.out.println("Introduce un valor para b: ");
		b = reader.nextInt();
		
		if(a%2 == 0) {
			if(b%2 == 0) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		} else {
			if(b%2 == 0) {
				System.out.println("NO");
			} else {
				System.out.println("SI");
			}
		}
	}
	
	// Cond3:
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce un valor para a: ");
		a = reader.nextInt();
		System.out.println("Introduce un valor para b: ");
		b = reader.nextInt();
		c = a%2 + b%2;
		
		if(c!=0 && c!=2) {
			System.out.println("NO");
		} else {
			System.out.println("SI");
		}
	}
	*/
	/* a) ¿Qué resultado produce Cond2 si se le dan los valores 15 y 78? ¿Y Cond3? 
		>> Cond2 NO
		>> Cond3 NO 
		
		b) ¿Qué resultado produce Cond2 si se le dan los valores 10 y 22? ¿Y Cond3? 
		>> Cond2 SI
		>> Cond3 SI 
		
		c) ¿Qué resultado produce Cond2 si se le dan los valores 17 y 21? ¿Y Cond3? 
		>> Cond2 SI
		>> Cond3 SI 
		
		d) ¿Cond2 y Cond3 siempre producen el mismo resultado?, ¿o no? 
		>> Sí. Para que salga “SI”, los dos números deben ser pares o los dos deben de ser impares. Para que salga “NO”, uno de los dos números debe 
			de ser par y el otro impar. 
	*/
	
	/* Problema 16 
		Respeto al programa que se da a continuación responde a las cuestiones siguientes: 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c, qp=0, qn=0;
		System.out.println("Introduce un valor para a: ");
		a = reader.nextInt();
		System.out.println("Introduce un valor para b: ");
		b = reader.nextInt();
		System.out.println("Introduce un valor para c: ");
		c = reader.nextInt();
		
		if(a >= 0 ) {
			qp = qp +1;
		} else {
			qn = qn +1;
		}
		
		if(b >= 0 ) {
			qp = qp +1;
		} else {
			qn = qn +1;
		}
		
		if(c >= 0 ) {
			qp = qp +1;
		} else {
			qn = qn +1;
		}
		
		if(qp>qn) {
			System.out.println("YUPI");
		}
		System.out.println("ADÉU");
	}
	*/
	/* a) ¿Qué resultado produce si se le dan los valores 10, -23 y 12? 
		YUPI 
		ADEU 
		b) ¿Qué resultado produce si se le dan los valores 3, 7 y -9? 
		YUPI 
		ADEU 
		c) ¿En qué circunstancias escribe YUPI antes de escribir ADEU? (¿cuándo escribe YUPI?) 
		>> Si los números positivos superan a los números negativos entonces se escribirá YUPI. En cualquier caso siempre se escribe ADEU. 
	*/
	
	/* Problema 17 
		Respeto al siguiente programa que se da a continuación, responde a las cuestiones siguientes:
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double a, result;
		int n, cycles;
		System.out.println("Introduce un valor para a: ");
		a = reader.nextDouble();
		System.out.println("Introduce un valor para n: ");
		n = reader.nextInt();
		System.out.print("\n");
		result = 1.0;
		cycles = 0;
		
		while(cycles != n) {
			// Checkeamos n para que sea positivo, si fuera negativo ¡entraríamos en un bucle infinito!
			if(n<0) {
				System.out.println("n no puede ser un número negativo.");
				break;
			}
			// Cálculo de (a) elevado a la potencia (n).
			System.out.print(a + " * " + result);
			cycles = cycles +1;
			result = result * a;
			System.out.print(" = " + result + "\n");			
		}
		System.out.println("\n" + "El resultado es " + result + " y se han recorrido " + cycles + " ciclos.");
	}
	*/
	/* 	a) ¿Qué resultado produce si se le dan los valores 5 y 3? 
		>> El resultado es 125. 
		
		b) ¿Qué resultado produce si se le dan los valores 2 y 3? 
		>> El resultado es 8 
		
		c) ¿Qué resultado produce si se le dan los valores 1 y -1? 
		>> El programa no está preparado para exponentes negativos. HE añadido el condicional para checkear que n sea un número positivo.
		
		d) ¿Qué es lo que calcula este programa? 
		>> Realiza la función potencia (a) elevado a (n). 
	*/
	
	/* Problema 18 
		Cuando el programa sea ejecutado, ¿cuáles serán los valores finales de las variables aaa y ccc (que escribirá el programa) si el valor leído 
		del teclado y asignado a la variable bbb es 10?
		>> aaa = 10, ccc = 45
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int aaa=0, bbb, ccc=0;
		System.out.print("Introduce un número: ");
		bbb = reader.nextInt();
		
		while(aaa < bbb) {
			ccc = ccc + aaa;
			System.out.println(ccc);
			aaa++;
		}
		System.out.println("aaa = " + aaa);
		System.out.println("ccc = " + ccc);
	}
	*/
	
	/* Problema 19 
		Respeto al programa que se da a continuación responde a las cuestiones siguientes:
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce un valor para a: ");
		a = reader.nextInt();
		System.out.println("Introduce un valor para b: ");
		b = reader.nextInt();
		
		while(!(a == b)) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println("El resultado es " + a);
	}
	*/
	/* a) ¿Qué resultado produce si se le dan los valores 2 y 5? 
		>> El resultado es 1 
		
		b) ¿Qué resultado produce si se le dan los valores 14 y 21? 
		>> El resultado es 7
		
		c) ¿Qué resultado produce si se le dan los valores 57 y 95? 
		>> El resultado es 19
		
		d) ¿Qué calcula esta función?
		>> Realiza el máximo común divisor, es el algoritmo de Euclides.
	*/
	
	/* Problema 20 
		Cuando el siguiente programa sea ejecutado, ¿Cuáles serán los valores finales de las variables "ahora" y "suma" si el valor (leído del teclado y 
		asignado a la variable "stop") es 34? (¿qué escribe el programa?)
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int ahora, suma, stop;
		System.out.print("Introduce un valor para la variable \"stop\": ");
		stop = reader.nextInt();
		suma = 0;
		ahora = 15;
		
		while(ahora <= stop) {
			ahora = ahora + 2;
			if(ahora%5 == 0) {
				suma = suma + ahora;
			}
		}
		System.out.println("ahora: " + ahora); // ahora: 35
		System.out.println("suma: " + suma); // suma: 60
	}
	*/
	
	/* Problema 21 
		Respeto al programa que se da a continuación, responde a las cuestiones siguientes: 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num, f;
		boolean acabar;
		System.out.println("Introduce un número: ");
		num =  reader.nextInt();
		acabar = (num == 0);
		f = 1;
		
		while(!acabar) {
			System.out.print(f + " * " + num + " = ");
			f = f * num;
			System.out.print(f + "\n");
			num = num - 1;
			acabar = (num == 0);
		}
		System.out.println("\n" + "El resultado es: " + f);
	}
	*/
	/* a) ¿Qué resultado produce si se le da el valor 3? 
		>> El resultado es: 6 
		
		b) ¿Qué resultado produce si se le da el valor 5? 
		>> El resultado es: 120 
		
		c) ¿Qué resultado produce si se le da el valor 0? 
		>> El resultado es: 1 
		
		d) ¿Qué resultado produce si se le da el valor -1? 
		>> El resultado es: 0. El programa no está preparado para calcular 
		
		e) ¿Que es lo que calcula este programa? 
		>> Calcula el factorial de un número 
	*/
	
	/* Problema 22 
		Si se ejecutara el siguiente fragmento de programa, ¿cuáles serían los valores finales de las siguientes variables: exterior, interior, 
		sumaGrande y sumaPequeña?
	
	public static void main(String[] args) {
		int exterior=2, interior=0, sumaGrande=0, sumaPequeña=0;
		
		while(exterior < 12) {
			if(exterior%2 == 0) {
				sumaPequeña = 0;
				interior = 5;
				while(interior <= exterior) {
					sumaPequeña = sumaPequeña + interior;
					interior++;
				}
				sumaGrande = sumaGrande + sumaPequeña;
			}
			exterior++;
		}
		System.out.println("exterior: " + exterior); // exterior: 12
		System.out.println("interior: " + interior); // interior: 11
		System.out.println("sumaGrande: " + sumaGrande); // sumaGrande: 82
		System.out.println("sumaPequeña: " + sumaPequeña); // sumaPequeña: 45
	}
	*/
	
	/* Problema 23
	   a) Suponed que cuando el programa se ejecuta, se le suministran, en este orden, los valores 10 y 25 (que serán recogidos en las variables 
	   "primero" y "ultimo", respectivamente). ¿Cuáles serán los valores de las variables "actual" y "buenos" al finalizar la ejecución? (¿Qué escribirá 
	   el programa al ser ejecutado?)
	   >> actual=26 
	   >> buenos=2 
	   
	   b) Suponed que los valores suministrados son 25 y 10. ¿Qué valores escribirá el programa? 
	   >> Se cuelga porque no finaliza la condición del bucle. El programa obliga a que (primero <= ultimo). 
	   
	   c) La condición (actual != ultimo + 1) que controla la iteración, ¿se puede escribir de alguna otra manera que haga el programa más robusto? 
	   >> actual < ultimo 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int primero, ultimo, actual, buenos;
		System.out.print("Introduce primero: ");
		primero =  reader.nextInt();
		System.out.print("Introduce ultimo: ");
		ultimo =  reader.nextInt();
		actual = primero;
		buenos = 0;
		
		while(actual <= ultimo){
			if(actual > ultimo) break;
			if(actual%2 == 1 && actual%3 ==0) {
				buenos = buenos + 1;
			}
			actual++;
		}
		System.out.println("actual: " + actual);
		System.out.println("buenos: " + buenos);
	}
	*/
	
	/* Problema 24 
		Cuando el programa sea ejecutado, ¿cuáles serán los valores finales de las variables "ahora" y "suma" (¿que escribirá el programa?), si los 
		valores leídos de teclado son 50 (asignado a la variable "terminacion") y 3 (asignado a la variable "control")?: 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int ahora, terminacion, control, suma;
		System.out.print("Introduce número para terminación: ");
		terminacion =  reader.nextInt();
		System.out.print("Introduce número para control: ");
		control =  reader.nextInt();
		ahora = 5;
		suma = 0;
		
		while(ahora <= terminacion) {
			if(control == 0) {
				if(ahora%10 == 0) {
					suma = suma + ahora;
				}
			} else {
				if(ahora%10 == 5) {
					suma = suma + ahora;
				}
			}
			ahora = ahora + 5;
		}
		System.out.println("ahora: " + ahora); // ahora: 55
		System.out.println("suma: "+ suma); // suma: 125
	}
	*/
	
	/* Problema 25 
		Cuando el programa sea ejecutado, ¿cuáles serán los valores finales de las variables "actualInterior", "actualExterior", "sumaInterior" y 
		"sumaExterior"?, si el valor leído del teclado y asignado a la variable "finalExterior" es: 
		a) 4 
		>> actualInterior: 4
		>> actualExterior: 5
		>> sumaInterior: 6
		>> sumaExterior: 10
		 
		b) 10
		>> actualInterior: 10
		>> actualExterior: 11
		>> sumaInterior: 45
		>> sumaExterior: 165
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int actualExterior, finalExterior, actualInterior=0, sumaInterior=0, sumaExterior;
		System.out.print("Introduce valor finalExterior: ");
		finalExterior =  reader.nextInt();
		sumaExterior = 0;
		actualExterior = 1;
		
		while(actualExterior <= finalExterior) {
			sumaInterior = 0;
			actualInterior = 1;
			while(actualInterior < actualExterior) {
				sumaInterior = sumaInterior + actualInterior;
				actualInterior = actualInterior + 1;
			}
			sumaExterior = sumaExterior + sumaInterior;
			actualExterior = actualExterior + 1;
		}
		System.out.println("actualInterior: " + actualInterior);
		System.out.println("actualExterior: " + actualExterior);
		System.out.println("sumaInterior: " + sumaInterior);
		System.out.println("sumaExterior: " + sumaExterior);
	}
	*/
	
	/* Problema 26 
		Escribe un programa que lea dos números enteros y los vuelva a escribir ordenados de menor a mayor. Por ejemplo, si los números dados son 4 
		y 17 el programa tendría que escribir 4, 17; mientras que si los números dados son 45, 29 el programa tendría que escribir 29, 45. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce número 1: ");
		int a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		int b =  reader.nextInt();
		
		if(a > b) {
			System.out.println(b + ", " + a);
		} else {
			System.out.println(a + ", " + b);
		}
	}
	*/
	
	/* Problema 27 
		Escribe un programa que lea tres números reales y que, como resultado, escriba cuántos de los nombres leídos son negativos. Por ejemplo, si los 
		números dados son -1.34, 12.56 y 34.76 el programa tendría que escribir 1, mientras que si los números dados son 4.09, 234.0 y 45.66, entonces 
		el programa tendría que escribir 0. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce número 1: ");
		int a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		int b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		int c =  reader.nextInt();
		int neg = 0;
		
		if(a < 0) neg++;
		if(b < 0) neg++;
		if(c < 0) neg++;
		
		System.out.println("Hay " + neg + " números negativos.");
	}
	*/
	
	/* Problema 28 
		Escribe un programa que lea tres números y que escriba todos los que son más grandes que el primero. Por ejemplo, si los números dados fueran 
		(en este orden) 13, 45, 3, el programa tendría que escribir 45; si los números dados fuesen 17, 23, 19, el programa tendría que escribir 23, 19. 
		Y si los números dados fuesen 19, 19, 20 entonces el programa tendría que escribir 20. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce número 1: ");
		int a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		int b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		int c =  reader.nextInt();
		int bMayorA, cMayorB;
		
		if(a < b && b > c) System.out.println(b + " es mayor que " + a);
		if(a > b && a < c) System.out.println(c + " es mayor que " + a);
		if(a < b && b < c) System.out.println(b + " y " + c + " son mayores que " + a);
		System.out.println("El número mayor es " + Math.max(a, Math.max(b, c)));
	}
	*/
	
	/* Problema 29 
		Haz un programa que calcule las siguientes fórmulas y muestre los resultados por pantalla:
		a) >> a: 5.524001402507504
		b) >> b: -0.5373883531358327
		c) >> c: 6.167070654180442
	
	public static void main(String[] args) {
		double a;
		System.out.println("Los resultados a las operaciones son: \n");
		a = Math.sqrt(((35*4) / Math.sqrt(22.5)) + ((27/2) / 12));
		System.out.println("a: " + a);
		a = (Math.cos(Math.sqrt(28.5) + 32)) / (41 * Math.sin(34.6));
		System.out.println("b: " + a);
		a = (2 * Math.PI) + ((Math.sin(Math.sqrt(35)) / Math.log(22)));
		System.out.println("c: " + a);
	}
	*/
	
	/* Problema 30 
		Haz un programa que genere tres números aleatorios de tipo float entre 0 y 9, los muestre por pantalla, diga cuál es el mayor, cuál es el 
		menor y cuál es su producto.
	
	public static void main(String[] args) {
		double a = Math.random() * 9;
		double b = Math.random() * 9;
		double c = Math.random() * 9;
		
		System.out.println("El primer número es: " + a);
		System.out.println("El segundo número es: " + b);
		System.out.println("El tercer número es: " + c);
		
		System.out.println("\nEl número mayor es: " + Math.max(a,  Math.max(b,  c)));
		System.out.println("El número menor es: " + Math.min(a,  Math.min(b,  c)));
		System.out.println("El producto de los 3 números es: " + (a * b * c));
	}
	*/
	
	/* Problema 31 
		Vamos a hacer una calculadora muy simple, sólo podrá operar con dos números y realizar una sola operación. La calculadora pedirá dos números, 
		y luego el tipo de operación que será (+) para la suma, (-) para la resta, (*) para la multiplicación, (/) para la división y (%) para el resto.
		Después de haber mostrado el resultado por pantalla finalizará el programa. La calculadora operará con números enteros de tipo long. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long numero1, numero2, resultado=0;
		String operador;
		boolean ok = true;
		
		System.out.print("Introduce número 1: ");
		numero1 =  reader.nextLong();
		System.out.print("Introduce número 2: ");
		numero2 =  reader.nextLong();
		System.out.print("Introduce el operador: ");
		operador =  reader.next();
		
		// Solución 1:
		switch(operador) {
			case "+":
				resultado = numero1 + numero2;
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "*":
				resultado = numero1 * numero2;
				break;
			case "/":
				resultado = numero1 / numero2;
				break;
			case "%":
				resultado = numero1 % numero2;
				break;
			default:
				ok = false;
				System.out.println("\nEl operador introducido es incorrecto.");
		}
		
		// Solución 2:
		if(operador.equals("+")) resultado = numero1 + numero2;
		else if(operador.equals("-")) resultado = numero1 - numero2;
		else if(operador.equals("*")) resultado = numero1 * numero2;
		else if(operador.equals("/")) resultado = numero1 / numero2;
		else if(operador.equals("/%")) resultado = numero1 % numero2;
		else {
			ok = false;
			System.out.println("\nEl operador introducido es incorrecto.");
		}
		
		//Final común a las 2 soluciones:
		if(ok) System.out.println("\nLa operación " + numero1 + " " + operador + " " + numero2 + " es igual a " + resultado);
	}
	*/
	
	/* Problema 32 
		Haz que el ordenador se piense un número del 1 al 100, que el usuario tratará de adivinar. El ordenador irá contando el número de intentos. 
		Si el usuario falla el número, el ordenador le dirá si el número pensado es mayor o menor. Cuando el usuario acierte el número, el programa le 
		dará la enhorabuena y le dirá el número de intentos que ha necesitado para adivinarlo. Luego el programa, le preguntará al usuario si quiere 
		jugar otra partida, en caso afirmativo se continuará con el juego y en caso contrario se finalizará el programa.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean fin = false;
		int numDado, intentos=0;
		int numAleatorio = (int)((Math.random()*100) + 1);
		
		System.out.println("----¡JUEGO ADIVINA UN NÚMERO!----");
		
		while(!fin) {
			System.out.print("\nDime un número del 1 al 100: ");
			numDado =  reader.nextInt();
			intentos++;
			if(numDado > numAleatorio) {
				System.out.println("El número a adivinar es más pequeño...");
			} else if(numDado < numAleatorio) {
				System.out.println("El número a adivinar es más grande...");
			} else {
				System.out.println("\n¡Enhorabuena! Has acertado el número.");
				System.out.println("Nº de intentos: " + intentos);
				System.out.println("¿Quieres volver a jugar? Pulsa 0 para acabar, o cualquier tecla para volver a jugar.");
				
				int tecla = reader.nextInt();
				if(tecla == 0) {
					fin = true;
				} else {
					numAleatorio = (int)((Math.random()*100) + 1);
					intentos = 0;
				}
			}
		}
	}
	*/
	
	/* Problema 33 
		Escribe un programa que lea 3 números e indique si alguno de ellos es repetido o no. Por ejemplo, si los números dados fuesen 3, 5, 8 el 
		programa tendría que escribir “No hay repeticiones”; si los números dados fuesen -3, 2, -3 el programa tendría que escribir “Hay repeticiones”.
		Y si los números dados fuesen 4, 4, 4 el programa tendría que escribir “Hay repeticiones”. 
		Nota: el programa sólo debe escribir “Hay repetición” o “No hay repetición” una sola vez. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Introduce número 1: ");
		a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		c =  reader.nextInt();
		
		if((a == b) || (a == c) || (b == c)) System.out.println("\nHay números repetidos.");
		else System.out.println("\nNo hay números repetidos.");
	}
	*/
	
	/* Problema 34 
		Escribe un programa que lea 3 números enteros y calcule la suma de todos los que son múltiples de 5. Si ninguno de los números leídos es 
		múltiple de 5, entonces el resultado ha de ser 0. Por ejemplo, si los números dados son 34, 45 y 30 entonces el resultado ha de ser 75 
		(45+30=75); si los números dados son 20, -15 y -5 el resultado ha de ser 0 (20+(-15)+(-5)=0); y si los números dados son 33, 21 y 19 entonces 
		el resultado ha de ser 0 (ninguno de los tres es múltiple de 5). 
		Pista: un número es múltiplo de 5 si, y sólo si, al dividirlo por 5 el resto de esta división es 0. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c, suma=0;
		
		System.out.print("Introduce número 1: ");
		a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		c =  reader.nextInt();
		
		if(a%5 == 0) suma += a;
		if(b%5 == 0) suma += b;
		if(c%5 == 0) suma += c;
		
		System.out.println("\nLa suma de los múltiples de 5 es " + suma);
	}
	*/
	
	/* Problema 35 
		Igual que en el apartado anterior, pero ahora, si ninguno de los números dados es múltiple de 5, en lugar de dar resultado 0 el programa tiene 
		que escribir “No hay ningún número múltiplo de 5”.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c, suma=0;
		
		System.out.print("Introduce número 1: ");
		a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		c =  reader.nextInt();
		
		if((a%5 != 0) && (b%5 != 0) && (c%5 != 0)) 
			System.out.println("\nNo hay ningún múltiple de 5.");
		else
			System.out.print("\nHay algún múltiple de 5.");
		
		if(a%5 == 0) suma += a;
		if(b%5 == 0) suma += b;
		if(c%5 == 0) suma += c;
		
		if((a%5 ==0) || (b%5 ==0) || (c%5 ==0)) System.out.print(" La suma de los múltiples de 5 es " + suma);
		
	}
	*/
	
	/* Problema 36 
		Escribe un programa que lea 3 números enteros y que, después, haga lo siguiente: 
		- Si el primer número es positivo (y mayor que cero) entonces tiene que escribir un mensaje indicando si alguno de los dos números siguientes 
		  es múltiple de 7 o no. 
		- Si el primer número es negativo entonces tiene que escribir los dos números siguientes ordenados de mayor a menor. 
		- Si el primer número es cero entonces ha de calcular la suma de los valores absolutos de los dos siguientes. 
		
		NOTA: 
		Por ejemplo, si los números dados son 6, 14, 9 el programa tiene que escribir “Alguno de los dos últimos es múltiplo de 7”. 
		Si los números dados son 1, 18, 24 entonces el programa debe de escribir “Ninguno de los dos últimos es múltiple de 7. 
		Si los números dados son -4, 7, 5 entonces el programa debe de escribir 7, 5. 
		Y si los números dados son 0, 3, -4 el programa tiene que escribir 7. 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c, suma=0;
		
		System.out.print("Introduce número 1: ");
		a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		c =  reader.nextInt();
		
		if(a > 0) {
			if((b%7 == 0) || (c%7 == 0)) {
				System.out.println("\nAlguno de los dos últimos números es múltiple de 7.");
			} else {
				System.out.println("\nNinguno de los dos últimos números es múltiple de 7.");
			}
		} else if(a<0){
			if(b < c) System.out.println(c + ", " + b);
			else System.out.println(b + ", " + c);
		} else {
			System.out.println("\nLa suma de los valores absolutos de los dos últimos números es " + (Math.abs(b) + Math.abs(c)));
		}
	}
	*/
	
	/* Problema 37 
		Escribe un programa que lea 4 números enteros, sume los pares por un lado y los impares por otro, e indique si la suma de los pares es 
		superior o igual a 4 veces la suma de los impares, o no. 
		
		NOTA: 
		Por ejemplo, si los números dados son 7, 20, 30, 5 el programa tendría que escribir “La suma de los pares supera o es igual a 4 veces la 
		suma de los impares”, porque 20+30 >= 4(7+5); si los números dados fuesen 10, 3, 5, 2 el programa tendría que escribir “La suma de los pares 
		no supera ni es igual a 4 veces la suma de los impares”, porque 10+2 < 4(3+5).
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b, c, d, pares=0, impares=0;
		
		System.out.print("Introduce número 1: ");
		a =  reader.nextInt();
		System.out.print("Introduce número 2: ");
		b =  reader.nextInt();
		System.out.print("Introduce número 3: ");
		c =  reader.nextInt();
		System.out.print("Introduce número 4: ");
		d =  reader.nextInt();
		
		if(a%2 == 0) pares += a;
		else impares += a;
		
		if(b%2 == 0) pares += b;
		else impares += b;
		
		if(c%2 == 0) pares += c;
		else impares += c;
		
		if(d%2 == 0) pares += d;
		else impares += d;
		
		System.out.println("\nLa suma de los pares es igual a " + pares);
		System.out.println("\nLa suma de los impares es igual a " + impares);
		
		if(pares >= 4 * impares) System.out.println("\nLa suma de los pares supera o es igual a 4 veces la suma de los impares.");
		else System.out.println("\nLa suma de los pares no supera ni es igual a 4 veces la suma de los impares.");
	}
	*/
	
	/* Problema 38 
		Escribe un programa que lea un número n (n > 0) y escriba en la pantalla todos los números enteros positivos entre 0 y n (los dos incluidos).
		Por ejemplo, si el número que se le da es 7, el resultado tendría que ser: 
		0 1 2 3 4 5 6 7 
		El programa no hace falta que verifique si el número dado es cero o inferior porque supondremos que quién lo introduce lo hace correctamente.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, i=0;
		
		System.out.print("Introduce un número: ");
		a =  reader.nextInt();
		
		if(a <= 0) {
			System.out.println("El número debe ser mayor que 0.");
		} else {
			while(i <= a) {
				System.out.print(i + " ");
				i++;
			}
		}
	}
	*/
	
	/* Problema 39
		Igual que el anterior pero separando los números con comas y poniendo un punto al final (detrás del último nombre). 
		Por ejemplo, si el número dado es 5, el resultado tendría que ser:
		0 , 1 , 2 , 3 , 4 , 5 .
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, i=0;
		
		System.out.print("Introduce un número: ");
		a =  reader.nextInt();
		
		if(a <= 0) {
			System.out.println("El número debe ser mayor que 0.");
		} else {	
			while(i<=a) {
				if(i==a) {
					System.out.print(i + " .");
				} else {
					System.out.print(i + " , ");
				}
				i++;
			}
		}
	}
	*/
	
	/* Problema 40
		Escribe un programa que dados dos números m y n (m < n) escriba ordenadamente, todos los números del intervalo [m, n] (m y n incluidos). 
		Por ejemplo, si los números dados son -5 y 4, el resultado tendría que ser:
		-5 -4 -3 -2 -1 0 1 2 3 4
		Es necesario que el programa verifique que el primer número (m) es estrictamente menor que el segundo (n). Si no es así el programa tendría 
		que escribir un mensaje indicando que el primer número ha de ser más pequeño que el segundo.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int m, n, i;
		
		do {
			System.out.print("Introduce el número 1: ");
			m =  reader.nextInt();
			System.out.print("Introduce el número 2: ");
			n =  reader.nextInt();
			if(m > n) {
				System.out.println("\nEl número 1 debe ser menor que el número 2.\n");
			}
		} while (m > n);
		
		i = m;
		
		while(i <= n) {
			System.out.print(i + " ");
			i++;
		}
	}
	*/
	
	/* Problema 41
		Igual que en el ejercicio anterior pero en sentido decreciente. 
		Por ejemplo, si los números dados son 7 y 15, el resultado tendría que ser:
		15 14 13 12 11 10 9 8 7
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int m, n, i;
		
		do {
			System.out.print("Introduce el número 1: ");
			m =  reader.nextInt();
			System.out.print("Introduce el número 2: ");
			n =  reader.nextInt();
			if(m > n) {
				System.out.println("\nEl número 1 debe ser menor que el número 2.\n");
			}
		} while (m > n);
		
		i = n;
		
		while(i >= m) {
			System.out.print(i + " ");
			i--;
		}
	}
	*/
	
	/* Problema 42
		Escribe un programa que dado un número entero n escriba la tabla de multiplicar de n. 
		Por ejemplo, si el número dado es 7 el resultado tendría que ser:
		7 x 1 = 7
		7 x 2 = 14
		7 x 3 = 21
		…
		7 x 9 = 63
		7 x 10 = 70
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		for(i=1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
	}
	*/
	
	/* Problema 43
		Escribe un programa que lea un número n (n >= 1) y dibuje en la pantalla un cuadrado de n x n asteriscos (*). 
		Por ejemplo, si se le da el número 3 el resultado tendría que ser:
		* * *
		* * *
		* * *
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
	*/
	
	/* Problema 44
		Escribe un programa que lea un número n (n >= 1) y dibuje en la pantalla un cuadrado de n x n formado por los números enteros positivos entre 
		1 y n. 
		Por ejemplo, si se le da el número 4 el resultado tendría que ser:
		1 1 1 1
		2 2 2 2
		3 3 3 3
		4 4 4 4
		Si el número que se le da es negativo (o cero) el programa tendría que escribir un mensaje indicando que el número dado no es válido.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<=0) {
			System.out.println("El número debe ser positivo y mayor que cero.");
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print(" " + (i + 1));
			}
			System.out.println("");
		}
	}
	*/
	
	/* Problema 45
		Igual que en el ejercicio anterior pero haciendo que en cada fila estén los números entre 1 y n. Por
		ejemplo, si se le da el número 5 el resultado tendría que ser:
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
		1 2 3 4 5
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<=0) {
			System.out.println("El número debe ser positivo y mayor que cero.");
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print(" " + (j + 1));
			}
			System.out.println("");
		}
	}
	*/
	
	/* Problema 46
		Escribe un programa que dado un número n (n >= 1) escriba un triángulo de asteriscos de altura n. 
		Por ejemplo, si el número que se le da es 4, el resultado tendría que ser:
		*
		* *
		* * *
		* * * *
		Si el número que se le da es negativo (o cero) el programa tendría que escribir un mensaje indicando que el número dado no 
		es válido.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<=0) {
			System.out.println("El número debe ser positivo y mayor que cero.");
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	*/
	
	/* Problema 47
		Igual que en el ejercicio anterior pero ahora invirtiendo el triángulo. 
		Por ejemplo, si el número que se le da es 3, el resultado tendría que ser:
		* * *
		* *
		*
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<=0) {
			System.out.println("El número debe ser positivo y mayor que cero.");
		}
		
		for(i=0; i<n; i++) {
			for(j=0; j<(n-i); j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	*/
	
	/* Problema 48
		Escribe un programa que lea un número n (n >= 3) y dibuje en la pantalla el perímetro de un cuadrado
		de n x n formado por los números enteros positivos entre 1 y n. Por ejemplo, si se le da el número 4 el
		resultado tendría que ser algo como esto:
		
		Solución 1:   Solución 2: 
		
		 * * * *      1 1 1 1
	   	 *     *      2     2
		 *     *      3     3
		 * * * *      4 4 4 4
		
	// Solución 1:
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<3) {
			System.out.println("El número debe ser positivo y mayor o igual a tres.");
		} else {
			for(i=0; i<n; i++) {
				for(j=0; j<n; j++) {
					if(i==0 || i==(n-1) || (i>0 && i<(n-1)) && (j==0 || j==(n-1))) { 
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println("");
			}
		}		
	}
	
	// Solución 2:
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<3) {
			System.out.println("El número debe ser positivo y mayor o igual a tres.");
		} else {
			for(i=0; i<n; i++) {
				for(j=0; j<n; j++) {
					if(i==0 || i==(n-1) || (i>0 && i<(n-1)) && (j==0 || j==(n-1))) { 
						System.out.print((i + 1)+ " ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println("");
			}
		}		
	}
	*/
	
	/* Problema 49
		Escribe un programa que dado un número n (n >= 4) escribe un triángulo de asteriscos de altura n. Por
		ejemplo, si el número que se le da es 5, el resultado tendría que ser:
		*
		* *
		*   *
		*     *
		* * * * *
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<4) {
			System.out.println("El número debe ser positivo y mayor o igual a cuatro.");
		} else {
			for(i=0; i<n; i++) {
				for(j=0; j<=i; j++) {
					if(i==0 || i==(n-1) || (i>0 && i<(n-1)) && (j==0 || j==i)) { 
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println("");
			}
		}		
	}
	*/
	
	/* Problema 50
		Escribe un programa que "dibuje" un cuadrado de n x n utilizando los caracteres + y -. El primero (+) para las filas impares, y el segundo (-) 
		para las filas pares. El valor n se debe de obtener del exterior. Resultados del programa para n=4 y para n=5:
		
		+ + + +      + + + + +
		- - - -      - - - - -
		+ + + +      + + + + +
		- - - -      - - - - -
		             + + + + +
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num, i, j;
		
		System.out.print("Introduce un número: ");
		num =  reader.nextInt();
		
		if(num<2) {
			System.out.println("El número debe ser positivo y mayor o igual a dos.");
		} else {
			for(i=0; i<num; i++) {
				for(j=0; j<num; j++) {
					if(i%2 == 0) { 
						System.out.print("+ ");
					} else {
						System.out.print("- ");
					}
				}
				System.out.println("");
			}
		}		
	}
	*/
	
	/* Problema 51
		Escribe un programa que "dibuje" un cuadrado de n x n utilizando el grupo de caracteres "+ -". El valor n se debe de obtener del exterior. 
		A continuación se muestra el resultado que el programa tendría que proporcionar para n=4 y para n=6:
		
		+ - + -      + - + - + -
		+ - + -      + - + - + -
		+ - + -      + - + - + -
		+ - + -      + - + - + -
		             + - + - + -
		             + - + - + -
		
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, j;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		
		if(n<2) {
			System.out.println("El número debe ser positivo y mayor o igual a dos.");
		} else {
			for(i=0; i<n; i++) {
				for(j=0; j<n; j++) {
					if(j%2 == 0) { 
						System.out.print("+ ");
					} else {
						System.out.print("- ");
					}
				}
				System.out.println("");
			}
		}		
	}
	*/
	
	/* Problema 52
		Escribe un programa que dibuje un triángulo de n pisos, con el número de cada piso indicado a la izquierda. Los pisos impares se deben de 
		hacer con el carácter * y los pares con el carácter +. El valor n se debe de obtener del exterior y no se debe de hacer ninguna verificación. 
		A continuación se muestra el resultado que el programa debería de proporcionar para n=4 y para n=5:
		
		(1) *                    (1) *
		(2) + +                  (2) + +
		(3) * * *                (3) * * * *
		(4) + + + +              (4) + + + + +
		                         (5) * * * * * *
		
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, piso, columna;
		char ahoraToca;
		
		System.out.print("Introduce un número: ");
		n =  reader.nextInt();
		piso = 1;
		
		while(piso <= n) {
			System.out.print("(" + piso + ")" + " ");
			
			if(piso%2 == 0) ahoraToca = '*';
			else ahoraToca = '+';
			
			columna = 1;
			
			while(columna <= piso) {
				System.out.print(ahoraToca);
				columna++;
			}
			System.out.println();
			piso++;
		}
	}
	*/
	
	// Ejercicios de Vectores
	
	/* Problema 1
		Indicar que escribirán los 3 programas que se dan a continuación:
	
	public static void main(String[] args) {
		int t[];
		int i, suma;
		t = new int[7];
		i = 0;
		
		while(i<7) {
			t[i] = i%2;
			i = i + 1;
		}
		
		suma = 0;
		
		for(i=0; i<7; i=i+2) {
			suma = suma + t[i];
		}
		System.out.println(suma);
	} // 0
	
	public static void main(String[] args) {
		int t[] = new int[5];
		int i, suma;
		
		for(i=0; i<=4; i++) {
			if(i%2 == 0) {
				t[i] = i;
			} else {
				t[i] = 2 * i;
			}
		}
		
		i = 0;
		suma = 0;
		while(!(i == 4)) {
			suma = suma + t[i];
			i++;
		}
		System.out.println(suma);
	} // 10
	
	public static void main(String[] args) {
		int t1[], t2[];
		int i;
		t1 = new int[4];
		t2 = new int[10];
		
		for(i=0; i<=9; i++) {
			t2[i] = 0;
		}
		
		t1[0] = 1;
		
		for(i=1; i<=3; i++) {
			t1[i] = i + t1[i-1];
		}
		
		for(i=0; i<=3; i++) {
			t2[t1[i]] = 2 * i;
		}
		
		for(i=0; i<=9; i++) {
			System.out.print(t2[i] + " ");
		}
	} // 0 0 2 0 4 0 0 6 0 0 
	*/
	
	/* Problema 2
		a) Cuando el programa llegue al punto marcado con el comentario // Punto 1 // ; ¿cuál será el contenido de las tablas tReales y tEnteros?
		>> P1 tEnteros: 1 2 4 7
		>> P1 tReales: 0.0 10.0 20.0 30.0 40.0 50.0 60.0 70.0
		
		b) Cuando el programa llegue al punto marcado con el comentario //Punto2, ¿Cuál será el contenido de las tablas tReales y tEnteros?
		>> P2 tEnteros: 1 2 4 7
		>> P2 tReales: 0.0 11.0 19.0 30.0 41.0 50.0 60.0 69.0
	
	public static void main(String[] args) {
		int tEnteros[];
		double tReales[];
		int indx, i, j;
		tReales = new double[8];
		tEnteros = new int[4];
		indx = 0;
		
		while(indx < tReales.length) {
			tReales[indx] = 10.0 * indx;
			indx = indx + 1;
		}
		
		for(indx=0; indx<=(tEnteros.length-1); indx++) {
			tEnteros[indx] = 2 * indx + 1;
		}
		
		indx = 1;
		
		while(indx < (tEnteros.length-1)) {
			tEnteros[indx] = tEnteros[indx] - 1;
			indx++;
		}
		
		System.out.println("P1 tEnteros: ");
		for (i=1; i<=tEnteros.length; i++) {
			System.out.print(tEnteros[i-1] + " ");
		} // P1 tEnteros: 1 2 4 7
		System.out.println("");
		
		System.out.println("\nP1 tReales: ");
		for (j=1; j<=tReales.length; j++) {
			System.out.print(tReales[j-1] + " ");
		} // P1 tReales: 0.0 10.0 20.0 30.0 40.0 50.0 60.0 70.0
		System.out.println("");
		
		// Punto 1 //
		
		for(indx=0; indx < tEnteros.length; indx=indx+2) {
			tReales[tEnteros[indx]]++;
		}
		
		for(indx=1; indx<tEnteros.length; indx=indx+2) {
			tReales[tEnteros[indx]]--;
		}
		
		System.out.println("\nP2 tEnteros: ");
		for (i=1; i<=tEnteros.length; i++) {
			System.out.print(tEnteros[i-1] + " ");
		} // P2 tEnteros: 1 2 4 7
		System.out.println("");
		
		System.out.println("\nP2 tReales: ");
		for (j=1; j<=tReales.length; j++) {
			System.out.print(tReales[j-1] + " ");
		} // P2 tReales: 0.0 11.0 19.0 30.0 41.0 50.0 60.0 69.0
		
		// Punto 2 //
	}
	*/
	
	/* Problema 3
		Dado el siguiente programa:
		a) Cuando el programa llegue al punto marcado con el comentario // PUNTO 1, ¿Cuál será el contenido de la tabla tSelec?
		>> 
		
		b) Cuando el programa llegue al punto marcado con el comentario //PUNTO 2, ¿Cuál será el contenido de la tabla tSelec?
		>> 
	
	public static void main(String[] args) {
		int tInt[], tSelec[];
		int i, j;
		tInt = new int[10];
		tSelec = new int[5];
		
		for(i=0; i<tInt.length; i++) {
			tInt[i] = 2*i;
			if(i%2 == 1) {
				tInt[i]++;
			}
		}
		
		i = 1;
		j = 0;
		
		while(i<=tInt.length) {
			tSelec[j] = tInt[i];
			i = i + 2;
			j = j + 1;
		}
		
		System.out.print("P1 tSelec: ");
		for (j=0; j<=tSelec.length-1; j++) {
			System.out.print(tSelec[j] + " ");
		}
			// PUNTO 1
			
		tSelec[tInt[2]]++;
		tSelec[tSelec[0]]++;
		
		System.out.print("\nP2 tSelec: ");
		for (j=0; j<=tSelec.length-1; j++) {
			System.out.print(tSelec[j] + " ");
		}
		// PUNTO 2
	}
	*/
	
	/* Problema 4
		Escribe un programa que dados dos vectores de componentes reales y longitud N, calcule el producto escalar. 
		Recordad que el producto escalar de (x1, x2, xn) y (y1, y2,..., yn) es x1y1+x2y2+...+ xnyn (suma de los productos de 
		las componentes).
		Notas: primero pedir los valores de las componentes del primer vector y después las del segundo vector. 
		Las componentes serán dadas ordenadamente.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = 10;
		int num1[] = new int[10];
		int num2[] = new int[10];
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			System.out.print("Introduce componente " + (i+1) + " vector 1: ");
			num1[i] =  reader.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			System.out.print("Introduce componente " + (i+1) + " vector 2: ");
			num2[i] =  reader.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			sum = sum + num1[i] * num2[i];
		}
		
		System.out.println("El producto escalar es " + sum);
	}
	*/
	/* Reflexionad sobre la necesidad de utilizar vectores para resolver este problema. Si no se nos pidiera que primero se 
		obtuvieran las componentes del primer vector y después las del segundo, y lo pudiésemos hacer de otra manera, ¿sería 
		necesario utilizar tablas?
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = 10;
		int num1, num2;
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			System.out.print("Introduce componente " + (i+1) + " vector 1: ");
			num1 =  reader.nextInt();
			System.out.print("Introduce componente " + (i+1) + " vector 2: ");
			num2 =  reader.nextInt();
			sum = sum + num1 * num2;
		}
		
		System.out.println("El producto escalar es " + sum);
	}
	*/
	
	/* Problema 5
		Escribe un programa que dados dos vectores de componentes reales, de la misma longitud, calcule su producto escalar. 
		Asumid que ambos vectores están completamente llenos y que, por lo tanto, se puede consultar su atributo length para 
		conocer la longitud.
	
	public static void main(String[] args) {
		int num1[] = {1,2,1,2,1,2,1,2,1,2,1};
		int num2[] = {1,2,1,2,1,2,1,2,1,2,1};
		int sum = 0;
		
		for(int i=0; i<num1.length; i++) {
			sum = sum + num1[i]*num2[i];
		}
		
		System.out.println("El producto escalar es " + sum);
	}
	*/
	
	/* Problema 6
		Escribe un programa que dado un vector de números reales (se puede consultar su atributo length) y un valor real v, 
		determine si este valor aparece o no en el vector.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int vector[] = {1,2,3,4,5,6,7,20,11,22,12};
		boolean encontrado = false;
		System.out.print("Introduce el número a buscar dentro del vector: ");
		int num = reader.nextInt();
		int i;
		
		for(i=0; i<vector.length; i++) {
			if(vector[i] == num) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) {
			System.out.println(num + " encontrado en posición " + i + ".");
		} else {
			System.out.println(num + " no encontrado.");
		}
	}
	*/
	
	/* Problema 7
		Escribe un programa que dado un vector de enteros totalmente lleno (se puede consultar su atributo length) calcule la 
		suma de las componentes que son estrictamente superiores a la última (que ocupa la posición length-1).
	
	public static void main(String[] args) {
		int vector[] = {1,2,3,4,5,6,7,20,11,22,12};
		int suma = 0;
		
		for(int i=0; i<vector.length-1; i++) {
			if(vector[i]>vector[vector.length-1]) {
				suma = suma + vector[i];
			}
		}
		
		System.out.println("Suma elementos vector mayores que " + vector[vector.length-1] + ": " + suma);
	}
	*/
	
	/* Problema 8
		Escribe un programa que dados dos vectores de enteros de la misma longitud y totalmente llenos determine si son o no 
		idénticos.
	
	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<Integer>(11);
	    Vector<Integer> vector2 = new Vector<Integer>(11);
		vector1.add(1);
		vector1.add(2);
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		vector1.add(6);
		vector1.add(7);
		vector1.add(20);
		vector1.add(11);
		vector1.add(22);
		vector1.add(12);
		vector2.add(1);
		vector2.add(2);
		vector2.add(3);
		vector2.add(4);
		vector2.add(5);
		vector2.add(6);
		vector2.add(7);
		vector2.add(20);
		vector2.add(11);
		vector2.add(22);
		vector2.add(12);
		
		System.out.println("¿Los vectores vector1 y vector2 son iguales? " + vector1.equals(vector2));
	}
	*/
	
	/* Problema 9
		Un polinomio de grado N se puede representar como una tabla unidimensional (un vector) de N+1 componentes, de tal 
		manera que en cada componente se almacene un coeficiente (el coeficiente de grado cero se almacena en la posición 0, 
		el de grado 1 se almacena en la posición 1, etc.) 
		Construir un programa que dados los coeficientes de un polinomio P(x) de grado G y un valor real a, calcule el valor 
		de P(a). 
		Nota: primero se dará el valor de G, después los G+1 coeficientes del polinomio (en orden creciente de grado) y, 
		finalmente, el valor a.
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce el grado del polinomio a calcular: ");
		int grado = reader.nextInt();
		double vector[] = new double[grado+1];
		
		for(int i=0; i<grado+1; i++) {
			System.out.print("Introduce el coeficiente de x^" + i + ": ");
			vector[i] = reader.nextDouble();
		}
		
		System.out.print("Introduce el valor de a: ");
		double a = reader.nextInt();
		double Pa = 0;
		
		for(int i=0; i<grado+1; i++) {
			Pa = Pa + Math.pow(a, i) * vector[i];
		}
		
		System.out.println("Valor del polinomio en x="+ a + " es: " + Pa);
	}
	*/
	
	/* Problema 10
		Escribe una función que dada una matriz cuadrada y de componentes enteros, un número entero N que indica la dimensión 
		de la tabla (será NxN) y un valor entero f, calcula la suma de los valores que componen la f-esima fila de la matriz.
	
	public static int sumaFila(int matriz[][], int N, int f){
		int suma = 0;
		
		for(int i=0; i<N; i++){
			suma = suma + matriz[f][i];
		}
		return suma;
	}
	*/
	
	/* Problema 11
		Igual que el problema anterior pero cambiando f por c y calculando los valores que componen la c-esima columna de la 
		matriz.
		
		public static int sumaColumna(int matriz[][], int N, int c){
			int suma = 0;
			
			for(int i=0; i<N; i++){
				suma = suma + matriz[i][c];
			}
			return suma;
		}
	*/
	
	/* Problema 12
		Escribe una función que dada una matriz cuadrada de componentes enteros, y un número entero N que indica la dimensión 
		de la tabla (será NxN) calcule la suma de los valores de la diagonal principal de esta (la diagonal principal es la que
		va del rincón superior izquierdo al rincón inferior derecho).
		
	public static int sumaDiagonal(int matriz[][], int N){
		int suma = 0;
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(i == j){
					suma = suma + matriz[i][j];
				}
			}
		}
		return suma;
	}
	*/
	
	/* Problema 13
		Igual que en el problema anterior pero para la otra diagonal (la que va del rincón superior derecho al rincón inferior
		izquierdo).
		
	public static int sumaDiagonalInv(int matriz[][], int N){
		int suma = 0;
		
		for(int i=0; i<N; i++){
			for(int j=N-1; j>=0; j--){
				if(i+j == N-1){
					suma = suma + matriz[i][j];
				}
			}
		}
		return suma;
	}
		
	*/
	
	
	/* Problema 14
		Se dice que una matriz cuadrada es mágica cuando todas las filas, todas las columnas y las dos diagonales suman lo mismo. 
		Diseñad una función para determinar si una matriz cuadrada es mágica o no. Utilizad las funciones de los ejercicios anteriores. 
		La función recibirá como parámetros la matriz y un entero que indique la dimensión. 
		El siguiente es un ejemplo de matriz mágica de 5x5:
		
			23 6 19 2 15
			10 18 1 14 22
			17 5 13 21 9
			4 12 25 8 16
			11 24 7 20 3
		
		
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.print("Introduce una dimensión de matriz cuadrada: ");
		int N =  reader.nextInt();
		int matriz[][] = new int [N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.println("Introduce matriz [" + i + "] [" + j + "]: ");
				matriz[i][j] = reader.nextInt();
			}
		}
		
		if(sumaDiagonalInv(matriz, N) != sumaDiagonal(matriz, N)) {
			System.out.println("Esta matriz no es mágica.");
		} else if(sumaDiagonal(matriz, N) != sumaFila(matriz, N, 0)) {
			System.out.println("Esta matriz no es mágica.");
		} else if(sumaFila(matriz, N, 0) != sumaFila(matriz, N, N-1)) {
			System.out.println("Esta matriz no es mágica.");
		} else if(sumaColumna(matriz, N, 0) != sumaFila(matriz, N, N-1)) {
			System.out.println("Esta matriz no es mágica.");
		} else {
			System.out.println("¡Esta matriz es mágica!");
		}		
	}
	*/
	
	/* Problema 15
		Escribe el código de una función que dada una tabla de enteros llena (con todas las posiciones inicializadas), indique si el primer elemento 
		(aquel que hay en la componente de índice 0) se encuentra repetido o no.
		
	private static boolean serepiteElPrimero (int[] tabla){
		int idx;
		boolean encontrado;
		idx = 1;
		encontrado = (tabla[idx] == tabla[0]);
		
		while(idx < tabla.length-1 && !encontrado) {
			idx++;
			encontrado = (tabla[idx] == tabla[0]);
		}
		return encontrado;
	}
	*/
	
	/* Problema 16
		Haz un programa que lea una línea de texto, y nos diga el número de vocales que contiene.
	
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		int contador =  0;
		System.out.print("Introduce una frase (sin acentuar): ");
		String z = reader.nextLine();
		
		for(int x=0; x<z.length(); x++) {
			z = z.toLowerCase();
			
			if((z.charAt(x) == 'a') || (z.charAt(x) == 'e') || (z.charAt(x) == 'i') || (z.charAt(x) == 'o') || (z.charAt(x) == 'u')) {
				contador++;
			}
		}
		System.out.println("Esta frase tiene " + contador + " vocales.");
	}
	*/
	
	/* Problema 17
		Haz un programa que lea una línea de texto, y nos diga la primera posición en que aparece la letra “s”, o “no aparece” en caso de que no 
		haya ninguna “s”.
	
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		boolean existeS = false;
		System.out.print("Introduce una frase (sin acentuar): ");
		String z = reader.nextLine();
		
		for(int x=0; x<z.length(); x++) {
			z = z.toLowerCase();
			
			if(z.charAt(x) == 's') {
				existeS = true;
				System.out.println("La primera \"s\" se encuentra en la posición: " + (x+1));
				break;
			}
		}
		
		if(!existeS) {
			System.out.println("No hay ninguna \"s\".");
		}
	}
	*/
	
	/* Problema 18
		Haz un programa que lea una línea de texto, y la devuelva sustituyendo todas las “a” por “e”, las “e” por “i”, las “i” por “o” y las “o” 
		por “u” y las “u” por “a”.
	
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.print("Introduce una frase (sin acentuar): ");
		String z = reader.nextLine();
		
		z = z.toLowerCase();
		
		z = z.replace('u', 'z');
		z = z.replace('o', 'u');
		z = z.replace('i', 'o');
		z = z.replace('e', 'i');
		z = z.replace('a', 'e');
		z = z.replace('z', 'a');
		
		System.out.println(z);
	}
	*/
	
	/* Problema 19
		Haz un programa que lea una serie de nombres separados por comas, de la siguiente manera: Pedro, marta, javier, sonia…. 
		Y que nos genere un array de Strings con todos los nombres, uno en cada posición del array.
	
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.print("Introduce una serie de nombres separados por comas, sin espacios: ");
		String z = reader.nextLine();
		System.out.println("->" + z);
		
		String[] a = z.split(" ");
		for(int x=0; x<a.length; x++) {
			System.out.print(a[x] + " ");
		}
	}
	*/
	
	/* Problema 20
		Lee una línea de texto, y muestra solo el trozo que haya entre el carácter 5 y el 10. Si no es tan grande, avisa al usuario de que no 
		puede realizarse.
	
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		System.out.print("Introduce una línea de texto de 10 caracteres mínimo: ");
		String z = reader.nextLine();
		
		if(z.length()<10) {
			System.out.println("La línea de texto tienes menos de 10 caracteres.");
		} else {
			System.out.println("Los caracteres de tu frase, entre las posiciones 5 y 10 son: " + (z.substring(5,10)));
		}
	}
	*/
	
	/* Problema 21
		Lee 10 frases del teclado, que guardarás en una sola variable de tipo StringBuilder. Después, reemplaza todas las vocales por el símbolo $ 
		y dale la vuelta al resultado final.
	
	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		StringBuilder sb =  new StringBuilder();
		
		System.out.println("Introduce, una tras otra, un total de 10 frases: ");
		
		for(int x=1; x<=10; x++) {
			System.out.print("Frase " + x + ": ");
			sb.append(reader.nextLine());
		}
		
		for(int x=0; x<sb.length(); x++) {
			if((sb.charAt(x) == 'a') || (sb.charAt(x) == 'e') || (sb.charAt(x) == 'i') || (sb.charAt(x) == 'o') || (sb.charAt(x) == 'u')) {
				sb.setCharAt(x, '$');
			}
		}
		
		sb.reverse();
		System.out.println("Las 10 frases escritas al revés y sustituyendo las vocales por $, quedan así: ");
		System.out.println(sb);
	}
	*/
	
	/* Problema 22
		Lee 10 números dentro de un array tipo int, y muestra el número mayor de la serie.
	
	public static void main(String[] args) {
		int[] vector = {11, 92, 33, 40, 35, 66, 73, 89, 56, 32};
		int Grande = 0;
		System.out.print("Vector: ");
		for(int x=0; x<vector.length; x++) {
			System.out.print(vector[x] + " ");
			if(vector[x] > Grande) {
				Grande = vector[x];
			}
		}
		System.out.println("\nEl valor más grande es " + Grande);
	}
	*/
	
	/* Problema 23
		Amplía el ejercicio anterior, y calcula también la suma total.
	
	public static void main(String[] args) {
		int[] vector = {11, 92, 33, 40, 35, 66, 73, 89, 56, 32};
		int Grande = 0, suma = 0;
		System.out.print("Vector: ");
		
		for(int x=0; x<vector.length; x++) {
			System.out.print(vector[x] + " ");
			suma = suma + vector[x];
			if(vector[x] > Grande) {
				Grande = vector[x];
			}
		}
		System.out.println("\nEl valor más grande es " + Grande);
		System.out.println("La suma de los valores es " + suma);
	}
	*/
	
	/* Problema 24
		Lee 9 números por teclado y guárdalos en una matriz de 2 dimensiones de 3x3. Usa para ello 2 bucles for anidados.
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[][]matriz = new int[3][3];
		
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				System.out.print("Introduce matriz[" + x + "][" + y +"]: ");
				matriz[x][y] = sc.nextInt();
			}
		}
		
		System.out.println("\nResultado matriz:");
		for(int x=0; x<3; x++) {
			if(x != 0) System.out.println("");
			for(int y=0; y<3; y++) {
				System.out.print(matriz[x][y] + " ");
			}
		}
	}
	*/
	
	/* Problema 25
		Haz un programa que lea una fecha por teclado, y nos indique los días que faltan (o que han pasado) hasta la fecha actual. 
		Utiliza para ello la clase Calendar.
	
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		int year = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH);
		int date = cal1.get(Calendar.DATE);
		
		System.out.println("Año actual: " + year);
		System.out.println("Mes actual: " + (month + 1)); // Hay que sumar 1 al mes ya que el método toma Enero = 0
		System.out.println("Día actual: " + date);
		
		Scanner sc =  new Scanner(System.in);
		int tuAño, tuMes, tuDía;
		Calendar cal2 = Calendar.getInstance();
		System.out.println("Introduce tu año de nacimiento  en formato YYYY: ");
		tuAño = sc.nextInt();
		System.out.println("Introduce tu mes de nacimiento  en formato MM: ");
		tuMes = (sc.nextInt() - 1); // Hay que restar 1 para que luego al calcular los milisegundos los calcule en el mes correcto!
		System.out.println("Introduce tu día de nacimiento  en formato DD: ");
		tuDía = sc.nextInt();
		
		cal2.set(tuAño, tuMes, tuDía);
		// Diferencia en milisegundos
		long diff = (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (1000*3600*24);
		System.out.println("Hay " + diff + " días de diferencia");
	}
	*/
	
	/* Problema 26
		Tendrás que hacer un programa que te pida dos fechas, y te muestre el intervalo en días entre ambas. Comprueba que la primera fecha sea 
		anterior a la segunda. Para realizar este programa utiliza las clases Date y Calendar. También crea un paquete llamado fecha que contenga 
		una clase llamada ControlDeFecha, esta clase debe albergar un método llamado getDias() que devolverá el número de días entre dos fechas, 
		usa este método en el programa.
	*/
	public static void main(String[] args) {
		SimpleDateFormat sdtf = new SimpleDateFormat("dd-MM-yyy");
		String fecha1 = "";
		String fecha2 = "";
		Scanner sc =  new Scanner(System.in);
		Date dt1 = new Date();
		Date dt2 = new Date();
		boolean ok = false;
		
		do {
			try {
				System.out.println("Introduce una primera fecha (dd-MM-yyyy): ");
				fecha1 = sc.next();
				dt1 = sdtf.parse(fecha1);
				System.out.println("Introduce una segunda fecha posterior a la anterior (dd-MM-yyyy): ");
				fecha2 = sc.next();
				dt2 = sdtf.parse(fecha2);
				
				if (dt2.after(dt1)) ok = true;
				else System.out.println("¡Esta fecha no es posterior a la anterior!");
				
			} catch (ParseException e) {
				System.out.println("Entrada de fecha no válida: " + e.getMessage());
			}
		} while(!ok);
		
		ControlDeFecha diferDias = new ControlDeFecha(dt1, dt2);
		System.out.println("La diferencia entre las fechas " + fecha1 + " y " + fecha2 + " es de " + diferDias.getDias() + " días.");
	}
	
	public static class ControlDeFecha{
		Date fechaAntigua, fechaActual;
		
		public ControlDeFecha(Date fechAnt, Date fechNue) {
			this.fechaAntigua = fechAnt;
			this.fechaActual = fechNue;
		}
		
		public long getDias() {
			long difer = fechaActual.getTime() - fechaAntigua.getTime();
			long nDias = difer / (1000*60*60*24);
			return nDias;
		}
	}

	

