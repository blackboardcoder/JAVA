package Control_Statement;

public class NESTED_SWITCH {

	public static void main(String[] args) {
		
		int V=3;
		switch(V)
		{
		case 1:System.out.println("case-1");
		break;
		case 2:System.out.println("case-2");
		break;
		case 3: 
		switch(V) 
		 {
		case 3:System.out.println("case-3");
		break;
		 }
		break;
		}
	}

}
//Author: Krishna