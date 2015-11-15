package Controller;

import java.util.Vector;

import Model.Book;
import Model.User;

/**
 * Created by Ritvik on 11/14/15.
 */
public class DBManager {

    public boolean authenticate ( String userName, String passWord) {
      return false;
    }

    public boolean addUser(User user) {
        return false;
    }

    public Vector<Book> getBuyList(User user){
        return null;
    }

    public void addToBuyList(Book bookToAdd) {

    }

    public Vector<Book> getSellList(User user) {
        return null;
    }

    public void addToSellList(Book bookToSell) {

    }
    
    public Vector<User> getInterested(Book book){
        return null;
    }

    public void addInterested(Book interestedBook, User userToAdd){

    }


}
