/**
 * a tool class 
 * @author micheal
 * @author https://github.com/gongpu
 * 
 */
public class T{

     /**  cut the content by the length
      * @param content
      * @param length
      * @return string 
      *
      */ 
    public static String cutString(String content,int length){
        int len = content.length();
	if(length > len){
	    return content;
	}else{
	    return content.substring(0,length);
	}

    }

    /**
     * some test methods
     * update by micheal 2015-11-04
     */
    public static void main(String args[]){
        String content = "I am from guangzhou where is beauful city!";
	System.out.println(cutString(content,50));
	System.out.println(cutString(content,5));

    }
}
