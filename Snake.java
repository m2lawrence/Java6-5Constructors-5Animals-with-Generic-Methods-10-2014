// Michael Lawrence BSc (HONS) 
public class Snake extends StartingPoint {
    String name;  //declare String variables
    String breed;
    Snake(){ }  //Simple Snake Method:
    //Snake Constructor:
    Snake(String n, String b){  //n&b Strings inside Method
        name = n;  // n&b 2 Strings inside the Constructor.
        breed = b; // A Constructor is a Method() that has Variables: String/Int in it.
    }
    void printName(){   //Method
        System.out.print(name);
    }
    void printBreed(){  //Method
        System.out.println(breed);
    }
    //General Methods:
    void noise(){  // noise method.
        System.out.print("Snake: Slide! ");
    }
    void dig(){
        System.out.print("Digging! ");
    }
    void eat(){
        System.out.println("Eating Snake Food! ");
    }
}