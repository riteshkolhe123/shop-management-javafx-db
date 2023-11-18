package user_management;

import add_user.AddUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserManagementScreenController {
	
	@FXML
	private Button Adduser;
	
	@FXML
	private Button Edituser;
	
	@FXML
	private Button Deleteuser;
	
	@FXML
	private Button Searchuser;
	
	@FXML
	private Button Back;
	
	
	public void AddUser(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
	}
	
   public void SearchUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
	}
  
   public void EditUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
   }

   public void Back(ActionEvent event) {
	   HomeScreen.showHomeScreen();
   }

   public void DeleteUser(ActionEvent event) {
	   search_user.SearchUser.showUserScreen();
   }
	
	
	
}