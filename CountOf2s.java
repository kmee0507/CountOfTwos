import  java.util.*;
public class CountOf2s {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int numberOfTwos = 0;
		
		for(int i = 0; i<= num;i++){
			String number = String.valueOf(i);
			char[] digits = number.toCharArray();
			for (int j = 0;j<digits.length;j++){
				if(digits[j] == '2')
					numberOfTwos+=1;
			}
		}
		System.out.println("The number of twos between 0 and " + num + " is: "
				+ numberOfTwos);
	}

}
