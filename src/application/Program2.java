package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao=DaoFactory.createrDepartmentDao();
		
		System.out.println("     TEST 1== Depatment findbyId=="); 
		Department department=depDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n    TEST 2== Department findAll==");
		List<Department>list=depDao.findAll();
		    for(Department obj:list) {
		    	System.out.println(obj);
		    }
		    
		    System.out.println("\n    TEST 3== Department insert==");  
		    Department newDep=new Department(5,"Music");
		    depDao.insert(newDep);
		    System.out.println("Inserted! new Department Id= "+newDep.getId());
		    
		    System.out.println("\n    TEST 4: update =======");
			Department dep2 = depDao.findById(1);
			dep2.setName("Food");
			depDao.update(dep2);
			System.out.println("Update completed");
		     
			System.out.println("\n    TEST 6== seller Delete==");
			depDao.deleteByid(7);
			System.out.println("Done! Department Deleted");
	}

}
