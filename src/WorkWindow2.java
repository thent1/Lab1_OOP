import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
public class WorkWindow2 extends JFrame {
    public WorkWindow2() {
        setTitle("Завдання варіанту 'В1'");
        setSize(410, 140);
        JButton buttonYes = new JButton("Так");
        JButton buttonNo = new JButton("Відміна");
        buttonYes.setPreferredSize(new Dimension(160, 50));
        buttonNo.setPreferredSize(new Dimension(160,50));
        buttonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 101);
        scrollBar.setPreferredSize(new Dimension(360, 30));
        JLabel label = new JLabel(String.valueOf(scrollBar.getValue()));

        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText(String.valueOf(scrollBar.getValue()));
            }
        });
        buttonYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainWindow.setScrollBarLabel(scrollBar.getValue());
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(label);
        panel.add(scrollBar);
        panel.add(buttonYes);
        panel.add(buttonNo);
        add(panel);
    }
}
