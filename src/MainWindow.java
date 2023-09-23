import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public JLabel textFieldLabel;
    public JLabel scrollBarLabel;
    public MainWindow() {
        setTitle("Lab. 1");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        textFieldLabel = new JLabel("Your text will be there");
        scrollBarLabel = new JLabel("Your number will be there");


        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Work");
        JMenuItem menuWork1 = new JMenuItem("Work1");
        JMenuItem menuWork2 = new JMenuItem("Work2");


        menuWork1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обработчик события
                WorkWindow1 window1 = new WorkWindow1();
                window1.setVisible(true);
            }
        });
        menuWork2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обработчик события
                WorkWindow2 window2 = new WorkWindow2();
                window2.setVisible(true);
            }
        });
        panel.add(textFieldLabel);
        panel.add(scrollBarLabel);
        menu.add(menuWork1);
        menu.add(menuWork2);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        add(panel);
    }

    public void setTextLabel(String string) {
        textFieldLabel.setText(string);
    }

    public void setScrollBarLabel(int value) {
        scrollBarLabel.setText(String.valueOf(value));
    }
}
