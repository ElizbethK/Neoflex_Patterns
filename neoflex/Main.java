package neoflex;

import neoflex.proxy.DBConnecterImpl;
import neoflex.proxy.DBConnecterProxy;

public class Main {
    public static void main(String[] args) {
    //        -- SINGLETON --
  //        -- Simple singleton --
//        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
//        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
//        System.out.println(simpleSingleton1.equals(simpleSingleton));

  //        -- Lazy singleton --
//      LazySingleton lazySingleton = LazySingleton.getInstance();
//      LazySingleton lazySingleton2 = LazySingleton.getInstance();

  //      -- Singleton thread --
//        SingletonThread singletonThread = new SingletonThread();
//        Thread thread = new Thread(singletonThread);
//        thread.start();
//
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(lazySingleton);

  //        -- SyncSingleton --
//        SingletonThread singletonThread = new SingletonThread();
//        Thread thread = new Thread(singletonThread);
//        thread.start();
//
//        SyncSingleton syncSingleton = SyncSingleton.getInstance();
//        System.out.println(syncSingleton);

  //      --DoubleCheckSingleton --
//        SingletonThread singletonThread = new SingletonThread();
//        Thread thread = new Thread(singletonThread);
//        thread.start();
//
//        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
//        System.out.println(doubleCheckSingleton);


    //    -- FACTORY --
//        CoffeeMachine coffeeMachine = new CoffeeMachine();
//        VendingMachine vendingMachine = new VendingMachine(coffeeMachine);
//        vendingMachine.start(CoffeeType.ESPRESSO);



    //    -- ADAPTER --
//        StorageCard storageCard = new StorageCard();
//        USBAdapter usbAdapter = new USBAdapter(storageCard);
//        Computer computer = new Computer();
//        computer.connect(usbAdapter);


        //    -- PROXY --
//       DBConnecterImpl dbConnecter = new DBConnecterImpl();
//       DBConnecterProxy dbConnecterProxy = new DBConnecterProxy(dbConnecter);
//       dbConnecterProxy.connect("1234/people");
//       dbConnecterProxy.connect("9876/animals");
//       dbConnecterProxy.connect("1234/people");
//       dbConnecterProxy.connect("9876/animals");


    }
}
