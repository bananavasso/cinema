import javax.swing.*;

public class Staff {
    private String name;
    private String password;
    private String age;
    private String email;
    private String address;
    private String qualifications;

    Staff(){};

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String getQualifications(){
        return qualifications;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String pass){
        password=pass;
    }
    public void setAge(String age){
        this.age=age;
    }
    public void setEmail(String email){
        this.email=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setQualifications(String qualifications){
        this.qualifications=qualifications;
    }
}
