package utils.mainScreen;

import javax.swing.*;
import java.awt.*;

public class Tasks {
    public static JPanel createTaskListPanel() {
        JPanel taskListPanel = new JPanel();
        taskListPanel.setBackground(Color.green);
        taskListPanel.setPreferredSize(new Dimension(450,500));

        return taskListPanel;
    }
}
