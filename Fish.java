// Michael Lawrence BSc (HONS) 
public class Fish extends StartingPoint {
    String name;  //declare String variables
    String breed;
    Fish(){ }  //Simple Fish Method:
    //Fish Constructor:
    Fish(String n, String b){  //n&b Strings inside Method
        name = n;  // n&b 2 Strings inside the Constructor.
        breed = b; // A Constructor is a Method() that has Variables: String/Int in it.
    }
    void printName(){   //This is a generic Print Name Method!
        System.out.print(name);
    }
    void printBreed(){   //This is a generic Print Breed Method!
        System.out.println(breed);
    }
    //General Methods:
    void noise(){
        System.out.print("Fish: Bubble! ");
    }
    void dig(){
        System.out.print("Digging! ");
    }
    void eat(){
        System.out.println("Eating Fish Flakes! ");
    }
}