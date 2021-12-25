package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj=new Department(1,"books");
		
		Seller seller=new Seller(21,"bob","bog@gnmail",new Date(),3000.00,obj);
		
		System.out.println(seller);
		
		SellerDao sellerDao= DaoFactory.createrSellerDao();

	}

}
