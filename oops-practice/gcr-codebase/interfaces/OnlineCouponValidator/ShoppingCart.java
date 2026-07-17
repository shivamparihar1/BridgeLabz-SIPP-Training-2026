package oops_practice.gcrcodebase.interfaces.OnlineCouponValidator;
public class ShoppingCart implements CouponValidator {

    String[] couponCodes;

    public ShoppingCart(String[] couponCodes) {
        this.couponCodes = couponCodes;
    }

    @Override
    public void validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code)) {
            System.out.println(code + " : Valid Coupon");
        } else {
            System.out.println(code + " : Invalid Coupon");
        }
    }

    public void checkCoupons() {

        for (String code : couponCodes) {
            validateCoupon(code);
        }
    }
}
