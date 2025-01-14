package emp.utils;
import java.util.*;
import emp.exceptions.InvalidChoiceException;

public class Menu{
	private static int maxChoice;
	public static int readChoice(int max){
		maxChoice = max;
		while(true){
			System.out.print("Enter choice : ");
			try{
				int choice = new Scanner(System.in).nextInt();
				if(choice < 1 || choice > maxChoice){
					throw new InvalidChoiceException();
				}
				return choice;
			}
			catch(InputMismatchException e){
				System.out.println("Please enter number only");
			}
			catch(InvalidChoiceException e){
				e.displayMessage(maxChoice);
			}
		}
	}
}