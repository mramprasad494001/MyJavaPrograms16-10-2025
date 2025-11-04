package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import Multy.It;

public class MainEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ankit", "Google", "Hyderabad");
        Employee e2 = new Employee(2, "Ram", "Microsoft", "Banglore");
        Employee e3 = new Employee(3, "Sukman", "Google", "Delhi");
        Employee e4 = new Employee(4, "Rajendra", "Netflix", "Mumbai");
        Employee e5 = new Employee(5, "Rashmi", "Oracle", "Chennai");
        Employee e6 = new Employee(7, "Manisha", "Flipkart", "India");

        ArrayList<Employee> a = new ArrayList<>();
        a.add(e1);
        a.add(e2);
        a.add(e3);
        a.add(e4);
        a.add(e5);
        a.add(e6);

        // for (int i = 0; i < a.size(); i++) {
        // Employee e = a.get(i);
        // if (e.getCompanyName().equalsIgnoreCase("Google")) {
        // //e.setJobLoc("Hyderabad");
        // System.out.println(e);
        // }
        // }

        
        Iterator<Employee> eter = a.listIterator();
        // while (eter.hasNext()) {
        //     Employee e = eter.next();
        //     if (e.getCompanyName().equalsIgnoreCase("google")) {
        //        eter.remove();
        //     }
        // }
        while(eter.hasNext()) {
            Employee c = eter.next();
            if(c.getCompanyName().equalsIgnoreCase("Google")){
                eter.remove();
            }
        }

        for (Employee employee : a) {
            System.out.println(employee);
        }
    
    }
}
