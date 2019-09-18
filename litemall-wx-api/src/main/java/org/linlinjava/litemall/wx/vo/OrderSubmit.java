package org.linlinjava.litemall.wx.vo;

import org.linlinjava.litemall.db.domain.LitemallActive;

import java.util.List;

public class OrderSubmit {

    private Integer cartId;
    private Integer addressId;
    private Integer couponId;
    private String message;
    private Integer grouponRulesId;
    private Integer grouponLinkId;
    private List<LitemallActive> actives;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getGrouponRulesId() {
        return grouponRulesId;
    }

    public void setGrouponRulesId(Integer grouponRulesId) {
        this.grouponRulesId = grouponRulesId;
    }

    public Integer getGrouponLinkId() {
        return grouponLinkId;
    }

    public void setGrouponLinkId(Integer grouponLinkId) {
        this.grouponLinkId = grouponLinkId;
    }

    public List<LitemallActive> getActives() {
        return actives;
    }

    public void setActives(List<LitemallActive> actives) {
        this.actives = actives;
    }
}
