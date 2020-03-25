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
            HashMap<String, String> Opcodes = new HashMap<>();
            // String[] opcodes = {"add", "addi", "sub", "mult", "div", "neg", "and", "andi", "or", "ori", "xor", "nor", "slt", "slti", "sll", "srl", "lw", "sw", "beq", "bne", "j", "jr", "jal", "nop"};
            String binary = "";

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] parts = line.split("\\s+|,|\\(");
                
                for (int i = 0; i < parts.length; i++) {
                    System.out.println(parts[i] + "\n");
                }

                // switch (parts[0]) {
                //     case "add": binary += "00000";
                        
                //         break;

                //         case "addi": binary += "00000";
                        
                //         break;
                        
                
                //     default:
                //         break;
                // }



                //String bin = Integer.toBinaryString(dec);

                System.out.println();
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
