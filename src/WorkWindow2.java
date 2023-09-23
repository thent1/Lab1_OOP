import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class WorkWindow2 extends JFrame {
    int scrollBarValue;
    //private Main mainWindow;

    public WorkWindow2() {
        //this.mainWindow = mainWindow;
        setTitle("Work2");
        setSize(410, 140);
        JButton buttonYes = new JButton("YES!!!!");
        JButton buttonNo = new JButton("no");
        buttonYes.setPreferredSize(new Dimension(160, 50));

        buttonYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.mainWindow.setScrollBarLabel(scrollBarValue);
            }
        });

        buttonNo.setPreferredSize(new Dimension(160,50));
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 101);
        scrollBar.setPreferredSize(new Dimension(360, 30));
        JLabel label = new JLabel(String.valueOf(scrollBar.getValue()));

        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Обновляем текст метки при изменении ползунка
                label.setText(String.valueOf(scrollBar.getValue()));
                scrollBarValue = scrollBar.getValue();
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
