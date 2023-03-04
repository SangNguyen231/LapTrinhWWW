package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
@NamedQueries({
       @NamedQuery(name="User.findAll",query = "from User")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(nullable = false, unique = true, length = 50)
    private String userName;
    @Column(nullable = false, unique = true, length = 150)
    private String email;
    @Column(nullable = false, length = 50)
    private String password;
    @Column(nullable = false, length = 35)
    private String state;

    public User() {
    }

    public User(String userName, String email, String password, String state) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.state = state;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return (int) (userId ^ (userId >>> 32));
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
