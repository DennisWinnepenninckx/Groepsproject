package ui;

import domain.CaesarCode;
import domain.Code;
import domain.CodeBehavior;
import domain.Mirror;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.Observable;

public class MainFX {
    Code code;
    GridPane root;

    ObservableList<String> options = FXCollections.observableArrayList("Caesercode","Mirror");
    ComboBox comboBox = new ComboBox(options);
    private TextField textTF = new TextField();
    private TextField resultTF = new TextField();
    private Button encodeB = new Button();
    private Button decodeB = new Button();

    public MainFX(GridPane root){
        this.root= root;
        this.code = new Code();
        showMenu(this.root);
    }

    public void showMenu(GridPane root){
        comboBox.setValue(options.get(0));
        textTF.setPromptText("Input");
        resultTF.setPromptText("Result");
        resultTF.setEditable(false);
        encodeB.setText("Encode");
        decodeB.setText("Decode");
        root.add(textTF, 0,0);
        root.add(comboBox,1,0);
        root.add(resultTF, 0, 1);
        root.add(encodeB, 0, 2);
        root.add(decodeB, 1, 2);
        encodeB.setOnAction(event -> encode());
        decodeB.setOnAction(event -> decode());
    }

    public void decode(){
        String chosenCode = (String) comboBox.getValue();
        String result = "";
        switch(chosenCode){
            case "Caesercode":
                Dialog dialog = new TextInputDialog();
                dialog.show();
                int move = Integer.parseInt(dialog.getContentText());
                code.setCb(new CaesarCode(move));
                result = code.decode(textTF.getText());
                break;
            case "Mirror":
                code.setCb(new Mirror());
                result = code.decode(textTF.getText());
                break;
            default:
        }
        resultTF.setText(result);
    }

    public void encode(){
        String chosenCode = (String) comboBox.getValue();
        String result = "";
        switch(chosenCode){
            case "Caesercode":
                Dialog dialog = new TextInputDialog();
                dialog.show();
                int move = Integer.parseInt(dialog.getContentText());
                code.setCb(new CaesarCode(move));
                result = code.encode(textTF.getText());
                break;
            case "Mirror":
                code.setCb(new Mirror());
                result = code.encode(textTF.getText());
                break;
            default:
        }
        resultTF.setText(result);
    }
}
