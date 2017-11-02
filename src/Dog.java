public class Dog {

    private int Age;

    public Dog(String name, int Age) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name );
        this.Age = Age;
    }

    public static void main(String []args) {
        // Following statement would create an object myPuppy
        Dog myPuppy = new Dog( "tommy",12);
        System.out.println("Passed Age is : " +myPuppy.Age);
    }
}