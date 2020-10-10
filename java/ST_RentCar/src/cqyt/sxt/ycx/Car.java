package cqyt.sxt.ycx;

//ΩŒ≥µ¿‡
public class Car extends MotoVehicle {
	
	private String type;
	private Car car;
	public Car() {

	}
	
    public Car(Car car) {
		this.car = car;
	}

	public Car(String no,String type) {
		super(no);
		this.type = type;

	}

	@Override
    public void CalcRent(int days) {
		car.CalcRent(days);
    }
}
