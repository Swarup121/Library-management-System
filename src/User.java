import java.util.List;

public class User {

    private int uid;
    private String uname;

    private List<Book> booklist;

    public User() {
    }


    public User(int userId, String userName) {
        this.uid = userId;
        this.uname = userName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }
}

