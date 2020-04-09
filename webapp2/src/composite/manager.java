package composite;

public class manager implements employee{
    private String name;
    private String id;
    public manager(String name, String id){
        this.name = name;
        this.id = id;
    }
    @Override
    public void employeeDetails() {
        System.out.println("Name: "+name+ " id: "+id);
    }
}
