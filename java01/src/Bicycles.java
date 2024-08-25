public interface Bicycles {
    int a = 45;
    void applyBreak(int decremnet);
    void speedup(int increment);
}
interface HornBicycle {
    void blowSound ();
    void blowSong();

}
class AvonCycle implements Bicycles, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee poo poo");
    }
  public   void applyBreak(int decremnet){

        System.out.println("Applying break");
    }
    public void speedup(int increment){
        System.out.println("Applying speedup");
    }
   public  void blowSound (){
        System.out.println(" Pok pok");
    }
    public void blowSong(){
        System.out.println("Sajni re");
    }
}