package my;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length1=nums1.length;
		int length2=nums2.length;
		int total=length1+length2;
		if(total%2!=0){//ÆæÊı
			return findMedian(nums1,length1,nums2,length2,total/2+1);
		}else{
			return (findMedian(nums1,length1,nums2,length2,total/2)+findMedian(nums1,length1,nums2,length2,total/2+1))/2.0;
		}
    }
	
	public double findMedian(int []nums1,int length1,int [] nums2,int length2,int target){
		if(length1==0){
			return nums2[target-1];
		}else if(length2==0){
			return nums1[target-1];
		}else if(target==1){
			return nums1[0]<nums2[0]?nums1[0]:nums2[0];
		}
		
		int temp=target/2;
		if(min(length1,length2)<temp){
			temp=min(length1,length2);
		}
		
		if(nums1[temp-1]==nums2[temp-1] && target%2==0){
			return nums1[temp-1];
		}
		if(nums1[temp-1]<=nums2[temp-1]){
			return findMedian(Arrays.copyOfRange(nums1, temp, length1),length1-temp,nums2,length2,target-temp);
		}else{
			return findMedian(nums1,length1,Arrays.copyOfRange(nums2, temp, length2),length2-temp,target-temp);
		}
	}
	
	public int min(int length1,int length2){
		return length1<length2?length1:length2;
	}
	
	public static void main(String[] args) {
		int[] a={};
		int[] b={1,2,3,4,5};
		System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(a, b));

	}

}
