import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResultSwing extends JFrame implements ActionListener {

    JTextField tfName, tfRoll;
    JTextField tfMaths, tfHindi, tfEng, tfGuj, tfComputer;
    JTextField tfTotal, tfPercent;
    JButton btnCalc;

    public ResultSwing() {

        setTitle("PARUL UNIVERSITY RESULT");
        setSize(600, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("PARUL UNIVERSITY RESULT");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setBounds(170, 20, 300, 30);
        add(title);

        // Student name
        JLabel lblName = new JLabel("Student name");
        lblName.setBounds(80, 80, 100, 25);
        add(lblName);

        tfName = new JTextField();
        tfName.setBounds(190, 80, 150, 25);
        add(tfName);

        // Roll No
        JLabel lblRoll = new JLabel("Roll No");
        lblRoll.setBounds(370, 80, 60, 25);
        add(lblRoll);

        tfRoll = new JTextField();
        tfRoll.setBounds(440, 80, 80, 25);
        add(tfRoll);

        // Subjects
        addLabel("Maths", 130);
        tfMaths = addTextField(130);

        addLabel("Hindi", 170);
        tfHindi = addTextField(170);

        addLabel("English", 210);
        tfEng = addTextField(210);

        addLabel("Gujarati", 250);
        tfGuj = addTextField(250);

        addLabel("Computer", 290);
        tfComputer = addTextField(290);

        // Button
        btnCalc = new JButton("Calculate");
        btnCalc.setBounds(240, 340, 100, 30);
        btnCalc.addActionListener(this);
        add(btnCalc);

        // Total
        JLabel lblTotal = new JLabel("Total");
        lblTotal.setBounds(120, 400, 50, 25);
        add(lblTotal);

        tfTotal = new JTextField();
        tfTotal.setBounds(180, 400, 80, 25);
        tfTotal.setEditable(false);
        add(tfTotal);

        // Percentage
        JLabel lblPercent = new JLabel("%");
        lblPercent.setBounds(320, 400, 20, 25);
        add(lblPercent);

        tfPercent = new JTextField();
        tfPercent.setBounds(350, 400, 80, 25);
        tfPercent.setEditable(false);
        add(tfPercent);

        setVisible(true);
    }

    // Helper methods
    void addLabel(String text, int y) {
        JLabel lbl = new JLabel(text);
        lbl.setBounds(150, y, 100, 25);
        add(lbl);
    }

    JTextField addTextField(int y) {
        JTextField tf = new JTextField();
        tf.setBounds(260, y, 100, 25);
        add(tf);
        return tf;
    }

    // Button action
    public void actionPerformed(ActionEvent e) {
        try {
            int m = Integer.parseInt(tfMaths.getText());
            int h = Integer.parseInt(tfHindi.getText());
            int en = Integer.parseInt(tfEng.getText());
            int g = Integer.parseInt(tfGuj.getText());
            int c = Integer.parseInt(tfComputer.getText());

            int total = m + h + en + g + c;
            double percent = (total * 100.0) / 500;

            tfTotal.setText(String.valueOf(total));
            tfPercent.setText(String.valueOf(percent));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid marks");
        }
    }

    public static void main(String[] args) {
        new ResultSwing();
    }
}
