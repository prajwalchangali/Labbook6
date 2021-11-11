package Labbook6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise1 {
	
public static List<String> getValues(int n) {
		
		TreeMap<Integer, String> hMap = new TreeMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter Key (Integer) : ");
			int k = sc.nextInt();
			System.out.println("Enter Value (String) : ");
			String v = sc.next();
			hMap.put(k, v);
		}
		sc.close();
		
		List<String> valList = new ArrayList<String>(hMap.values());
		
		return valList;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many pairs you want to enter in HashMap : ");
		int n = sc.nextInt();
		List<String> newList = Exercise1.getValues(n);
		
		for(int i = 0 ; i < newList.size() ; i++) {
			System.out.print(" " + newList.get(i));
		}
		
	}
	
}
