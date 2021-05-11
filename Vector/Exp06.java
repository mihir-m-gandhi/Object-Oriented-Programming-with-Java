/* Program by Mihir Gandhi B1 1611077 */

import java.util.*;

class Exp06
{
public static void main(String args[])
 {
  int choice;
  Scanner sc=new Scanner(System.in);
  Vector v=new Vector();
  for(int j=0; j<args.length; j++)
  {
    v.addElement(args[j]);
  }
  do
  {
    System.out.println("\nEnter number corressponding to what you want to do : ");
    System.out.println("1.Add new item at end \n2.Add new item at specific index \n3.Delete item  \n4.Display \n5.Exit");
    choice=sc.nextInt();
    switch(choice)
    { 
	case 1:
	{
	  Item i=new Item();
	  i.setItem();  
	  i.setId();
	  i.setPrice();
	  v.addElement(i);
	  break;
	}
	case 2:
	{
	  int n;
	  Item i=new Item();
	  System.out.println("Enter the index at which the item is to be added : ");
	  n=sc.nextInt();
	  i.setItem();  
	  i.setId();
	  i.setPrice();
	  v.insertElementAt(i,n);
	  break;
	}
	case 3: 
	{
	  System.out.println("Enter the index of the item to be deleted : ");
	  int index;
	  int k=0;
	  index=sc.nextInt();
	  while(k!=index)
	  {
	    k++; 
	  }
	  v.removeElementAt(k);
	  break;
	}
	case 4:
	{
	  System.out.println(" ");
	  for(int j=0; j<v.size(); j++)
     	  {
	    Item x=(Item)v.get(j);
	    System.out.println("Item: "+ x.getItem() + " \tID: "+ x.getId()+ " \tPrice: "+ x.getPrice());
	  }
	  break;
	}		
   }
  }while(choice!=5);
  System.out.println("Program by Mihir Gandhi B1 1611077");
 }
}

class Item 
{ 
	String item; 
	String id;
	float price;
	Scanner sc=new Scanner(System.in); 
	public String getItem() 
	{ 
		return item; 
	} 
	public void setItem()
	{ 
		String item1;
		System.out.println("Enter the item to be added : ");
		item1=sc.next();
		this.item = item1;
	} 
	public String getId() 
	{ 
		return id; 
	} 
	public void setId() 
	{ 
		String id1;
		System.out.println("Enter the id of the item : ");
		id1=sc.next();
		this.id = id1;
	} 
	public float getPrice() 
	{ 
		return price; 
	} 
	public void setPrice() 
	{ 
		float price1;
		System.out.println("Enter the price of the item : ");
		price1=sc.nextFloat();
		this.price = price1;
	} 
}


