import java.util.Date;

public class Book {

    private int bid;
    private  String bname;
    private String bauthor;
    private boolean isIssued;

    public Book() {
    }

//    public Book(boolean isIssued, String bauthor, String bname, int bid) {
//        this.isIssued = isIssued;
//        this.bauthor = bauthor;
//        this.bname = bname;
//        this.bid = bid;
//    }

    public Book(int id, String name, String aName) {
        bid=id;
        bname = name;
        bauthor = aName;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
}
