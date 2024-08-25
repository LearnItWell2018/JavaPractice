public class Duck {
    int pound =6;
    float ability = 2.1F;
    String name = "Generic";
    long [] feathers = {1,2,3,4,5,6,7};
    boolean canFly = true;
    int maxSpeed =25;
     public Duck(){
         System.out.println("type 1 duck");
     }

     public Duck(boolean fly){
         canFly = fly;
         System.out.println("Type 2 Duck");

     }
     public Duck(String n, long [] f){
         name = n;
         feathers= f;
         System.out.println("Type 3 Duck");
     }
     public Duck (int w, float f){
         pound = w;
         ability = f;
         System.out.println("Type 4 Duck");


     }
     public Duck (float density, int max){
         ability = density;
         maxSpeed = max;
         System.out.println("Type 5 Duck");
     }
}
