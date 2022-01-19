import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File myDir = new File("MyDocs");
		
		if ( myDir.mkdir()) {
			System.out.println("The directory was created successfully!");
		}else {
			System.out.println("The directory  already  exists.");
		}
		
		File myFile = new File (myDir,"myfile.txt");
		
		if  ( myFile.createNewFile() ) {
			System.out.println("The file is created successfully");
		}else {
			System.out.println("The file is already exist!");
		}

		
		// File Information
		System.out.println("File Name: " +myFile.getName());
		System.out.println("Path: " +myFile.getPath());
		System.out.println("Absolute Path: "+myFile.getAbsolutePath());
		System.out.println("Parent: " +myFile.getParent());
		File dest = new File(myDir,"newFile.txt");
		myFile.renameTo(dest);
		
		dest.delete();
		
	}

}
