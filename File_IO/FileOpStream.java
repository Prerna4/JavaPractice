package com.JavaIO.demo;
/*You can write byte-oriented as well as character-oriented data through FileOutputStream class. 
But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.*/
import java.io.FileOutputStream;
import java.io.IOException;  
public class FileOpStream {

	public static void main(String[] args) throws IOException {
		  FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
          fout.write(65);  
          String s="\nWelcome to Java Programming";
          byte b[]=s.getBytes();
          fout.write(b);
          fout.close();    
          System.out.println("success...");    
	}

}
