public class MySort {
    public int[] sort(int... inputs) {

        if (inputs.length > 1) {
            if (inputs[0] > inputs[1]) {
                int temp = inputs[0];
                inputs[0] = inputs[1];
                inputs[1] = temp;
            }
            if (inputs.length == 3)
                if (inputs[1] > inputs[2]) {
                    int temp = inputs[1];
                    inputs[1] = inputs[2];
                    inputs[2] = temp;
                }
        }

        return inputs;
    }
}
