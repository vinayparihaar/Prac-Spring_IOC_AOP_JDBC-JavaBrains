/**
 * 
 */
package com.vinayparihar.springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.vinayparihar.springjdbc.model.Circle;

/**
 * @author VinayParihar
 * @date May 12, 2020 @time 11:07:26 AM
 */
@Component
public class JdbcDaoImpl {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private Circle circle;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		/*
		 * this.dataSource=dataSource; this.jdbcTemplate = new
		 * JdbcTemplate(getDataSource());
		 */
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getCircleCount() {
		String sql = "SELECT COUNT(*) FROM CIRCLE";

		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	public String getCircleName(int circleId) {
		String sql = "SELECT NAME FROM CIRCLE WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { circleId }, String.class);
	}

	public Circle getCircleForId(int circleID) {
		String sql = "SELECT * FROM CIRCLE WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { circleID }, new CircleMapper());
	}

	public List<Circle> getAllCircles() {
		String sql = "SELECT * FROM CIRCLE";
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	 public void insertCircle(Circle circle) {
		 String sql="INSERT INTO CIRCLE(ID,NAME) VALUES(?,?)";
		 jdbcTemplate.update(sql, new Object[]{circle.getId(),circle.getName()});
	 }
	private static final class CircleMapper implements RowMapper<Circle> {

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			return circle;
		}

	}

	public Circle getCircle(int circleId) {

		try {
			/*
			 * String driver = "org.apache.derby.jdbc.ClientDriver"; Class.forName(driver);
			 * connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
			 */

			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM circle where Id=?");
			preparedStatement.setInt(1, circleId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				// circle = new Circle(circleId, resultSet.getString("name"));
				circle = new Circle(resultSet.getInt("id"), resultSet.getString("name"));

			}
			resultSet.close();
			preparedStatement.close();

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return circle;
	}

}
