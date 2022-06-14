package Modules.textures;
import java.io.*;


public class Copytextures {
    static String outDir = "saves/";
    static String name;
    static String path;

    public Copytextures(String _name, String _path) {
         Copytextures.name = _name;
         Copytextures.path = _path + "/"+ _name + "/textures";
         Copytextures.outDir = outDir + "/" + _name;
    }

    // Execute All
    public static void rootCopy(String _name, String _path) throws IOException, FileNotFoundException {
        
        try {
            copyBlock();
            copyItem();
        } catch (IOException e){}
    }

    // Blocks 
    public static void copyBlock() throws IOException, FileNotFoundException {
        File block = new File(path+"/blocks");
        File destDir = new File(outDir);
        try {
        BTJ.copyFiles.fileCopy(block, destDir);
        } catch (IOException e) {
            System.out.println("\n" + e);
        }
    }

    // Items
    public static void copyItem() throws IOException, FileNotFoundException {
        File item = new File(path+"/items");
        File destDir = new File(outDir + "/item");
        try {
            BTJ.copyFiles.fileCopy(item, destDir);
        } catch (IOException e) {
            System.out.println("\n" + e);
        }
    }
}
