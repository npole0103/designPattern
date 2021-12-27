package midterm.observer.second;

public class Main {
	public static void main(String[] args) {
		NewsMachine newsMachine = new NewsMachine();
		AnnualSubscriber as = new AnnualSubscriber(newsMachine);
		EventSubscriber es = new EventSubscriber(newsMachine);
		
		newsMachine.setNewsInfo("오늘부터 가을 날씨", "일교차가 심하니 몸살에 조심하세요.");
		newsMachine.setNewsInfo("서울 첫눈", "금일 서울에 첫눈이 내립니다. 다들 미끄러움에 주의하세요.");
	}
}
