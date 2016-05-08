package net.arkube.blackswords.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

	private String url = "jdbc:mysql://localhost:3306/arkube", username = "root", password = "2016arkubeadmin", table = "blackswords";
	private Connection connection;
	
	public MySQL(){}
	
	public Connection getConnection(){
		return connection;
	}
	
	public String getTable(){
		return table;
	}
	
	private boolean isConnected(){
		try{
			if((connection == null) | (connection.isClosed()) | (connection.isValid(5))){
				return false;
			}else{
				return true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public void connect(){
		try{
			if(!isConnected()){
				connection = DriverManager.getConnection(url, username, password);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void disconnect(){
		try{
			if(isConnected()){
				connection.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
