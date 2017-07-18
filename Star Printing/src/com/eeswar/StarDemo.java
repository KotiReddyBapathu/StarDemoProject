package com.eeswar;

public class StarDemo {
	public void display(int rows){
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}
