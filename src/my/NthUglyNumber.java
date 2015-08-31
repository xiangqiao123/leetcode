package my;

import java.util.ArrayList;
import java.util.List;

public class NthUglyNumber {
	
	public int nthUglyNumber(int n) {
		List<Integer> result=new ArrayList<Integer>();
		
		List<Integer> l2=new ArrayList<Integer>();
		List<Integer> l3=new ArrayList<Integer>();
		List<Integer> l5=new ArrayList<Integer>();
		
		int i=0,j=0,k=0;
		result.add(1);
		l2.add(2);
		l3.add(3);
		l5.add(5);
		
		while(result.size()<n){
			int min=getMin(l2.get(i),l3.get(j),l5.get(k));
			result.add(min);
			l2.add(min*2);
			l3.add(min*3);
			l5.add(min*5);
			if(min==l2.get(i)){
				i++;
			}
			if(min==l3.get(j)){
				j++;
			}
			if(min==l5.get(k)){
				k++;
			}
		}
		
		
		return result.get(result.size()-1);
    }
	
	public int getMin(int a,int b,int c){
		int temp=a>b?b:a;
		return temp>c?c:temp;
	}
	
	
	


	public static void main(String[] args) {
		System.out.println(new NthUglyNumber().nthUglyNumber(1352));
	}

}
