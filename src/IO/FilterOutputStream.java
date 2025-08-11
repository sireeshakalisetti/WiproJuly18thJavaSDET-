package IO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FilterOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		
		BufferedOutputStream filterOutput = null;
		
		try {
			fos = new FileOutputStream("C://Users//siree//Downloads//Exp3.java");
			//
			
			filterOutput= new BufferedOutputStream(fos);
			
			//
			String text = "Hi how are u";
			filterOutput.write(text.getBytes());
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			filterOutput.close();
			fos.close();
		}

	}

}
