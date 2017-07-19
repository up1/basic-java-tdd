public class MyRange {
    public boolean isก้ามปูเปิด(String input) {
        return input.startsWith("[");
    }

    public int getFirstNumber(String input) {
        if (isก้ามปูเปิด(input)) {
            return input.charAt(1) - 48;
        }
        return input.charAt(1) - 47;
    }

    public boolean isก้ามปูปิด(String input) {
        return input.endsWith("]");
    }

    public int getLastNumber(String input) {
        if (isก้ามปูปิด(input)) {
            return Character.getNumericValue(input.charAt(3));
        }
        return Character.getNumericValue(input.charAt(3)) - 1;
    }

    public String of(String input) {
        String result = "";
        for (int i = getFirstNumber(input); i <= getLastNumber(input); i++) {
            result += i;
        }
        return result;
    }
}
