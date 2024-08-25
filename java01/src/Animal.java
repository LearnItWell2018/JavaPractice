public interface Animal {
    void eat();
    void sound();
}
 interface Bird extends Animal{
    void movement();
    void wakeup ();

}
class Creature implements Animal, Bird{
    void nature(){
        System.out.println("Birds are clam");
        System.out.println("Animals are ferocious");

    }
    public void eat(){
        System.out.println("Animals are hunting");
        System.out.println("Birds are eating");

    }
    public void sound(){
        System.out.println("Animals are barking");
        System.out.println("Birds are chirping");
    }
    public void movement(){
        System.out.println("Animals are running");
        System.out.println("Birds are flying");
    }
    public void wakeup(){
        System.out.println("Birds = Early morning");
        System.out.println("Animals = late morning");
    }



    public static void main (String [] args){
        Creature cr = new  Creature();
        cr.eat();
        cr.movement();

        Animal am = new Creature();
        am.sound();
        Bird b = new Creature();
        b.movement();
        cr.wakeup();

    }
}
