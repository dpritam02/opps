
class Bike{
    protected int gear;
    protected int stroke;
    protected String color;

    public Bike(int gear, int stroke, String color){ //constructor
        this.gear = gear;
        this.stroke = stroke;
        this.color = color;
    }

    //only if we use private access modifier
    /*public int getGear(){
        return gear;
    }
    public void setGear(int G){
        this.gear = G;
    }
    public int getStroke(){
        return stroke;
    }
    public void setStroke(int S){
        this.stroke = S;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String C){
        this.color = C;
    }*/

    public String toString(){
        return ("Gear: " + gear + " ,Stroke: " + stroke + " ,Color: " + color);
    }
}

class duke extends Bike{
    protected int engine;

    public duke(int gear, int stroke, String color, int engine) {
        super(gear, stroke, color);
        this.engine = engine;
    }
    //if we use private
    /*public int getEngine(){
        return engine;
    }
    public void setEngine(int E){
        this.engine = E;
    }*/

    @Override public String toString(){
        return(super.toString() + ", Engine: "+engine);
    }
}


//reason for override--
/*@Override
public String toString() {
    // Using getters to access private fields from the parent class
    return "Gear: " + getGear() + " ,Stroke: " + getStroke() + " ,Color: " + getColor() + " ,Engine: " + engine;
}
Why Override: This method overrides toString() to return a custom string that includes the details of the Duke object, such as gear, stroke, color, and engine.
Usage of Getters: Since the fields in the parent class Bike are private, the method uses getters (getGear(), getStroke(), getColor()) to access these values. This ensures that the method respects encapsulation while still producing a formatted string of the object's state.
@Override Annotation: This annotation indicates that the method is overridden from a superclass, providing clarity and helping catch errors if the method signature does not match the method in the superclass.
If you create and print a Duke object like this:

java
Copy code
Duke d1 = new Duke(4, 2, "Orange", 6);
System.out.println(d1.toString());
The overridden toString() method will output:

less
Copy code
Gear: 4 ,Stroke: 2 ,Color: Orange ,Engine: 6
This is much more informative than the default toString() method from the Object class, which would print something like Duke@1a2b3c4d.
*/

/*class pulser { //here the gear varaible is not accessable to this pulser class due to protected
    public void display(){
        System.out.println(gear);
    }
}*/



public class Inheritance {
    public static void main(String[] args) {

        // inheritance understanding
        //parent class result
        /*Bike b1 = new Bike(4,2,"Blue");
        System.out.println("Parent class");
        System.out.println(b1.toString());
        //child class result
        duke d1 = new duke(4,2,"Orange", 6);
        System.out.println("Child class");
        System.out.println(d1.toString());
         */

        //types of inheritance
        //1. single -> lion - animal
        lion l1 = new lion();
        l1.eat();

        //2. multilevel -> cub - lion - animal
        cub c1 = new cub();
        c1.eat();
        c1.sound();

        //3. Hybrid

    }
}

//types of inheritance---
class Animal{
    int tier;
    public void eat(){
        System.out.println("Carnivorous");
    }
}
class lion extends Animal{
    int cry;
    public void sound(){
        System.out.println("Roar");
    }
}
class cub extends lion{
}


