package bean;

public class EmployeeWithSetter {
    private int id;
    private String name;
    private AddressWithSetter address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressWithSetter getAddress() {
        return address;
    }

    public void setAddress(AddressWithSetter address) {
        this.address = address;
    }
    public void show(){
        System.out.println(id+" "+name);
        System.out.println(address);
    }
}
