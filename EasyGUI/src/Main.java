import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame Jframe = new JFrame("MainForm");
        Jframe.setContentPane(new MainForm().panel1);
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jframe.setSize(250, 270);
        Jframe.setLocationRcelativeTo(null);
        Jframe.setVisible(true);
    }
}