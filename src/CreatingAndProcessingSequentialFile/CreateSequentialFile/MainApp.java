package CreatingAndProcessingSequentialFile.CreateSequentialFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateSequentialFile.MainApp.java
 * <p>
 * This is the working class
 *
 * @author Claude DE-TCHAMBILA
 * Student number: 217035027
 */
public class MainApp {

    private static List<Product> products;
    private static ObjectOutputStream outputStream;

    public static void main(String[] args) throws IOException {
        // reading sales.txt
        int c;

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("C:\\Users\\Christ\\IdeaProjects\\Prac15_ADP\\res\\Sales.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        String fileText = "";

        while ((c = fileReader.read()) != -1)
            fileText += (char) c;


        fileReader.close();

        // replacing all line separators in the string by **
        fileText = fileText.replaceAll(System.getProperty("line.separator"), "**");

        String[] salesStr = fileText.split("\\*\\*");


        products = new ArrayList<>();
        int index = 1;

        ForSaleProduct forSaleProduct = new ForSaleProduct();
        for (String value : salesStr) {

            switch (index) {
                case 1:
                    forSaleProduct.setProdType(Integer.parseInt(value));
                    index++;
                    break;
                case 2:
                    forSaleProduct.setCatalogNumber(Integer.parseInt(value));
                    index++;
                    break;
                case 3:
                    forSaleProduct.setProdDescription(value);
                    index++;
                    break;
                case 4:
                    forSaleProduct.setPurchasePricePerItem(Integer.parseInt(value));
                    index++;
                    break;
                case 5:
                    forSaleProduct.setProdSellPrice(Integer.parseInt(value));
                    index++;
                    break;
                case 6:
                    forSaleProduct.setProdQuantity(Integer.parseInt(value));
                    products.add(forSaleProduct);
                    forSaleProduct = new ForSaleProduct();
                    index = 1;
                    break;
            }
        }

        openFile();
        writeProducts();
        closeFile();

    }

    public static void openFile() {
        try {
            outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("C:\\Users\\Christ\\IdeaProjects\\Prac15_ADP\\src\\CreateSequentialFile\\prod.ser")));
        } catch (IOException iOException) {
            System.err.println("An error occurred while opening the file.\nTerminating...");
            System.exit(1);
        }
    }

    public static void writeProducts() {
        products.forEach(product -> {
            try {
                outputStream.writeObject(product);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Product objects added to file prod.ser");
    }

    public static void closeFile() {
        try {
            if (outputStream != null)
                outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
