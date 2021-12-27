package midterm.observer.third;

import java.util.ArrayList;
import java.util.List;

public class WebSite implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private Article article;

	public WebSite() {}
	public WebSite(List<Observer> observers) {
		this.observers = observers;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int idx = observers.indexOf(observer);

		if (idx >= 0) {
			observers.remove(idx);
		}
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(article);
		}
	}

	public void newPosting(Article article) {
		this.article = article;
		notifyObservers();
	}
}
