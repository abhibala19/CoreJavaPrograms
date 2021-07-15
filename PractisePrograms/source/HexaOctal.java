public class HexaOctal {
        public static void main(String[] args) {
            int a = 0xABCD;
            int b = 030;
            System.out.println(a +" "+ b);
            int f=10;
            int d=20;
            long c=(long)d+f;
            System.out.println(c);
            byte g=20;
            int e=g+20;
            System.out.println(e);
            short h=20;
            int i=g+h;
            System.out.println(i);       
            float j=2^63-1;
            System.out.println(j);
            long k=(long)d-f;
            System.out.println(k);           
            int l=5;
            long m=(long)d*l;
            System.out.println(m); 
            int n=26;
            int o=n/3;
            System.out.println("quotent" + o);
            int p=(n%3);
            System.out.println("remainder " + p);
            System.out.println(1+2*5/2-2*4);
            System.out.println(1*2*5-2+24);
            System.out.println(1+2/5/2/2-4);
            System.out.println(10);
            System.out.println("012 => "+012);
            System.out.println(0xAB);
            int q=6;
            System.out.println(f|q);
            int a1=100;
            int a2=50;
            System.out.println(a1|a2);
            System.out.println(f&q);
            System.out.println(a1&a2);
            System.out.println(f^q);
            System.out.println(a1^a2);
            int b1=-10;
            System.out.println(f>>>2);
            System.out.println(b1>>>2);
            System.out.println(4|3);
            System.out.println(4|4);
            System.out.println(4&3);
            System.out.println(4/3);
            System.out.println(1==1?5:6);
            System.out.println(1==2?5:6);
            System.out.println(1==1?true:false);
            System.out.println(1==2?true:false);
            System.out.println(true?false:true);
            System.out.println(true?true:false);
            char b2='X';
            int b3=0;
            System.out.println(true?b2:0);
            System.out.println(false?b3:b2);
            int a3=50;
            while(a3!=0){
                System.out.println(a3>>>=1);
        }
            }
} 