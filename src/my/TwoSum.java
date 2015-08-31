package my;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] twoSum(int[] nums, int target) {
    	int [] result=new int[2];
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	
    	for(int i=0;i<nums.length;i++){
    		map.put(nums[i], i);
    	}
    	
        for(int i=0;i<nums.length;i++){
        	Object temp=map.get(target-nums[i]);
    		if(temp instanceof Integer &&  ((Integer)temp).intValue()!=i){
    			result[0]=i+1;
    			result[1]=((Integer)temp).intValue()+1;
    			return result;
    		}
        }
        return result;
    }
	
    public int[] twoSum2(int[] nums, int target) {
    	int [] result=new int[2];
        for(int i=0;i<nums.length;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[i]+nums[j]==target){
        			result[0]=i+1;
        			result[1]=j+1;
        			return result;
        		}
        	}
        }
        return result;
    }
    
    public static void main(String[] args) {
		int [] numbers={2, 7, 11, 15};
		int target=9;
		int [] result=new Solution().twoSum(numbers, target);
		System.out.println("index1="+result[0]+", index2="+result[1]);
	}
}