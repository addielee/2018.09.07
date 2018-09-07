class PartTime extends Employee
{
	//전역변수 초기화
	
	private int timePay;
	

	//기본생성자
	public PartTime(){
	}
	//매개변수 8개 생성자
	public PartTime(int empNo,String empName, String job, int mgr, String hiredate,String deptName, int timePay){
		super(empNo, empName, job, mgr,  hiredate, deptName);
		this.timePay = timePay;
		
	}
	
	//getter, setter
	
	public int getTimePay(){
		return timePay;
	}
	public void setTimePay(int timePay){
		this.timePay = timePay;
	}
	
	//message
	public void message(){
		System.out.println(getEmpName()+"사원은 비정규직입니다.");
	}

	//toString오버라이딩
	public String toString(){
		return super.toString()+" | "+timePay;   //부모 클래스에서 받아옴
	}
}
