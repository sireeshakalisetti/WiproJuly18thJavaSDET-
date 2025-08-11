package Labsession1_8;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderEx {
    public static void main(String[] args) throws IOException {
        char[] charArray = {'S', 'I', 'R', 'E', 'E', 'S', 'H','A'};
        
        CharArrayReader reader = new CharArrayReader(charArray);

        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }

        reader.close(); 
    }
}