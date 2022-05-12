package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;

public class RootFlowPane extends FlowPane {
	private Button btOK, btBeenden;
	private CheckBox cbWaehleMich;
	private RadioButton rb1, rb2, rb3;
	private ToggleGroup tgRadios;

	public RootFlowPane() {
		initComponents();
		addComponents();
		addHandler();
	}

	private void initComponents() {
		tgRadios = new ToggleGroup();

		btOK = new Button("OK");
		btBeenden = new Button("Beenden");

		btOK.setPrefWidth(100);
		btBeenden.setPrefWidth(100);

		cbWaehleMich = new CheckBox("Waehle Mich!");

		rb1 = new RadioButton("RB1");
		rb2 = new RadioButton("RB2");
		rb3 = new RadioButton("RB3");

		tgRadios.getToggles().addAll(rb1, rb2, rb3);

		setPadding(new Insets(10));
		setAlignment(Pos.CENTER);
		setVgap(10);
		setHgap(10);
	}

	private void addComponents() {
		getChildren().addAll(cbWaehleMich, rb1, rb2, rb3, btOK, btBeenden);
	}

	private void addHandler() {

	}
}
