import java.util.*;

public class Main{
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i]++;
        }
        return;
    }
    public static void printArray(Integer arr[]){
        int size = arr.length;
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
    
    public static StringBuilder convertToUpperCase(StringBuilder str){
        int size = str.length();
        StringBuilder s = new StringBuilder("");
        
        for(int i = 0; i<size; i++){
            if(str.charAt(i) == ' '){
                s.append(' ');
                continue;
            }
            // s.append(Character.toUpperCase(str.charAt(i)));
            s.append((char)(str.charAt(i) - ('a' - 'A')));
        }
        return s;
    }
    
    public static void main(String args[]){
        int marks[] = new int[10];
        Integer arr1[] = {1,4,5,7,2};
        Scanner sc = new Scanner(System.in);
        
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        
        // System.out.println("phy: " + marks[0]);
        // System.out.println("math: " + marks[1]);
        // System.out.println("chem: " + marks[2]);
        // System.out.println("size of marks is: " + arr1.length);
        
        // update(marks);
        // for(int i = 0; i<marks.length; i++){
        //     System.out.println(marks[i] + " ");
        // }
        
        // Arrays.sort(arr1);
        // Arrays.sort(arr1, 2, 5); //(arr, starting index, ending index)
        // Arrays.sort(arr1, Collections.reverseOrder());
        // Arrays.sort(arr1, 0, 3, Collections.reverseOrder());
        // printArray(arr1);
        
        // int mat[][] = new int[2][2];
        // int mat1[][] = {{1,2}, {3,4}};
        // System.out.println("size of marks is: " + mat1[1][1] + " " + mat[0].length);
        
        String name = "karan ";
        // String name1;
        // name1 = sc.next();
        // String name2 = sc.nextLine();
        // System.out.println(name + "\n" + name1 + "\n" + name2);
        
        // name = name + name1;
        // System.out.println(name.length()); //for array it is property so we use arr.length
        // System.out.println(name.charAt(2));
        // System.out.println(name[2]); //not allowed
        
        
        
        // String str1 = "tony";
        // String str2 = "tony";
        // String str3 = new String("tony"); // it stores the string at new address
        
        // System.out.println( (str1 == str2) ? "is equal" : "not equal" );
        // System.out.println( (str1 == str3) ? "is equal" : "not equal" ); //compares the value along with address if it is pointing to the same address
        // System.out.println( (str1.equals(str3)) ? "is equal" : "not equal" ); //equals only checks the value
        
        
        
        // String str4 = "karan singh";
        // System.out.println(str4.substring(0, 3));
        
        // String str5 = "Mango";
        // String str6 = "apple";
        // System.out.println( (str5.compareTo(str6) > 0) ? str5 : str6); //it compare the string lexicographically
        // System.out.println( (str5.compareToIgnoreCase(str6) > 0) ? str5 : str6); //it compare the string lexicographically
        
        
        
        StringBuilder str7 = new StringBuilder("karan singh");
        str7.toString();
        // System.out.println(str7.getClass().getSimpleName()); //to get the type of any variables
        // System.out.println((Object)str7.getClass().getSimpleName());
        
        // str7.append("! lets go");  // to add at the end
        // System.out.println(Character.toUpperCase(str7.charAt(0))); // convert a character to upper case
        
        
        //code to convert a lowecase string to upper case
        // str7 = convertToUpperCase(str7);
        // System.out.println(str7);
        
        // char a = 'a';
        // a = (char)(a + 4);
        // int x = a;
        // System.out.println(a);
        
        
        
    }
}

/*
declaring array: datatype variable[] = new datatype[size];

Integer is non primitive type, so it make Array of object

in string we run a loop on string and with each loop we make changes in it, in this case the whole string get copied and new string is created with each loop this make the time complexity as O(loop * string length) making it quadratic, to avoid this case we use string builder data structure

toString() function works only on objects so it cannot convert int to string but can interger 

The explicit cast to Object is generally unnecessary in this context because getClass() is a method available on all objects. The explicit cast might be used for the following reasons:
Clarity: To make it explicitly clear that str5 is an object, although this is usually unnecessary since it's implied.
Avoiding Compile-Time Errors: In certain generic contexts, casting to Object can avoid compile-time type checking issues. For instance, if str5 were of a generic type T, where T could be any object, the explicit cast to Object would be necessary to avoid compile-time type errors.
*/