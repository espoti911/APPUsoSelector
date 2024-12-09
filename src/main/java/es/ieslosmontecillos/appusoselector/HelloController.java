package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_gonzalezfrancisco.SelectorDeslizamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable
{

    @FXML
    private SelectorDeslizamiento selectorUno;
    @FXML
    private Label labelSelector;
    @FXML
    private SelectorDeslizamiento selectorDos;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        selectorUno.setOnAction(e -> {selectorOnAction(e, 1);});
        selectorDos.setOnAction(e -> {selectorOnAction(e, 2);});
        selectorUno.setItems("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez");
        selectorDos.setItems("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez");
    }

    private void selectorOnAction(ActionEvent actionEvent, int nSelector) {
        if (nSelector == 1)
            labelSelector.setText("Pulsado el selector de arriba");
        else
            labelSelector.setText("Pulsado el selector de abajo");
    }
}