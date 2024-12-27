package capitulo12;

import utils.GuiUtils;

import javax.swing.*;

public class LabelTest {
    public static void main(String[] args) {
        GuiUtils.definirTheme();
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(260, 200);
        labelFrame.setVisible(true);
    }
}
