package my;

public class MissingNumber {
	
	 public int missingNumber(int[] nums) {
		 int max=0;
		 int sum1=0;
		 boolean hasZero=false;
		 for(int i=0;i<nums.length;i++){
			 if(nums[i]>max){
				 max=nums[i];
			 }
			 if(nums[i]==0)hasZero=true;
			 sum1+=nums[i];
		 }
		 int sum2=(0+max)*(max+1)/2;
		 if(sum2-sum1==0 && hasZero){
		     return max+1;
		 }else{
		    return sum2-sum1;
		 }
	 }
	
	public static void main(String[] args) {
		int []nums={0, 1, 3};
		System.out.println(new MissingNumber().missingNumber(nums));

	}

}
