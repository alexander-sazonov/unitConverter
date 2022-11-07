import javax.swing.*;
import java.awt.*;

public class GUI {
    JTextField inputCelsius;
    JLabel labelFaringate;
    JButton btn;

    public GUI(){
        inputCelsius = new JTextField("0",10);
        labelFaringate = new JLabel("temperature in fahrenheit");
        btn = new JButton("Convert");
        btn.addActionListener(new ButtonListener(this));
    }

    public void showGUI(){
        JPanel panel = new JPanel();
        FlowLayout fl = new FlowLayout();
        panel.setLayout(fl);
        panel.add(inputCelsius);
        panel.add(labelFaringate);
        panel.add(btn);
        JFrame window = new JFrame("Unit Converter");
        window.setContentPane(panel);
        window.pack();
        window.setVisible(true);
    }
}
