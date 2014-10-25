// Michael Lawrence BSc (HONS) 
public class Cat extends StartingPoint{
    String name;  //declare String variables
    String breed;
    Cat(){ } //Simple Cat Method.
    //Cat Constructor:
    Cat(String n, String b){  //n&b Strings inside Method
        name = n;  // n&b 2 Strings inside the Constructor.
        breed = b; // A Constructor is a Method() that has Variables: String/Int in it.
    }
    void printName(){   //Prints Name Method
        System.out.print(name);
    }
    void printBreed(){  //Prints Breed Method
        System.out.println(breed);
    }
    //General Methods:
    void noise(){
        System.out.print("Cat: Meow! ");
    }
    void dig(){
        System.out.print("Digging! ");
    }
    void eat(){
        System.out.println("Eating Cat Food! ");
    }
}