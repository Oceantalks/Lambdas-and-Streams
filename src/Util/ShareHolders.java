package Util;

/**
 * Created by Ado on 2018-01-05.
 */
public class ShareHolders {

    private String name;
    private String sirName;
    private String email;

    public ShareHolders(String name, String sirName, String email){
        this.name = name;
        this.sirName = sirName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ShareHolders{" +
                "name='" + name + '\'' +
                ", sirName='" + sirName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
