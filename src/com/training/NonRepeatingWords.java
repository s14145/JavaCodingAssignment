package com.training;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class NonRepeatingWords {

	public static void main(String[] args) {
		
		String s1="I have a blue pen. I got a red pen.";
		StringBuilder str1=new StringBuilder(s1);
		
		String[] words=str1.toString().split(" ");
		
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
		for(int i=0;i<words.length;i++) {
			if(hs.contains(words[i]))
				hs.remove(words[i]);
			else {
				hs.add(words[i]);
			}
		}
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}

	}

}
