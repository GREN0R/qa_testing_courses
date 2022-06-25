package Home;

import Home.StoreData;

public class Launch {
    public static void main(String[] args) {
        Home.Launch launch = new Home.Launch();
        launch.run();

    }
    public void run(){
        Home.StoreData storeData = new StoreData();
//        storeData.a = 1;
//        storeData.b = 2;
        storeData.setA(1);
        storeData.setB(true);
        storeData.setC(String.valueOf("Grenor"));
        storeData.setD(5.5);


        System.out.println(storeData.getA() + " " + storeData.getB() +" " + storeData.getC() +" " + storeData.getD());
    }
}