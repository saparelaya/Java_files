package org.tns.capgemini.c2tc.Generics;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List list=(List) new ArrayList();
		list.add("abc");
		list.add(new Integer(5));
		for(Object obj : list){
			
		    String str=(String) obj; 
		}


	}

}