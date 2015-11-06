/**
 * Copyright (c) 2015 youyizy.com. All rights reserved.
 * 
 * Modified log:
 * ----------------------------------
 * 2015年11月5日 Ver.1.0 Micheal Created.
 */


/**
 * 
 * @author Micheal.
 * @Time 2015年11月5日
 * @Version 1.0
 */
class ShowProperties {
	public static void main(String args[]) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
