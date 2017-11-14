package com.qa.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDao {
	private final String SQL_COUNT_NO_OF_CUSTOMER ="select count(1) from customer";
	
	private JdbcTemplate jdbcTemplate;

	public CustomerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int getCountNoOfCustomer() {
		return jdbcTemplate.queryForInt(SQL_COUNT_NO_OF_CUSTOMER);
	}
	
}
