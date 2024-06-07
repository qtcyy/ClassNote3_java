package classNote.data602.selflearning;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_example {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("output.txt");
            writer.write("hello");
            writer.write('\n');
            writer.write("welcome");
            writer.flush();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
