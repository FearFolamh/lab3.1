import java.util.ArrayList;
import java.util.Comparator;

public class GroupBook {
    public Integer UniqueNumber;
    public ArrayList<book> books;

    public GroupBook()
    {
        books = new ArrayList<>();
    }

    public GroupBook(Integer uniqueNumber, ArrayList<book> books)
    {
        this.UniqueNumber = UniqueNumber;
        this.books = books;
    }

    public Integer GetUniqueNumber(){return UniqueNumber;}
    public ArrayList<book> GetBook(){return books;}

    public void setBooks(ArrayList<book> books) {this.books = books;}

    public void setUniqueNumber(Integer UniqueNumber)
    {
        this.UniqueNumber = UniqueNumber;
    }

    public void addBook(book Book)
    {
        books.add(Book);
    }

    public void removeByBookName(String FirstName)
    {
        books.removeIf(book1->book1.GetFirstName().equals(FirstName));
    }

    public book GetBook(int index)
    {
        if(index >=0 && index < books.size())
        {
            return books.get(index);
        }
        return null;
    }

    public void SortByFirstName()
    {
        books.sort(Comparator.comparing(book::GetFirstName));
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("Books #" + UniqueNumber + ":\n");
        for(book Book:books)
        {
            result.append(Book.toString()).append("\n---\n");
        }
        return result.toString();
    }
}
