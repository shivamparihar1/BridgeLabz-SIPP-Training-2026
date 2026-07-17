package oops_practice.gcrcodebase.interfaces.OnlineCouponValidator;
public interface CouponValidator {

    void validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}