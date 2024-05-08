import java.util.Arrays;

public class Test {
    public static int[] bottle(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg=false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if (flg==false){
                return array;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array=new int[]{9,8,7,6,5,4,3,2,1,0};
        array=bottle(array);
        System.out.println(Arrays.toString(array));
    }
}