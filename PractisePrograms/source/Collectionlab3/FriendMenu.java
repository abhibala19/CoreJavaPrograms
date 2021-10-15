package Collectionlab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FriendMenu {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
			List<String> names=new ArrayList<String>();
			int ch=0;
			String str;
			StringLengthComparator slc=new StringLengthComparator();

			while(ch!=5)
				
			{
				System.out.println("press 1 to add friend name ");
				System.out.println("press 2 to list friend names");
				System.out.println("press 3 remove friend name");
				System.out.println("press 4 to search for friend name given partString");
				System.out.println("press 5 to sort friend name based on 1.alphabetical 2.lengthwise");
				System.out.println("enter your choice");
				ch=sc1.nextInt();
				System.out.println("choice entered "+ch);
				switch(ch)
				{
				case 1:
					System.out.println("adding your friend name");
					System.out.println("enter your friend name");
					str=sc1.next();
					names.add(str);
					break;
				case 2:
					System.out.println("listing your friends names");
					System.out.println(names);
					break;
				case 3:
					System.out.println("removing a friend name you have given");
					System.out.println("enter your friend name to remove");
					str=sc1.next();
					names.remove(str);
					break;
				case 4:
					System.out.println("searching");
					System.out.println("give partString");
					str=sc1.next();
					for(String s:names)
					{
						if(names.contains(str))
							System.out.println("match found "+ s);
						else
							System.out.println("match not found ");
					}
					break;
				case 5:
					System.out.println("sorting");
					Set l2=new TreeSet(names);
					Collections.sort(names,slc);
					System.out.println(l2);
					System.out.println(names);
					break;
					default:
						System.out.println("choices are between 1 to 5");

					
					
					
					}
				}
			}
}

