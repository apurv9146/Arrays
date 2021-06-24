import java.util.Scanner;

public class Array {
	 int Array1[] = new int[10];
	 int n;
	 Scanner sc = new Scanner(System.in);
	 
	 public void getData()
		{
			System.out.println("Enter numbers of element in array");
			n = sc.nextInt();
			System.out.println("Enter elements of array ");
			for(int i=0;i<n;i++)
			{
				Array1[i]=sc.nextInt();
			}
		}
		
	 public void putData()
		{
			System.out.println("Elements of Arrays Are: ");
			for(int i =0;i<n;i++)
			{
				System.out.println(Array1[i]+" ");
			}
		}
	 
	 public void Insert()
	 {
		 System.out.println("Enter the location where you want to Enter: ");
		 int loc = sc.nextInt();
		 System.out.println("Enter the element to be inserted ");
		 int ele = sc.nextInt();
		 for(int i=n-1;i>=loc-1;i--)
		 {
			 Array1[i+1] = Array1[i];
		 }
		 Array1[loc-1]=ele;
		 

		 n = n+1;
	 }
	 
	 public void Delete()
	 {
		 System.out.println("Enter the location of element to be deleted");
		 int loc = sc.nextInt();
		 loc = loc-1;
		 for(int i =loc;i<n-1;i++)
		 {
			 Array1[i]=Array1[i+1];
		 }
		 n=n-1;
	 }
	 
	 public void Search()
	 {
		 System.out.println("Enter the element to search");
		 int ele = sc.nextInt();
		 int temp = -1;
		 for(int i =0;i<n;i++)
		 {
			 if(ele==Array1[i])
			 {
				 temp = i;
			 }
		 }
		 if(temp==-1)
		 {
			 System.out.println("not found");
			 return;
		 }
		 temp = temp+1;
		 System.out.println("element " +ele + " found at " + temp);
	 }
	 
	 public void Sorting()
	 {
		 int temp=0;
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j =i+1;j<n;j++)
			 {
				 if(Array1[i]>Array1[j])
				 {
					 temp = Array1[i];
					 Array1[i] = Array1[j];
					 Array1[j] = temp;
						
				 }
			 }
		 }
		 
		 
	 }
}
