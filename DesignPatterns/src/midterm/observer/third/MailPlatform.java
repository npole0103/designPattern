package midterm.observer.third;

public class MailPlatform implements Observer{
	@Override
	public void update(Article article) {
		System.out.println("메일로 새글 알림");
		System.out.println(article);
		System.out.println();
	}
}
