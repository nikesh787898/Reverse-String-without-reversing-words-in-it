import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//
		int n;
		Scanner sn = new Scanner(System.in);
		n = Integer.parseInt(sn.nextLine());
		while(n-- > 0 )
		{
		    String output = "";
		    String str = sn.nextLine();
		    str = new StringBuilder(str).reverse().toString();
		    String tempArr [] = str.split("\\.");
		    for(int i = 0 ; i < tempArr.length ; i++ )
		    {
		        tempArr[i] = new StringBuilder(tempArr[i]).reverse().toString();
		        output += tempArr[i] + ".";
		    }
		    if(output.length()  > 1)
		    System.out.println(output.substring(0,output.length()-1));
		    else
		    System.out.println("");
		}
		
	}
}
