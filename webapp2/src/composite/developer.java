package composite;

public class developer implements employee{
    private String name;
    private String id;
    public developer(String name, String id){
        this.name = name;
        this.id = id;
    }
    @Override
    public void employeeDetails() {
        System.out.println("Name: "+name+" id: "+id);
    }
}
