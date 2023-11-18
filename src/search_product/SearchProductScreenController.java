
package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import dbUtils.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductScreen;
import search_user.SearchUserController;

public class SearchProductScreenController {
	
	@FXML
	private TextField productname;
	
	@FXML
	private TextField id;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private TextField category;
	
	@FXML
	private Button search;
	
	@FXML
	private Button close;
	
	@FXML
	private Button delete;
	
	@FXML
	private Button edit;
	
	public void searchProduct(ActionEvent event) throws SQLException {
		boolean status = Search_Product(productname.getText());

		if(status) {
			
		}else {
			System.out.println("Product Not Found !!");
	}
	}
	public boolean Search_Product(String productnames) throws SQLException {
			String query = "SELECT * FROM products WHERE productName = '"+productnames+"'";

			ResultSet rs = DBUtils.executeQueryGetResult(query);

			try {
				if(rs.next()) {
					productname.setText(rs.getString("productName"));
					id.setText(rs.getString("ID"));
					price.setText(rs.getString("price"));
					quantity.setText(rs.getString("quantity"));
					category.setText(rs.getString("category"));

					return true;
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	
    public void closeProduct(ActionEvent event) {
    	ProductScreen.showProductScreen();
	} 
    
    public void editProduct(ActionEvent event) {
    	boolean status = Edit_Product(productname.getText());
		if(status) {
			System.out.println("Product Edited successfully.");
		}
		else {
			System.out.println("Product not found.");
		}
	} 
    public boolean Edit_Product(String productnametosearch) {
		String Query = "select * from products where productName = '"+productnametosearch+"'";

		ResultSet rs = DBUtils.executeQueryGetResult(Query);
		try {
			if(rs.next()) {
				String query = "UPDATE products SET productName = '"+productname.getText()+"', "
						+ "ID = '" +id.getText()  + "', " 
						+ "price = '"+price.getText()+"', "
						+ "quantity = '"+quantity.getText()+"',"
						+ "category = '"+category.getText()+"'"
						+ "WHERE productName = '"+productnametosearch+"'";

				DBUtils.executeQuery(query);

				System.out.println("Product updated successfully.");

				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
    
    public void deleteProduct(ActionEvent event) {
    	boolean status = Delete_Product(productname.getText());

		if(status) {
			System.out.println("PRODUCT DELETED SUCCESSFULLY");
		}
		else {
			System.out.println("!!!!PRODUCT NOT FOUND!!!!!");
		}
	}
	public static boolean Delete_Product(String name) {

		String query = "DELETE FROM products WHERE productName = '"+name+"'";

		DBUtils.executeQuery(query);
		return true;
	}
		

	

}