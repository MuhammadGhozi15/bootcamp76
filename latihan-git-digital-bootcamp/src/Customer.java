
public class Customer{
    private String name;
    private String address;
    private int age;

    public Customer(){
        // TODD auto generate constructor STUB
    }
    public Customer(String name, String address, int age){
        super();
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress( String address){
        this.address = address;
    }
}