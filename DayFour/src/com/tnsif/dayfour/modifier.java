package com.tnsif.dayfour;

import com.tnsif.dayfour.modifiers.Base;

public class modifier {

	public static void main(String[] args) {
		Base b1 = new Base();
		// b1.methodDefault(); will show error
		b1.methodProtected();

	}

}
