package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(221, 122);
		
		contas[0] = cc1;	
		
		
		
		
		System.out.println(contas[0]);

	}

}
