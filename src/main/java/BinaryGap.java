public class BinaryGap {

    public int solution(int N) {
        int i = N;
        int result = 0;
        int count = 0;
        boolean foundOne = false;
        while(i>0) {
            if( (i & 1) == 1) {
                if(!foundOne) {
                    foundOne = true;
                } else {
                    result = Math.max(result, count);
                }
                count = 0;
            } else {
                count++;
            }
            i >>=1;
        }
        return result;
    }

    public String convert(int number) {
        return Long.toBinaryString(number);
    }

    public int solution2(int N) {
        int count = 0;
        int result = 0;
        char[] input = convert(N).toCharArray();
        for (char i: input) {
            if( i == '0') {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }
        return result;
    }
}
