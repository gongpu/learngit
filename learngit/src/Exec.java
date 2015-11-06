import java.io.IOException;
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
class Exec{
	/**
	 * 
	 * @param args
	 * @throws IOException<br>
	 * @author Micheal, 2015年11月5日.<br>
	 */
    public static void main(String args[]) throws IOException{
       Runtime.getRuntime().exec("ls");

    }
}
