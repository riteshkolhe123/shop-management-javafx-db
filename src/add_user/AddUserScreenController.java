package add_user;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class AddUserScreenController {
	
	@FXML
	private  TextField userName;
	
	@FXML
	private TextField email;
	
	@FXML
	private TextField number;
	
	@FXML
	private TextField role;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField confirm;
	
	@FXML
	private Button save; 
	
	@FXML
	private Button cancel;
	
	public void saveUser(ActionEvent event) {
		
		String query = "INSERT INTO users(username,email,number,role,password,confirm) Values ('" + userName.getText() + "','" + email.getText()
				+ "','" +number.getText() + "','"+role.getText()+"','"+password.getText()+"','"+confirm.getText()+"')";
		dbUtils.DBUtils.executeQuery(query);
		
	}

   public void cancleUser(ActionEvent event) {    
	   UserManagementScreen.showUserManagementScreen();
	}
    
   
 

}