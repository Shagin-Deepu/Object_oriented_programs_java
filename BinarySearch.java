import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, key, low = 0, high, mid, flag = 0,i;
        
        System.out.println("Enter the size of the array:");
        a = sc.nextInt();
        int[] A = new int[a];
        
        System.out.println("Enter the elements:");
        for (i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number to search:");
        key = sc.nextInt();
        high = a - 1;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (A[mid] == key) {
                flag = 1;
                System.out.println("index position:" + mid);
                break;
            } else if (A[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (flag == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
        
        sc.close();
    }
}

