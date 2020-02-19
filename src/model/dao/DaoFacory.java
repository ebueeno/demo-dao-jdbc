package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJdbc;

public class DaoFacory {

	public static SellerDao creatSellerDao() {
		return new SellerDaoJdbc(DB.getConnection());
	}
	
}
