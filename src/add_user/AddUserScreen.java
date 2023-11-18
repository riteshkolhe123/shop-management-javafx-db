package add_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddUserScreen{
	
   
	public static void showAddUserScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:/C:\\Users\\rites\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\add_user\\Add User.fxml"));
			
			StageFactory.stage.setTitle("Add User");
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