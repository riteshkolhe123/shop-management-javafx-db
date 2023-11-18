package search_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchProductScreen{
	
    public static void showSearchProductScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:\\Users\\rites\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\search_product\\Search Product.fxml"));
			
			StageFactory.stage.setTitle("Search Product");
			Scene scene = new Scene(actorGroup,600,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}