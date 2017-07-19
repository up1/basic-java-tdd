public class PrimeFactor {
    public String of(int number) {
        String result = "";
        while (number % 2 == 0) {
            result += "2";
            number /= 2;
        }
        if (number > 1) {
            result += number;
        }
        return result;
    }
}
