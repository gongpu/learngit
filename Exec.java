import java.io.IOException;
/**
 * Copyright (c) 2015 PCgroup. All rights reserved.
 * 
 * Modified log:
 * ----------------------------------
 * 2015年11月5日 Ver.1.0 Guogongpu Created.
 */

/**
 * @author Guogongpu.
 * @Time 2015年11月5日
 * @Version 1.0
 */
class Exec{
	/**
	 * 
	 * @param args
	 * @throws IOException<br>
	 * @author Guogongpu, 2015年11月5日<br>
	 */
    public static void main(String args[]) throws IOException{
       Runtime.getRuntime().exec("ls");

    }
}
