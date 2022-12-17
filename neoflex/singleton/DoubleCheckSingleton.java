package neoflex.singleton;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DoubleCheckSingleton {
    static int countSingleton = 1;

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){}

    public static void getInfoAboutFiels() {
        System.out.println("It`s fields: ");
        Field[] fields = doubleCheckSingleton.getClass().getDeclaredFields();
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
        Method[] methods = doubleCheckSingleton.getClass().getDeclaredMethods();
        int k = 1;
        for(Method method : methods){
            System.out.println(k + ") " + "modifier -  " + method.getModifiers() + " " +
                    "\n" + "name - " + method.getName());
            k++;
        }
    }

    public static void getAllInfoAboutDouble(){
        System.out.println("SYNCHRONISED SINGLETON №" + countSingleton);
        System.out.println(doubleCheckSingleton);
        System.out.println("It`s class: " + doubleCheckSingleton.getClass());
        System.out.println("------");
        getInfoAboutFiels();
        System.out.println("------");
        getInfoAboutMethods();
        System.out.println("===========");
        countSingleton++;
    }

    public static DoubleCheckSingleton getInstance(){
        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        getAllInfoAboutDouble();
        return doubleCheckSingleton;
    }
}
