package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	
	//Array[]
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa o array com zeros
		
		idades[0]= 29;
		idades[1]= 29;
		idades[2]= 29;
		idades[3]= 40;
		idades[4]= 29;
		
		System.out.println(idades[3]);
		
		System.out.println(idades.length);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i] + "\n");
		}
		
	
	}

}
