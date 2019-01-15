import java.math.BigInteger;
import java.util.Scanner;

public class Main {
   
  public static BigInteger f(BigInteger n1){
		
		BigInteger x1=n1.add(new BigInteger("1"));
		
		BigInteger x2= x1.multiply(n1);
		
		BigInteger x3=n1.multiply(new BigInteger("2"));
		
		BigInteger x4=x3.add(new BigInteger("1"));
		
		BigInteger x5=x2.multiply(x4);
		
		BigInteger x6=x5.divide(new BigInteger("6"));
		
		return x6;
  }
   
  public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++){
        
			BigInteger n1=in.nextBigInteger(); 
			
			BigInteger n2=in.nextBigInteger();
			
			n1=n1.subtract(new BigInteger("1"));
			
			BigInteger s3=f(n2).subtract(f(n1));
			
			BigInteger s4=s3.divide(new BigInteger("10"));
			
			BigInteger s5=s4.multiply(new BigInteger("10"));
			
			System.out.println("Case "+i+": "+s3.subtract(s5));
			
		}
  }
}