package utils.mainScreen;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("TaskApp");
        window.setSize(600,600);

        //JPanel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        //Cabeçalho do programa escrito "TaskApp"
        JPanel taskListPanel = Tasks.createTaskListPanel();
        JPanel newTaskBtn = NewTaskButton.createNewTaskPanel();

        mainPanel.add(taskListPanel);
        mainPanel.add(newTaskBtn);


        //Adicionar JPanel "main" ao JFrame "window"
        window.add(mainPanel);

        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}