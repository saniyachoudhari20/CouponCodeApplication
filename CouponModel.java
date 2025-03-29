package model;

import java.util.Random;

public class CouponModel {
     private String couponCode;
    private double discountPercentage;
    public String generateCouponCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder coupon = new StringBuilder();
        
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(characters.length());
            coupon.append(characters.charAt(randomIndex));
        }
        this.couponCode = coupon.toString();
        return this.couponCode;
    }

    public double getDiscountPercentage(int userType) {
        discountPercentage = switch (userType) {
             case 1 -> 15.0;
             case 2 -> 10.0;
             case 3 -> 20.0;
             default -> 0.0;
         };
        return discountPercentage;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
