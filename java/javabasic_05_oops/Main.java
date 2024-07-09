import java.util.*;

public class Main{
    public static void main(String args[]){
        // Account acc = new Account("karan");
        // Account acc1 = new Account("singh", 123);
        // acc1.setAccount();
        // SavingAccount sacc = new SavingAccount();
        // sacc.setAccount();
        
        
        // Queen q = new Queen();
        // q.moves();
        // Rook r = new Rook();
        // r.moves();
        
        
        // Bear b = new Bear();
        // b.eat();
        
        // Student s = new Student();
        // s.setName("ecs");
        // Student s1 = new Student();
        // System.out.println(s1.getName());
        
        User u = new User("karan", 123, "ram kumar");
        u.get();

    }
}


//example of class and objects
class Account{
    public String username;
    private String password;
    Integer accountNo;
    
    Account(){
        System.out.println("set the account default");
    }
    
    Account(String username){
        this.username = username;
        System.out.println("account username constructor");
    }
    Account(String username, Integer accountNo){
        this.username = username;
        this.accountNo = accountNo;
        System.out.println("account username and accountNo");
    }
    
    void setAccount(){
        System.out.println("set the account");
    }
    
    void makeAcc(){
        System.out.println("makeacc of account");
    };
}
class SavingAccount extends Account{
    void setAccount(){
        System.out.println("set the saving account");
    }
    
    void makeAcc(){
        System.out.println("make acc of saving called");
    }
}



//example of interfaces
interface ChessPlayer{
    void moves(); //by default public and abstarct
}
class Queen implements ChessPlayer {
    public void moves(){ //you have to declare it public otherwise it will become as default type
        System.out.println("up, down, left, right, diagonals in all direction");
    }
}
class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("vertical and horizontal");
    }
}



//example of multiple inheritance
interface Herbivores{
    void eat();
}
interface Carnivores{
    void eat();
}
class Bear implements Herbivores, Carnivores{
    public void eat(){
        System.out.println("eat both plants and animals");   
    }
}


//example of static and super keyword
class Student{
    String name;
    int rollNo;
    static String schoolName;
    
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    
    void setName(String schoolName){
        this.schoolName = schoolName;
    }
    String getName(){
        return this.schoolName;
    }
}
class User extends Student{
    String father;
    User(String name, int rollNo, String father){
        // this.name = name;
        // this.rollNo = rollNo;
        super(name, rollNo);
        this.father = father;
    }
    
    void get(){
        System.out.println(this.name + " " + this.rollNo + " " + this.father);
    }
}


/*
access modifiers and access specifiers

access modifiers  visible class     visible package      outside package by subclass only       outside package
private                y                n                              n                             n
default                y                y                              n                             n
protected              y                y                              y                             n
public                 y                y                              y                             b


getters : to get the objects value
setters : to set the objects value

encapsulation : as the wrapping up of the data & methods under a single unit, it also implements data hiding
constructors : non parameterized, parameterized, copy constructor, 
constructor overloading
shallow copy: copies the content and points to the same objects
deep copy : copies the content and points to the another objects
destructor: in java we does not write it becoz we have garbage collector that does the work automatically

inheritence : we use extends
types of inheritence: single level, multilevel, (does not have but can be implemented using interfaces)multiple, hierarchical, hybrid

polumorphism: 
compile time (method overloading)
run time (method overriding) = does not need to declare function as virtual

abstraction : hiding the unnecessary details : abstarct classes and interfaces
you have to redefine the abstract method in the inherited class
we cannot create object of abstract class but we can define the constructor

if we create a derived class object then the parent constructor is called the same level of hierarchy and declared

interfaces are the blueprint of class, and classes are the blueprint of the objects 
interfaces are used to implement multiple inheritence
interfaces are used to achieve total abstraction
all methods are public, abstract and without implementation
variables in the interfacse are final, public, static


static is used to share the same variables and methods of a given class

super is user to access parent method, parent constructor, parent methods



*/