// Michael Lawrence BSc (HONS) 
public class StartingPoint {
    public static void main(String args[]){
        System.out.println("* Michael Lawrence BSc (HONS)");
        System.out.println();
        System.out.println("* Dog 1st Constructor that will accept 2 Strings (names): ");
        Dog jerome = new Dog("Jerome: ", "Golden Retriever "); 
        //Creates a new dog object called jerome & will look for a
        // Constructor that will accept 2 strings.
        // A Constructor is a Method with variables inside it.
        Dog henry = new Dog("Henry: ", "Pitbull "); 
        //Creates a new dog object and a new dog out of it.
        Dog scooby = new Dog("Scooby: ", "Staffy ");
        
        jerome.printName();  // . adds print Methods
        jerome.printBreed();
        
        henry.printName();
        henry.printBreed();
        
        scooby.printName();
        scooby.printBreed();
        //------
        System.out.println("* Cat 2nd Constructor that will accept 2 Strings (names): ");
        Cat CatSmarty = new Cat("Smarty: ", "Ginger Tom Cat "); 
        //Creates a new dog object called jerome & will look for a
        // Constructor that will accept 2 strings.
        // A Constructor is a Method with variables inside it.
        Cat CatHenry = new Cat("CatHenry: ", "Kitten "); 
        //Creates a new dog object and a new dog out of it.
        Cat CatMike = new Cat("CatMike: ", "Black Cat ");
        
        CatSmarty.printName();  // . adds print Methods
        CatSmarty.printBreed();
        
        CatHenry.printName();
        CatHenry.printBreed();
        
        CatMike.printName();
        CatMike.printBreed();
        //------
        System.out.println("* Snake 3rd Constructor that will accept 2 Strings (names): ");
        Snake SnakeJake = new Snake("Jake: ", "Grey Snake "); 
        //Creates a new dog object called jerome & will look for a
        // Constructor that will accept 2 strings.
        // A Constructor is a Method with variables inside it.
        Snake SnakeEmma = new Snake("Emma: ", "White Snake "); 
        //Creates a new dog object and a new dog out of it.
        Snake SnakeLouise = new Snake("Louise: ", "Black Snake ");
        
        SnakeJake.printName();  // . adds print Methods
        SnakeJake.printBreed();
        
        SnakeEmma.printName();
        SnakeEmma.printBreed();
        
        SnakeLouise.printName();
        SnakeLouise.printBreed();
        //------
        System.out.println("* Fish 4th Constructor that will accept 2 Strings (names): ");
        Fish FishOrangeJuice = new Fish("OrangeJuice: ", "Gold Fish "); 
        //Creates a new dog object called jerome & will look for a
        // Constructor that will accept 2 strings.
        // A Constructor is a Method with variables inside it.
        Fish FishLemonade = new Fish("Lemonade: ", "Gold Fish "); 
        //Creates a new dog object and a new dog out of it.
        Fish FishIce = new Fish("Ice: ", "Gold Fish ");
        
        FishOrangeJuice.printName();  // . adds print Methods
        FishOrangeJuice.printBreed();
        
        FishLemonade.printName();
        FishLemonade.printBreed();
        
        FishIce.printName();
        FishIce.printBreed();
        //------
        //------
        System.out.println("* Mouse 5th Constructor that will accept 2 Strings (names): ");
        Mouse brownMouse = new Mouse("Brown Mouse: ", "Mouse "); 
        //Creates a new mouse object called brownMouse & will look for a
        // Constructor that will accept 2 strings.
        // A Constructor is a Method with variables inside it that initiates the instance
        // and you can only have one constructor per class.
        Mouse whiteMouse = new Mouse("White Mouse: ", "Mouse "); 
        //Creates a new mouse object and a new mouse out of it.
        Mouse creamMouse = new Mouse("Cream Mouse: ", "Mouse "); 
        
        brownMouse.printName();  // . adds print Methods
        brownMouse.printBreed();
        
        whiteMouse.printName();
        whiteMouse.printBreed();
        
        creamMouse.printName();
        creamMouse.printBreed();
        //------
        System.out.println("* Java 6 OOP Polymorphism: ");
        //----------------------- OOP ---------------------------
        Dog Scooby; //Creates a new dog object.
        Scooby = new Dog();  //Creates a new dog out of it.
        Scooby.noise();  //Uses the Object Scooby plus the generic noise Method.
        Scooby.dig();  //Uses the Object Scooby plus the generic dig Method.
        Scooby.eat();  //Uses the Object Scooby plus the generic eat Method.
        //-------------
        Cat mike; //Creates a new cat object.
        mike = new Cat();  //Creates a new cat out of it.
        mike.noise();  //Uses the generic noise method.
        mike.dig();  //Uses the generic dig method.
        mike.eat();  //Uses the generic eat method.
        //--------------
        Fish Bubbles; //Creates a new fish object.
        Bubbles = new Fish();  //Creates a new fish out of it.
        Bubbles.noise();  //Uses the generic noise method.
        Bubbles.dig();  //Uses the generic dig method.
        Bubbles.eat();  //Uses the generic eat method.
        //--------------
        Snake Sliver; //Creates a new snake object.
        Sliver = new Snake();  //Creates a new snake out of it.
        Sliver.noise();  //Uses the generic noise method.
        Sliver.dig();  //Uses the generic dig method.
        Sliver.eat();  //Uses the generic eat method.
        //--------------
        Mouse Squeak; //Creates a new Mouse object.
        Squeak = new Mouse();  //Creates a new Mouse out of it.
        Squeak.noise();  //Uses the generic noise method.
        Squeak.dig();  //Uses the generic dig method.
        Squeak.eat();  //Uses the generic eat method.
    }
}