import java.awt.*;
import java.awt.event.*;

class CardLout extends Frame implements ActionListener {

    CardLayout car = new CardLayout(20, 20);

    CardLout(String str) {
        super(str);

        setLayout(car);

        Button panel1 = new Button("Parul University");
        Button panel2 = new Button("FITCS");
        Button panel3 = new Button("MScIT / MCA");

        add(panel1, "Parul University");
        add(panel2, "FITCS");
        add(panel3, "MScIT / MCA");

        panel1.addActionListener(this);
        panel2.addActionListener(this);
        panel3.addActionListener(this);

        addWindowListener(new MyClass());
    }

    public void actionPerformed(ActionEvent e) {
        car.next(this);
    }

    public static void main(String[] args) {
        CardLout frame = new CardLout("CardLayout Example");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
