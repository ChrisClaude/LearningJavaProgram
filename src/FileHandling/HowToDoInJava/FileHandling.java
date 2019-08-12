package FileHandling.HowToDoInJava;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileHandling {

    public static void main(String[] args) {

            // writing files
//            FileHandling.usingBufferedWriter();
//            FileHandling.usingPrintWriter();
//            FileHandling.usingPath();

            // read files
//            String text = FileHandling.readLineByLine("C:\\Users\\Christ\\IdeaProjects\\" +
//                    "LearningJavaProgram\\src\\FileHandling\\HowToDoInJava\\output.txt");

//            String text = FileHandling.readAllBytes("C:\\Users\\Christ\\IdeaProjects\\" +
//                    "LearningJavaProgram\\src\\FileHandling\\HowToDoInJava\\output2.txt");

            String text = FileHandling.usingBufferedReader("C:\\Users\\Christ\\IdeaProjects\\" +
                    "LearningJavaProgram\\src\\FileHandling\\HowToDoInJava\\sample.txt");

            System.out.println(text);

    }

    // writing to a file: BufferedWriter - write to a file when it exists or create file when not exists
    public static void usingBufferedWriter() throws IOException {
        String fileContent = "File handling, using BufferedWriter.";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Christ\\IdeaProjects\\" +
                "LearningJavaProgram\\src\\FileHandling\\HowToDoInJava\\output.txt"));

        bufferedWriter.write(fileContent);
        bufferedWriter.close();
    }

    // Use PrintWriter to write formatted text to a file
    public static void usingPrintWriter() throws IOException {
        String fileContent = "File handling, using PrintWriter";

        FileWriter fileWriter = new FileWriter("C:\\Users\\Christ\\IdeaProjects\\LearningJavaProgram\\src\\" +
                "FileHandling\\HowToDoInJava\\output2.txt");

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fileContent);
        printWriter.printf("\nDeveloper name: %s", "Claude Christ");
        printWriter.close();
    }

    // Files utility class and we can write a file using it’s write function,
    // internally it’s using OutputStream to write byte array into file.
    public static void usingPath() throws IOException {
        String fileContent = "Writing to a file, using Files utility";
        Path path = Paths.get("C:\\Users\\Christ\\IdeaProjects\\LearningJavaProgram\\src\\FileHandling" +
                "\\HowToDoInJava\\sample.txt");

        Files.write(path, fileContent.getBytes());
    }

    // Java 8 - Read file line by line - Files.lines(Path path, Charset cs)
    private static String readLineByLine(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    // Files.readAllBytes(Path path) - Java 7 and above
    public static String readAllBytes(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    // Using BufferedReader and FileReader - Below Java 7
    private static String usingBufferedReader(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }






}
