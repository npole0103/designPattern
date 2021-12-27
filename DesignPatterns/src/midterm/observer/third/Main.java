package midterm.observer.third;

public class Main {
	public static void main(String[] args) {
		WebSite ws = new WebSite();
		Observer kakao = new KakaoPlatform();
		Observer mail = new MailPlatform();
		
		ws.registerObserver(kakao);
		ws.registerObserver(mail);
		
		Article article1 = new Article();
		Article article2 = new Article();
		article1.setter("������ �޴�", "�Ľ�Ÿ, ������ũ");
		article2.setter("������ ���", "�� 17�� �� 8��");
		
		ws.newPosting(article1);
		ws.newPosting(article2);
	}
}
