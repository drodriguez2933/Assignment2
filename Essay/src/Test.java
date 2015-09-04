import java.util.Scanner;

public class Test {

	public static void main(String Args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int gram = 0;
		int spell = 0;
		int cont = 0;
		int total;
		int flag = 0;
		
		while (flag != 1){
		
		System.out.println("How many points did the student get for grammar?");
		gram= scan.nextInt();
		
			if (gram <= 25 && gram >= 0){
					flag += 1;
			}
			else {
				System.out.println("The score you entered is not valid. Please enter a number between 0 and 25.");
			}
		}
		
		flag = 0;
		
		while (flag != 1){
			
			System.out.println("How many points did the student get for spelling?");
			spell = scan.nextInt();
		
			if(spell <= 35 && spell >= 0){
					flag += 1;
			}
			else {
				System.out.println("The score you entered is is not valid. Please enter a number between 0 and 35.");
			}
		}
		
		flag = 0;
		
		while (flag != 1){
		
			System.out.println("How many points did the student get for content?");
			cont = scan.nextInt();
		
			if(cont <= 40 && cont >= 0){
				flag += 1;
			}
			else{
				System.out.println("The score you entered is is not valid. Please enter a number between 0 and 40.");
			}
		}
		
		total = gram + spell + cont;
		
		Essay essay = new Essay(gram, spell, cont, total);
		
		System.out.println(essay.toString());
		
		scan.close();
	}
	
	
}
