import java.util.*;
public class noOfDoubleLetters
{
    public static void doubleLetters(String s)
    { 
      char ch=' '; char[] array=new char[s.length()];
      array =s.toCharArray();int j=0;
      outer:
      for(int i=0;i<s.length();i++){
           ch=array[i];
           if(i<(s.length()-1) && Character.isLetter(ch)==true){   
              if(ch==array[i+1]){
                  j++;
                  i++;
            }
           }  
        }
      System.out.println("The no. of double letters are:"+j);
    }
    public static void main(){
      String str=freqOfWord.accept_input();
      noOfDoubleLetters.doubleLetters(str);
    }
}
