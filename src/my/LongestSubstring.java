package my;
 
class LongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int [] result=new int[256];
		int max=0;
		int length=0;
		//int j=0;
        for(int i=0;i<s.length()-max;i++)
        {
        	 for(int k=i+(length>0?length-1:0);k<s.length();k++)
              {
	        	if(result[s.charAt(k)]==0){
	        		result[s.charAt(k)]=1;
	        		length++;
	        		//System.out.println((++j)+"----");
	        	}
	        	else{
	        		if(max<length)max=length;
	        		result[s.charAt(i)]=0;
	        		/*for(int p=0;p<result.length;p++){
	        			result[p]=0;
	        		}*/
	        		//length--;
	        		break;
	        	}
              }
        }
      
		return length>max?length:max;
    }
	
	public static void main(String[] args) {
		System.out.println(new LongestSubstring().lengthOfLongestSubstring("abcdadsaetewrtvwe5yb66e56yub7b5i8b768n tyhsertwe4tvwesete56ygv4yuecsfcge567uni er6n7rn758m 87rsfds"));
	}
}
