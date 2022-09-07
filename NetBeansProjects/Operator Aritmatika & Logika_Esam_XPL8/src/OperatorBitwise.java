public class OperatorBitwise {
    public static void main(String[] args) {
        int a=60;      //111100
        int b=13;      //110101
        int c=0;
        c=a&b;         //001101 -> 2^3+2^2 =8+4+12
        System.out.println("a&b="+c);
        c=a|b;
        System.out.println("a|b="+c);
        c=a^b;
        System.out.println("a^b"+c);
        c=~a;
        System.out.println("~a="+c);
        c = a<<2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);
        c = a >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c);
        c = a>>>2;     /* 215 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);

    }   
    

 
}
