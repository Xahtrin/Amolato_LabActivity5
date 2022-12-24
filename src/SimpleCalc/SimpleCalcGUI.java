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
                try {
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
                        if (b == 0) {
                            throw new ArithmeticException();
                        }
                            res = a / b;
                            tfResult.setText(String.valueOf(res));
                            break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panel1, "Invalid input(s)","Error", JOptionPane.ERROR_MESSAGE);
                    tfNumber1.setText("");
                    tfNumber2.setText("");
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(panel1, "Invalid operation","Error", JOptionPane.ERROR_MESSAGE);
                    tfNumber1.setText("");
                    tfNumber2.setText("");
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
