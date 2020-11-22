package 上机实践3___运算符和表达式和语句;

import java.util.Scanner;
import java.util.Random;
public class AutoGuessNumber {
   public static void main (String args[]) {
	   
      Scanner reader = new Scanner(System.in);
      int cnt = 0;
      Random random = new Random();
      System.out.println("给你一个1至100之间的整数,请猜测这个数");
      int realNumber = random.nextInt(100)+1; //random.nextInt(100)是[0,100)中的随机整数
      int yourGuess = 0;
      System.out.println("要猜的数字是："+realNumber);
      System.out.println("输入您的猜测:");  
      yourGuess = random.nextInt(100)+1;
      cnt ++;
      
      
      int c[] = new int[2];
      if(yourGuess >= realNumber) {
    	  c[0] = 1;
    	  c[1] = yourGuess;
      }
      else {
    	  c[0] = yourGuess;
    	  c[1] = 100;
      }
      
      
      while(yourGuess != realNumber) //循环条件
      {
         if(yourGuess > realNumber)   //猜大了的条件代码
         {
        	 c[1] = yourGuess;
             System.out.println("所猜数字是"+yourGuess+"猜大了,"+"\n"+"再输入一个"+c[0]+"到"+c[1]+"之间的猜测数字:"+"\n");
             yourGuess = random.nextInt(c[1]-c[0]-1)+c[0]+1;
             
             cnt ++;
         }
         else if(yourGuess < realNumber) //猜小了的条件代码
         {
        	 c[0] = yourGuess;
             System.out.println("所猜数字是"+yourGuess+"猜小了,"+"\n"+"再输入一个"+c[0]+"到"+c[1]+"之间的猜测数字:"+"\n");
             yourGuess = random.nextInt(c[1]-c[0]-1)+c[0]+1;
             cnt ++;
         }
      }
      System.out.println("最后一次猜的数字为："+yourGuess+"与要猜的数字"+realNumber+"相等");
      System.out.println("猜对了!"+"一共猜了"+cnt+"次");
   }
}

