import java.io.IOException;

public class UpdateUbuntu {
    public void UpdateSystem() {

        // /home de forma universal
        String userPath = System.getenv("HOME");

        // -- Linux --
        // String[] cmd = new String[]{"sh", "-c", userPath + "/master.sh"}; // Universal
        String[] cmd = new String[]{"x-terminal-emulator", "-e", "echo \"Atualizando APT e Flatpak, por favor aguarde...\" && sudo apt update && sudo apt full-upgrade -y && sudo apt autoremove -y && sudo apt autoclean && flatpak update -y && flatpak uninstall --unused -y"}; //

        ProcessBuilder processBuilder = new ProcessBuilder(cmd);

        try {
            Process process = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}