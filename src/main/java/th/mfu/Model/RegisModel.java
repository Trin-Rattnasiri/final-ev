package th.mfu.Model;

import javax.validation.constraints.NotNull;

public class RegisModel {
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
