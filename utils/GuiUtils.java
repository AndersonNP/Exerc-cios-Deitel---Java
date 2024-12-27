package utils;

import javax.swing.*;

public class GuiUtils {
    public static void definirTheme() {
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
