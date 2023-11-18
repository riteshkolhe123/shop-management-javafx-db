package login;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {
	
	@FXML
	private TextField UserName;
	
	@FXML
	private TextField Password;
	
	@FXML
	private Button Login;

	public void login(ActionEvent event) {
		System.out.println(UserName.getText());
		System.out.println(Password.getText());
		boolean start=LoginScreenController.isValidateUsernameAndPassword(UserName.getText(),Password.getText());
		if(start) {
			HomeScreen.showHomeScreen();
		}else {
			System.out.println("Login Failed");
		}

	}
	public static boolean isValidateUsernameAndPassword(String username, String password) {

		String query = " Select * from users where username='" + username + "' and password = '" + password + "' ";

		ResultSet rs = dbUtils.DBUtils.executeQueryGetResult(query);
		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


}