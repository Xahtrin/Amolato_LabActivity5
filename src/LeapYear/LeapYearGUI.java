package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel input;

    public static void main (String args[]) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public LeapYearGUI() {
        System.out.println("HELLO");

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


