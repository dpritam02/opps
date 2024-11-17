
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

    public void display(){
        System.out.println("Gear: "+gear+ " ,Stroke: "+stroke+ " ,Color: "+color);
    }

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

/*class pulser { //here the gear varaible is not accessable to this pulser class due to protected
    public void display(){
        System.out.println(gear);
    }
}*/

public class Inheritance {
    public static void main(String[] args) {
        //parent class result
        Bike b1 = new Bike(4,2,"Blue");
        System.out.println("Parent class");
        b1.display();
        //child class result
        duke d1 = new duke(4,2,"Orange", 6);
        System.out.println("Child class");
        System.out.println(d1.toString());
    }
}
