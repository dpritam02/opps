class hello{
    int Bye;
    /*hello(){
        System.out.println("hello its a default constructor!!");
    }
    hello(int bye){
        System.out.println("address of this: " + this);
        this.Bye = bye;
    }
    */

    //static keyword--
    /*static int time = 0; //static class(a)
    //static keyword -> create data member belongs to class
    //static class(a)
    public hello(){
        time++;
        System.out.println("Static keyword is executed!!");
    }
    //static method(b)
    public static int addition(int a, int b){
        return a+b;
    }
    //static block (c)
    static{
        System.out.println("static block executed!");
    }
    static class outerhello{
        public void display(){
            System.out.println("nested static");
        }
    }*/
}



class main{
    public static void main(String[] args) {
        /*hello h1 = new hello();
        hello h2 = new hello(10);
        System.out.println("address this h2 is: " + h2);
        System.out.println("address of h2 is: " + h2.Bye);
        */

        //for destructor
       /*hello h1 = new hello();*/

        //static -> no need to initialise object
        /*System.out.println(hello.time);//(a)
        System.out.println(hello.addition(5,6));//(b)
        //static block need not to be initialise in the main function
        hello.outerhello h2 = new hello.outerhello();
        h2.display();*/

    }
}
