package exercise;

public class Exercise2 {
        public static void main(String[] args) {
        int[] example = {2458, 9095, 1899, 9009, 2013, 1458, 2458, 6557, 12143, 8784, 34567, 2165, 1457, 23432};
        //int [] arr = new int [] {1, 2, 3, 4, 5};
        for (int i = 0; i< example.length; i++){
            System.out.print(example[i] + " ");
        }
        System.out.println();
        for(int i = example.length -1; i >=0;i--){
            System.out.print(example[i] + " ");
        }

    }

    //---------------------------------------------------
//    public static void main(String[] args)
//    {
//        Integer [] arr = {1,2,3,4,5};
//        System.out.println("Original array : " + Arrays.asList(arr));
//        Collections.reverse(Arrays.asList(arr));
//        System.out.println("Reverse Array : " + Arrays.asList(arr));
//    }
}
