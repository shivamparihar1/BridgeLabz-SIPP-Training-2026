package oops_practice.oops_class_practice_problem.CouponValidator;

public class ShopingCart implements ICouponValidator {

    @Override
    public boolean couponValidator(String code) {

        return ICouponValidator.isLength(code) && code.toUpperCase().startsWith("SAVE");
    }

//    static boolean isLength(String code){
//
//    } static method can't be override this is overhidden  word same as override


}
