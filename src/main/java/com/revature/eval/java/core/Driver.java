package com.revature.eval.java.core;

public class Driver {

	int keys[] = new int[100];
	String values[] = new String[100];

	public void add(String s) {

		boolean duplicate = false;
		String s1 = s.toLowerCase();
		int h1 = s1.hashCode();

		for (int i = 0; i < keys.length; i++) {
			if (h1 == keys[i]) {
				duplicate = true;
				break;
			}
		}


		if (duplicate == false) {
			for (int i = 0; i < keys.length; i++) {
				if (keys[i] == 0) {
					keys[i] = h1;
					values[i] = s;
					break;
				}
			}
		}

	}

	public void remove(String s) {

		String s1 = s.toLowerCase();
		int h1 = s1.hashCode();

		for (int i = 0; i < keys.length; i++) {
			if (h1 == keys[i]) {
				keys[i] = 0;
				values[i] = null;
			}
		}
	}

	public boolean contains(String s) {

		String s1 = s.toLowerCase();
//		int h1 = s1.hashCode();
		boolean containsVal = false;

		for (int i = 0; i < keys.length; i++) {
			if (s1 == values[i]) {

				return containsVal = true;
			}
		}
		return containsVal;
	}

	public boolean isEmpty() {
		boolean empty;
	
			if(keys[0] == 0) {
				empty = true;
			}else 
				empty=false;

		return empty;
	}
	
	public void clear() {

		

		for (int i = 0; i < keys.length; i++) {
				keys[i] = 0;
				values[i] = null;
			}
	}
	
	public static void main(String[] args) {

		Driver d = new Driver();

		String s1 = "sock";
		String s2 = "hat";
		String s3 = "pants";
		String s4 = "undershirt";
		String s5 = "sock";
		String s6 = "undershirt";
		
		d.add(s1);
		d.add(s2);
		d.add(s3);
		d.add(s4);
		d.add(s5);
		d.add(s6);
		
		
		
		System.out.println(d.values[0]);
		System.out.println(d.values[1]);
		System.out.println(d.values[2]);
		System.out.println(d.values[3]);
		System.out.println(d.values[4]);
		System.out.println(d.values[5]);
		
		System.out.println(d.isEmpty());
		
		System.out.println(d.contains("hat"));
		d.clear();
		System.out.println(d.isEmpty());
//		


	}

}
