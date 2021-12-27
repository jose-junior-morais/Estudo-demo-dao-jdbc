package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		SellerDao sellerDao= DaoFactory.createrSellerDao();
		
	System.out.println("TEST 1== seller findbyId==");
		
        Seller seller= sellerDao.findById(3);
        
        System.out.println(seller);
        
    System.out.println("\nTEST 2== seller findbyDepartment==");
        
        Department department=new Department(2,null);
        List<Seller> list=sellerDao.findByDepartment(department);
        
        for(Seller obj:list) {
        	System.out.println(obj);
        }
        
    System.out.println("\nTEST 3== seller findAll==");
        
        list=sellerDao.findAll();
        
        for(Seller obj:list) {
        	System.out.println(obj);
        }
        
     System.out.println("\nTEST 4== seller insert==");        
        Seller newSeller=new Seller(null,"greg","greg@gmail",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id= "+newSeller.getId());
		
     System.out.println("\nTEST 5== seller update==");
     
        seller=sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed!");
        
     System.out.println("\nTEST 6== seller Delete==");
     System.out.println("Enter id for delete= ");
     int id=sc.nextInt();
     sellerDao.deleteByid(id);
     System.out.println("\nDelete Completed!");
     
     sc.close();
	}

}
