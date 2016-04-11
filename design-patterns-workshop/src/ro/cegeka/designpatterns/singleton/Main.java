package ro.cegeka.designpatterns.singleton;

import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    final static String FILE_TO_READ = "data/singleton.txt";

    public static void main(String[] args) {
        FileReader fileReader = FileReader.getInstance();
        try {
            String fileContent = fileReader.readFile(FILE_TO_READ, Charset.defaultCharset());
            System.out.print(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
