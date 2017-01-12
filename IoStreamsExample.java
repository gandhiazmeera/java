//create file in specific path

package sagar;

import java.io.*;

public class FileCreation {
	public static void main(String aa[]){
	try{
		File f=new File("ddd.txt");
		f.createNewFile();
		
	}
	catch(Exception e){
		
	}
}
}


//create a Directory in specificpath

package sagar;
import java.io.*;
public class Practice2 {
	public static void main(String aa[]){
		try{
			File f=new File("S:\\azmeera");
			f.mkdir();
			
		}
		catch(Exception e){
			
		}
	}

}


//write data into specific file using file writer class

package sagar;
import java.io.*;
public class FileWriter1 {
	public static void main(String aa[])
	{
		try{
		File f=new File("S:\\sss.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("gandhi");
		fw.write("sagar");
		fw.write(20);
		fw.flush();
		}
		catch(Exception e)
		{
		}
		}
}


//write data into specific file using bufferedwriter class

package sagar;
import java.io.*;
public class BufferedWriter1 {
public static void main(String aa[]){
	try{
		FileWriter f=new FileWriter("S:\\ggg.txt");
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("gandhi");
		bw.write("sagar");
		bw.write(20);
		bw.flush();
	}
	catch(Exception e){
		
	}
}
}


//read data from specific file using filereader class

package sagar;
import java.io.*;
public class FileReader1 {
	public static void main(String aa[])
	{
		try{
			FileReader f=new FileReader("S:\\sss.txt");
			int i=0;
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e){
			
		}
	}

}


//read data from specific file using bufferedreader class

package sagar;
import java.io.*;
public class BufferedReader1 {
	public static void main(String aa[])
	{
		try{
			FileReader f=new FileReader("S:\\ggg.txt");
			BufferedReader bw=new BufferedReader(f);
			int i=0;
			while((i=f.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(Exception e){
			
		}
	}

}


//difference between filewriter and bufferedwriter

package sagar;
import java.io.*;
public class Practice1 {
public static void main(String aa[])
{
	try{
		
	BufferedWriter br=new BufferedWriter(new FileWriter("S:\\ggg.txt"));
	br.write('c');
	br.write("aaaaaaaaaaaaaaaaaaa");
	br.write(198);
	br.write("assadsadasd00");
	br.write("sssssssssssssssssss");
	br.flush();
	br.close();
	BufferedReader br1=new BufferedReader(new FileReader("S:\\ggg.txt"));
String str;
	while((str=br1.readLine())!=null)
	{
		System.out.println(str);
	}
	}
	
	
	
	
	catch(Exception e)
	{
	}
	}
}


//write data into file using printwriter class

package sagar;
import java.io.*;
public class PrintWriter1 {
	public static void main(String aa[])
	{
		try{
			PrintWriter pw=new PrintWriter("S:\\gandhi.txt");
			pw.write("oomesh");
			pw.write("hello");
			pw.write(20);
			pw.write(67);
			pw.write("suresh");
			pw.flush();
		}
		catch(Exception e){
			
		}
	}

}


//write data into file using fileoutputstream class

package sagar;
import java.io.*;
public class FileOutputStream1 {
	public static void main(String aa[])
	{
		try{
			String str="hai this is niit";
		FileOutputStream fo=new FileOutputStream("S:\\gandhi.txt");
		fo.write(str.getBytes());
		}
		catch(Exception e){
			
		}
	}
}


//read data from file using fileinputstream class

package sagar;
import java.io.*;
public class FileInputStream1 {
	public static void main(String aa[])
	{
		try{
			String str="hai this is niit";
		FileInputStream fi=new FileInputStream("S:\\gandhi.txt");
		fi.read(str.getBytes());
		System.out.println(str);
		}
		catch(Exception e){
			
		}
	}

}


//read data from file and write same data into other file using filewriter and filereader and bufferedwriter and bufferedreader

package sagar;
import java.io.*;
public class ReadAndWrite {
	public static void main(String aa[]){
		try{
			FileReader f=new FileReader("S:\\ggg.txt");
			File f1=new File("S:\\gandhi.txt");
			FileWriter fw=new FileWriter(f1);
			int i=0;
			while((i=f.read())!=-1)
			{
				fw.write(i);
				System.out.print((char)i);
			}
			fw.flush();
			}
			catch(Exception e)
			{
			}
	}

}


package sagar;
import java.io.*;
public class ReadAndWrite1 {
	public static void main(String aa[]){
		try{
			FileReader f=new FileReader("S:\\gandhi.txt");
			BufferedReader br=new BufferedReader(f);
			FileWriter f1=new FileWriter("S:\\sss.txt");
			BufferedWriter bw=new BufferedWriter(f1);
			int i=0;
			while((i=f.read())!=-1)
			{   
				bw.write(i);
				System.out.print((char)i);
				bw.flush();
			}
		}
		catch(Exception e){
			
		}
	}

}


//read data from single file and write data into single file using bytestreams

package sagar;
import java.io.*;
public class ByteStreams1 {
	public static void main(String aa[]){
		try{
			String str="hai this is sagar. how are you? ";
		FileInputStream fi=new FileInputStream("S:\\gandhi.txt");
		FileOutputStream fo=new FileOutputStream("S:\\sss.txt");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
			System.out.print((char)i);
		}
		fo.flush();
		fo.write(str.getBytes());
		fi.read(str.getBytes());
		System.out.println(str);
		}
		catch(Exception e){
			
		}
	}
	}


//read data from single file and write data into two file using bytestreams

package sagar;
import java.io.*;
public class ByteStream2 {
	public static void main(String aa[]){
		try{
			String str="hai this is sagar. how are you? ";
		FileInputStream fi=new FileInputStream("S:\\gandhi.txt");
		FileOutputStream fo=new FileOutputStream("S:\\sss.txt");
		FileOutputStream fo1=new FileOutputStream("S:\\ggg.txt");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
			fo1.write(i);
			System.out.print((char)i);
		}
		fo.flush();
		fo1.flush();
		fo.write(str.getBytes());
		fo1.write(str.getBytes());
		fi.read(str.getBytes());
		System.out.println(str);
		}
		catch(Exception e){
			
		}
	}
}


//read data from two file and write data into single file using bytestreams

package sagar;
import java.io.*;
public class ByteStream3 {
	public static void main(String aa[]){
		try{
		FileInputStream fi=new FileInputStream("S:\\gandhi.txt");
		FileInputStream fo=new FileInputStream("S:\\sss.txt");
		SequenceInputStream si=new SequenceInputStream(fi,fo);
		FileOutputStream fo1=new FileOutputStream("S:\\ggg.txt");
		int i=0;
		while((i=si.read())!=-1)
		{
			fo1.write(i);
			System.out.print((char)i);
		}
		fo1.flush();
		fo1.close();
		fo.close();
		fi.close();
		si.close();
		}
		catch(Exception e){
			
		}
	}
}


//read image from specific path write into specific path

package sagar;
import java.io.*;
public class ReadImage1 {
	public static void main(String aa[]){
		try{
		FileInputStream fi=new FileInputStream("S:\\sagar.jpg");
		FileOutputStream fo=new FileOutputStream("d:\\suresh.jpg");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
		}
		fo.flush();
		}
		catch(Exception e){
			
		}
	}
}


//read image from specific path write into text file


package sagar;
import java.io.*;
public class ReadImage1 {
	public static void main(String aa[]){
		try{
		FileInputStream fi=new FileInputStream("S:\\sagar.txt");
		FileOutputStream fo=new FileOutputStream("d:\\suresh.txt");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
		}
		fo.flush();
		}
		catch(Exception e){
			
		}
	}
}

//read image from specific path write into doc file

package sagar;
import java.io.*;
public class ReadImage1 {
	public static void main(String aa[]){
		try{
		FileInputStream fi=new FileInputStream("S:\\sagar.doc");
		FileOutputStream fo=new FileOutputStream("d:\\suresh.doc");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
		}
		fo.flush();
		}
		catch(Exception e){
			
		}
	}
}


//read audio file and write into specific path

package sagar;
import java.io.*;
public class Audio {
	public static void main(String aa[]){
		try{
		FileInputStream fi=new FileInputStream("S:\\YaaYaa.mp3");
		FileOutputStream fo=new FileOutputStream("D:\\YaaYaa.mp3");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
		}
		fo.flush();
		}
		catch(Exception e){
			
		}
	}
}


//read video file and write into specific path

package sagar;
import java.io.*;
public class Video {
	public static void main(String aa[]){
		try{
		FileInputStream fi=new FileInputStream("S:\\video.mp4");
		FileOutputStream fo=new FileOutputStream("D:\\film.mp4");
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
		}
		fo.flush();
		}
		catch(Exception e){
			
		}
	}
}

===========================================================================================
