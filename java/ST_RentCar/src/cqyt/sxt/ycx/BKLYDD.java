package cqyt.sxt.ycx;

//别克林荫大道轿车
public class BKLYDD extends Car{
    public void CalcRent(int days) {
        System.out.println("别克林荫大道，租用"+days+"天，租金："+days*SinglePrice.BKLYDD);
   }
}
