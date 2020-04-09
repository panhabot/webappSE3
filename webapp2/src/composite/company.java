package composite;

public class company {
    public static void main( String[] args ) {
        manager ma1 = new manager("Bot", "1");
        manager ma2 = new manager("hey", "2");
        composite com1 = new composite();
        com1.addEmployee(ma1);
        com1.addEmployee(ma2);

        developer de1 = new developer("mony", "3");
        developer de2 = new developer("dy", "4");
        composite com2 = new composite();
        com2.addEmployee(de1);
        com2.addEmployee(de2);

        composite com3 = new composite();
        com3.addEmployee(com1);
        com3.addEmployee(com2);
        com3.employeeDetails();

    }
}
