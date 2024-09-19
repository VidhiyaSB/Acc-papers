// Online Java Compiler
// Use this editor to write, compile and run your Java code online


//if reversal of subarray is equal to sorted array
class HelloWorld {
        public static boolean issuba(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                reversed(arr,i,j);
                if(isSorted(arr)){
                    return true;
                }
                reversed(arr,i,j);
            }
        }
        return false;
        }
        public static void reversed(int arr[],int start,int end){
            while(start<end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        public static boolean isSorted(int[] arr){
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    return false;
                }
            }
            return true;
        }
         public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        if(issuba(arr)==true){
            System.out.print("true");
        }
        else{
            System.out.println("false");
        }
    }
}
