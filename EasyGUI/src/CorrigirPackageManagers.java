import java.io.IOException;

public class CorrigirPackageManagers {

    public void CorrigirPacotes() {

        // -- Linux --
        String[] cmd = new String[]{"x-terminal-emulator", "-e", "echo Corrigindo possíveis problemas com pacotes do APT e/ou Flatpak... && sudo dpkg --configure -a && sudo flatpak repair"}; //

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
