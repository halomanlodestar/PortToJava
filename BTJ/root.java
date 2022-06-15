package BTJ;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import Modules.textures.*;;

class root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input Bedrock Path
        System.out.print("Enter Path of Bedrock Pack : ");
        String BedrockFilePath = sc.nextLine();

        // Inpurt Java Name
        System.out.print("Enter Name of Ported File : ");
        String JavaFileName = sc.nextLine();

        // Trying Copy Template
        try {
        copyTemplate(BedrockFilePath, JavaFileName);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        sc.close();
    }

    // Head
    public static void copyTemplate(String path, String name) throws IOException, FileNotFoundException {
        try {
        copyFiles.copy(path, name);
        Copytextures CT =  new Copytextures(name, path);
        CT.rootCopy();
        } catch (IOException e) {
            System.out.println("Error :: " + e);
        }
    }
}