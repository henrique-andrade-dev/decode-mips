import java.util.*; // 

class Opcodes {
    HashMap<String, String> opcodes = new HashMap<>();

    public Opcodes() {
        opcodes.put("add", "100000");
        opcodes.put("addi", "001000");
        opcodes.put("sub", "100010");
        opcodes.put("mult", "011000");
        opcodes.put("div", "011010");
        opcodes.put("neg", "000111");
        opcodes.put("and", "100100");
        opcodes.put("andi", "001100");
        opcodes.put("or", "100101");
        opcodes.put("ori", "001101");
        opcodes.put("xor", "100110");
        opcodes.put("nor", "100111");
        opcodes.put("slt", "101010");
        opcodes.put("slti", "001010");
        opcodes.put("sll", "000000");
        opcodes.put("srl", "000010");
        opcodes.put("lw", "100011");
        opcodes.put("sw", "101011");
        opcodes.put("beq", "000100");
        opcodes.put("bne", "000101");
        opcodes.put("j", "000010");
        opcodes.put("jr", "001000");
        opcodes.put("jal", "000011");
        opcodes.put("nop", "000000");
    }

    public String get(String param) {
        return opcodes.get(param);
    }
}