package com.office.crud.servicem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.office.crud.dal.UserDal;
import com.office.crud.pojo.Country;
import com.office.crud.pojo.MasterLanguage;
import com.office.crud.pojo.State;
import com.office.crud.pojo.UserType;
import com.office.crud.utils.DBConnection;

public class UserService {

	UserDal userDal = new  UserDal();
	
	public List<State> getStateById(short i) {
		// TODO Auto-generated method stub
		if(!(i < 0) ) {
			return userDal.fetchStateByCountryId(i);
		}
		return null;
	}

	public List<Country> getCountryList() {
		// TODO Auto-generated method stub
		return userDal.getCountryList();
	}

	public List<UserType> getUserType() {
		// TODO Auto-generated method stub
		return userDal.fetchUserType();
	}

	public List<MasterLanguage> getLanguage() {
		// TODO Auto-generated method stub
		return userDal.fetchLanguage();
	}

}
