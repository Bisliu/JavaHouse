//public class Test {
//    public static void fun(int[]array,int n){
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length ; j++) {
//                if(array[i]+array[j]==n){
//                    System.out.println("["+i+","+j+"]");
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] array=new int[]{1,4,9,7,8};
//        fun(array,5);
//    }
//}
//public class Test {
//    public static int fun(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            int j=0;
//            for (j = i+1; j < array.length; j++) {
//                if(array[i]==array[j]){
//                    break;
//                }
//            }
//            if(j==array.length){
//                return array[i];
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] array=new int[]{2,6,2,2,2,8,8};
//        System.out.println(fun(array));
//    }
//}
//public class Test {
//    public static int fun(int[] array){
//        int count=0;
//        for (int i = 0; i < array.length; i++) {
//            count=0;
//            for (int j = i+1; j < array.length; j++) {
//                if (i==j){
//                    count++;
//                }
//            }
//            if(count> array.length/2){
//                return array[i];
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] array=new int[]{2,3,3,3,3,3,3};
//        System.out.println(fun(array));
//    }
//}
public class Test {
    public boolean fun(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] arr1 = {2, 6, 4, 1};
        int[] arr2 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(test.fun(arr1));
        System.out.println(test.fun(arr2));
    }
}
