package com.agilecrm.dao;

import com.agilecrm.model.Contact;
import com.agilecrm.util.*;
import java.sql.SQLException;
public class daoimp implements daoinf {

	public boolean createContact(Contact contact) {		
			int i=0;
			try {
				java.sql.Connection connection=utilcls.getConnection();
				String query="insert into Contact(firstName,lastName,email) values(?,?,?);";
				java.sql.PreparedStatement ps;
				ps=connection.prepareStatement(query);
				ps.setString(1, contact.getFirstName());
				ps.setString(2, contact.getLastName());				
				ps.setString(3, contact.getEmail());				
				i=ps.executeUpdate();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// TODO Auto-generated method stub
		return i>0;
	}

	public boolean update(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Contact byid(int id) {			
		
		// TODO Auto-generated method stub
		return null;
	}

	public Contact byfirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact bylastname(String Lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact byemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
