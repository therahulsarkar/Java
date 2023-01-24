

import java.util.*;
public class ArrayString
{
	public static void main(String[] args) {
		String arr[] = {"Rahul", "Astami", "Rohan", "Mintu"};
		
		String x = "Rahul   is a  good      boy";
		String xArr[] = x.split("\\s+");
		String xNew ="";
		
		Arrays.sort(arr);
		
		for(String data: arr){
		    System.out.print(data + " ");
		}
		
		for(String data: xArr){
		    System.out.print(data + "->");
		    System.out.print(xArr.length);
		    xNew = xNew +data + " ";
		}
		    System.out.print("\n"+ xNew);
	}
}
