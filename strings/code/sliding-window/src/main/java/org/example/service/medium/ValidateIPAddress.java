package org.example.service.medium;

/// Leetcode 468. Validate IP Address
public class ValidateIPAddress {

    public String validate(String queryIP){
        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return validateIPv4(queryIP);
        } else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            return validateIPv6(queryIP);
        } else {
            return "Neither";
        }
    }

    private String validateIPv4(String ip) {
        String[] nums = ip.split("\\.", -1);
        for (String x : nums) {
            // Check length: 1-3 digits
            if (x.length() == 0 || x.length() > 3) return "Neither";

            // Check leading zeros
            if (x.charAt(0) == '0' && x.length() != 1) return "Neither";

            // Check if all characters are digits and value is <= 255
            for (char ch : x.toCharArray()) {
                if (!Character.isDigit(ch)) return "Neither";
            }
            if (Integer.parseInt(x) > 255) return "Neither";
        }
        return "IPv4";
    }

    private String validateIPv6(String ip) {
        String[] nums = ip.split(":", -1);
        String hexdigits = "0123456789abcdefABCDEF";
        for (String x : nums) {
            // Check length: 1-4 hex digits
            if (x.length() == 0 || x.length() > 4) return "Neither";

            // Check if characters are valid hex
            for (Character ch : x.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) return "Neither";
            }
        }
        return "IPv6";
    }
}
