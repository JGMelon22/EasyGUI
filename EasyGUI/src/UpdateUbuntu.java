import java.io.IOException;

public class UpdateUbuntu {
    public void UpdateSystem() {

        // /home de forma universal
        String userPath = System.getenv("HOME");

        // -- Linux --
        // String[] cmd = new String[]{"sh", "-c", userPath + "/master.sh"}; // Universal
        String[] cmd = new String[]{"x-terminal-emulator", "-e", userPath + "/UpdateAll.sh"}; //

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}