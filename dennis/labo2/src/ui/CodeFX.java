package ui;

import domain.Caesarcode;
import domain.Code;
import domain.CodeBehaviour;
import domain.Spiegeling;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CodeFX {
    private Button start;
    private Label firstText;
    private Label secondText;
    private Label offset;
    private Label result;
    private TextField input;
    private TextField inputOffset;
    private Button setInput;
    private Button caeserStrategy;
    private Button caeserStrategyEncode;
    private Button caeserStrategyDecode;
    private Button Spiegeling;
    private Button SpiegelingEncode;
    private Button SpiegelingDecode;

    public CodeFX(GridPane root) {
        start = new Button("Begin met encoderen");
        firstText = new Label("Vul uw tekst in.");
        input = new TextField();
        inputOffset = new TextField();
        setInput = new Button("Confirm text");
        secondText = new Label("Welke methode wil u gebruiken?");
        offset = new Label("Wat is de offset?");
        caeserStrategy = new Button("Caesar");
        Spiegeling = new Button("Spiegeling");
        SpiegelingEncode = new Button("Encodeer");
        caeserStrategyEncode = new Button("Encodeer");
        SpiegelingDecode = new Button("Decodeer");
        caeserStrategyDecode = new Button("Decodeer");
        result = new Label();



        root.add(start,0,0);
        start.setOnAction( event ->{
            start.setVisible(false);
            root.add(firstText,0,0);
            root.add(input,0,1);
            root.add(setInput,0,2);
        });

        setInput.setOnAction(event -> {
            firstText.setVisible(false);
            input.setVisible(false);
            setInput.setVisible(false);
            root.add(secondText,0,0);
            root.add(caeserStrategy,0,1);
            root.add(Spiegeling,1,1);
        });

        Spiegeling.setOnAction(event -> {
            secondText.setVisible(false);
            caeserStrategy.setVisible(false);
            Spiegeling.setVisible(false);
            root.add(SpiegelingEncode,0,1);
            root.add(SpiegelingDecode,1,1);
        });


    }
}