class Utils {
    public static int tryParseInt(String lineItem) {
        return lineItem.matches("\\d+") ? Integer.parseInt(lineItem) : -1;
    }

    public static int checkIfOperator(String lineItem) {
        for (int i = 0; i < lineItem.length(); i += 1) {
            if (lineItem.charAt(i) == '$') {
                switch (lineItem.charAt(i + 1)) {
                    case 'r': {

                        break;
                    }
                    case 't': {

                        break;
                    }
                    case 's': {

                        break;
                    }
                    default:
                        break;
                }

                return Integer.parseInt(lineItem.replaceAll("\\D+", ""));
            }
        }
        
        return -1;
    }
}
