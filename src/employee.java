public class employee {
    int id;
    String name;
    String department;
    employee(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department;
    }
}
