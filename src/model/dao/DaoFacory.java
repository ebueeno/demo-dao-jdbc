package model.dao;

import model.dao.impl.SellerDaoJdbc;

public class DaoFacory {

	public static SellerDao creatSellerDao() {
		return new SellerDaoJdbc();
	}
	
}
