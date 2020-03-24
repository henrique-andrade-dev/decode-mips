import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*; // 

class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("./assets/input.txt");
            Scanner myReader = new Scanner(myObj);
            HashMap<String, String> Opcodes = new HashMap<>();
            String[] opcodes = {"add", "addi", "sub", "mult", "div", "neg", "and", "andi", "or", "ori", "xor", "nor", "slt", "slti", "sll", "srl", "lw", "sw", "beq", "bne", "j", "jr", "jal", "nop"};
            String binary = "";

            while (myReader.hasNextLine()) {
                
                
                String data = myReader.nextLine();
                String[] parts = data.split("jgodijfgoi");
                
                switch (parts[0]) {
                    case "add": binary += "00000";
                        
                        break;

                        case "addi": binary += "00000";
                        
                        break;
                        
                
                    default:
                        break;
                }


                for (int i = 0; i < parts.length; i++) {
                }


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
