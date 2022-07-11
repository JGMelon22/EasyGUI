import java.io.IOException;

public class StartStopMSSQL {

    public void Start() {

        // -- Linux --
        String[] cmd = new String[]{"gnome-terminal", "-e", "/Caminho para o Shell Script/.StartDocker.sh"};

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Stop() {

        // -- Linux --
        String[] cmd = new String[]{"gnome-terminal", "-e", "/Caminho para o Shell Script/.StopDocker.sh"};

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}