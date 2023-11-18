package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import dbUtils.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class SearchUserController {
	  
	@FXML 
	private TextField UsernameToSearch;

	@FXML 
	private TextField Username;

	@FXML 
	private TextField Mobile;

	@FXML 
	private TextField Email;

	@FXML 
	private TextField Role;

	@FXML 
	private TextField Password;

	@FXML 
	private TextField Confirm;

	@FXML 
	private Button Search;

	@FXML 
	private Button Edit;

	@FXML 
	private Button Delete;
	
	@FXML 
	private Button Close;



	public void searchButton(ActionEvent event) throws SQLException {
		boolean status = Search_User(UsernameToSearch.getText());

		if(status) {
			
		}else {
			System.out.println("User Not Found !!");
		}
	}
	public boolean Search_User(String usernametosearch) throws SQLException {
		String query = "SELECT * FROM users WHERE username = '"+usernametosearch+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(query);

		try {
			if(rs.next()) {
				Username.setText(rs.getString("username"));
				Email.setText(rs.getString("email"));
				Mobile.setText(rs.getString("number"));
				Role.setText(rs.getString("role"));
				Password.setText(rs.getString("password"));
				Confirm.setText(rs.getString("confirm"));
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public void editButton(ActionEvent event) {
		boolean status = Edit_User(UsernameToSearch.getText());
		if(status) {
			System.out.println("User Edited successfully.");
		}
		else {
			System.out.println("User not found.");
		}
	}
	public boolean Edit_User(String usernametosearch) {
		String Query = "select * from users where username = '"+usernametosearch+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(Query);
		try {
			if(rs.next()) {
				String query = "UPDATE users SET username = '"+Username.getText()+"', "
						+ "email = '" +Email.getText()  + "', " 
						+ "number = '"+Mobile.getText()+"', "
						+ "role = '"+Role.getText()+"',"
						+ "password = '"+Password.getText()+"',"
					    + "confirm = '"+Confirm.getText()+"'"
						+ "WHERE username = '"+usernametosearch+"'";

				DBUtils.executeQuery(query);

				System.out.println("User updated successfully.");

				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public void deleteButton(ActionEvent event) {
		boolean status =  SearchUserController.Delete_User(UsernameToSearch.getText());

		if(status) {
			System.out.println("USER DELETED SUCCESSFULLY");
		}
		else {
			System.out.println("!!!!USER NOT FOUND!!!!!");
		}
	}
	public static boolean Delete_User(String Username) {

		String query = "DELETE FROM users WHERE username = '"+Username+"'";

		DBUtils.executeQuery(query);
		return true;
	}
		

	
	public void closeButton(ActionEvent event) {
		UserManagementScreen.showUserManagementScreen();
	}
	
}