package singleLevel;

public class Main {
    public static void main(String[]args) {

        // single level Inheritance 
        ChildClass cc =  new ChildClass();

        System.out.println(cc.parentName);
        System.out.println(cc.childName);

        cc.parentMethod();
        cc.childMethod();
    }    
}
