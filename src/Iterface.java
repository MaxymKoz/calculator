
//імпортуємо бібліотеки
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Iterface extends JFrame { // створюємо та зазначаємо блоки інтерфейсу
    private JButton button = new JButton("Знайти Рішення");
    private JTextField inputA = new JTextField("", 5);

    private JTextField inputC = new JTextField("", 5);
    private JLabel labelA = new JLabel("Задайте значення а: ");

    private JLabel labelC = new JLabel("Задайте значення c: ");
    private JCheckBox check = new JCheckBox("Тест на робота", false);

    public Iterface() { // створюємо інтерфейс
        super("Калькулятор простих степеней");
        this.setBounds(100, 100, 600, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // виключаємо після закриття вікна

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 2, 5, 5)); // сітка для розташування об'єктів
        // додаємо різні блоки для користувача
        container.add(labelA);
        container.add(inputA);
        container.add(labelC);
        container.add(inputC);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int x;
            int z;
            x = Integer.parseInt(inputA.getText()); // використувємо данні з полів Input
            z = Integer.parseInt(inputC.getText()); // використувємо данні з полів Input

            int result = x;
            // Цикл for который перемножает X самого на себя пока X не получит значения
            // степени Y.
            for (int a = 1; z > a; a++) {
                // Перемножение.
                result = result * x;
            }

            String message = "";
            message += "Розрахунки закінчені!\n";
            message += "x1 = " + result + "\n";
            message += ((check.isSelected()) ? "Ви Робот(" : "Ви не робот!");
            JOptionPane.showMessageDialog(null, message, "Рішення", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
