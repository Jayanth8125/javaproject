package javapro;

import java.util.TreeMap;

public class TreemapExample {
public static void main(String[]args)
{
	TreeMap<Integer,String> marks=new TreeMap<Integer,String>();
	marks.put(10,"jay");
	marks.put(20,"vishnu");
	marks.put(30,"mohan");
	marks.put(40,"irfan");
	marks.put(40,"venky");
	System.out.println(marks);
}
}
