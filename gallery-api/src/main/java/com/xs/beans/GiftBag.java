package com.xs.beans;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_gift_bag")
public class GiftBag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 礼包名称
     */
    private String title;

    /**
     * 商品id集合（赠送门槛：指定商品）
     */
    @Column(name = "item_ids")
    private String itemIds;

    /**
     * 满赠金额
     */
    @Column(name = "full_of_gifts")
    private BigDecimal fullOfGifts;

    /**
     * 优惠券id集合（用于指定赠送的优惠券）
     */
    @Column(name = "coupon_ids")
    private String couponIds;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modify
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * @param gmtModify
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 获取礼包名称
     *
     * @return title - 礼包名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置礼包名称
     *
     * @param title 礼包名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取商品id集合（赠送门槛：指定商品）
     *
     * @return item_ids - 商品id集合（赠送门槛：指定商品）
     */
    public String getItemIds() {
        return itemIds;
    }

    /**
     * 设置商品id集合（赠送门槛：指定商品）
     *
     * @param itemIds 商品id集合（赠送门槛：指定商品）
     */
    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    /**
     * 获取满赠金额
     *
     * @return full_of_gifts - 满赠金额
     */
    public BigDecimal getFullOfGifts() {
        return fullOfGifts;
    }

    /**
     * 设置满赠金额
     *
     * @param fullOfGifts 满赠金额
     */
    public void setFullOfGifts(BigDecimal fullOfGifts) {
        this.fullOfGifts = fullOfGifts;
    }

    /**
     * 获取优惠券id集合（用于指定赠送的优惠券）
     *
     * @return coupon_ids - 优惠券id集合（用于指定赠送的优惠券）
     */
    public String getCouponIds() {
        return couponIds;
    }

    /**
     * 设置优惠券id集合（用于指定赠送的优惠券）
     *
     * @param couponIds 优惠券id集合（用于指定赠送的优惠券）
     */
    public void setCouponIds(String couponIds) {
        this.couponIds = couponIds;
    }
}