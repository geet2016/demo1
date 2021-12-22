package com.example.demo1;

import java.util.*;

public class ListCheck {
public static void main(String args[])
{
	List<String> list=new ArrayList<String>();
	int cindex=1;
	list.add("a");list.add("b");list.add("c");
	list.add("d");list.add("e");list.add("f");
	for(String s:list)
	{
		
			System.out.println("cindex:"+cindex+" ,list.size(): "+list.size());
		
		cindex++;
	}
}
}
