package CreatingAndProcessingSequentialFile.ReadSequentialFile;

import CreateSequentialFile.Product;

import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ReadSequentialProductFile.java
 *
 * This is the working class that reads the prod.ser sequential file
 * and outputs the objects therein to outputProducts.txt
 *
 * @author Claude DE-TCHAMBILA
 * Student Number: 217035027
 */
public class ReadSequentialProductFile {

    private static ObjectInputStream inputStream;
    private static List<Product> products;

    public static void main(String[] args) throws IOException {
        products = new ArrayList<>();

        openFile();
        readContent();
        closeFile();

        products = products.stream()
                .sorted(Comparator.comparing(Product::getProdDescription))
                .collect(Collectors.toList());


        String headings = String.format("%-15s%-22s%15s%18s%n", "Product Type", "Product Description", "Price per Unit", "Quantity Sold");
        StringBuilder content = new StringBuilder();

        for (Product product : products)
            content.append(String.format("%-15d%-22s%15d%18d%n", product.getProdType(), product.getProdDescription(),
                    product.getProdSellPrice(), product.getProdQuantity()));

        // concatenating info about total number of products processed
        content.append(String.format("\nTotal number of products: %d", products.size()));

        String fileContent = headings + content;

        // outputting to file
        FileWriter output = new FileWriter("C:\\Users\\Christ\\IdeaProjects\\Prac15_ADP\\src\\ReadSequentialFile\\outputProducts.txt");

        for (int i = 0; i < fileContent.length(); i++)
            output.write(fileContent.charAt(i));


        System.out.println("Writing successful");

        output.close();

    }

    private static void openFile() {
        try {
            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("C:\\Users\\Christ\\IdeaProjects\\Prac15_ADP\\src\\CreateSequentialFile\\prod.ser")));
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("An error occurred while trying to open the file.");
            System.exit(1);
        }
    }

    private static void readContent() {
//        System.out.printf("%-15s%-22s%15s%18s%n", "Product Type", "Product Description", "Price per Unit", "Quantity Sold");

        try {
            while (true) {
                Product product = (Product) inputStream.readObject();

                products.add(product);

//                System.out.printf("%-15d%-22s%15d%18d%n", product.getProdType(), product.getProdDescription(),
//                        product.getProdSellPrice(), product.getProdQuantity());
            }
        } catch (EOFException endOfFileEx) {
            System.out.println("\nEnd of file!");
        } catch (ClassNotFoundException classNotFoundEx) {
            classNotFoundEx.printStackTrace();
            System.out.println("Invalid object type!");
        } catch (IOException iOEx) {
            iOEx.printStackTrace();
            System.out.println("An error occurred while trying to read the file!");
        }
    }

    private static void closeFile() {
        try {
            if (inputStream != null)
                inputStream.close();
        } catch (IOException iOEx) {
            System.err.println("Error closing file. Terminating...");
            System.exit(1);
        }
    }

}
