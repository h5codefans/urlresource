package cqyt.sxt.ycx;

//宝马550i轿车
public class BM extends Car{
    public void CalcRent(int days) {
        System.out.println("宝马550i轿车，租用"+days+"天，租金:"+days*SinglePrice.BM);
   }
}
