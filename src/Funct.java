import java.util.*; // 

class Funct {
    HashMap<String, String> funct = new HashMap<>();
    HashMap<String, String> rFormat = new HashMap<>();
    HashMap<String, String> iFormat = new HashMap<>();
    HashMap<String, String> jFormat = new HashMap<>();

    public Funct() {
        fillHashMaps();
        
    }

    public String get(String param) {
        return funct.get(param);
    }

    public void fillHashMaps() {
        funct.put("add", "100000");
        funct.put("addi", "001000");
        funct.put("sub", "100010");
        funct.put("mult", "011000");
        funct.put("div", "011010");
        funct.put("neg", "000111");
        funct.put("and", "100100");
        funct.put("andi", "001100");
        funct.put("or", "100101");
        funct.put("ori", "001101");
        funct.put("xor", "100110");
        funct.put("nor", "100111");
        funct.put("slt", "101010");
        funct.put("slti", "001010");
        funct.put("sll", "000000");
        funct.put("srl", "000010");
        funct.put("lw", "100011");
        funct.put("sw", "101011");
        funct.put("beq", "000100");
        funct.put("bne", "000101");
        funct.put("j", "000010");
        funct.put("jr", "001000");
        funct.put("jal", "000011");
        funct.put("nop", "000000");
    }
}
