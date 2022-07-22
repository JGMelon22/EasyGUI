import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JButton atualizarSOButton;
    public JPanel panel1;
    private JButton iniciarMSSQL;
    private JButton corrigirAptFlatpak;
    private JLabel label1;
    private JCheckBox chkSimple;
    private JButton pararMSSQL;

    public MainForm() {
        atualizarSOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Atualizar Sistema
                UpdateUbuntu updateUbuntu = new UpdateUbuntu();
                updateUbuntu.UpdateSystem();
                JOptionPane.showMessageDialog(null, "Atualizando o SO.");
            }
        });
        iniciarMSSQL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StartStopMSSQL startStopMSSQL = new StartStopMSSQL();
                startStopMSSQL.Start();
                JOptionPane.showMessageDialog(null, "Iniciando o SQL Server.");
            }
        });

        corrigirAptFlatpak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CorrigirPackageManagers corrigirPackageManagers = new CorrigirPackageManagers();
                corrigirPackageManagers.CorrigirPacotes();
                JOptionPane.showMessageDialog(null, "Corrigindo pacotes do Apt e/ou Flatpak.");
            }
        });
        pararMSSQL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StartStopMSSQL startStopMSSQL = new StartStopMSSQL();
                startStopMSSQL.Stop();
                JOptionPane.showMessageDialog(null, "Parando o SQL Server.");
            }
        });

        // Esconde os botões de iniciar e parar o SQL Server caso marcado
        chkSimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                boolean checked = chkSimple.isSelected();
                {
                    if (chkSimple.isSelected()) {

                        label1.setText("Atualizar SO");
                        iniciarMSSQL.setVisible(false);
                        pararMSSQL.setVisible(false);
                    } else {
                        label1.setText("Atualizar SO e rodar SQL Server");
                        iniciarMSSQL.setVisible(true);
                        pararMSSQL.setVisible(true);
                    }
                }
            }
        });
    }
}
