
//3.	Write a Java program that:
// 1.	Takes two integer inputs from the user: a and b.
// 2.	Performs the following operations and prints the results:
// a.	Sum of a and b.
// b.	Bitwise AND of a and b.
// c.	Bitwise OR of a and b.
// d.	Bitwise XOR of a and b.
// e.	Left shift a by 2 bits.
// f.	Right shift b by 3 bits.
// g.	Logical AND between the conditions (a > 10) and (b < 20).
// h.	Logical OR between the conditions (a % 2 == 0) and (b % 2 != 0).

class BitwiseOperations {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first a:");
        int a=sc.nextInt();
        System.out.println("enter second number b");
        int b=sc.nextInt();
        int sum=a+b;
        int BitwiseAND=a&b;
        int bitwiseor=a|b;
        int bitwiseXOR= a^b;
        int leftshift= a<<2;
        int rightshift=b>>3;
        boolean logicaland=(a>10)&&(b<20);
        boolean logicalor=(a%2==0)||(b%2!=0);
        System.out.println("sum of a and b:"+sum);
        System.out.println("Bitwise AND of a and b:"+BitwiseAND);
        System.out.println("Bitwise OR of a and b:"+bitwiseor);
        System.out.println("Bitwise XOR of a and b:"+bitwiseXOR);
        System.out.println("Left shift a by 2 bits:"+leftshift);
        System.out.println("Right shift b by 3 bits:"+rightshift);
        System.out.println("Logical AND between the conditions (a > 10) and (b < 20):"+logicaland);
        System.out.println("Logical OR between the conditions (a % 2 == 0) and (b % 2 != 0):"+logicalor);   
        sc.close();


    }


}
