package com.it.shh.dao.impl;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.it.shh.dao.CustomerDao;
import com.it.shh.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(int id) {
		
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
