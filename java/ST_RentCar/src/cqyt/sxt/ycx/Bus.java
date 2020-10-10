package cqyt.sxt.ycx;

//¿Í³µÀà
public class Bus extends MotoVehicle{

	protected static int seatCount;
	protected static boolean flag;
	private Bus bus;
	public Bus() {
	}
	
	public Bus(Bus bus) {
		this.bus = bus;
	}    
    
	
	public Bus(boolean flag) {
		this.flag = flag;
	}

	public  Bus(String no, int seatCount) {
		super(no);
		this.seatCount = seatCount;
	}

	@Override
	public  void CalcRent(int days) {
		bus.CalcRent(days);
	}
}
