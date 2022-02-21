package a03_연산자;

public class Operation03 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		int result1= num1 < num2 ? 1 : 2;
		//참이면 1 거짓이면 2
		//결과가 1,2(정수)이기 때문에 int
		
		System.out.println(result1);
		
		boolean result2 = num1 > num2 ? true : false;
		//결과가 true,false( boolean) 이기때문에 boolean
		System.out.println(result2);

	}

}
