/**
 * Copyright (c) 2015 PCgroup. All rights reserved.
 * 
 * Modified log:
 * ----------------------------------
 * 2015年11月5日 Ver.1.0 Guogongpu Created.
 */


/**
 * 
 * @author Guogongpu.
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
