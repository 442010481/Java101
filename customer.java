package Comapny_;
public class Customer {

    //id of the customer
    int id;
    //name of the customer
    String name;
    //address of the customer
    String address;
    //date Of Birth of the customer
    String dateOfBirth;
    //mobile Phone of the customer
    String mobilePhone;
    //E-mail of the customer
    String email;

    //Constructor for customer class
    public Customer(int id, String name, String address, String dateOfBirth, String mobilePhone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void getInfoCustomer() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address " + address);
        System.out.println("date Of Birth " + dateOfBirth);
        System.out.println("mobile " + mobilePhone);
        System.out.println("email: " + email);
        System.out.println();
    }
    
        @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", adddrss=" + address + ", dateOfBirth=" + dateOfBirth + ", mobilePhone=" + mobilePhone + ", email=" + email + '}';
    }

}
