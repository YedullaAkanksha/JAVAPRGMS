package Filehandlingdemo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


	public static void main(String[] args) {
		fileinputStreamdemo();
		
	}
	static void fileinputStreamdemo() {
		try {
		File f=new File("C:\\f\\file.txt");
		FileInputStream f1=new FileInputStream(f);
		System.out.println("file opn");
		int i;
		while((i=f1.read())!=-1) {
			System.out.print((char) i);
		}
		f1.close();
	
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		System.out.print("exception occured "+ e.getMessage());
		//e.printStackTrace();
	}


		public class filewrite {
			public filewrite(File f) {
				// TODO Auto-generated constructor stub
			}
			public static void main(String[] args) {
				fileoutputStreamdemo();
				
			}
			static void fileoutputStreamdemo() {
				try {
				File f=new File("C:\\f\\file.txt");
				FileOutputStream f1=new FileOutputStream(f);
				System.out.println("file opn");
				int i;
				
					System.out.print((char) i);
					f1.write("Hello");
				
				f1.close();
			
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				System.out.print("exception occured "+ e.getMessage());
				//e.printStackTrace();
			}


		}}



}}


