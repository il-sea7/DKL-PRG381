package DataAccess;

public class Employee extends Person {

    public Employee(String name, String surname, String phone) {
        super(name, surname, phone);
        // TODO Auto-generated constructor stub
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
		this.name = name;
	}
    public String getSurname() {
        return surname;
    }
    public void setSurname(String name) {
		this.name = name;
	}
    public String getPhone() {
        return phone;
    }
    public void setPhone(String name) {
		this.name = name;
	}

}
