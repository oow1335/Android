public class AndroidDriver{
	public static void main (String[] arg) {
		Android phone = new Android ("Nokia","Black","Zeus",2014);
		System.out.println("Make: " + phone.make + " Color: " + 
			phone.color + " Model: " + phone.model + 
			" Year: " + phone.year);
		Android tab = new Android ();
		System.out.println("Make: " + tab.make + " Color: " +
                        tab.color + " Model: " + tab.model +
                        " Year: " + tab.year);

	}	
}
