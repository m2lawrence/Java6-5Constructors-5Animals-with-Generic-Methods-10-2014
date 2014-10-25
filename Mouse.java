// Michael Lawrence BSc (HONS) 
public class Mouse extends StartingPoint {
    String name;  //declare String variables
    String breed;
    Mouse(){ }  //Simple Mouse Method:
    //Mouse Constructor:
    Mouse(String n, String b){  //n&b Strings inside Method
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
    void noise(){  //uses the generic noise method.
        System.out.print("Mouse: Squeak! ");
    }
    void dig(){  //uses the generic dig method.
        System.out.print("Digging! ");
    }
    void eat(){  //uses the generic eat method.
        System.out.println("Eating mouse food. ");
    }
}