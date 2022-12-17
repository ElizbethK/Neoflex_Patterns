package neoflex.proxy;

public class DBConnecterImpl implements IDBConnecter {


    @Override
    public String connect(String address) {
        System.out.println("...connecting with new database");
        System.out.println("-> connected with localhost:" + address);
        System.out.println("");
        return address;
    }
}
