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
		gumballMachine.releaseBall(); //�ϳ� �̰�
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState()); //�ϳ� �̾Ҵµ� ���ٸ� SoldOut
		} else {
			gumballMachine.releaseBall(); //�˺��� �� �ִٸ� �ѹ� �� ����
			if (gumballMachine.getCount() > 0) { // NoQuarter ���·� �ٲ�
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else { //���� Gumball�� ���ٸ� SoldOut
            	System.out.println("Oops, out of gumballs!"); //Gumball ���� ���
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
