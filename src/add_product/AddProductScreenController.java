package add_product;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import product_management.ProductScreen;

public class AddProductScreenController {
	
	@FXML
	private TextField ProductName;
	
	@FXML
	private TextField id;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private TextField category;
	
	@FXML
	private Button Save;
	
	@FXML
	private Button Cancel;
	
	
	public void saveProductINFO(ActionEvent event) {

		String query = "INSERT INTO products(productName,ID,price,quantity,category) Values ('" + ProductName.getText() + "','" + id.getText()
				+ "','" +price.getText() + "','"+quantity.getText()+"','"+category.getText()+"')";
		dbUtils.DBUtils.executeQuery(query);
	}
	
    public void cancelProduct(ActionEvent event) {
    	ProductScreen.showProductScreen();
	}

   
}