
    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int sum = 0;
        int sol = (n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
    return sol-sum;
}
}
