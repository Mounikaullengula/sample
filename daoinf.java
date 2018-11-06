package com.agilecrm.dao;

import com.agilecrm.model.Contact;

public interface daoinf {
public boolean createContact(Contact contact);
public boolean update(String email);
public boolean delete(int id);
public Contact byid(int id);
public Contact byfirstname(String firstname);
public Contact bylastname(String Lastname);
public Contact byemail(String email);
}
