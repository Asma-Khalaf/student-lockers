import java.util.*;

public class test
{
	public static void main(String [] args)
	{
		LList l=new LList();
		try
		{
			Scanner kb=new Scanner(System.in);
		boolean ans=true;
	do {
		System.out.println("#ENTER THE NUMBER OF SERVICE\n\t1.New register\n\t2.Change password\n\t3.delete locker by name\n\t4.delete locker by ID");
		System.out.println("\t5.Search locker by name\n\t6.Show registered lockers");
		
		
		int choice = kb.nextInt();
		 switch (choice) {
         case 1:
        	 int pass,id;
        	 String name;
        	 //boolean build;
        	 System.out.println("\tEnter your name\n\tYour ID\n\tYour passwors");
			l.newRegister(name=kb.next(),id=kb.nextInt(),pass=kb.nextInt());
             break;
        
         case 2:
         		System.out.println("Enter your name ,old password then the new password");
         		l.changePass(kb.next(),kb.nextInt(),kb.nextInt());
             break;
             
         case 3:
        	 System.out.println("Enter your name to delete your locker");
        	 l.delete(kb.next());
             break;
             
         case 4:
        	 System.out.println("Enter your Id to delete your locker");
        	 l.delete2(kb.nextInt());
             break;
        case 5:
        	System.out.println("Enter your name to search your locker");
        	 l.searchByName(kb.next());
        	break;
        
        	
        case 6:
        	l.print();
        	
        	break;
        default:
        	System.out.println("incorrect input");
		 
		 }				 
		 				 
		 				 
		 System.out.println("#DO YOU NEED ANOTHER SERVICE? (type true if YES and false if NO)");
		 ans=kb.nextBoolean();
		
		
	} while(ans==true);
																			} 
		catch(InputMismatchException e)
		{
			System.out.println("invalid input value!");
		}
	

	}

		private static void lockerNo(int i) {
		// TODO Auto-generated method stub
		
	}
	}

