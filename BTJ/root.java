package BTJ;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import Modules.textures.*;;

class root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Path
        System.out.println("Enter Path of Bedrock Pack : ");
        String Path = sc.nextLine();

        // Name
        System.out.println("Enter Name of Ported File : ");
        String Name = sc.nextLine();

        try {
        copyTemplate(Path, Name);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        sc.close();
    }

    // Head
    public static void copyTemplate(String path, String name) throws IOException, FileNotFoundException {
        try {
        copyFiles.copy(path, name);
        Copytextures.rootCopy(name, path);
        } catch (IOException e) {
            System.out.println("Error :: " + e);
        }
    }
}