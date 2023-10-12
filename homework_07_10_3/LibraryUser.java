package javaPro.homework_07_10_3;

import java.util.*;



public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private List<String> userBooksBorrowed;
    private Set<String> userBooksReserved;

    public LibraryUser(int userId, String userName, String userEmail, String userPhone, List<String> userBooksBorrowed, Set<String> userBooksReserved) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userBooksBorrowed = new ArrayList<>();
        this.userBooksReserved = new HashSet<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public List<String> getUserBooksBorrowed() {
        return userBooksBorrowed;
    }

    public void setUserBooksBorrowed(List<String> userBooksBorrowed) {
        this.userBooksBorrowed = userBooksBorrowed;
    }

    public Set<String> getUserBooksReserved() {
        return userBooksReserved;
    }

    public void setUserBooksReserved(Set<String> userBooksReserved) {
        this.userBooksReserved = userBooksReserved;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser that)) return false;
        return userId == that.userId && Objects.equals(userName, that.userName) && Objects.equals(userEmail, that.userEmail) && Objects.equals(userPhone, that.userPhone) && Objects.equals(userBooksBorrowed, that.userBooksBorrowed) && Objects.equals(userBooksReserved, that.userBooksReserved);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userEmail, userPhone, userBooksBorrowed, userBooksReserved);
    }
    @Override
    public String toString() {
        return "LibraryUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userBooksBorrowed=" + userBooksBorrowed +
                ", userBooksReserved=" + userBooksReserved +
                '}';
    }
    public void add(Book book) {
    }
}
