/**
 * 
 */
package com.vinayparihar.springjdbc.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

/**
 * @author VinayParihar
 * @date May 12, 2020 @time 11:39:58 PM
 */
@Component
public class SimplejdbcDAOImpl extends SimpleJdbcCall {
	/**
	 * @param dataSource
	 */
	public SimplejdbcDAOImpl(DataSource dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}

	public int getCircleCount() {
		String sql = "select count(*) from circle";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}

}
