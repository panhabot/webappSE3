package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DBTask {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        DBOperation insert = new DBOperation();

        System.out.println("Enter the number of input: ");
        int num = input.nextInt();

        ArrayList<btb> btb = new ArrayList<>(num);

        if (num > 0){
            for (int i = 0; num > i; i++){

                task2.btb dto = new btb();
                System.out.println("Id: ");
                dto.setId(input.next());
                System.out.println("Name: ");
                dto.setName(input.next());
                btb.add(dto);
            }
            insert.insertData(btb);
        }

    }
}
