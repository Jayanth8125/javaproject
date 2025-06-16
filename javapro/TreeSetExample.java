package javapro;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[]args)
	{
		TreeSet<Integer> marks=new TreeSet<Integer>();
		marks.add(10);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		marks.add(20);
		marks.add(40);
		System.out.println(marks);
	}

}
