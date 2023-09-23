import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkWindow1 extends JFrame {
    public WorkWindow1() {
        setTitle("Work1");
        setSize(400, 140);
        JButton buttonYes = new JButton("ТАК!");
        JButton buttonNo = new JButton("НІ!");
        buttonYes.setPreferredSize(new Dimension(160, 50));
        buttonNo.setPreferredSize(new Dimension(160,50));
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(360, 30));
        JPanel panel = new JPanel(new FlowLayout());
        buttonYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainWindow.setTextLabel(textField.getText());
            }
        });
        panel.add(textField);
        panel.add(buttonYes);
        panel.add(buttonNo);
        add(panel);
        }
    }