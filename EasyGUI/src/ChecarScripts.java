// Por hora, não será implementado na GUI e nem chamado em arquivo de log.
// Apenas "preparando o terrêno" ;)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChecarScripts {
    // /home do usuário
    static String userPath = System.getenv("HOME");

    // Verifica conteúdo do sScript de atualização
    public static void VerificaScriptUm() {
        try {
            File scriptsFile = new File(userPath + "/UpdateAll.sh");
            Scanner readScript = new Scanner(scriptsFile);

            while (readScript.hasNextLine()) {
                String data = readScript.nextLine();
                System.out.println(data);
            }

            readScript.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Verifica o conteúdo do script de correção do APT + Flatpak
    public static void VerificaScriptDois() {
        try {
            File scriptsFile = new File(userPath + "/FixAptFlatpak.sh");
            Scanner readScript = new Scanner(scriptsFile);

            while (readScript.hasNextLine()) {
                String data = readScript.nextLine();
                System.out.println(data);
            }

            readScript.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Verifica o conteúdo do script de inicialização Docker + MSSQL
    public static void VerificaScriptTres() {
        try {
            File scriptsFile = new File(userPath + "/StartDocker.sh");
            Scanner readScript = new Scanner(scriptsFile);

            while (readScript.hasNextLine()) {
                String data = readScript.nextLine();
                System.out.println(data);
            }

            readScript.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Verifica o conteúdo do script de desligamento do MSSQL + Docker
    public static void VerificaScriptQuatro() {
        try {
            File scriptsFile = new File(userPath + "/StopDocker.sh");
            Scanner readScript = new Scanner(scriptsFile);

            while (readScript.hasNextLine()) {
                String data = readScript.nextLine();
                System.out.println(data);
            }

            readScript.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
