package neoflex.singleton;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SimpleSingleton {
    static int countSingleton = 1;

    private final static SimpleSingleton simpleSingleton = new SimpleSingleton();

    private SimpleSingleton(){}


    public static void getInfoAboutFiels() {
        System.out.println("It`s fields: ");
        Field[] fields = simpleSingleton.getClass().getDeclaredFields();
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
        Method[] methods = simpleSingleton.getClass().getDeclaredMethods();
        int k = 1;
        for(Method method : methods){
            System.out.println(k + ") " + "modifier -  " + method.getModifiers() + " " +
                    "\n" + "name - " + method.getName());
            k++;
        }
    }

    public static void getAllInfoAboutSimple(){
        System.out.println("SIMPLE SINGLETON №" + countSingleton);
        System.out.println(simpleSingleton);
        System.out.println("It`s class: " + simpleSingleton.getClass());
        System.out.println("------");
        getInfoAboutFiels();
        System.out.println("------");
        getInfoAboutMethods();
        System.out.println("===========");
    }

    public static SimpleSingleton getInstance() {
       getAllInfoAboutSimple();
        countSingleton++;
        return simpleSingleton;
    }


}
