package composite;

import java.util.ArrayList;
import java.util.List;

public class composite implements employee{
    private List<employee> list = new ArrayList<employee>();

    public void addEmployee(employee emp){
        list.add(emp);
    }
    public void removeEmployee(employee emp){
        list.remove(emp);
    }

    @Override
    public void employeeDetails() {
        for (employee emp:list){
            emp.employeeDetails();
        }
    }
}
