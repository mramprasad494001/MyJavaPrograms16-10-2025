
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("ramprasad", "ramprasad@123", "Google", "Adawal");
        Employee e2 = new Employee("sukman", "sukman@123", "Oracle", "Khutpadar");
        Employee e3 = new Employee("samel", "samel@123", "Amazon", "Jagdalpur");
        Employee e4 = new Employee("dinesh", "dinesh@123", "Oracle", "Dongriguda");
        Employee e5 = new Employee("roshan", "roshan@123", "Google", "Jagdalpur");
        Employee e6 = new Employee("balvant", "balvant@123", "Microsoft", "Jagdalpur");

        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
        arr.add(e4);
        arr.add(e5);
        arr.add(e6);

        // yha per getter setter ka use karke attribute ko change kar rha hu
        // getter ka use karke print bhi kar rha hu

        // for(int i=0;i<arr.size();i++){
        //     Employee em = arr.get(i);
        //     if (em.getUserName().equalsIgnoreCase("sukman")) {
        //         System.out.println(em);
        //         // getter use
        //         System.out.println(em.getCompanyName());
        //         // setter use
        //         em.setCompanyName("Microsoft");
        //         System.out.println(em.getCompanyName());
        //         System.out.println(em);
        //     }
        // }

        // yha per delete or remove() karke dekhenge 
        // aur Iterator ka use karenge delete or remove() karne ke liye
        // mai while loop ka use karunga 

        Iterator<Employee> eter = arr.listIterator();

        while(eter.hasNext()){
            Employee em = eter.next();
            if (em.getUserName().equalsIgnoreCase("balvant")) {
                eter.remove();
            }
        }

        for (Employee elem : arr) {
            System.out.println(elem);
        }

    }
}
