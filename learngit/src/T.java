/**
 * Copyright (c) 2015 youyizy.com. All rights reserved.
 * 
 * Modified log:
 * ----------------------------------
 * 2015年11月5日 Ver.1.0 Micheal Created.
 */


/**
 * a tool class
 * 
 * @author micheal
 * @author https://github.com/gongpu
 */
public class T {

	/**
	 * 
	 * @param content
	 * @param length
	 * @return<br>
	 * @author Guogongpu, 2015年11月5日.<br>
	 */
	public static String cutString(String content, int length) {
		int len = content.length();
		if (length > len) {
			return content;
		} else {
			return content.substring(0, length);
		}
	}

    /**
     * 
     * @param args<br>
     * @author Guogongpu, 2015年11月5日.<br>
     */
	public static void main(String args[]) {
		String content = "I am from guangzhou where is a beauful city!";
		System.out.println(cutString(content, 50));
		System.out.println(cutString(content, 5));

	}
}
