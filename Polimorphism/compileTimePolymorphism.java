// method Overloading 
// 
public class compileTimePolymorphism {
    public static void main(String[]args){
        // this is compile time Polymorphism
        compileTime ct = new compileTime();
        System.out.println(ct.add(23, 43));
        System.out.println(ct.add(27, 13, 41));
        System.out.println(ct.add(74, 93));
    }
}

class compileTime {
    // 2 int ka sum 
    int add(int a , int b){
        return a + b;
    }
    // 3 int ka sum 
    int add(int a , int b , int c) {
        return a + b + c;
    }
    // 2 double ka sum 
    double add(double a , double b){
        return a + b;
    }
}