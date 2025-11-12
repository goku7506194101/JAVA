import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String upper = str.toUpperCase();

            FileWriter fw1 = new FileWriter("output1.txt");
            fw1.write("Uppercase String: " + upper);
            fw1.close();

            System.out.println("String stored in output1.txt");

            System.out.print("Enter a double value: ");
            double val = sc.nextDouble();

            FileWriter fw2 = new FileWriter("output2.txt");

            String date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());

            fw2.write("Double Value: " + val + "\n");
            fw2.write("Date: " + date);
            fw2.close();

            System.out.println("Double value and date stored in output2.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.nextLine();
        System.out.print("Enter file/directory name to delete: ");
        String fname = sc.nextLine();
        File f = new File(fname);

        if (f.delete()) {
            System.out.println(fname + " deleted successfully.");
        } else {
            System.out.println("Failed to delete " + fname + ". Check if it exists.");
        }

        sc.close();
    }
}
