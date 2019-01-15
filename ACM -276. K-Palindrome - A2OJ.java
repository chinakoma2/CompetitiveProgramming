import java.util.Scanner;

public class Main {
  public static Boolean f(String ch,char c){
      int j=0;
      for(int i=0;i<ch.length();i++){
          if(ch.charAt(i)==c) j++;
      }
      if(j % 2==1)
          return true;
      else
          return false;
  }
  public static String f2(String ch){
      String chr="";
      for(int i=0;i<ch.length();i++){
          if(chr.indexOf(ch.charAt(i))==-1)
              chr+=ch.charAt(i);
      }
      return chr;
  }
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        for(int i=0;i<n;i++){
          Scanner sc=new Scanner(in.nextLine());
          int te=Integer.parseInt(sc.next());
          String ch=sc.next();
          String cht=f2(ch);
          int k=0;
          for(int j=0;j<cht.length();j++){
              if(f(ch,cht.charAt(j)))
                  k++;
          }
          if(te<=ch.length() && k<=te){
              System.out.println("YES");
          }
          else
              System.out.println("NO");
          }
        }
        
        
    }