package midterm.observer.third;

public class KakaoPlatform implements Observer{
	@Override
	public void update(Article article) {
		System.out.println("īī�������� ���� �˸�");
		System.out.println(article);
		System.out.println();
	}
}
