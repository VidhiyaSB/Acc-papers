import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    int[] arr  = {9,10,8,0,6};
    int[] op = new int[2];
    int maxprod=1;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if((arr[i]+arr[j]==18) &&(arr[i]>arr[j])){
                 if(arr[i]*arr[j]>maxprod){
                     maxprod = arr[i]*arr[j];
                     op[0]=arr[i];
                     op[1]=arr[j];
                 }   
            }
        }
    }
    for(int i:op){
        System.out.print(i+"");
    }
    }
}
