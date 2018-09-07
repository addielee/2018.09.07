public class Employee
{
	//전역변수 초기화
	private int empNo;
	private String empName;
	private String job;
	private int mgr;
	private String hiredate;
	private String deptName;
	

	//기본생성자
	public Employee(){
	}
	
	//매개변수 8개 생성자
	public Employee(int empNo,String empName, String job, int mgr, String hiredate,String deptName){
		this.empNo = empNo;
		this.empName = empName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
		
	}
	
	//getter, setter
	public int getEmpNo(){
		return empNo;
	}
	public void setEmpNo(int empNo){
		this.empNo = empNo;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpName(String empName){
		this.empName = empName;
	}
	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job = job;
	}
	public int getMgr(){
		return mgr;
	}
	public void setMgr(int mgr){
		this.mgr = mgr;
	}
	public String getHiredate(){
		return hiredate;
	}
	public void setHiredate(String hiredate){
		this.hiredate = hiredate;
	}
	public String getDeptName(){
		return deptName;
	}
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}
	

	//message
	public void message(){
		//System.out.println(empName+"사원은 정규직입니다.");     
		//여기에는 무슨 기능을 해도 필요없음. 자식 클래스에서 오버라이딩할 것이기 때문에 비워둠
	}

	//toString오버라이딩
	public String toString(){
		return empNo+" | "+ empName+" | "+job+" | "+mgr+" | "+hiredate+" | "+deptName;
	}

}
