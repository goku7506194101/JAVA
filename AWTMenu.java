import java.awt.*;
import java.awt.event.*;

public class AWTMenu {

    public static void main(String[] args) {

        Frame frame = new Frame("AWT Menu Example");
        frame.setSize(500, 400);

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("New"));
        fileMenu.add(new MenuItem("Open"));
        fileMenu.add(new MenuItem("Close"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Save"));
        fileMenu.add(new MenuItem("Save As"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Print"));

        Menu editMenu = new Menu("Edit");

        CheckboxMenuItem lineItem = new CheckboxMenuItem("Line", true);
        CheckboxMenuItem rectItem = new CheckboxMenuItem("Rectangle");
        CheckboxMenuItem circleItem = new CheckboxMenuItem("Circle");

        ItemListener radioListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                lineItem.setState(false);
                rectItem.setState(false);
                circleItem.setState(false);

                CheckboxMenuItem source =
                        (CheckboxMenuItem) e.getSource();
                source.setState(true);
            }
        };

        lineItem.addItemListener(radioListener);
        rectItem.addItemListener(radioListener);
        circleItem.addItemListener(radioListener);

        editMenu.add(lineItem);
        editMenu.add(rectItem);
        editMenu.add(circleItem);
        editMenu.addSeparator();

        CheckboxMenuItem redItem = new CheckboxMenuItem("Red");
        CheckboxMenuItem greenItem = new CheckboxMenuItem("Green");
        CheckboxMenuItem blueItem = new CheckboxMenuItem("Blue");

        editMenu.add(redItem);
        editMenu.add(greenItem);
        editMenu.add(blueItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setMenuBar(menuBar);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
