
public class AddingIntegerClass {

	
	
	public static String add(int no1,int no2){
		int sum=no1+no2;
		return Integer.toString(sum);
	}
	
	public static void main(String[] args) {
		System.out.println("Addition is: "+ add(12,2));
		System.out.println("Addition is: "+ addThree(12,2,3));
	}
	
	public static Object addThree(int no1, int no2, int no3)
	{
		Object sum=add(no1, no2)+no3;
		return sum;
	}
	
	public static void printAdd(int no1, int no2){
		System.out.println("Addition in PrintAdd method is :"+ add(no1,no2));
	}
}
