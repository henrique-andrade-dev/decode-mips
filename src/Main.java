import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Main {
    public static void main(String[] args) {
        try {
            File file = new File("../assets/input.txt");
            Scanner myReader = new Scanner(file);
            Funct funct = new Funct();
            String binary = "";

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] lineItems = line.split("\\s+|,|\\(|\\)");

                for (int i = 0; i < lineItems.length; i++) {
                    String opcode = funct.get(lineItems[i]);
                    int registerNumber = Utils.returnRegisterNumber(lineItems[i]);
                    int number = Utils.tryParseInt(lineItems[i]);

                    if (opcode != null) {
                        binary += opcode;
                    } else if (registerNumber != -1) {
                        binary += Integer.toBinaryString(registerNumber);
                    } else if (number != -1) {
                        binary += Integer.toBinaryString(number);
                    }
                    else {
                        // throw Exception?
                    }

                    // System.out.println(i + ": " + binary + "\n");
                }

            }

            System.out.println(binary);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
