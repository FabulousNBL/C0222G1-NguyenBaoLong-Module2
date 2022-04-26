package casestudy.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService,
                String rentType,
                int areaUse,
                int feeRent,
                int maximumCustomer,
                String id,
                String freeService) {

        super(nameService, rentType, areaUse, feeRent, maximumCustomer, id);
        this.freeService = freeService;
    }

    @Override
    public int getMaintain() {
        return super.getMaintain();
    }

    @Override
    public void setMaintain(int maintain) {
        super.setMaintain(maintain);
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public String getRentType() {
        return super.getRentType();
    }

    @Override
    public void setRentType(String rentType) {
        super.setRentType(rentType);
    }

    @Override
    public int getAreaUse() {
        return super.getAreaUse();
    }

    @Override
    public void setAreaUse(int areaUse) {
        super.setAreaUse(areaUse);
    }

    @Override
    public int getFeeRent() {
        return super.getFeeRent();
    }

    @Override
    public void setFeeRent(int feeRent) {
        super.setFeeRent(feeRent);
    }

    @Override
    public String getRoomLevel() {
        return super.getRoomLevel();
    }

    @Override
    public void setRoomLevel(String roomLevel) {
        super.setRoomLevel(roomLevel);
    }

    @Override
    public int getFloor() {
        return super.getFloor();
    }

    @Override
    public void setFloor(int floor) {
        super.setFloor(floor);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public int getMaximumCustomer() {
        return super.getMaximumCustomer();
    }

    @Override
    public void setMaximumCustomer(int maximumCustomer) {
        super.setMaximumCustomer(maximumCustomer);
    }

    @Override
    public String toString() {
        return super.toString() + ", free service = " + freeService;
    }
}
