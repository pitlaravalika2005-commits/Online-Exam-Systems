public class User {

    private String username;
    private String password;
    private String name;
    private String email;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public boolean login(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }

    public void updateProfile(String newName, String newEmail) {
        name = newName;
        email = newEmail;

        System.out.println("\nProfile Updated Successfully!");
    }

    public void changePassword(String oldPass, String newPass) {

        if (password.equals(oldPass)) {
            password = newPass;
            System.out.println("Password Changed Successfully!");
        } else {
            System.out.println("Wrong Old Password!");
        }
    }

    public void displayProfile() {
        System.out.println("\n----- PROFILE -----");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
    }
}