package neoflex.singleton;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LazySingleton {

    static int countSingleton = 1;

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static void getInfoAboutFiels() {
        System.out.println("It`s fields: ");
        Field[] fields = lazySingleton.getClass().getDeclaredFields();
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
        Method[] methods = lazySingleton.getClass().getDeclaredMethods();
        int k = 1;
        for(Method method : methods){
            System.out.println(k + ") " + "modifier -  " + method.getModifiers() + " " +
                    "\n" + "name - " + method.getName());
            k++;
        }
    }

    public static void getAllInfoAboutLazy(){
        System.out.println("LAZY SINGLETON №" + countSingleton);
        System.out.println(lazySingleton);
        System.out.println("It`s class: " + lazySingleton.getClass());
        System.out.println("------");
        getInfoAboutFiels();
        System.out.println("------");
        getInfoAboutMethods();
        System.out.println("===========");
        countSingleton++;
    }

    public static LazySingleton getInstance() {
        if( lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        getAllInfoAboutLazy();

        return lazySingleton;
    }

}
