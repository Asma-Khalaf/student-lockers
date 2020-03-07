public class Node
{
	public String name;
	public int id;
	public int password;
	public char building;
	
	public  Node next;
	
	
		public Node(String a,int b,int c)
		{
			this(a,b,c,null);
			}
			
		public Node(String a,int b,int c, Node e)
		{
			name=a;
			id=b;
			password=c;
			
			next=e;
			
			}
			
	}