
package shop_management_main;

import common.StageFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class Application_Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	
	
	public void start(Stage stage) throws Exception {
		StageFactory.stage=stage;
		LoginScreen.showLoginScreen();
		
	}

}