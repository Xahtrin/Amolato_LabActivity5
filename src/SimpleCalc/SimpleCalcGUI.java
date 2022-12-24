package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField tfResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double a = Integer.parseInt(tfNumber1.getText());
                double b = Integer.parseInt(tfNumber2.getText());
                int op = cbOperations.getSelectedIndex();
                double res;
                switch (op) {
                    case 0:
                        res = a + b;
                        tfResult.setText(String.valueOf(res));
                        break;
                    case 1:
                        res = a - b;
                        tfResult.setText(String.valueOf(res));
                        break;
                    case 2:
                        res = a * b;
                        tfResult.setText(String.valueOf(res));
                        break;
                    case 3:
                        res = a / b;
                        tfResult.setText(String.valueOf(res));
                        break;
                }
            }
        });
    }

    public static void main (String args[]) {

        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
