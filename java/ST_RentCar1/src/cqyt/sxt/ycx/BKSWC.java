package cqyt.sxt.ycx;

//别克商务舱GL8轿车
public class BKSWC extends Car {

    public int CalcRent(int days) {
        System.out.println("别克商务舱GL8，租用"+days+"天，租金："+days*SinglePrice.BKSWC);
        return days*SinglePrice.BKSWC;
   }
}
