package homework_28;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid IP address");
        String ipAddress = sc.nextLine();
        boolean b = validateIpAddress(ipAddress);
        if (b == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    public static boolean validateIpAddress(String ipAddress) {
        boolean b1 = false;
        StringTokenizer t = new StringTokenizer(ipAddress, ".");
        int a = Integer.parseInt(t.nextToken());
        int b = Integer.parseInt(t.nextToken());
        int c = Integer.parseInt(t.nextToken());
        int d = Integer.parseInt(t.nextToken());
        if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255)
                && (c >= 0 && c <= 255) && (d >= 0 && d <= 255))
            b1 = true;
        return b1;
    }
}

