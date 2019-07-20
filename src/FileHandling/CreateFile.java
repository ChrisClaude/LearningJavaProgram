package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        // Accept a string
        String str = "File Handling in Java using " + " FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter fw = new FileWriter("C:\\Users\\Christ\\IdeaProjects\\LearningJavaProgram\\src\\FileHandling\\output.txt");

        // read character wise from string and write
        // into FileWriter

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }

        System.out.println("Writing successful");

        // close the file
        fw.close();
    }

}
