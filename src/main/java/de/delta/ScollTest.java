package de.delta;

import java.util.Timer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;

public class ScollTest {

	private static final MyTimerTask task = new MyTimerTask();

	 static Timer t = new Timer();

	  public static void main(String[] args) {
	    Display display = new Display();
	    Shell shell = new Shell(display);
	    shell.setLayout(new FillLayout());
	    shell.addListener(SWT.Close, e -> task.stop());
	    FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
	    Scene scene = createScene();
	    canvas.setScene(scene);
	    t.schedule(task, 0, 1000);

	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch()) {
	        display.sleep();
	      }
	    }
	    display.dispose();
	  }

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

	}