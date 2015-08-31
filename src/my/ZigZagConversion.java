package my;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	
	public String convert(String s, int numRows) {
        StringBuffer[] strs=new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
        	strs[i]=new StringBuffer();
        }
       
        for(int i=0;i<s.length();i++){
        	strs[i%(numRows+1)!=numRows?i%(numRows+1):numRows/2].append(s.charAt(i));
        }
        
        StringBuffer result=new StringBuffer();
        for(int i=0;i<numRows;i++){
        	result.append(strs[i].toString());
        }
		
		return result.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(new ZigZagConversion().convert("PAYPALISHIRING", 3));
	}

}
