import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        try {
            File file = new File("../assets/input.txt");
            Scanner myReader = new Scanner(file);

            FormatTypes formatTypes = new FormatTypes();
            RFormat rFormat = new RFormat();
            IFormat iFormat = new IFormat();
            JFormat jFormat = new JFormat();

            String binary = "";

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] lineItems = line.split("\\s+|,|\\(|\\)");
                lineItems = Arrays.stream(lineItems).filter(s -> !s.isEmpty()).toArray(String[]::new);
                if(lineItems.length > 0) {
                    String format = formatTypes.get(lineItems[0]);
                    switch(format) {
                        case "r": {
                            binary += "000000"; //Opcode
                            // Opcode, rs, rt, rd, sa, funct
                            // add s0, s1, s2
                            // add = lineitems 0
                            // s0 = lineitems 1 = rd
                            // s1 = lineitems 2 = rs
                            // s2 = linteitems 3 = rt
    
                            String rd = Utils.returnRegisterNumber(lineItems[1]);
                            String rs = lineItems.length > 2 ? Utils.returnRegisterNumber(lineItems[2]) : "00000";
                            String rt = lineItems.length > 3 ? Utils.returnRegisterNumber(lineItems[3]) : "00000";
                            String funct = rFormat.get(lineItems[0]);
                            String shamt = "00000";
    
                            if(lineItems.length == 3) {
                                String temp = rs;
                                rs = rd;
                                rt = temp;
                                rd = "00000";
                            }
    
                            switch(lineItems[0]) {
                                case "sll": {
                                    rt = Utils.convert(Utils.tryParseInt(lineItems[3]), 5);
                                    String temp = shamt;
                                    shamt = rt;
                                    rt = rs;
                                    rs = temp;
                                    break;
                                }
                            
                                case "srt": {
                                    break;
                                }
    
                                case "jr": {
                                    String temp = shamt;
                                    rs = rd;
                                    rd = temp;
                                    break;
                                }
                                default: break;
                            }
                             binary += rs + rt + rd + shamt + funct + "\n";
                            break;
                        }
    
                        case "j": {
                            break;
                        }
    
                        case "i": {
                            binary += iFormat.get(lineItems[0]); //Opcode
                            String operatorsBinary = ""; // $r, $t, etc
                            String constantBinary = ""; // valor constante
                            for(int i = lineItems.length - 1; i > 0; i -= 1) {
                                if(Utils.checkIfRegister(lineItems[i]))
                                    operatorsBinary += Utils.returnRegisterNumber(lineItems[i]);
                                else constantBinary += Utils.convert(Utils.tryParseInt(lineItems[i]), 16);
                            }
                                binary += operatorsBinary + constantBinary + "\n";
                            break;
                        }
    
                        default: break;
                    }
                
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
