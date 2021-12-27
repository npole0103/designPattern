package midterm.observer.third;

public class KakaoPlatform implements Observer{
	@Override
	public void update(Article article) {
		System.out.println("카카오톡으로 새글 알림");
		System.out.println(article);
		System.out.println();
	}
}
