package midterm.observer.second;

public class Main {
	public static void main(String[] args) {
		NewsMachine newsMachine = new NewsMachine();
		AnnualSubscriber as = new AnnualSubscriber(newsMachine);
		EventSubscriber es = new EventSubscriber(newsMachine);
		
		newsMachine.setNewsInfo("���ú��� ���� ����", "�ϱ����� ���ϴ� ���쿡 �����ϼ���.");
		newsMachine.setNewsInfo("���� ù��", "���� ���￡ ù���� �����ϴ�. �ٵ� �̲����� �����ϼ���.");
	}
}
