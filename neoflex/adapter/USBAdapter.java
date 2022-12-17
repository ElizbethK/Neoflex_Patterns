package neoflex.adapter;

public class USBAdapter implements USB {

     private final StorageCard storageCard;

     public USBAdapter(StorageCard storageCard) {
          this.storageCard = storageCard;
     }

     @Override
     public void connect() {
          storageCard.insert();
     }
}
