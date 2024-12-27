package capitulo12;

import javax.swing.*;

public class Addition {
    public static void main(String[] args) {

        definirTheme();

        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }

    private static void definirTheme() {
        try {
            // Define o Nimbus Look and Feel
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Caso haja algum problema ao definir o Look and Feel
        }
    }
}
