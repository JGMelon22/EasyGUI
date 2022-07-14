import java.io.IOException;

public class CorrigirPackageManagers {

    public void CorrigirPacotes() {

        // /home de forma universal
        String userPath = System.getenv("HOME");

        // -- Linux --
        String[] cmd = new String[]{"gnome-terminal", "-e", userPath + "/.FixAptFlatpak.sh"}; //

        System.out.println(cmd);

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
