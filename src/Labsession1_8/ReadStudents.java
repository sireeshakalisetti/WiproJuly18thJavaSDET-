package Labsession1_8;
import java.io.FileReader;

public class ReadStudents {
    public static void main(String[] args) {
        String fileName = "C://Users//siree//Downloads//Java Fundamentals.pptx";

        try {
        	
        FileReader fr = new FileReader(fileName);
            int i;
            System.out.println("Contents of file:");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);  
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
