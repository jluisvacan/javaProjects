package org.generation.utils;
import java.util.Scanner;

import org.generation.utils.Aritmetica;

public class CalculatorBrain {

	public static void main(String[] args) {
		Aritmetica ari = new Aritmetica();
//		Scanner console = new Scanner( System.in );
//        System.out.println( "ingresa tu nombre:  " );
//        String name = console.next();
        
//		System.out.println(ari.suma(128, 128));
//		System.out.println(ari.suma(128, 128, 128));
//		System.out.println(ari.suma((float)128.2, 128.4F));
//		System.out.println(ari.cuadrado(5));
//		System.out.println(Otros.multiplica(78, 12));
	
		System.out.println(ari.potencia(3, 2));
		System.out.println(ari.raiz(9));

	}

}
