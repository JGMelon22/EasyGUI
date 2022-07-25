import java.io.IOException;

public class StartStopMSSQL {

    public void Start() {

        // /home de forma universal
        String userPath = System.getenv("HOME");

        // -- Linux --
        String[] cmd = new String[]{"x-terminal-emulator", "-e", userPath + "/StartDocker.sh"};

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Stop() {

        // /home de forma universal
        String userPath = System.getenv("HOME");

        // -- Linux --
        String[] cmd = new String[]{"x-terminal-emulator", "-e", userPath + "/StopDocker.sh"};

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}