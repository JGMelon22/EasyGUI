import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm extends JFrame {
    private JButton atualizarSOButton;
    public JPanel panel1;
    private JButton iniciarMSSQL;
    private JButton corrigirAptFlatpak;
    private JLabel label1;
    private JCheckBox chkSimple;
    private JButton pararMSSQL;

    public MainForm() {
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
        atualizarSOButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Atualizar Sistema
                UpdateUbuntu updateUbuntu = new UpdateUbuntu();
                updateUbuntu.UpdateSystem();
                JOptionPane.showMessageDialog(null, "Atualizando o SO.");
            }
        });
        iniciarMSSQL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StartStopMSSQL startStopMSSQL = new StartStopMSSQL();
                startStopMSSQL.Start();
                JOptionPane.showMessageDialog(null, "Iniciando o SQL Server.");
            }
        });
        pararMSSQL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StartStopMSSQL startStopMSSQL = new StartStopMSSQL();
                startStopMSSQL.Stop();
                JOptionPane.showMessageDialog(null, "Parando o SQL Server.");
            }
        });
        corrigirAptFlatpak.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CorrigirPackageManagers corrigirPackageManagers = new CorrigirPackageManagers();
                corrigirPackageManagers.CorrigirPacotes();
                JOptionPane.showMessageDialog(null, "Corrigindo pacotes do Apt e/ou Flatpak.");
            }
        });
    }
}
