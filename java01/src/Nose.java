public interface Nose {
    public int iMethod();
}
abstract class picasso implements Nose{
    @Override
    public int iMethod() {
        return 7;
    }
}
class clowns extends picasso{


}
class Acts extends picasso{
    @Override
    public int iMethod() {
        return 5;
    }
}
