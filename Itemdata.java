package invoice;

import java.util.Scanner;

public class Itemdata {

	public Itemdata() {
		// TODO Auto-generated constructor stub
	}
	Scanner in = new Scanner (System.in);
	String category;
	double quantity,price,tcost=0;
	void get()
	{
		System.out.print ("\n\t Enter item type (N for neccessary or L for luxury) = ");
		category =in.next().toString();
	}

	void cost()
	{
		System.out.print ("\n\t Enter item quantity = ");
		quantity=in.nextDouble();
		System.out.print ("\n\t Enter item price per unit = ");
		price=in.nextDouble();
		if ( category.toUpperCase().equals("N") )
		{ tcost=quantity*price;
		    tcost=tcost + tcost * .01 ;
		}
		else if ( category.toUpperCase().equals("L") )
		{
			tcost=quantity*price;
		    tcost=tcost + tcost * .09 ;
		}
    }

	void displyLine(String name)
	{
		System.out.println ("\n\t Item Name = "+name);
		if ( category.toUpperCase().equals("N") )
			System.out.println ("\n\t Item Category = Necessary");
		else if ( category.toUpperCase().equals("L") )
			System.out.println ("\n\t Item Category = Luxury");
		System.out.println ("\n\t Item quantity = "+quantity);
		System.out.println ("\n\t Item price per unit = "+price);
		System.out.println ("\n\t Total cost = "+tcost);
		}


}
