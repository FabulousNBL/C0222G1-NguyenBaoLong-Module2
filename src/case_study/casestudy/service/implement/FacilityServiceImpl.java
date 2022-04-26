package casestudy.service.implement;

import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.service.FacilityService;
import casestudy.util.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static final String ID_VILLA = "^(SVVL)-\\d{4}$";
    public static final String ID_HOUSE = "^(SVHO)-\\d{4}$";
    public static final String ID_ROOM = "^(SVRO)-\\d{4}$";
    public static final String RENT_TYPE = "^(Day|Month|Year|Hour)$";
    public static final String ROOM_STANDARD = "^(Vip|Normal|Single|Double)$";
    public static final String NAME_SERVICE = "^[A-Z][a-z]{1,10}$";

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static Map<Facility, Integer> getFacilityIntegerMap() {
        return facilityIntegerMap;
    }

    public static void setFacilityIntegerMap(Map<Facility, Integer> facilityIntegerMap) {
        FacilityServiceImpl.facilityIntegerMap = facilityIntegerMap;
    }

    static {
        Villa villa = new Villa("villa1", "day", "VIP", 4,
                400, 8000, 4, "villa1", 500);
        facilityIntegerMap.put(villa, 0);
        House house = new House("house1", "month", "Normal", 2,
                300, 3000, 3, "house1");
        facilityIntegerMap.put(house, 0);

        Room room = new Room("room1", "day", 100, 500,
                2, "room1", "Free breakfast");
        facilityIntegerMap.put(room, 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " rent: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
    }

    @Override
    public void addNewVilla() {
        String id = inputIDVilla();
        System.out.println("Enter service's name");
        String nameService = nameService();
        System.out.println("1. Day    2. Month    3. Year    4. Hour");
        String rentType = rentType();
        System.out.println("Các loại phòng: ");
        System.out.println("1.Vip   2.Normal   3.Single   4.Double)");
        String roomLevel = roomStandard();
        int floor;
        while (true) {
            try {
                System.out.println("Enter floor ");
                floor = Integer.parseInt(sc.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("Floor must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int villaArea;
        while (true) {
            try {
                System.out.println("Enter villa's area");
                villaArea = Integer.parseInt(sc.nextLine());
                if (villaArea > 100) {
                    break;
                } else {
                    System.out.println("Villa 's area must greater than 100m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int rentFee;
        while (true) {
            try {
                System.out.println("Enter rent's fee");
                rentFee = Integer.parseInt(sc.nextLine());
                if (rentFee > 0) {
                    break;
                } else {
                    System.out.println("Rent's fee must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int amountCustomer;
        while (true) {
            try {
                System.out.println("Enter customer 's amount");
                amountCustomer = Integer.parseInt(sc.nextLine());
                if (amountCustomer > 0) {
                    break;
                } else {
                    System.out.println("Customer 's amount must greater than 0 and less than 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }

        int poolArea;
        while (true) {
            try {
                System.out.println("Enter pool's area");
                poolArea = Integer.parseInt(sc.nextLine());
                if (poolArea > 30) {
                    break;
                } else {
                    System.out.println("Pool's area must greater than 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        Villa villa = new Villa(nameService, rentType, roomLevel,
                floor, villaArea, rentFee, amountCustomer, id, poolArea);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Added successful");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter service's name");
        String nameService = nameService();
        String id = inputIDHouse();
        System.out.println("Enter  room's type");
        String roomLevel = roomStandard();
        System.out.println("1. Day    2. Month    3. Year    4. Hour");
        String rentType = rentType();
        int floor;
        while (true) {
            try {
                System.out.println("Enter floor ");
                floor = Integer.parseInt(sc.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.out.println("Floor must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int houseArea;
        while (true) {
            try {
                System.out.println("Enter house's area");
                houseArea = Integer.parseInt(sc.nextLine());
                if (houseArea > 100) {
                    break;
                } else {
                    System.out.println("House's area must greater than 100m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int rentCost;
        while (true) {
            try {
                System.out.println("Enter rent's fee");
                rentCost = Integer.parseInt(sc.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("Rent's fee must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int amountCustomer;
        while (true) {
            try {
                System.out.println("Enter customer's amount");
                amountCustomer = Integer.parseInt(sc.nextLine());
                if (amountCustomer > 0) {
                    break;
                } else {
                    System.out.println("Customer 's amount must greater than 0 and less than 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        House house = new House(nameService, rentType, roomLevel, floor, houseArea, rentCost, amountCustomer, id);
        facilityIntegerMap.put(house, 0);
        System.out.println("Added successful");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập tên dịch vụ");
        String nameService = nameService();
        String id = inputIDRoom();
        String freeService = nameService();
        System.out.println("1. Day    2. Month    3. Year    4. Hour");
        String rentType = rentType();
        int roomArea;
        while (true) {
            try {
                System.out.println("Enter room's area");
                roomArea = Integer.parseInt(sc.nextLine());
                if (roomArea > 100) {
                    break;
                } else {
                    System.out.println("Room 's area must greater than 100m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int rentCost;
        while (true) {
            try {
                System.out.println("Enter rent's fee");
                rentCost = Integer.parseInt(sc.nextLine());
                if (rentCost > 0) {
                    break;
                } else {
                    System.out.println("Rent 's fee must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        int amountCustomer;
        while (true) {
            try {
                System.out.println("Enter customer's amount");
                amountCustomer = Integer.parseInt(sc.nextLine());
                if (amountCustomer > 0 && amountCustomer < 20) {
                    break;
                } else {
                    System.out.println("Customer 's amount must greater than 0 and less than 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong format");
            }
        }
        Room room = new Room(nameService, rentType, roomArea, rentCost, amountCustomer, id, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Added successful");
    }

    private String inputIDVilla() {
        System.out.println("Enter villa's id");
        return RegexData.regexStr(sc.nextLine(), ID_VILLA,
                "You has input the wrong format,the right format is SVVL-XXXX( with XXXX are 4 random number )");
    }

    private String inputIDHouse() {
        System.out.println("Enter house's id");
        return RegexData.regexStr(sc.nextLine(), ID_HOUSE,
                "You has input the wrong format,the right format is SVHO-XXXX( with XXXX are 4 random number )");
    }

    private String inputIDRoom() {
        System.out.println("Enter room's id");
        return RegexData.regexStr(sc.nextLine(), ID_ROOM,
                "You has input the wrong format,the right format is SVRO-XXXX( with XXXX are 4 random number )");
    }

    private String nameService() {
        return RegexData.regexStr(sc.nextLine(), NAME_SERVICE,
                "You has input the wrong format," +
                        "the right format is the first character is capital and the others are lower case");
    }

    private String rentType() {
        System.out.println("Enter rent's type ");
        return RegexData.regexStr(sc.nextLine(), RENT_TYPE,
                "You has input the wrong format,the right format is one of the elements that mentioned above ");
    }

    private String roomStandard() {
        System.out.println("Enter room's standard ");
        return RegexData.regexStr(sc.nextLine(), ROOM_STANDARD,
                "You has input the wrong format,the right format is one of the elements that mentioned above ");
    }
}
