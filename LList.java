/* this program serves as a database for student lockers in schools , students can look for the desired locker-place if 
   possible/avalible , set or change passwords, delete Locker by name,.... */
   
   //new register method 
   //delete by name method
   //delete by id method
   //method to print all lockers registerd
   //give lockers randomly								
   //instead of pasword, make an array of lockers avalible 
   
   
import java.util.*;   
public class LList
{
	public Node head, tail;
	public LList()
		{
			head=tail=null;
		}


public boolean isEmpty()
		{
			return head==null;
		}
		
		
		
public void newRegister(String name,int id, int pass)   
{
	
if (IdNo(id))
{
	if(head==null)
		head =tail= new Node (name,id,pass,head);
		else
		{
			Node p,t;
			for(p=head,t=head.next;t!=null;p=p.next,t=t.next);
			if(t!=null)
				p.next=new Node(name,id,pass,t);
				else 
					tail.next=tail=new Node(name,id,pass,null);
		}
	
	System.out.print("\tyour locker number is ");
	lockerNo(100);
	System.out.println();
}
else System.out.println ("incorrect ID number");

}

	//method to tell the user if he enterd ID with more or less than 8 digits
		public boolean IdNo(int a)  
	{
		return a<45000000 && a>10000000;
			
	} 	


	public void print()
		{
	   
	            Node t;
	            if(isEmpty())
	            	System.out.print("No registerd Lockers in the list to show\n");
	            		else{
	            		
	            for( t=head;t!=null;t=t.next)
	            {
	               
	                System.out.println("Name: "+t.name);
	                System.out.println("ID Number: "+t.id);
	                
	            }}
	    }
			
//method to search student lockers by name ;

	public void searchByName(String a)
		{
			Node t;
			for (t=head ; t!=null && !(a.equalsIgnoreCase(t.name)); t=t.next);
			if(t==null)
				System.out.println(a+ " Locker is Not Found in the list");
			else
				System.out.println(a+ " Locker is Found in the list");
			
			
			
		}


		
  //method to delete a locker with a particular value NAME
   public void delete(String a)
  {
      if (isEmpty())
      System.out.println("No Lockers to remove from the list");
      else
        {
			if (head==tail && head.name.equals(a))
				head=tail=null;
			else if (head.name.equals(a))
				head=head.next;
			else
				{
					Node p,t;
					for (p=head ,t=head.next ; t!=null && !t.name.equals(a) ; p=p.next , t=t.next);
						if (t==null)
							System.out.println("Locker with the name "+a+" is not found");
								else
									{
										p.next=t.next;
										if(tail==t)
										tail=p;
										System.out.print("Locker with name "+a+" is deleted sucessfully from the list\n" );
									}
				}
		}
	}
	
	//method to delete a locker with a particular value ID
   public void delete2(int a)
  {
      if (isEmpty())
      System.out.println("No Lockers to remove from the list");
      else
        {
			if (head==tail && head.id==a)
				head=tail=null;
			else if (head.id==a)
				head=head.next;
			else
				{
					Node p,t;
					for (p=head ,t=head.next ; t!=null && t.id!=a ; p=p.next , t=t.next);
						if (t==null)
							System.out.println("Locker number "+a+" is not found");
								else
									{
										p.next=t.next;
										if(tail==t)
										tail=p;
										System.out.print("Locker number "+a+" is deleted sucessfully from the list" );
									}
				}
		}
	}


//method to generate lockers numbers randomly  from  0 to 100

    public void lockerNo(int a)
    {
    	ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		Random generate= new Random();
        int random= generate.nextInt(100);
    	if (!numbers.contains(random))// this condition to prevent reapeated numbers
        numbers.add(random);          // so the numbers will be given uniqely for each student
    	System.out.print(random+" ");
    	
    }
    
    
    
    
	public void changePass(String a,int oldp,int newp)
	{
	 	Node t;
		for (t=head ; t!=null && !(a.equalsIgnoreCase(t.name)); t=t.next);  
		if (t.password==oldp)
		{
			t.password=newp;
			System.out.println("Your new password is: "+newp);
		}
		else 
			System.out.println("Wrong password, cannot change");
	} 
		
	
    
}