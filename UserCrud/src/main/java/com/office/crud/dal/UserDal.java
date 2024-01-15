package com.office.crud.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.office.crud.pojo.Country;
import com.office.crud.pojo.MasterLanguage;
import com.office.crud.pojo.State;
import com.office.crud.pojo.UserType;
import com.office.crud.utils.DBConnection;

public class UserDal {

	Connection connection = null;

	public List<Country> getCountryList() {
		// TODO Auto-generated method stub
		String query = "select * from master_country";
		List<Country> countries = new ArrayList<>();
		try {
			connection = DBConnection.getDBConnection();
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Country country = new Country();
				country.setCountryId(rs.getShort("countryid"));
				country.setCountryName(rs.getString("countryname"));
				countries.add(country);
			}
			st.close();
			connection.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}

		return countries;
	}

	public List<State> fetchStateByCountryId(short i) {
		// TODO Auto-generated method stub
		String query = "select * from master_state where countryid=?";
		List<State> states = new ArrayList();

		try {
			connection = DBConnection.getDBConnection();
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setByte(1, (byte) i);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				State state = new State();
				state.setStateId(rs.getShort("stateid"));
				state.setStateName(rs.getString("statename"));
				states.add(state);
			}
			ps.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return states;
	}

	public List<UserType> fetchUserType() {
		// TODO Auto-generated method stub
		String query = "select * from master_usertype";
		List<UserType> userTypes = new ArrayList<>();
		try {
			connection = DBConnection.getDBConnection();
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				UserType userType = new UserType();
				// userType.setUserType((byte)(rs.getByte(""));
				userType.setUserTypeId(rs.getByte("usertypeid"));
				userType.setUserType(rs.getString("usertypename"));
				userTypes.add(userType);
			}
			st.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return userTypes;
	}

	public List<MasterLanguage> fetchLanguage() {
		// TODO Auto-generated method stub
		String query = "select * from master_language";
		List<MasterLanguage> masterLanguages = new ArrayList<>();
		try {
			connection=DBConnection.getDBConnection();
			PreparedStatement st = connection.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				MasterLanguage masterLanguage = new MasterLanguage();
				masterLanguage.setLanguageId(rs.getByte("languageid"));
				masterLanguage.setLanguage(rs.getString("language"));
				masterLanguages.add(masterLanguage);
			}
			st.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return masterLanguages;
	}

}
