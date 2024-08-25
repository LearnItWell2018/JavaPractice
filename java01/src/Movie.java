public class Movie {
    String title;
    String genre;
    int rating;
    void playIt(){
        System.out.println(title +" "+ ":" + genre+ " " + "-" + " "+ rating );
    }

    public static void main(String [] args){
        Movie one = new Movie();
        one.title = "Quite place";
        one.genre ="Horror";
        one.rating= 7;

        Movie two = new Movie();
        two.title = "I am legend";
        two.genre ="Thriller";
        two.rating= 5;


        Movie three = new Movie();
        three.title = "Doctor";
        three.genre ="Tragic";
        three.rating= 9;

        one.playIt();
        System.out.println(two.title);

        two.playIt();


    }
}
