package Á¤¸®;

import java.util.List;
import java.util.ArrayList;

public class OverTest_Param {
	static public void callAA(AA ref) {
		System.out.println("callAA(AA ref) ");
		ref.m1();
	}

	static public void callAA(SubAA ref) {
		System.out.println("callAA(SubAA ref) ");
		ref.m1();
	}

	static public void callAA(SubAASub ref) {
		System.out.println("callAA(SubAASub ref) ");
		ref.m1();
	}

	public static void main(String[] args) {

		callAA(new SubAA());
		System.out.println("/////////");

		callAA(new BBAA());

	}
}
