import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JButton atualizarSOButton;
    public JPanel panel1;
    private JButton iniciarMSSQL;
    private JButton pararMSSQL;
    private JLabel label1;

    public MainForm() {
        atualizarSOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Atualizar Sistema
                UpdateUbuntu updateUbuntu = new UpdateUbuntu();
                updateUbuntu.UpdateSystem();
                JOptionPane.showMessageDialog(null, "Atualizando o SO");
            }
        });
        iniciarMSSQL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StartStopMSSQL startStopMSSQL = new StartStopMSSQL();
                startStopMSSQL.Start();
                JOptionPane.showMessageDialog(null, "Iniciando o SQL Server");
            }
        });
        pararMSSQL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StartStopMSSQL startStopMSSQL = new StartStopMSSQL();
                startStopMSSQL.Stop();
                JOptionPane.showMessageDialog(null, "Parando o SQL Server");
            }
        });
    }
}
