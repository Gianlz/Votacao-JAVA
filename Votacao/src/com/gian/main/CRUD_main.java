package com.gian.main;
import com.gian.mvc.Pessoas;
public class CRUD_main {

	public static void main(String[] args) {
		Pessoas p = new Pessoas();
		p.setNome("Gianluca");

		
		System.out.println(p.getNome());
	}

}
