package midterm.observer.third;

public class Article {
    private String title;
    private String content;
    
    public void setter(String title, String content) {
		this.title = title;
		this.content = content;
	}
    
    @Override
    public String toString() {
    	return "���� : " + title + "\n" + "���� : " + content ;
    }
}

