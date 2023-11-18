package home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.ProductScreen;
import user_management.UserManagementScreen;

public class HomeScreenController {
	
	@FXML
	private Button UserManagement;

	@FXML
	private Button ProductManagement;
	
	@FXML
	private Button Quit;
	
	public void showUserManagement(ActionEvent event) {
		UserManagementScreen.showUserManagementScreen();
		
	}
	
    public void showProductManagement(ActionEvent event) {
    	ProductScreen.showProductScreen();
	}
    
    public void backTOHomePage(ActionEvent event) {
	
    }
    
    

}