public abstract class baseUser implements userActions{
    private String Name;
    private String phoneNumber;
    private int age;


    public baseUser(String Name, String phoneNumber, int age) {
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.age = age;
            }

    public String getName() {return Name;}
    public String getPhoneNumber() {return phoneNumber;}
    public int getAge() {return age;}


    public void setName(String Name) {this.Name = Name;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setAge(int age) {this.age = age;}

    @Override
    public void getLocation(){
        System.out.println(Name + "Is currently at location X");
    }

    @Override
    public void confirmRide(){
        System.out.print("your driver is:" + Name + "and he is driving  A CAR" );
    }


    @Override
    public void verifyAge(){
        if(age >= 18) { System.out.println("you are " + age);}
        else {System.out.println("you cannot ride without and adult present");}
        }



    }

