package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Departament obj=new Departament(1,"books");
		
		Seller seller=new Seller(21,"bob","bog@gnmail",new Date(),3000.00,obj);
		
		System.out.println(seller);

	}

}
