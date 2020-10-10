package cqyt.sxt.ycx;


//机动车抽象类
abstract class MotoVehicle {

	protected String no;
	protected String brand;
	protected String color;
	//里程
	protected String mileage;
    public MotoVehicle() {
	}
	public MotoVehicle(String no) {
		this.no = no;
	}

	public abstract int CalcRent(int days);
}
