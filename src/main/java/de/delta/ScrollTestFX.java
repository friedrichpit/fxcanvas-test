package de.delta;

import java.util.Timer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScrollTestFX extends Application {

	static Timer t = new Timer();

	private static Scene createScene() {
		Pane root = new Pane();
	    ComboBox<String> box = new ComboBox<>();
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    box.getItems().add("asd");
	    root.getChildren().add(box);
	    return new Scene(root);
	  }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = createScene();

		t.schedule(task, 0, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static final MyTimerTask task = new MyTimerTask();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void stop() throws Exception {
		task.stop();
		super.stop();
	}
}
