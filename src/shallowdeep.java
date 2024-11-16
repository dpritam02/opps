class Copy{
    //properties
    char[] name;

    //shallow copy and deep copy
    Copy(){
        name = new char[100]; //allocated memory for the name array
    }

    //for deep copy->we need our own copy constructor
    Copy(Copy deepcopy){
        this.name = new char[deepcopy.name.length];
        for(int i =0;i<deepcopy.name.length;i++){
            this.name[i] = deepcopy.name[i];
        }
    }

    //setter for shallow constructor
    void setname(char[] Name){
        this.name = Name; //this is a shallow copy{ref is copied}
    }
    void print(){
        for(char c: name) System.out.print(c);
        System.out.println();
    }
}
public  class shallowdeep {
    public static void main(String[] args) {
        //shallow copy
        /*//creating first object
        Copy h1 = new Copy();
        char[] iname = {'h','e','l'};
        h1.setname(iname);
        System.out.print("h1 is: ");
        h1.print();

        //create a shallow copy the reference
        Copy h2 = new Copy();
        h2.setname(h1.name);
        System.out.print("h2 (shallow copy): ");
        h2.print();

        //modify
        h1.name[0] = 'P';
        System.out.print("h1, after modification: ");
        h1.print();
        //why h2 also change as we only change h1?
        System.out.print("h2, after modification: ");
        h2.print();
        */

        //deep copy
        Copy c1 = new Copy();
        char[] iname2 = {'m','i','k'};
        c1.setname(iname2);
        System.out.print("c1: ");
        c1.print();

        //deep copy
        Copy c2 = new Copy(c1);
        System.out.print("c2(deep copy): ");
        c2.print();

        //modification
        c1.name[0]='H';
        System.out.print("c1 after modification: ");
        c1.print();
        System.out.print("c2 after modification: ");
        c2.print();

    }
}
