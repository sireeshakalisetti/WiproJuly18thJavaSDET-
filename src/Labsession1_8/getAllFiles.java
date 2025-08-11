package Labsession1_8;
import java.io.File;

public class getAllFiles {
    public static void main(String[] args) {
        
        File folder = new File("C://Users//siree//Downloads//Java Fundamentals.pptx");


        String[] list = folder.list();

        if (list != null) {
            System.out.println("directory names");
            for (String name : list) {
                System.out.println(name);
            }
        } else {
            System.out.println("no directory exist");
        }
    }
}
