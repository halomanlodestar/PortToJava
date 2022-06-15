package BTJ;
import java.io.*;


public class copyFiles {
	public static void copy(String bedrock_path, String java_name) throws IOException
	{
		// Copy Template
		String java_saves = "saves/" + java_name;
		File srcDir = new File("D:/context/GitHub/BedrockToJava/JavaPort/template");
		File destDir = new File(java_saves);

		// Make sure srcDir exists
		if (!srcDir.exists()) {
			System.out.println("Directory does not exist.");
            }
		else {
			copyFiles fileDemo = new copyFiles();
			fileDemo.copydir(srcDir, destDir);
			System.out.println("Created successfully.");
		}
	}

	public void copydir(File src, File dest) throws IOException
	{

		if (src.isDirectory())
		{

			// if directory not exists, create it
			if (!dest.exists())
			{
				dest.mkdir();
				System.out.println("Directory copied from " + src + "  to "
						+ dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String fileName : files)
			{
				// construct the src and dest file structure
				File srcFile = new File(src, fileName);
				File destFile = new File(dest, fileName);
				// recursive copy
				copydir(srcFile, destFile);
			}

		}
		else
		{
			// If file, then copy it
			fileCopy(src, dest);
		}
	}

	public static void fileCopy(File src, File dest)
			throws FileNotFoundException, IOException
	{

		InputStream in = null;
		OutputStream out = null;

		try
		{
			// If file, then copy it
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// Copy the file content in bytes
			while ((length = in.read(buffer)) > 0)
			{
				out.write(buffer, 0, length);
			}

		}
		finally
		{
			if (in != null)
			{
				in.close();
			}
			if (out != null)
			{
				out.close();
			}
		}
		System.out.println("copy from : " + src.getPath() + "  to  " + dest.getPath() );
	}
}
