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
// class Solution {
//     public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
//         int count=0;
//         for(int i=0;i<hours.length;i++){
//             if(hours[i]>=target){
//                 count++;
//             }
//         }
//         return count;
//     }
// }
// class Solution {
//     public int kthGrammar(int n, int k) {
//         if (n == 1) return 0;

//         int half = 1<<(n-2);
//         if(k>half){
//             return kthGrammar(n - 1, k - half) ^ 1;
//         }
//         return kthGrammar(n - 1, k);
//     }
// }

