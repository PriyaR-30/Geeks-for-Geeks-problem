class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1, second = -1;
        for (int num : arr){
            if (num > largest){
                second = largest;
                largest = num;
            }
            else if (num > second && num != largest){
                second = num;
            }
        }
        return second;
    }
}
Check the link https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays,Java&sortBy=submissions
