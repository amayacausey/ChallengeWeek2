public class ContactInformation {
    protected String name;
    protected String email;
    protected String phoneNum;
    protected String city;
    protected String state;
    private Symptoms Symptoms;


    public ContactInformation(){

    }
    public ContactInformation(String name,String email,String phoneNum,String city,String state,Symptoms symptoms){
        this.name=name;
        this.email=email;
        this.phoneNum=phoneNum;
        this.city=city;
        this.state=state;
        this.Symptoms= new Symptoms();
    }
    //getters and setters
    public void setName(String name)
    {
        this.name=name;
    }
   public String getName()
    {
        return this.name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum=phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity()
    {
        return this.city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


    @Override
    public String toString() {
        return  "Patient Name:               " +name + "\n" +
                "Phone Number:        " +phoneNum + "\n" +
                "Email:              " + email+ "\n"+
                "City:              " +city + "\n"+
                "State:              " + state+ "\n";
    }



}
