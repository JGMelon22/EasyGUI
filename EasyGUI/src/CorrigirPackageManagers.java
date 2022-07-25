import java.io.IOException;

public class CorrigirPackageManagers {

    public void CorrigirPacotes() {

        // /home de forma universal
        String userPath = System.getenv("HOME");

        // -- Linux --
        String[] cmd = new String[]{"x-terminal-emulator", "-e", userPath + "/FixAptFlatpak.sh"}; //

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
