package oop_homework;

import lombok.ToString;

@ToString
public class DiscountRate {

    public String serviceDiscount;
    public String productDiscount;
    public static double servicePremiumMember = 0.2;
    public static double serviceGoldMember = 0.15;
    public static double serviceSilverMember = 0.1;
    public static double productDiscountPremium = 0.1;
    public static double productDiscountGold = 0.1;
    public static double productDiscountSilver = 0.1;


    public static double getProductDiscount(String productDiscount) {
        if ("Premium".equals(productDiscount)) {
            return productDiscountPremium;
        } else if ("Gold".equals(productDiscount)) {
            return productDiscountGold;
        } else if ("Silver".equals(productDiscount)) {
            return productDiscountSilver;
        }
        return 0;
    }

    public static double getServiceDiscount(String serviceDiscount) {
        switch (serviceDiscount) {
            case "Premium":
                return servicePremiumMember;
            case "Gold":
                return serviceGoldMember;
            case "Silver":
                return serviceSilverMember;
            default:
                return 0;
        }

    }


}

