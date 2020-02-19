package application;

import java.util.Date;

import model.dao.DaoFacory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
				
		
		
		SellerDao sellerDao = DaoFacory.creatSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.err.println(seller);
		
		
		
	}

}
