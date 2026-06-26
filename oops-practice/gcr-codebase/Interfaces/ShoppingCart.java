package oops-practice.gcr-codebase.Interfaces;

interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 6;
    }
}

public class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE");
    }

    public static void main(String[] args) {

        String[] coupons = {
            "SAVE10",
            "OFF20",
            "SAVE50",
            "AB12",
            "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid");
            } else {
                System.out.println(coupon + " -> Invalid");
            }
        }
    }
}