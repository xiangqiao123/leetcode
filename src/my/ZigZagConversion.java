package my;

public class ZigZagConversion {
	
	public String convert(String s, int numRows) {
        StringBuffer[] strs=new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
        	strs[i]=new StringBuffer();
        }
       int index=0;
       int flag=0;
        for(int i=0;i<s.length();i++){
        	strs[index].append(s.charAt(i));
        	if(index==0 && index!=numRows-1){
        		flag=1;
        	}else if(index !=0 && index==numRows-1){
        		flag=-1;
        	}
        	index=index+flag;
        }
        
        StringBuffer result=new StringBuffer();
        for(int i=0;i<numRows;i++){
        	result.append(strs[i].toString());
        }
		
		return result.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(new ZigZagConversion().convert("AB", 1));
	}

}
