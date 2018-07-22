package fileRW;

import java.io.*;
import java.lang.*;

public class RW {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line1=new String();
		String line2=new String();
		
		BufferedReader bfr1=new BufferedReader(new FileReader("f:\\a.txt"));
		BufferedReader bfr2=new BufferedReader(new FileReader("f:\\b.txt"));
		
		BufferedWriter bfw=new BufferedWriter(new FileWriter("f:\\c.txt"));
		line1=bfr1.readLine();
		line2=bfr2.readLine();
		while (line1!=null & line2!=null) {
		bfw.write(line1);
		bfw.newLine();
		bfw.write(line2);
		bfw.newLine();
		line1=bfr1.readLine();
		line2=bfr2.readLine();
		}	
		bfw.flush();

		
	}

}
