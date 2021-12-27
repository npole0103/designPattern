package midterm.observer.first;

public class Main {
	public static void main(String[] args) {
		Kayne kayne = new Kayne();
		Student mike = new Mike();
		Student john = new John();
		Student pawn = new Pawn();
		
		kayne.subscribe(mike);
		kayne.subscribe(john);
		kayne.subscribe(pawn);
		
		kayne.goToSchool();
		kayne.teaching();
		kayne.breakTime();
		kayne.goToHome();
		
		kayne.unSubscribe(pawn);
		
		kayne.goToSchool();
	}
}
