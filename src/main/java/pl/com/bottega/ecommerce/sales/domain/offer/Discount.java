package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String discountCause;

    private Money discount;

    public Discount(String discountCause, Money discount) {
        this.discountCause = discountCause;
        this.discount = discount;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public Money getDiscount() {
        return discount;
    }

}
