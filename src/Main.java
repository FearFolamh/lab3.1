import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Объект класса
        book book1= new book( "Константин","Рух", "7 Коней мира, дом 3");
        book1.SetId(12);
        book1.SetPhone("89532751965");
        book1.SetNote("Страшный человек");
        ArrayList<book> books1 = new ArrayList<>();
        books1.add(book1);

        GroupBook groupBook = new GroupBook(1,books1);
        System.out.println(groupBook);

        book book2 = new book("Иван","Колыван","У черта на куличиках");
        groupBook.addBook(book2);
        System.out.println(groupBook);

        groupBook.SortByFirstName();
        System.out.println(groupBook);

        groupBook.removeByBookName("Константин");
        System.out.println(groupBook);



    }
}