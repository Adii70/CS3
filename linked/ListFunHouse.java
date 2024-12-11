package linked;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   String str = "";
	   while (list.getNext()!= null){
		   str += list.getValue() + "\n";
		   list = list.getNext();
	   }
	   str += list.getValue();
	   System.out.println(str);
   }
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
   	int count=0;
	   while (list.getNext() != null){
		   count++;
		   list = list.getNext();
	   }
	   count++;
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode bob = new ListNode(list.getValue(),list.getNext());
		list.setNext(bob);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		ListNode prev;
		while (list.getNext() != null){
			list = list.getNext();
		}
		if (list.getValue() != null){
			prev = new ListNode(list.getValue(),null);
			list.setNext(prev);
		}

	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{

		while (list.getNext() != null){
			if (list.getNext().getNext()!=null){
				list = list.getNext().getNext();
			}
		}
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count=1;
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{

	}		
}