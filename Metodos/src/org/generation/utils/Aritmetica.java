package org.generation.utils;

public class Aritmetica {
		public int suma (int a, int b) {
			return a+b;
		} //suma
		
		public int suma (int a, int b, int c) {
			return a+b+c;
		} //suma
		
		public float suma (float a, float b) {
			return a+b;
		} //suma
				
		protected int multiplicacion (int a, int b) {
			return a*b;
		} //multiplicación

		public int cuadrado (int a) {
			return multiplicacion(a,a);
		} //cuadrado
		
		public int division (int a, int b) {
			return a/b;
		} //división
		
		public double raiz (int a) {
			float tmp;
			float raiz = a/2;
			
			do {
				tmp = raiz;
				raiz = (tmp+(a/tmp))/2;
			}
			while ((tmp-raiz) != 0);
			
			return raiz;
		}

		public float potencia (int a, int b) {
			int res = 1;
			for (int i = 1; i <= b; i++) {
				res = res*a;
			}
			return res;
		}
		
}//class aritmetica
