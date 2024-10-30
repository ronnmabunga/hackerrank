import java.io.*;
import java.util.*;

class Solution {
    static class OrderComparator implements Comparator<Order> {
        @Override
        public int compare(Order d1, Order d2) {
            if (d1.st == d2.st) {
                return (d1.id).compareTo(d2.id);
            }
            return (d1.st).compareTo(d2.st);
        }
    }

    static class Order {
        Integer id;
        Integer st;

        Order() {
        }

        Order(Integer id, Integer st) {
            this.id = id;
            this.st = st;
        }
    }

    // Complete the jimOrders function below.
    static void jimOrders(Order[] orders) {
        Arrays.sort(orders, new OrderComparator());
        for (Order order : orders) {
            System.out.print(order.id + " ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Order[] orders = new Order[n];
        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            orders[i] = new Order(i + 1, Integer.parseInt(ordersRowItems[0]) + Integer.parseInt(ordersRowItems[1]));
        }

        jimOrders(orders);

        scanner.close();
    }
}
