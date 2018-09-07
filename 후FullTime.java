//상속 후(내 것 아님)

public class FullTime extends Employee
{
	//전역변수 초기화
	
	private int salary;
	private int bonus;

	//기본생성자
	public FullTime(){
	}
	//매개변수 8개 생성자
	public FullTime(int empNo,String empName, String job, int mgr, String hiredate,String deptName, int salary, int bonus){
		//super();   //기본생성자 생략돼 있음
		super(empNo,empName,job, mgr, hiredate, deptName);   //private이라 상속이 안돼서 this로 받을 수 없음
		this.salary = salary;
		this.bonus = bonus;	
		//setter로 부를 수 있지만 재사용성 떨어짐
	}
	
	//getter, setter

	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getBonus(){
		return bonus;
	}
	public void setBonus(int bonus){
		this.bonus = bonus;
	}
	
	public void message(){
		System.out.println(getEmpName()+"사원은 정규직입니다.");
	}



	//toString오버라이딩
	public String toString(){
		return super.toString() +" | "+salary+" | "+bonus;    //부모 클래스에 메소드 있어서 super로 불러옴
	}

}
