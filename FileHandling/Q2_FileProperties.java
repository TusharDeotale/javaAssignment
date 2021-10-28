package fileInputOutput;

import java.io.File;
import java.io.FileWriter;

public class Q2_FileProperties {

	public static void main(String[] args) {
		File f = new File("FileProperties.txt");
		try {
			f.createNewFile();
		}catch(Exception e){
			System.out.println("Can't create file!!");
			e.printStackTrace();
		}
		try {
			FileWriter fw = new FileWriter("FileProperties.txt");
			fw.write("File Properties!!");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		
	}

}
