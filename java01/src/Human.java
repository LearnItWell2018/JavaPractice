public class Human extends Monkey implements BasicAnimal{

    void m1(){
        System.out.println(" I am in class B");
    }


    void show (){
        m1();
        this.m1();
        super.m1();
    }

    void speak(){
        System.out.println(" Hello sir");

    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
