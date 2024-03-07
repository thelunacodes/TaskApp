package utils.mainScreen;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class NewTaskButton {
    public static JPanel createNewTaskPanel() {
        JPanel newTaskPanel = new JPanel(new BorderLayout());

        JButton newTaskBtn = new JButton("Nova Tarefa");
        newTaskBtn.setFont(new Font("Arial", Font.PLAIN, 16));
        newTaskPanel.add(newTaskBtn);
        //Aplicar uma borta no newTaskPanel
        newTaskPanel.setBorder(new EmptyBorder(10,200,10,200));

        return newTaskPanel;
    }
}
