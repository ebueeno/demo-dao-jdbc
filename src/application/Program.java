package application;

import java.util.Date;

import model.entities.Sellerr;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Sellerr obj = new Sellerr(1, "Books");
		
		Seller seller = new Seller(21,"Bob","Bob@gmail.com",new Date(), 3000.00,obj);
		
		
		System.out.println(seller);
		
		
		
	}

}
