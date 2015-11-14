package Model;
import java.sql.Blob;
import java.util.Vector;

/**
 * Created by Ritvik on 11/14/15.
 */
public class User {

    private String emailPrefix; //Mandatory
    private String tempPassword; //Mandatory //For Testing;
    private String firstName; //Mandatory
    private String lastName; //Mandatory
    private Blob userImage; //Mandatory
    private Vector<Book> booksToBuy;
    private Vector<Book> booksToSell;



    public User(String emailPrefix, String tempPassword) {
        this.emailPrefix=emailPrefix;
        this.tempPassword=tempPassword;
        this.booksToBuy=new Vector<Book>();
        this.booksToSell=new Vector<Book>();
    }


    public String getEmailPrefix() {
        return emailPrefix;
    }

    public void setEmailPrefix(String emailPrefix) {
        this.emailPrefix = emailPrefix;
    }

    public String getTempPassword() {
        return tempPassword;
    }

    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Blob getUserImage() {
        return userImage;
    }

    public void setUserImage(Blob userImage) {
        this.userImage = userImage;
    }

    public Vector<Book> getBooksToBuy() {
        return booksToBuy;
    }

    public void setBooksToBuy(Vector<Book> booksToBuy) {
        this.booksToBuy = booksToBuy;
    }

    public void addBookToBuy(Book newBook){
        booksToBuy.add(newBook);
    }


    public Vector<Book> getBooksToSell() {
        return booksToSell;
    }

    public void setBooksToSell(Vector<Book> booksToSell) {
        this.booksToSell = booksToSell;
    }

    public void addBookToSell(Book newBook){
        booksToSell.add(newBook);
    }


}
