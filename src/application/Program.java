package application;

import model.dao.DaoFacory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFacory.creatSellerDao();

		System.out.println("== Test 1 :Seller findById ==");
		Seller seller = sellerDao.findById(3);

		System.err.println(seller);

	}

}
