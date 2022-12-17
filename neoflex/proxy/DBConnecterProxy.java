package neoflex.proxy;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class DBConnecterProxy implements IDBConnecter {
    private DBConnecterImpl dBConnecterImpl;
    private final ArrayList<String> cache;

    public DBConnecterProxy(DBConnecterImpl dBConnecterImpl) {
        this.dBConnecterImpl = dBConnecterImpl;
        cache = new ArrayList<>();
    }

    @Override
    public String connect(String address) {

            if(cache.contains(address)){
                int i = cache.indexOf(address);
                System.out.println("...connecting with cache");
                System.out.println("-> connected with localhost:" + cache.get(i));
                System.out.println("the number in the cache list - " + ( i + 1 ) );
                System.out.println("");
                return address;
            }
            else {
                cache.add(address);
                return dBConnecterImpl.connect(address);
            }
    }
}
