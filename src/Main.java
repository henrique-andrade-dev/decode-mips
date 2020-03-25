import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*; // 

class Main {
    public static void main(String[] args) {
        try {
            File file = new File("./assets/input.txt");
            Scanner myReader = new Scanner(file);
            Opcodes opcodes = new Opcodes();
            String binary = "";

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] lineItems = line.split("\\s+|,|\\(");
                
                for (int i = 0; i < lineItems.length; i++) {
                    String opcode = opcodes.get(lineItems[i]);

                    if (opcode != null) {
                        binary += opcode;
                    }
                }

                // String bin = Integer.toBinaryString(dec);

                System.out.println();
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
