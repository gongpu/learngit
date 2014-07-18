/**
  * a tool class 
  * @author micheal
  * @time 2014-7-18
  * 
  */
class T{
     /**  cut the content by the length
       * @param content
       * @param length
       * return 
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
      *
      */
    public static void main(String args[]){
        String content = "I am from guangzhou where is beauful city!";
	System.out.println(cutString(content,5));

    }

}
