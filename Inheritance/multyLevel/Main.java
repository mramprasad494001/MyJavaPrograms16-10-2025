public class Main {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        System.out.println(cc.parentName);
        System.out.println(cc.subName);
        System.out.println(cc.childName);

        // methods calling 
        cc.ParentClassPrintDetails();
        cc.subParentClassPrintDetails();
        cc.childClassPrintDetails();
    }
}
