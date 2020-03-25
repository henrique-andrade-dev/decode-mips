import java.util.*; // 

class Opcodes {
    HashMap<String, String> Opcodes = new HashMap<>();

    public Opcodes() {
        Opcodes.put("add", "100000");
        Opcodes.put("addi", "001000");
        Opcodes.put("sub", "100010");
        Opcodes.put("mult", "011000");
        Opcodes.put("div", "011010");
        Opcodes.put("neg", "000111");
        Opcodes.put("and", "100100");
        Opcodes.put("andi", "001100");
        Opcodes.put("or", "100101");
        Opcodes.put("ori", "001101");
        Opcodes.put("xor", "100110");
        Opcodes.put("nor", "100111");
        Opcodes.put("slt", "101010");
        Opcodes.put("slti", "001010");
        Opcodes.put("sll", "000000");
        Opcodes.put("srl", "000010");
        Opcodes.put("lw", "100011");
        Opcodes.put("sw", "101011");
        Opcodes.put("beq", "000100");
        Opcodes.put("bne", "000101");
        Opcodes.put("j", "000010");
        Opcodes.put("jr", "001000");
        Opcodes.put("jal", "000011");
        Opcodes.put("nop", "000000");
    }
}