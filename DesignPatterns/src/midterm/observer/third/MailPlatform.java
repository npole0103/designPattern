package midterm.observer.third;

public class MailPlatform implements Observer{
	@Override
	public void update(Article article) {
		System.out.println("���Ϸ� ���� �˸�");
		System.out.println(article);
		System.out.println();
	}
}
