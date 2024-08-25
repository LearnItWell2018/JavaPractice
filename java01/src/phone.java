public class phone {
    public void greet(){
        System.out.println("Good morning");
    }
    public void myName(){
        System.out.println("turning on phone");
    }
}
class SmartPhone extends phone{
    public void swagat(){
        System.out.println("Welcome"); // This is not allowed because this method is present in superclass.
    }
    public void myName(){
        System.out.println("turning on smartphone");
    }

}
