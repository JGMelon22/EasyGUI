import java.io.IOException;

public class UpdateUbuntu {
    public void UpdateSystem() {

        // -- Linux --
        String[] cmd = new String[]{"gnome-terminal", "-e", "/Caminho para o Shell Script/.UpdateAll.sh"}; //

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}