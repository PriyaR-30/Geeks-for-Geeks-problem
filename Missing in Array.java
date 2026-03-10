class Solution {
    int missingNum(int arr[]) {
        // code here
        long n= arr.length + 1;
        long sum = n * (n + 1) / 2;
        for (int num : arr){
            sum -= num;
        }
        return(int) sum;
        
    }
}
Check the link https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Java&sortBy=submissions
