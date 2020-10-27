package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa(1,"Marcus Vinicius","mv@gmail.com");
		Pessoa p2 = new Pessoa(2,"Marcus","marcus@gmail.com");
		Pessoa p3 = new Pessoa(3,"Vinicius","vinicius@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
