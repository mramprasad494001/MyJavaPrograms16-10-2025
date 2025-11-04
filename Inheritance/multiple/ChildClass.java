public class ChildClass implements ParentClass, SubParentClass {
    @Override
    public void parentClassPrintDetails(){
        System.out.println("Hello World");
    }

    @Override
    public void SubParentMethod() {
        System.out.println("this SubParent Methods ");
    }
}