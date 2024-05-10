//import java.util.Arrays;
//class Solution {
//    public double trimMean(int[] arr) {
//        Arrays.sort(arr);
//        double a=0;
//        double sum=0;
//        for(int i=(int)(0.05*arr.length);i<0.95*arr.length;i++){
//            sum+=arr[i];
//        }
//        a=sum/(arr.length*0.9);
//        return a;
//    }
//}
//
//import java.util.Arrays;
//class Solution {
//    public long maximumHappinessSum(int[] happiness, int k) {
//        Arrays.sort(happiness);
//        long sum=0;
//        for(int i=happiness.length-1;i>happiness.length-1-k;i--){
//            sum+=happiness[i];
//            for(int a=0;a<i;a++){
//                if(happiness[a]==0){
//                    continue;
//                }
//                happiness[a]--;
//            }
//        }
//        return sum;
//    }
//}
