import java.io.IOException;
/**
 * Copyright (c) 2015 youyizy.com. All rights reserved.
 * 
 * Modified log:
 * ----------------------------------
 * 2015��11��5�� Ver.1.0 Micheal Created.
 */

/**
 * 
 * @author Micheal.
 * @Time 2015��11��5��
 * @Version 1.0
 */
class Exec{
	/**
	 * 
	 * @param args
	 * @throws IOException<br>
	 * @author Guogongpu, 2015��11��5��.<br>
	 */
    public static void main(String args[]) throws IOException{
       Runtime.getRuntime().exec("ls");

    }
}
