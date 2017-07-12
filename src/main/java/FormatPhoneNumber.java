public class FormatPhoneNumber {
    public String solution(String input) {
        String result = removeNonDigit(input);
        return format(result);
    }

    private String format(String input) {
        StringBuilder result = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if (counter == 3 && i < input.length() - 1) {
                result.append("-");
                counter = 1;
            } else {
                counter++;
            }
        }

        if (input.length() % 3 == 1) {
            char[] temp = result.toString().toCharArray();
            temp[temp.length - 2] = temp[temp.length - 3];
            temp[temp.length - 3] = '-';
            return new String(temp);
        }

        return result.toString();
    }

    private String removeNonDigit(String input) {
        return input.replaceAll("[^0-9]", "");
    }
}
