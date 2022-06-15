package Modules.textures;
import java.io.*;


public class Copytextures {
    static String java_saves = "saves/";
    static String java_name;
    static String bedrock_path;

    public Copytextures(String j_name, String _path) {
        java_name = j_name;
        bedrock_path = bedrock_path + "/textures";
        java_saves = java_saves + "/" + j_name + "/textures";
    }

    // Execute All
    public void rootCopy() throws IOException, FileNotFoundException {
        
        try {
            copyBlock();
            copyItem();
        } catch (IOException e){}
    }

    // Blocks 
    public static void copyBlock() throws IOException, FileNotFoundException {
        File blocks = new File(bedrock_path + "/blocks");
        File block = new File(java_saves + "/block");
        try {
        BTJ.copyFiles.fileCopy(blocks, block);
        } catch (IOException e) {
            System.out.println("\n" + e);
        }
    }

    // Items
    public static void copyItem() throws IOException, FileNotFoundException {
        File items = new File(bedrock_path + "/items");
        File item = new File(java_saves + "/item");
        try {
            BTJ.copyFiles.fileCopy(items, item);
        } catch (IOException e) {
            System.out.println("\n" + e);
        }
    }
}
