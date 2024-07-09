import java.util.*;

public class Main{
    public static void main(String args[]){
        // System.out.print("hello world");
        // System.out.println("hello world");
        // System.out.println("hello world");
        
        // byte a = 10;
        // System.out.println(a);
        
        // char ch = 'a';
        // System.out.println(ch);
        
        // boolean bool = false;
        // System.out.println(bool);
        
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        
        // String name1 = sc.nextLine();
        // System.out.println(name1);
        
        int b, c;
        System.out.print("enter value of b: ");
        b = sc.nextInt();
        System.out.print("enter value of c: ");
        c = sc.nextInt();
        int sum = b + c;
        System.out.print("the sum of " + b + " and " + c + " is " + sum);
    }
}

/*
identifiers : name given to the programming elements, used for the identification purpose

data types: primitive and non primitive

primitive (byte, char, boolean, int, short, long, float, double)
non primitive (String, Array, Class, Object, Interface) 

size of data types: 
byte : 1 byte (-128 to 127)
short : 2 bytes
char : 2 bytes
boolean : 1 bytes
int : 4 bytes
long : 8 bytes
float : 4 bytes
double : 8 bytes

input in java:
next: to store string util and space or new next
nextLine: to store the sentences
nextInt : 
nextByte:
nextFloat:
nextDouble:
nextBoolean:
nextShort:
nextLong:

order of size:
byte > short > int > float > long > double

type conversion: implicit conversion and explicit conversion(type casting)

suppose we add mutiple types of data in one so the data get converted  to the longest possible type(if the vlaue is stored in it itself) otherwise you have to type casting: eg, int a, float b, double c, long d, double sum = a+b+c+d; so ultimatily everthing is converted to double 

type promotion in expression : byte b = 2; b = b * 2; here b is converted into int and now int b is multiplied to 2 and assigned to byte b so it give data loss error so you have to type cast : (byte)b*2;

jvm(java virtual machine) -> jre(java runtime enviroment) -> jdk(java development kit

code execution: source code -> compiler -> byte code -> jvm -> native code 
               |---------compilation---------------|---------execution---|



*/
