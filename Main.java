public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        QueueX mainQueue = new QueueX(5);
        
      
        System.out.println("Enter 5 transaction IDs:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter transaction ID " + (i + 1) + ": ");
            int transactionID = scanner.nextInt();
            mainQueue.insert(transactionID);
        }
        
        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);
        
        
        while (!mainQueue.isEmpty()) {
            int transactionID = mainQueue.remove();
            if (transactionID % 2 == 0) {
                evenQueue.insert(transactionID);
            } else {
                oddQueue.insert(transactionID);
            }
        }
        
    
        System.out.println("\nPC1");
        while (!evenQueue.isEmpty()) {
            int transactionID = evenQueue.remove();
            System.out.println("Transaction " + transactionID);
        }
        
        System.out.println("\nPC2");
        while (!oddQueue.isEmpty()) {
            int transactionID = oddQueue.remove();
            System.out.println("Transaction " + transactionID);
        }
        
        scanner.close();
    }
}