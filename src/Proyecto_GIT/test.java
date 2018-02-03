package Proyecto_GIT;
import java.util.*;
import java.io.IOException;
/**
 * 
 * @author Jose y Angelo
 * @version 1.01
 * @
 *
 */


public class test {

	public static void main(String[] args) {
		int op;
		double num;
		String res;
		Scanner sc= new Scanner(System.in);
		//Declaracion del objeto
		Calculadora c1=new Calculadora();
		
		do {
			System.out.println("Por favor elija una de las siguientes opciones.");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. Division");
			System.out.println("5. Resetear");
			System.out.println("6. Raiz cuadrada");
			System.out.println("7. Raiz x");
			System.out.println("8. Salir.");
			op=sc.nextInt();
			switch (op){
			case 1:
				System.out.println("Porfavor Introduzca el numero que desea sumar");
				c1.suma(input(sc.next()));
				System.out.println("El resultado es: "+c1.retornaResu());
				break;
			case 2:
				System.out.println("Porfavor Introduzca el numero que desea restar");
				c1.resta(input(sc.next()));
				System.out.println("El resultado es: "+c1.retornaResu());
				break;
			case 3:
				System.out.println("Porfavor Introduzca el numero que desea multiplicar");
				c1.multi(input(sc.next()));
				System.out.println("El resultado es: "+c1.retornaResu());
				break;
			case 4:
				System.out.println("Porfavor Introduzca el numero que desea dividir");
					c1.div(input(sc.next()));
					System.out.println("El resultado es: "+c1.retornaResu());
				
				break;
			case 5:
				c1.reset("Reset");
				System.out.println("El resultado es: "+c1.retornaResu());
				break;
			case 6://VERSION 2
				c1.raiz_cuadrada();
				System.out.println("El resultado es: "+c1.retornaResu());
				break;
			case 7:
				System.out.println("Porfavor Introduzca el numero al que desea elevar.");
				c1.potencia(input(sc.next()));
				System.out.println("El resultado es: "+c1.retornaResu());
				break;
			case 8:
				op=0;
				break;
				
			default:
					System.out.println("El numero introducido no es correcto");
			}
			
		}while(op!=0);
		
		System.out.println("El resultado es: "+c1.retornaResu());
		System.out.println("**********Eso es todo Amigos**********");
	}

	public static double input(String a){
		if(a.length() <= 13){
			try{
				Double.parseDouble(a);
				return Double.parseDouble(a);
			}
			catch(Exception e){
				System.out.println(e.getMessage()+" Entrada no válida. No son números.");
				a="0";
			}
			}
		else{
			try{
				throw new ArrayIndexOutOfBoundsException(" Error. Longitud inadecuada.  "); 
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
		return 0;
	}
	
	
	
}
