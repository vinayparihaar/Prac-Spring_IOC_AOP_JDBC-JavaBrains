/**
 * 
 */
package com.vinayparihar.springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.vinayparihar.springjdbc.model.Circle;

/**
 * @author VinayParihar
 * @date May 12, 2020 @time 11:07:26 AM
 */
@Component
public class JdbcDaoImpl {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private Circle circle;

	public Circle getCircle(int circleId) {

		try {
			String driver = "org.apache.derby.jdbc.ClientDriver";
			Class.forName(driver);
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
			preparedStatement = connection.prepareStatement("SELECT * FROM circle where Id=?");
			preparedStatement.setInt(1, circleId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				// circle = new Circle(circleId, resultSet.getString("name"));
				circle = new Circle(resultSet.getInt("id"), resultSet.getString("name"));

			}
			resultSet.close();
			preparedStatement.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
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
