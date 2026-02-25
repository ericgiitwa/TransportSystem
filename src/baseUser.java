abstract class baseUser {
    private String Name;
    private String phoneNumber;
    private int age;

    public baseUser(String Name, String phoneNumber, int age) {
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {return Name;}
    public void setName(String Name) {this.Name = Name;}

}