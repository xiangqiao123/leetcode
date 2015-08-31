package my;

public class IsUgly {
	
	public boolean isUgly(int num) {
        
		if(num<=0){
			return false;
		}
		while(num>1){
			if(num%5==0){
				num=num/5;
			}else if(num%3==0){
				num=num/3;
			}else if(num%2==0){
				num=num/2;
			}else{
				return false;
			}
		}
		
		return true;
    }

	public static void main(String[] args) {
		System.out.println(new IsUgly().isUgly(0));

	}

}
