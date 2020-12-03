package Section_11.com.mycompany.accessible;

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

    // In the following interface what is the visibility of:

    //1. The Accessible interface   -->>  It will be available to the classes IN the package
    //2. The int var SOME_CONSTANT   -->>  Will be public - it is in an interface
    //3. method b   -->>  Will be public - it is in an interface
    //4. method c   -->>  Will be public - it is in an interface

}
