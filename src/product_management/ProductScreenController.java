package product_management;

import add_product.AddProductScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;

public class ProductScreenController {
	
	@FXML
	private Button AddProduct;
	
	@FXML
	private Button SearchProduct;
	
	@FXML
	private Button EditProduct;
	
	@FXML
	private Button DeleteProduct;
	
	@FXML
	private Button Quit;
	
	public void addProduct(ActionEvent event) {
		AddProductScreen.showHomeScreen();
	}
	
	public void searchProduct(ActionEvent event) {
		SearchProductScreen.showSearchProductScreen();
	}
	
	public void editProduct(ActionEvent event) {
		SearchProductScreen.showSearchProductScreen();
	}
	
	public void deleteProduct(ActionEvent event) {
		SearchProductScreen.showSearchProductScreen();
	}
	
	public void quiteProduct(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}

}