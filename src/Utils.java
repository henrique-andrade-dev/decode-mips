class Utils {
    public static int tryParseInt(String lineItem) {
        return lineItem.matches("\\d+") ? Integer.parseInt(lineItem) : -1;
    }
}
