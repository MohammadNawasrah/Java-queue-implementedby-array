import java.time.Clock;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("Your menu :");
        System.out.println("1-Add to queue");
        System.out.println("2-Remove from queue");
        System.out.println("3-Get front of queue");
        System.out.println("4-Get rear of queue");
        System.out.println("5-Get front");
        System.out.println("6-Get rear");
        System.out.println("7-Print queue");
        System.out.println("8-Exit");
        System.out.print("Select your choice :");

    }

    public static void main(String[] args) {
        System.out.print("Please enter size of queue :");

        int sizeOfQueue = scanner.nextInt();
        Queue queue = new Queue(sizeOfQueue);
        boolean exit = false;
        while (!exit) {
            menu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter item to add queue :");
                    scanner.nextLine();
                    String number = scanner.nextLine();
                    queue.enqueue(number);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Queue front :"+queue.getQueueFront());
                    break;
                case 4:
                    System.out.println("Queue rear :"+queue.getQueueRear());
                    break;
                case 5:
                    System.out.println("My front :"+queue.getFront());
                    break;
                case 6:
                    System.out.println("My rear :"+queue.getRear());
                    break;
                case 7:
                    queue.print();
                    break;
                case 8:
                    exit=true;
                    break;
                default:
                    System.out.println("Your choice is not available choose another choice .");
            }
        }
//        queue.enqueue(10);
//        queue.enqueue(11);
//        queue.enqueue(20);
//        queue.enqueue(15);
//        queue.enqueue(10);
//        queue.enqueue(130);
//        queue.enqueue(130);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(10);
//        queue.enqueue(130);
//        queue.enqueue(130);
//
//        System.out.println("Queue front :"+queue.getQueueFront());
//        System.out.println("Queue rear :"+queue.getQueueRear());
//        System.out.println("My front :"+queue.getFront());
//        System.out.println("My rear :"+queue.getRear());
//        queue.print();

    }
}