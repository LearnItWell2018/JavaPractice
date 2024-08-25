public interface Camera {
    void takeSnap();
    void video();
}

interface wifi extends Camera{
    void song();
    void calculator();

    
}

class CellPhone implements wifi{
    public  void takeSnap (){
        System.out.println("Taking my pic");
    }

    public void video(){
        System.out.println("Funny video");
    }
    public void song(){
        System.out.println("vida karo");
    }
    public void calculator(){
        System.out.println("Addition");
    }

}
