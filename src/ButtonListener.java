import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    GUI gui;

    public ButtonListener(GUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String tempCelsiusString = gui.inputCelsius.getText();
        int tempCelsius = Integer.parseInt(tempCelsiusString);
        gui.labelFaringate.setText(String.valueOf(Converter.celsiusToFahrenheit(tempCelsius)));

    }
}
