package accessModifiers.school;

public class Student {

    int marks;

    public int rank;

    private String address;

    protected String name; //accessible outside the package only to child classes
    protected void d(){
        System.out.println("I am a protected method");
    }

    public String getAddress() {

        return address;
    }

    public String getAddress(String UserName ,String Password) {

        if(UserName =="ABC" && Password == "XCV")

        return address;
        else {
            return "Address not found";
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
