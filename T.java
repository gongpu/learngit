/**
 * Copyright (c) 2015 PCgroup. All rights reserved.
 * 
 * Modified log:
 * ----------------------------------
 * 2015��11��5�� Ver.1.0 Guogongpu Created.
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
	 * @author Guogongpu, 2015��11��5��.<br>
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
	 * @author Guogongpu, 2015��11��5��.<br>
	 */
	public static void main(String args[]) {
		String content = "I am from guangzhou where is beauful city!";
		System.out.println(cutString(content, 50));
		System.out.println(cutString(content, 5));

	}
}
