//상속 전

public class MainApp {
	MainApp(){
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FullTime [] full = new FullTime[3];
		PartTime [] part = new PartTime[2];

		
		full[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
		full[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		full[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		
		part[0] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		part[1] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
		
		//각 배열 길이 정의 , length 바로 쓰지 않고 변수에 담는 것이 좋음(반복문에서 length 길이 계속 체크할 필요 없으니깐)
		int fullLen = full.length;
		int partLen = part.length;

		System.out.println("****************** FullTime정보 *******************");
		for(int i = 0; i<fullLen;i++) 
			System.out.println(full[i]);  //인수.toString(), 오버라이딩 안했으면 주소값 나왔을 텐데 오버라이딩 덕분에 return값 패턴

		System.out.println("\n");
		System.out.println("****************** PartTime정보 *******************");
		for(int i = 0; i<partLen;i++) 
			System.out.println(part[i]);
		System.out.println("\n");

		System.out.println("****************** Message *******************");
		for(int i = 0; i<fullLen;i++) full[i].message();
		for(int i = 0; i<partLen;i++) part[i].message();		
		
		
	}

}






