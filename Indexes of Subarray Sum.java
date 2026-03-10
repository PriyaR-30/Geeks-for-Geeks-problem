class Solution {
   static ArrayList<Integer> subarraySum(int[] arr, int target){
       ArrayList<Integer> result = new ArrayList<>();
       int start = 0,sum = 0;
       for(int end =0; end < arr.length; end++){
           sum += arr[end];
           while (sum > target && start <= end){
               sum -= arr[start++];
           }
           if(sum == target){
            result.add(start + 1);
            result.add(end + 1);
            return result;
           }
            }
       result.add(-1);
       return result;
   }
   }
Check the link https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays,Java&sortBy=submissions
