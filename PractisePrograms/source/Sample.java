
public class Sample{
    public static void main(String[] args)
     {
         //UseOfByte();
         //Divide();
    //     int num=12345;S
       String s =isPerfecrSquare(24);
       System.out.println("the num is perfect square "+s);
       // riseChar();
         //sumOfDigit(456);
    //    DivisibleByThreeOrFive(1);
         // UseOfShift();
        //printEvenOrOdd(1, 100);
    }


    /* 8) Print "even" and the number or "odd" and the number between 1-100 */
   /*  public static void printEvenOr
   Odd(int from, int to) {
        for (int i=from; i<=to; i++){
            if(i%2==0) {
                System.out.println("even " + i);
            } else {
                System.out.println("odd " + i);
            }
        }
    */
     /* public static void DivisibleByThreeOrFive (int from)
     {
         while(from<=100)
         {
             if((from%3==0)^(from%5==0))
            {
               System.out.println("divisible by 3or 5"+ from);
            }
         from++;

        }

     } */
/*      public static void UseOfShift()
     {
         int i=100;
         int a=i<<1;
         System.out.println("multiply by 2 "+a);
         int a1=i<<2;
         System.out.println("multiply by 4 is"+a1);
         int a3=i<<3;
         System.out.println("multiply by 8 is"+a3);
         int b=i>>1;
         System.out.println("divide by 2"+b);
         int b1=i>>2;
         System.out.println("divide by 4 is"+b1);
         int b3=i>>3;
         System.out.println("divide by 8 is"+b3); 
              
      }*/
              /*    public static void Divide()
      {
          int a=25;
          int b=3;
          int c=a/b;
          int d=a%b;
          System.out.println("the quotient is" + c);
          System.out.println("the remainder is" + d);
          
      }
 *//* 
   public static void UseOfByte()
   {
       byte b=127;
       int b1=(b+10);
       System.out.println("byte value is" +b1);
   } */
/* 
   public static int sumOfDigit(int number)
   {
       int sum=0;
       if(number<9)
       {
         sum=number;
         System.out.println("sum of digit"+number +"is"+number);
         return sum;
        }       
                 
        int quotient=0;
        int remainder=0;
                while(number>=10)
                {
                    quotient=number/10;
                    remainder=number%10;
                    sum=sum+remainder;
                    number=quotient;
                    if(quotient<10)
                    {
                        sum=sum+quotient;
                        if(sum>=10){
                        number=sum;
                        sum=0;
                        }
                    }

                }
        System.out.println("sum is"+sum);
        return sum;    
   } */
/* 
   public static void riseChar()
   {
       char c='a';
       System.out.println("asc"+c++);
       int i=c;
       System.out.println("the symbol is"+c );
       System.out.println("the number is"+i );
       int j=i+25;
       for(i=c;i<=j;i++)
       {
            System.out.println("the  next number is"+i );
            c=(char)i;
            System.out.println("the  next symbol is"+c);
       }

       


   } */


   public static String isPerfecrSquare(int num)
   {
       if(num<0)
            return "invalid";
       if(num==0)
        return "no";
       if (num==4|num==9|num==1)
         return "yes";
       for(int i=4;i<=num;i++)
       {
       if((i*i)==num)
       return "yes";
       }
        return "no";
       
   }
}




































            
     
    

