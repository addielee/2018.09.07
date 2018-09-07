public class MainApp {
	MainApp(){
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//FullTime [] full = new FullTime[3];
		//PartTime [] part = new PartTime[2];          

		Employee [] emp = new Employee[5];    //다형성이기 때문에 위 두 줄처럼 쓰지 말고 이렇게 하나의 변수로 받을 수 
		//만약 Employee가 abstract class이어도 이렇게 쓸 수 있음
		//왜냐하면 이건 객체 생성이 아니라 배열방을 생성한 것임
		//객체는 그 배열방 안에 들어가는 것, 둘이 다름

		emp[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
		emp[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		emp[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		
		emp[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		emp[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
		//다형성 사용
		
		//각 배열 길이 정의
		int empLen = emp.length;
		
		System.out.println("****************** Emp 정보 *******************");
		for(int i = 0; i<empLen;i++) System.out.println(emp[i]);
		System.out.println("\n");
		
		System.out.println("****************** Emp Message 정보 *******************");
		for(int i = 0; i<empLen;i++) emp[i].message();  //재정의된 거라 자식 거 메소드로 호출
			
		
		
	}

}






