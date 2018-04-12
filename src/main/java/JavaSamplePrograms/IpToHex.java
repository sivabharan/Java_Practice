package JavaSamplePrograms;

import java.util.Scanner;
import sun.net.util.IPAddressUtil;

public class IpToHex {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the IpAddress");
        String ipAddress = scanner.next();
        boolean isIP = IPAddressUtil.isIPv4LiteralAddress(ipAddress);
        if(isIP == true) {
            System.out.println(convertIptoHex(ipAddress));
        }else{
            System.out.println("Please enter valid Ip Address");
        }

    }



    public static String convertIptoHex(String IpAddress){

        String hex = "";
        String[] part = IpAddress.split("[\\.,]");
        if (part.length < 4) {
            return "00000000";
        }
        for (int i = 0; i < 4; i++) {
            int decimal = Integer.parseInt(part[i]);
            if (decimal < 16) // Append a 0 to maintian 2 digits for every
            // number
            {
                hex += "0" + String.format("%01X", decimal);
            } else {
                hex += String.format("%01X", decimal);
            }
        }
        return hex;
    }
}
