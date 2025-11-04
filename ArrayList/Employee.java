package ArrayList;

public class Employee {
    private int empId;
    private String empName;
    private String companyName;
    private String jobLoc;

    public Employee(){

    }

    public Employee(int empId, String empName, String companyName, String jobLoc){
           this.empId = empId;
           this.empName = empName;
           this.companyName = companyName;
           this.jobLoc = jobLoc;
    }

    public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobLoc() {
		return jobLoc;
	}

	public void setJobLoc(String jobLoc) {
		this.jobLoc = jobLoc;
	}

    @Override
	public String toString() {
		return "Employee  -> [empId=" + empId + ", empName=" + empName + ", companyName=" + companyName + ", jobLoc="+ jobLoc + "]";
	}
    
}
