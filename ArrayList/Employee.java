public class Employee {
    private String userName;
    private String userId;
    private String companyName;
    private String address;

    public Employee(String userName, String userId, String companyName, String address){
        this.userName=userName;
        this.userId=userId;
        this.companyName=companyName;
        this.address=address;
    }

    // yha se getter setter bna rha hu 
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    // user id
    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId=userId;
    }
    // companyName
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    // address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    @Override
    // toString()
    public String toString(){
        return "Employee => [userName : "+userName+", userId : "+userId+", email : "+companyName+", address : "+address+"]";
    }
}