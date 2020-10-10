package cn.bjsxt.lianxi;



public class TestBankException {
      public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("存款后目前有："+bank.savings(40)+"元。");
		System.out.println("存款后目前有："+bank.savings(40)+"元。");
		System.out.println("存款后目前有："+bank.savings(40)+"元。");
		System.out.println("取款后目前有："+bank.atm(60)+"元。");
		System.out.println("取款后目前有："+bank.atm(60)+"元。");
		System.out.println("取款后目前有："+bank.atm(60)+"元。");
	}
}
class Bank{
	private  int sum;
	
	public  int atm(int x){

			try{
				if(x>sum){
				throw new BankException("余额不足,结束本次操作");
				}
				sum=sum-x;
				return sum;
				
			}catch (BankException e) {
				e.printStackTrace();
			}
			
			return sum;
		}
	public int savings(int x){
	   sum=sum+x;
	   return sum;
	}
}
class BankException extends Exception{
	public BankException(){
		
	}
	public BankException(String message){
		super(message);
	}
}
