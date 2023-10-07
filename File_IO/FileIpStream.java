package com.JavaIO.demo;

/*t is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. 
You can also read character-stream data. But, for reading streams of characters, 
it is recommended to use FileReader class.
*/
import java.io.FileInputStream;
import java.io.IOException;

public class FileIpStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\\\testout.txt");
		int i=fis.read();
		System.out.println((char)i);  //read single character
		int j=0;
		//read multiple character
		while((j=fis.read())!=-1) {
			System.out.println((char)j);
		}
		fis.close();
	}

}
