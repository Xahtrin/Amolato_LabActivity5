package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JCheckBox cBurger;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int pri = 0;
                    if (cPizza.isSelected()) {
                        pri += 100;
                    }
                    if (cBurger.isSelected()) {
                        pri += 80;
                    }
                    if (cFries.isSelected()) {
                        pri += 65;
                    }
                    if (cSoftDrinks.isSelected()) {
                        pri += 55;
                    }
                    if (cTea.isSelected()) {
                        pri += 50;
                    }
                    if (cSundae.isSelected()) {
                        pri += 40;
                    }
                    if (pri == 0) {
                        throw new Exception();
                    }
                    double dis = 0;
                    if (rbNone.isSelected()) {
                        dis = 1;
                    } else if (rb5.isSelected()) {
                        dis = 0.95;
                    } else if (rb10.isSelected()) {
                        dis = 0.90;
                    } else if (rb15.isSelected()) {
                        dis = 0.85;
                    } else {
                        throw new Exception();
                    }
                    double res = pri * dis;
                    JOptionPane.showMessageDialog(panel1, ("The total price is Php " + res),"Message", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(panel1, "Please Select Food Item(s) and Discount Type","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main (String args[]) {

        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
