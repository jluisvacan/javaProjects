
public class MatrizDemo {

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		for (int i=0; i <matriz.length; i++) {
			for (int j=0; j <matriz[i].length; j++) {
				System.out.println(matriz[i][j] + ", ");
			}// for_j
			System.out.println();
		}// for_i
		
		for (int[] i : matriz) {
			for(int j : i) {
				System.out.println(j + ", ");
			}//foreach_col
			System.out.println();
		}// foreach_ren
		
		
	}// main
}// class_Demo
