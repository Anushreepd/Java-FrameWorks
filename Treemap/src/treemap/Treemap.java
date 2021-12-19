package treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Treemap {
String state,capital;

TreeMap<String,String>dict = new TreeMap<String,String>();
void set(String state,String capital)
{
	dict.put(state, capital);
}
void get()
{
	for(Map.Entry<String, String> word : dict.entrySet())
	{
		System.out.print(word.getKey());
		System.out.println(word.getValue());
	}
}
void search(String key)
{
	if(dict.containsKey(key))
	{
		System.out.println("Key founded");
		
	}
	else
	{
		System.out.println("Key not founded");
	}
}

public static void main(String[] args)
{
	Treemap obj = new Treemap();
	Scanner sc = new Scanner(System.in);
	System.out.println("1----add values");
	System.out.println("2----display values");
	System.out.println("3----search values");
	
	while(true)
	{
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 01:   System.out.println("Enter the state");
		       		String state = sc.next();
		       		System.out.println("Enter the capital");
		       		String capital = sc.next();
		       		obj.set(state, capital);
		       		break;
		       		
		case 02:	System.out.println("State and capital"); 
					obj.get();
					break;
					
		case 03:	System.out.println("Searching");	
					System.out.println("Enter the state to search");
					String key = sc.next();
					obj.search(key);
					break;
		default:   System.out.println("invalid choice");
					break;

		}
	}
}
}
