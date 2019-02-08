package sample;


import java.lang.*;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    TextField fieldc1r1 = new TextField();
    TextField fieldc2r1 = new TextField();
    TextField fieldc3r1 = new TextField();
    TextField fieldc1r2 = new TextField();
    TextField fieldc2r2 = new TextField();
    TextField fieldc3r2 = new TextField();
    TextField fieldc1r3 = new TextField();
    TextField fieldc2r3 = new TextField();
    TextField fieldc3r3 = new TextField();
    Label warn = new Label("One or more elements are not numbers");
    float d1, d2, d3, d4, d5, d6, d7, d8, d9;
    Label insertpls = new Label("Write down your numbers: ");
    Label datac1r1 = new Label();
    Label datac2r1 = new Label();
    Label datac3r1 = new Label();
    Label datac1r2 = new Label();
    Label datac2r2 = new Label();
    Label datac3r2 = new Label();
    Label datac1r3 = new Label();
    Label datac2r3 = new Label();
    Label datac3r3 = new Label();
    Label mx = new Label();
    Label mn = new Label();
    Label mntext = new Label("Min: ");
    Label mxtext = new Label("Max: ");
    GridPane window = new GridPane();
    GridPane fields = new GridPane();
    GridPane alldata = new GridPane();

    @Override
    public void start(Stage stage) throws Exception{
        stage.initStyle(StageStyle.UNDECORATED);

        Button closeapp = new Button("Exit");
        closeapp.setOnAction(closeapp1->
        {
            stage.close();
        });

        Button min = new Button("Minimalize");
        min.setOnAction(min1->
        {
            stage.setIconified(true);
        });

        closeapp.setMinHeight(50);
        closeapp.setMinWidth(100);
        closeapp.setFont(Font.font(20));

        min.setMinHeight(50);
        min.setMinWidth(100);
        min.setFont(Font.font(20));

        insertpls.setFont(Font.font(20));

        Scene sceneapp = new Scene(window, 800, 600);
        stage.setTitle("Project");
        stage.setScene(sceneapp);
        stage.show();

        window.setPadding(new Insets(10, 10, 10, 10));
        window.setHgap(10);
        window.setVgap(10);

        fields.setHgap(10);
        fields.setVgap(10);

        alldata.setHgap(10);
        alldata.setVgap(10);

        HBox buttons = new HBox();
        buttons.setMinWidth(50);
        buttons.setPrefHeight(10);
        buttons.setAlignment(Pos. BOTTOM_LEFT);

        warn.setWrapText(true);

        Button ShowResults = new Button("Show results");
        ShowResults.setOnAction(ShowResults1->
        {
            Show_Results();
        });

        ShowResults.setMinHeight(50);
        ShowResults.setMinWidth(100);
        ShowResults.setFont(Font.font(20));

        Button InsertData = new Button("Insert data");
        InsertData.setOnAction(InsertData1 ->
        {
            window.getChildren().remove(buttons);
            buttons.getChildren().remove(ShowResults);

            fieldc1r1.setText("");
            fieldc2r1.setText("");
            fieldc3r1.setText("");
            fieldc1r2.setText("");
            fieldc2r2.setText("");
            fieldc3r2.setText("");
            fieldc1r3.setText("");
            fieldc2r3.setText("");
            fieldc3r3.setText("");

            window.getChildren().remove(fields);
            window.getChildren().remove(alldata);
            alldata.getChildren().remove(datac1r1);
            alldata.getChildren().remove(datac2r1);
            alldata.getChildren().remove(datac3r1);
            alldata.getChildren().remove(datac1r2);
            alldata.getChildren().remove(datac2r2);
            alldata.getChildren().remove(datac3r2);
            alldata.getChildren().remove(datac1r3);
            alldata.getChildren().remove(datac2r3);
            alldata.getChildren().remove(datac3r3);
            alldata.getChildren().remove(warn);
            window.getChildren().remove(mx);
            window.getChildren().remove(mn);
            window.getChildren().remove(mxtext);
            window.getChildren().remove(mntext);
            alldata.getChildren().remove(warn);
            window.getChildren().remove(insertpls);

            window.add(buttons, 0, 10, 1, 1);
            buttons.getChildren().add(ShowResults);
            buttons.setAlignment(Pos.BOTTOM_LEFT);

            Insert_Data();
        });

        InsertData.setMinHeight(50);
        InsertData.setMinWidth(100);
        InsertData.setFont(Font.font(20));

        HBox buttonsright = new HBox();
        buttonsright.setMinWidth(780);

        buttonsright.setMinHeight(50);

        buttonsright.setAlignment(Pos.TOP_RIGHT);
        buttonsright.setSpacing(10);
        buttonsright.getChildren().addAll(min, closeapp);
        window.add(buttonsright, 0, 0, 3, 1);

        HBox buttonsleft = new HBox();
        buttonsleft.setMinWidth(100);

        buttonsleft.setMinHeight(100);

        buttonsleft.setAlignment(Pos.TOP_LEFT);
        buttonsleft.getChildren().add(InsertData);
        window.add(buttonsleft, 0, 0, 1, 1);

        warn.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        warn.setMaxWidth(300);
        warn.setAlignment(Pos.CENTER);
        datac1r1.setFont(Font.font (20));
        datac2r1.setFont(Font.font (20));
        datac3r1.setFont(Font.font (20));
        datac1r2.setFont(Font.font (20));
        datac2r2.setFont(Font.font (20));
        datac3r2.setFont(Font.font (20));
        datac1r3.setFont(Font.font (20));
        datac2r3.setFont(Font.font (20));
        datac3r3.setFont(Font.font (20));

        datac1r1.setMinHeight(60);
        datac1r1.setMinWidth(80);
        datac1r1.setAlignment(Pos.CENTER);

        datac2r1.setMinHeight(60);
        datac2r1.setMinWidth(80);
        datac2r1.setAlignment(Pos.CENTER);

        datac3r1.setMinHeight(60);
        datac3r1.setMinWidth(80);
        datac3r1.setAlignment(Pos.CENTER);

        datac1r2.setMinHeight(60);
        datac1r2.setMinWidth(80);
        datac1r2.setAlignment(Pos.CENTER);

        datac2r2.setMinHeight(60);
        datac2r2.setMinWidth(80);
        datac2r2.setAlignment(Pos.CENTER);

        datac3r2.setMinHeight(60);
        datac3r2.setMinWidth(80);
        datac3r2.setAlignment(Pos.CENTER);

        datac1r3.setMinHeight(60);
        datac1r3.setMinWidth(80);
        datac1r3.setAlignment(Pos.CENTER);

        datac2r3.setMinHeight(60);
        datac2r3.setMinWidth(80);
        datac2r3.setAlignment(Pos.CENTER);

        datac3r3.setMinHeight(60);
        datac3r3.setMinWidth(80);
        datac3r3.setAlignment(Pos.CENTER);

        fieldc1r1.setMinHeight(50);
        fieldc1r1.setMaxWidth(100);
        fieldc1r1.setAlignment(Pos.CENTER);

        fieldc2r1.setMinHeight(50);
        fieldc2r1.setMaxWidth(100);
        fieldc2r1.setAlignment(Pos.CENTER);

        fieldc3r1.setMinHeight(50);
        fieldc3r1.setMaxWidth(100);
        fieldc3r1.setAlignment(Pos.CENTER);

        fieldc1r2.setMinHeight(50);
        fieldc1r2.setMaxWidth(100);
        fieldc1r2.setAlignment(Pos.CENTER);

        fieldc2r2.setMinHeight(50);
        fieldc2r2.setMaxWidth(100);
        fieldc2r2.setAlignment(Pos.CENTER);

        fieldc3r2.setMinHeight(50);
        fieldc3r2.setMaxWidth(100);
        fieldc3r2.setAlignment(Pos.CENTER);

        fieldc1r3.setMinHeight(50);
        fieldc1r3.setMaxWidth(100);
        fieldc1r3.setAlignment(Pos.CENTER);

        fieldc2r3.setMinHeight(50);
        fieldc2r3.setMaxWidth(100);
        fieldc2r3.setAlignment(Pos.CENTER);

        fieldc3r3.setMinHeight(50);
        fieldc3r3.setMaxWidth(100);
        fieldc3r3.setAlignment(Pos.CENTER);

        mx.setFont(Font.font (20));
        mxtext.setFont(Font.font (20));
        mn.setFont(Font.font (20));
        mntext.setFont(Font.font (20));

        mx.setMinWidth(200);
        mx.setAlignment(Pos.CENTER_RIGHT);
        mn.setMinWidth(200);
        mn.setAlignment(Pos.CENTER_RIGHT);

    }

    public void Insert_Data() {

        window.getChildren().remove(fields);
        fields.getChildren().remove(fieldc1r1);
        fields.getChildren().remove(fieldc2r1);
        fields.getChildren().remove(fieldc3r1);
        fields.getChildren().remove(fieldc1r2);
        fields.getChildren().remove(fieldc2r2);
        fields.getChildren().remove(fieldc3r2);
        fields.getChildren().remove(fieldc1r3);
        fields.getChildren().remove(fieldc2r3);
        fields.getChildren().remove(fieldc3r3);
        window.getChildren().remove(alldata);
        alldata.getChildren().remove(datac1r1);
        alldata.getChildren().remove(datac2r1);
        alldata.getChildren().remove(datac3r1);
        alldata.getChildren().remove(datac1r2);
        alldata.getChildren().remove(datac2r2);
        alldata.getChildren().remove(datac3r2);
        alldata.getChildren().remove(datac1r3);
        alldata.getChildren().remove(datac2r3);
        alldata.getChildren().remove(datac3r3);
        alldata.getChildren().remove(warn);
        window.getChildren().remove(mx);
        window.getChildren().remove(mn);
        window.getChildren().remove(mxtext);
        window.getChildren().remove(mntext);
        window.getChildren().remove(insertpls);
        window.add(fields, 0, 2, 1, 1);
        fields.add(fieldc1r1, 0, 4, 1, 1);
        fields.add(fieldc2r1, 1, 4, 1, 1);
        fields.add(fieldc3r1, 2, 4, 1, 1);
        fields.add(fieldc1r2, 0, 5, 1, 1);
        fields.add(fieldc2r2, 1, 5, 1, 1);
        fields.add(fieldc3r2, 2, 5, 1, 1);
        fields.add(fieldc1r3, 0, 6, 1, 1);
        fields.add(fieldc2r3, 1, 6, 1, 1);
        fields.add(fieldc3r3, 2, 6, 1, 1);
        window.add(insertpls, 0,  1, 1, 1);
    }

    public void Show_Results() {

        datac1r1.setText(fieldc1r1.getText());
        datac2r1.setText(fieldc2r1.getText());
        datac3r1.setText(fieldc3r1.getText());
        datac1r2.setText(fieldc1r2.getText());
        datac2r2.setText(fieldc2r2.getText());
        datac3r2.setText(fieldc3r2.getText());
        datac1r3.setText(fieldc1r3.getText());
        datac2r3.setText(fieldc2r3.getText());
        datac3r3.setText(fieldc3r3.getText());

        float min, max;

        try {

            d1 = Float.valueOf(datac1r1.getText());
            d2 = Float.valueOf(datac2r1.getText());
            d3 = Float.valueOf(datac3r1.getText());
            d4 = Float.valueOf(datac1r2.getText());
            d5 = Float.valueOf(datac2r2.getText());
            d6 = Float.valueOf(datac3r2.getText());
            d7 = Float.valueOf(datac1r3.getText());
            d8 = Float.valueOf(datac2r3.getText());
            d9 = Float.valueOf(datac3r3.getText());

            min = d1;
            if (d2 < min) min = d2;
            if (d3 < min) min = d3;
            if (d4 < min) min = d4;
            if (d5 < min) min = d5;
            if (d6 < min) min = d6;
            if (d7 < min) min = d7;
            if (d8 < min) min = d8;
            if (d9 < min) min = d9;

            max = 0;
            if (d1 > max) max = d1;
            if (d2 > max) max = d2;
            if (d3 > max) max = d3;
            if (d4 > max) max = d4;
            if (d5 > max) max = d5;
            if (d6 > max) max = d6;
            if (d7 > max) max = d7;
            if (d8 > max) max = d8;
            if (d9 > max) max = d9;


            if ((fieldc1r1.getText() != null && !fieldc1r1.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac1r1);
                alldata.getChildren().remove(warn);
                datac1r1.setText(fieldc1r1.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac1r1, 4, 2, 1, 1);
            }

            if ((fieldc2r1.getText() != null && !fieldc2r1.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac2r1);
                alldata.getChildren().remove(warn);
                datac2r1.setText(fieldc2r1.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac2r1, 5, 2, 1, 1);
            }

            if ((fieldc3r1.getText() != null && !fieldc3r1.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac3r1);
                alldata.getChildren().remove(warn);
                datac3r1.setText(fieldc3r1.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac3r1, 6, 2, 1, 1);
            }

            if ((fieldc1r2.getText() != null && !fieldc1r2.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac1r2);
                alldata.getChildren().remove(warn);
                datac1r2.setText(fieldc1r2.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac1r2, 4, 3, 1, 1);
            }

            if ((fieldc2r2.getText() != null && !fieldc2r2.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac2r2);
                alldata.getChildren().remove(warn);
                datac2r2.setText(fieldc2r2.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac2r2, 5, 3, 1, 1);
            }

            if ((fieldc3r2.getText() != null && !fieldc3r2.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac3r2);
                alldata.getChildren().remove(warn);
                datac3r2.setText(fieldc3r2.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac3r2, 6, 3, 1, 1);
            }

            if ((fieldc1r3.getText() != null && !fieldc1r3.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac1r3);
                alldata.getChildren().remove(warn);
                datac1r3.setText(fieldc1r3.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac1r3, 4, 4, 1, 1);
            }

            if ((fieldc2r3.getText() != null && !fieldc2r3.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac2r3);
                alldata.getChildren().remove(warn);
                datac2r3.setText(fieldc2r3.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac2r3, 5, 4, 1, 1);
            }

            if ((fieldc3r3.getText() != null && !fieldc3r3.getText().isEmpty())) {

                window.getChildren().remove(mx);
                window.getChildren().remove(mn);
                window.getChildren().remove(mxtext);
                window.getChildren().remove(mntext);
                window.getChildren().remove(alldata);

                alldata.getChildren().remove(datac3r3);
                alldata.getChildren().remove(warn);
                datac3r3.setText(fieldc3r3.getText());
                window.add(alldata, 3, 2, 1, 1);
                alldata.add(datac3r3, 6, 4, 1, 1);
            }

            mx.setText(String.valueOf(max));
            mn.setText(String.valueOf(min));

            window.add(mxtext, 3, 9, 1, 1);
            window.add(mx, 3, 9, 1, 1);

            window.add(mntext, 3, 8, 1, 1);
            window.add(mn, 3, 8, 1, 1);


        } catch(NumberFormatException ex){
            alldata.getChildren().remove(datac1r1);
            alldata.getChildren().remove(datac2r1);
            alldata.getChildren().remove(datac3r1);
            alldata.getChildren().remove(datac1r2);
            alldata.getChildren().remove(datac2r2);
            alldata.getChildren().remove(datac3r2);
            alldata.getChildren().remove(datac1r3);
            alldata.getChildren().remove(datac2r3);
            alldata.getChildren().remove(datac3r3);
            alldata.getChildren().remove(warn);
            window.getChildren().remove(mx);
            window.getChildren().remove(mn);
            window.getChildren().remove(mxtext);
            window.getChildren().remove(mntext);
            window.getChildren().remove(alldata);
            window.add(alldata, 3, 2, 1, 1);
            alldata.add(warn, 5, 5, 1, 1);

        }


    }


    public static void main(String[] args) {
        launch(args);
    }
}
