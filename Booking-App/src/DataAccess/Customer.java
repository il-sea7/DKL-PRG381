package DataAccess;

public class Customer extends Person {

    public Customer(String name, String surname, String phone) {
        super(name, surname, phone);
        // TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

}
