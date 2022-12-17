package neoflex.singleton;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SyncSingleton {
    static int countSingleton = 1;

    private static SyncSingleton syncSingleton;

    private SyncSingleton(){}

    public static void getInfoAboutFiels() {
        System.out.println("It`s fields: ");
        Field[] fields = syncSingleton.getClass().getDeclaredFields();
        int k = 1;
        for(Field field : fields) {
            System.out.println(k + ") " + "type -  " + field.getType() + " " +
                    "\n" + "name - " + field.getName() + " " +
                    "\n" + "modifier - " + field.getModifiers());
            k++;
        }
    }

    public static void getInfoAboutMethods(){
        System.out.println("It`s methods: ");
        Method[] methods = syncSingleton.getClass().getDeclaredMethods();
        int k = 1;
        for(Method method : methods){
            System.out.println(k + ") " + "modifier -  " + method.getModifiers() + " " +
                    "\n" + "name - " + method.getName());
            k++;
        }
    }

    public static void getAllInfoAboutSync(){
        System.out.println("SYNCHRONISED SINGLETON №" + countSingleton);
        System.out.println(syncSingleton);
        System.out.println("It`s class: " + syncSingleton.getClass());
        System.out.println("------");
        getInfoAboutFiels();
        System.out.println("------");
        getInfoAboutMethods();
        System.out.println("===========");
        countSingleton++;
    }

    public static synchronized SyncSingleton getInstance(){
        if( syncSingleton == null){
            syncSingleton = new SyncSingleton();
        }
        getAllInfoAboutSync();

        return syncSingleton;
    }

}
