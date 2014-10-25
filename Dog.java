// Michael Lawrence BSc (HONS) 
public class Dog extends StartingPoint{
    String name;  //declare String variables
    String breed;
    Dog(){ }  //Simple Dog Method.
    //Dog Constructor:
    Dog(String n, String b){  //n&b Strings inside Method
        name = n;  // A Constructor is a Method() that has Variables: String/Int in it.
        breed = b; // n&b 2 Strings inside the Constructor.
    }
    void printName(){   //Method
        System.out.print(name);
    }
    void printBreed(){  //Method
        System.out.println(breed);
    }
    //General Methods:
    void noise(){
        System.out.print("Dog: Woof! "); //prints on same line.
    }
    void dig(){
        System.out.print("Digging! "); //prints on same line.
    }
    void eat(){
        System.out.println("Eating Scooby Snacks! "); //prints then goes onto next line.
    }
}