package smartRobot;

public class Kiva {
	
	static void task() {
        System.out.println("Task is assigned to KIVA bot to help a picker in picking the product");
        move();
    }

    static void move() {
        System.out.println("The KIVA bot starts moving");
        scan();
    }

    static void scan() {
        System.out.println("The kiva bot scans the barcodes on the ground using its cameras and process the images using the image processing unit");
        lift();
    }

    static void lift() {
        System.out.println("The bot spots the exact pod which contains the product and lifts it with motors");
        drop();
    }

    static void drop() {
        System.out.println("The bot moves to the picker, just in time, when the product is about to be packed ");
        charge();
    }

    static void charge() {
        System.out.println("The bot detects when it needs to be charged and finds the nearest charging station and moves towards it and charged itself");
        ready();
    }

    static void ready() {
        System.out.println("The bot is fully charged and is ready to be assigned with a new task");
    }

    public static void main(String[] args) {
        task();
    }


}
