package Assignment_12_Inheritance;

import java.nio.file.attribute.UserPrincipalLookupService;

class LibraryManagementSystem
{
    String usertype;
    String username;
    String password;

    public void Login()
    {

    }
    public void Register()
    {

    }
    public void Logout()
    {

    }
}
class User extends LibraryManagementSystem
{
    String name;
    int id;
    public void verify()
    {

    }
    public void checkAccount()
    {

    }
    public void get_book_info()
    {

    }
}
class Staff extends User{
    String dept;
}
class Students extends User{
    String cls;
}
class Book extends LibraryManagementSystem{
    String title;
    String author;
    int ISBN;
    String publication;
    public void show_duedt()
    {

    }
}
class Librarian extends LibraryManagementSystem{
    String name;
    int id;
    String password;
    String searchString;

   public  void Verify_librarian()
    {

    }
    public void search()
    {

    }

}
class LibraryDatabase extends Librarian{
    String[] list_of_books;
    public void Add()
    {

    }
    public void Delete()
    {

    }
    public void Update()
    {

    }
    public void Display()
    {

    }
    public void Search()
    {

    }
}
class Account extends User{
    int no_borrowed_books;
    int no_reserved_books;
    int no_returned_books;
    int no_lost_books;
    int fine_amount;

    public void Calculate_fine()
    {

    }


}
public class LibrarySystem {
    public static void main(String[] args) {

    }
}
