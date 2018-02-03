/*Modeliza una clase calculadora tendra un atributo resultado.
 * reset --> poner a 0 resultado
 * suma --> resutaldo + valor
 * resta --> resultado - valor
 * multiplicacion --> resultado * valor
 * division --> resultado / valor
 */

package Proyecto_GIT;

import java.io.IOException;

public class Calculadora {

	//Declaracion de atributos
	private double resultado=0;
	
	//Declaracion de constructores:
	
	public Calculadora (){
		
	}
	
	//Declaracion de Metodos
	
	public void suma (double a){
		if(a < Integer.MAX_VALUE && this.resultado < Integer.MAX_VALUE){
		this.resultado+=a;
		}
		else {
			try {
				throw new Exception("Habrá overflow si se hace esta suma.");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public void resta (double b) {
		if(b < Integer.MAX_VALUE && this.resultado < Integer.MAX_VALUE){
		this.resultado-=b;
		}
		else {
			try {
				throw new Exception("Habrá overflow con esta resta.");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public void multi(double c){
		if(c < Integer.MAX_VALUE && this.resultado < Integer.MAX_VALUE){
		this.resultado*=c;
		}
		else{
			try {
				throw new Exception("Habrá overflow con esta multiplicación.");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	public void div(double d){
		if(d!=0){
		this.resultado = this.resultado / d;
		}
		else{try {
			throw new Exception("No se puede dividir por 0");
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
	
	public void raiz_cuadrada(){
		if(this.resultado < Integer.MAX_VALUE){
			this.resultado = this.resultado * this.resultado;
			}
			else{
				try {
					throw new Exception("Habrá overflow con esta raiz cuadrada.");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
	}
	
	
	public void reset (String e){
		
		this.resultado = 0;
		
	}
	
	public double retornaResu (){
	
		return this.resultado;
	}
	

}