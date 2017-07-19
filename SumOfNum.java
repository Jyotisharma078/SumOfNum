public class SumOfNum {
    public static void main(String[] args) {
      int randnum = 0;
      int sum=0;
      for(int i=0;i<=1;i++){
      randnum = (int)(Math.random()*100);
    	System.out.println("Random no is  "+randnum);            
    	sum = randnum + sum;
      }
      System.out.println("sum of two digit no is "+sum);            
    }
}