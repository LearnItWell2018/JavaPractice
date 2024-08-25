class Cylinder {
    private int radius;
    private  int height;

    public Cylinder(int radius, int height){
        this.radius=radius;
        this.height= height;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius( int radius){
        this.radius= radius;
    }

    public int getHeight(){
        return height;

    }
    public void setHeight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height;
    }

}
