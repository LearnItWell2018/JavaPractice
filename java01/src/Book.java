public class Book {
    String title;
    String author;






    public static void main(String[] args){
        Book [] mybook = new Book[3];
        mybook[0]= new Book();
        mybook[1]= new Book();
        mybook[2] = new Book();

        int x=0;
        mybook[0].title="Heads to java";
        mybook[1].title= "Wellcome to Java";
        mybook[2].title="Java cook book";
        mybook[0].author="Dona";
        mybook[1].author="Sonal";
        mybook[2].author="Dodo";
        while (x < 3){
            System.out.println(mybook[x].title + " "+ "is written by" + " " + mybook[x].author);
            x = x + 1;
        }
    }
}
