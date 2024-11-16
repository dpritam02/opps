import java.util.Objects;
class HERO{
    //properties
    //here by default all the properties are public in java (access modifier)
     public int health;
     public char level;
     public char[] name;

     //for copy constructor
    /*HERO(int Health,char Level){
        this.health = Health;
        this.level = Level;
    }
    HERO(HERO copyconstructor){
        this.health = copyconstructor.health;
        this.level = copyconstructor.level;
        System.out.println("copy constructor called!!");
    }
    void print(){
        System.out.println("Health: "+ this.health);
        System.out.println("Level: "+ this.level);
    }*/

     //non parameterized constructor
    /*HERO(){
        System.out.println("Constructor called!!");
    }*/

    //parameterized constructor
     /*HERO(int Health, char Level){
//        System.out.println("address of this: "+this);
        this.level = Level;
        this.health = Health;
    }*/

     //to get the access of private class we use getter and setter
    /*String getName(){
        return name;
    }
    void setName(String str){
        this.name = str;
    }

    int getHealth() {
        return health;
    }
    void setHealth(int h, String name) { //specific conditioned setter
        if(Objects.equals(name, "Aman")){
            this.health = h;
        }
    }

    char getLevel() {
        return level;
    }
    void setLevel(char level) {
        this.level = level;
    }*/
}
public class intro {
    public static void main(String[] args) {

        //creation of object
        //dynamic object creation
        /*HERO h1  = new HERO();
        //if we solely run this above line then this {Constructor is called!!} get printed.*/

        //parameterized object creation
        /*HERO h2 = new HERO(100,'A');
//        System.out.println("Address sof h2: "+ h2);
        System.out.println("health of hero is: "+ h2.health);
        System.out.println("level of hero is: "+ h2.level);*/

        //setter and getter
        /*h1.setHealth(10, "Aman"); //explicit content
        System.out.println(h1.getHealth()); // for any name other than Aman, output = 0

        h1.setName("ALo");
        System.out.println(h1.getName());

        h1.level = 'D';
        System.out.println(h1.level);*/

        //copy keyword
        /*HERO cp1 = new HERO(70,'A',"Alok");
        cp1.print();
        HERO cp2 = new HERO(cp1);
        cp2.print();*/

    }
}

