public class RotatingString {

  public static void main(String[] args) {
    String str1 = "abcde";
    String goal = "cdeab";
    System.out.println(Check(str1, goal));
  }  
  

  static boolean Check(String str ,String goal)
  {
    String copy = str;
    String res= "";
    int len = copy.length();
    for(int i =0; i<len; i++ )
    {   res = copy;
        String element = res.substring(0,1);
        String slice = res.substring(1 ,len );
        res= slice + element;
        copy =res;

          if(res.equals(goal))
           {return true;
           }
    }
    return false;
  }

}


