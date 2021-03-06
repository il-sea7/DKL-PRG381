package DataAccess;

public class Customer extends Person {

    Customer(String id, String name, String surname, String phone) {
        super(id, name, surname, phone);
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
