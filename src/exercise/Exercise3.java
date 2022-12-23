package exercise;

public class Exercise3 {
    public static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Max : " + getMaxValue(arr));
        System.out.println("Min : " + getMinValue(arr));
    }

    //-------------------------------------
//    public static void main(String[] args) {
//        Integer [] arr = {1, 2, 3, 4, 5};
//        int min = Collections.min(Arrays.asList(arr));
//        int max = Collections.max(Arrays.asList(arr));
//        System.out.println("Max : " + max);
//        System.out.println("Min : " + min);
//    }
    //--------------------------------------
//    public static void main(String[] args) {
//        Integer [] arr = {2, 3, 1, 5, 4,6};
//        Arrays.sort(arr);
//        System.out.println("Max :" + arr[arr.length - 1]);
//        System.out.println("Min :" + arr[0]);
//    }
}
