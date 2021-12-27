package headfirst.state.gumballstatewinner;

public class WinnerState implements State {
    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
 
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}
 
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall(); //하나 뽑고
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState()); //하나 뽑았는데 없다면 SoldOut
		} else {
			gumballMachine.releaseBall(); //검볼이 더 있다면 한번 더 뽑음
			if (gumballMachine.getCount() > 0) { // NoQuarter 상태로 바꿈
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else { //만약 Gumball이 없다면 SoldOut
            	System.out.println("Oops, out of gumballs!"); //Gumball 없는 경우
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
