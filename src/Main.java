import java.util.Scanner;

public class Main 
{
	
	public static void main(String args[])
	{
		int c;
		Array ar = new Array();

		do{
			System.out.println("1 Insert Array \n2.Print Array \n3.Insert \n4.Delete \n5.Search \n6.Sorting");
		
		System.out.println("Enter choice");
		Scanner sc = new Scanner(System.in);
		 c = sc.nextInt();

		
		
		switch(c)
		{
		case 1: 			
			ar.getData();
			break;
		case 2:
			ar.putData();
			break;
		case 3:
			ar.Insert();
			break;
		case 4:
			ar.Delete();
			break;
		case 5:
			ar.Search();
			break;
		case 6:
			ar.Sorting();
			break;
		default:
			System.out.println("Invalid Case");
			break;
		}
		}while(c!=7);
			
		
		
	}
	
	
}
