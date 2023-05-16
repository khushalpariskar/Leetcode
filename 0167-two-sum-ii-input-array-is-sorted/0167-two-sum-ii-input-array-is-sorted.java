class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int indices[] = new int[2];
        int left =0;
        int right = numbers.length-1;
        if(numbers==null){
            return indices;
        }
        while(left<right){
            System.out.println(left+" "+right);
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                indices[0]=left+1;
                indices[1]=right+1;
                return indices;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return indices;
    }
}