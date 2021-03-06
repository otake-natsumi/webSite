package com.corvadev.illustsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.corvadev.illustsite.util.DBConnector;
import com.corvadev.illustsite.util.DateUtil;
;
public class ContactCompleteDAO{
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO comment_list(nick_name, comment, update_date) VALUES(?,?,?)";

	public void createComment(String nick_name,String comment) throws SQLException{
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, nick_name);
			preparedStatement.setString(2, comment);
			preparedStatement.setString(3, dateUtil.getDate());

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
