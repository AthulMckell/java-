public class Books {
    private String name;
    private String author;
    private int price;

    public Books(){
        this.name = "name";
        this.author = "author";
        this.price = 000;
    }
    public Books(String name,int price){
        this.name = name;
        this.price = price;
    }
    public Books(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] arg){
        Books myBooks = new Books();
        System.out.println("Name : "+myBooks.name);
        System.out.println("Author : "+myBooks.author);
        System.out.println("Price : "+myBooks.price);

        Books myBooks2 = new Books("BUShi", 234);
        System.out.println("Name : "+myBooks2.name);
        System.out.println("Author : "+myBooks2.author);
        System.out.println("Price : "+myBooks2.price);

        Books myBooks3 = new Books("ASHIN", "Athul", 333);
        System.out.println("Name : "+myBooks3.name);
        System.out.println("Author : "+myBooks3.author);
        System.out.println("Price : "+myBooks3.price);

    }
}
