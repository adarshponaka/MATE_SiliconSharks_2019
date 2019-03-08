package Interface.Panels;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JPanel pitchPanel;
    private JPanel yawPanel;

    public ViewPanel(){

        pitchPanel = new JPanel();
        yawPanel = new JPanel();

        this.setLayout(new GridLayout(2, 1));
        this.add(pitchPanel);
        this.add(yawPanel);

        pitchPanel.setBackground(Color.PINK);
        yawPanel.setBackground(Color.lightGray);
    }

}