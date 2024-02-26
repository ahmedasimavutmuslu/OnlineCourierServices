import java.util.Date;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class User {
    private String userName;
    private String userSurname;

    //private Date userBirthdate;
    // Try to implement it later!!!
    private String userMail;
    private String userPassword;
    private String userAdress;



    public User(String uN,String uS, String uM, String uP, String uA)
    {
        setUserName(uN);
        setUserSurname(uS);
        setUserMail(uM);
        setUserPassword(uP);
        setUserAdress(uA);

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserAdress() {
        return userAdress;
    }

}
