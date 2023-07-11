package day2.practice;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getPassword() {
    	return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getEmail() {
    	return email;
    }
    
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("mullai");
        user.setPassword("mullai123");
       user.setEmail("mullai@gmail.com");
        System.out.println("Id: " +user.getId());         
        System.out.println("Name: " +user.getName());      
        System.out.println("Password: " + user.getPassword());
        System.out.println("Email: "+ user.getEmail());
    }
}
