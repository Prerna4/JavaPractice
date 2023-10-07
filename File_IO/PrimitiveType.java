package com.JavaIO.demo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveType {

	public static void main(String[] args) throws IOException {
		int id=101;
		String name="AAA";
		float f=3.4f;
		
		FileOutputStream fos=new FileOutputStream("D:\\\\\\\\testout.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeFloat(f);
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("D:\\testout.txt");
	    DataInputStream dis = new DataInputStream(fis);
	    
	    int Id=dis.readInt();
	    System.out.println("Id: " +Id);
	    String Name=dis.readUTF();
	    System.out.println("Name: " +Id);
	    f=dis.readFloat();
	    System.out.println("F: " +f);
	    

	}

}
