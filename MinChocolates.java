// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {6,4,1,15,5};
        int n = 5;
        int m = 5;
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(ele%5==0){
                count++;
            }
            else if(ele<=m){
                count++;
                m = m-ele;
            }
        }
        System.out.print(count);
    }
}
