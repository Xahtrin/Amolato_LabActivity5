package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main (String args[]) {

        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public LeapYearGUI() {
        System.out.println("HELLO");

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int yr = Integer.parseInt(tfYear.getText());
                    if (yr % 4 == 0){
                        JOptionPane.showMessageDialog(panel1, "Leap year","Result", JOptionPane.PLAIN_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(panel1, "Not a leap year","Result", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (NumberFormatException e)  {
                    JOptionPane.showMessageDialog(panel1, "Please Insert A Year","Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }


    private void createUIComponents() {

        // TODO: place custom component creation code here
    }
}


