import java.util.Objects;
class HERO{
    //properties
    //here by default all the properties are public in java (access modifier)
     private int health;
     private String name;
     public char level;

     //to get the access of private class we use getter and setter
    String getName(){
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
    }
}
public class intro {
    public static void main(String[] args) {

        //creation of object
        HERO h1  = new HERO(); //dynamic object creation

        h1.setHealth(10, "Aman"); //explicit content
        System.out.println(h1.getHealth()); // for any name other than Aman, output = 0

        h1.setName("ALo");
        System.out.println(h1.getName());

        h1.level = 'D';
        System.out.println(h1.level);

    }
}

