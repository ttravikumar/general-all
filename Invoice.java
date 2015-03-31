package invoice;

import java.util.*;

public class Invoice {

	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String name;
		Itemdata ob = new Itemdata();
		ob.get();
		System.out.print ("\n\t Enter Item Name = ");
		name=in.nextLine();
		ob.cost();
		ob.displyLine(name);

	}



}
 
