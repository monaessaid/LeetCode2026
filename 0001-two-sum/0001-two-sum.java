// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i= 0; i< nums.length; i++) {
//             for (int j = i + 1; j< nums.length; j++){
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i,j};               
//                 }
//             }
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>  pairs = new HashMap<>();
        for(int i= 0; i< nums.length; i++) {
            Integer numberIndex = pairs.get(nums[i]);
                if (numberIndex != null) {
                    return new int[]{i, numberIndex};
                } 
                pairs.put(target- nums[i], i);
    }
    return nums;
}
}