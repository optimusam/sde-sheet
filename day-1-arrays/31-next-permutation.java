class Solution {
    public void nextPermutation(int[] nums) {
        /*
        [1,3,5,7,6,4]
        1 .el1 = smallest element from right which breaks increasing order = 5 
        since 4,6,7 from right is in increasing order

        2. el2 = smallest element from right greater than el1 = 6

        3. swap el1 and el2 since we need to change prefix(el1) with something greater(el2) than it

        [1,3,6,7,5,4]

        4. reverse from index1+1 to end
        [1,3,6,4,5,7]
        */
        int n = nums.length;
        if(n <= 1) {
            return;
        }
        int index1 = n-2;
        // finding smallest element from right which breaks increasing order
        while(index1 >= 0 && nums[index1] >= nums[index1+1]) {
            index1--;
        }
        if(index1 >= 0) {
            int index2 = n-1;
            // finding smallest element from right greater than el1
            while(index2 >=0 && nums[index2] <= nums[index1]) {
                index2--;
            }
            // swap el1 and el2
            swap(nums, index1, index2);
        }
        // reverse from index1+1 to end
        reverse(nums, index1+1, n-1);
    }
    public void swap(int [] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
    public void reverse(int [] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}