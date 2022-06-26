package OLD.Home;

public class Launch {
    public static void main(String[] args) {
        Launch launch = new Launch();
        launch.run();

    }
    public void run(){
        StoreData storeData = new StoreData();
//        storeData.a = 1;
//        storeData.b = 2;
        storeData.setA(1);
        storeData.setB(true);
        storeData.setC(String.valueOf("Grenor"));
        storeData.setD(5.5);


        System.out.println(storeData.getA() + " " + storeData.getB() +" " + storeData.getC() +" " + storeData.getD());
    }
}