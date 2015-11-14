package Model;

import java.security.acl.Owner;
import java.sql.Blob;
import java.util.Vector;

/**
 * Created by saurabhj80 on 10/21/15.
 */
public class Book {

    // Name
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Author
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    // ISBN
    private long iSBN;

    public long getiSBN() {
        return iSBN;
    }

    public void setiSBN(long iSBN) {
        this.iSBN = iSBN;
    }

    // Course
    private String course;
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Picture
    private Blob picture;
    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    // Quality
    private int quality;
    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    // Price
    private int price;
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Negotiable
    private boolean negotiable = true;

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    // Owner
    private User owner;
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    // Status
    private int status;
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    // Interested user
    private Vector<User> interestedUsers;

    public Vector<User> getInterestedUsers() {
        return interestedUsers;
    }

    public void setInterestedUsers(Vector<User> interestedUsers) {
        this.interestedUsers = interestedUsers;
    }

    public void addInterestedUser(User user) {
        interestedUsers.add(user);
    }

    // instance constructor
    {
        interestedUsers = new Vector<User>();
    }

    // Constructor
    public Book(String name, String author, int quality, int price, User owner, int status) {
        this.name =  name;
        this.author = author;
        this.quality = quality;
        this.price = price;
        this.owner = owner;
        this.status = status;
    }

}
