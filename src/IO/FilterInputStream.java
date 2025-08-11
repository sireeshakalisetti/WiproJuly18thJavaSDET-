package IO;
import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class FilterInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		BufferedInputStream filterInput = null;
		
		try {
			fis = new FileInputStream("C://Users//siree//Downloads//Exp3.java");
			
			filterInput = new BufferedInputStream(fis);
			
			int data;
			
			while((data = filterInput.read()) != -1) {
				System.out.print((char)data);
			} fis.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
