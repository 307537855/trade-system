// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.request;

import com.zts.xtp.common.enums.*;

import java.io.Serializable;

public class OrderInsertRequest implements Serializable {
    /**
     * XTP系统订单ID，无需用户填写，在XTP系统中唯一
     */
    private String orderXtpId;
    /**
     * 报单引用，由客户自定义
     */
    private int orderClientId;
    /**
     * 合约代码 客户端请求不带空格
     */
    private String ticker;
    /**
     * 交易市场
     */
    private MarketType marketType;
    /**
     * 价格
     */
    private double price;
    /**
     * 止损价
     */
    private double stopPrice;
    /**
     * 数量(股票单位为股，逆回购单位为张)
     */
    private long quantity;
    /**
     * 报单价格
     */
    private PriceType priceType;
    /**
     * 买卖方向
     */
    private SideType sideType;
    /**
     * 开平标志
     */
    private PositionEffectType positionEffectType;
    /**
     * 业务类型
     */
    private BusinessType businessType;

    public int getMarketType() {
        return marketType.ordinal();
    }

    public int getPriceType() {
        return priceType.getType();
    }

    public int getSideType() {
        return sideType.getType();
    }

    public int getPositionEffectType() {
        if (positionEffectType == null) return 0;//默认为初始化类型  现货适用
         else return positionEffectType.ordinal();
    }

    public int getBusinessType() {
        return businessType.ordinal();
    }


    @SuppressWarnings("all")
    public static class OrderInsertRequestBuilder {
        @SuppressWarnings("all")
        private String orderXtpId;
        @SuppressWarnings("all")
        private int orderClientId;
        @SuppressWarnings("all")
        private String ticker;
        @SuppressWarnings("all")
        private MarketType marketType;
        @SuppressWarnings("all")
        private double price;
        @SuppressWarnings("all")
        private double stopPrice;
        @SuppressWarnings("all")
        private long quantity;
        @SuppressWarnings("all")
        private PriceType priceType;
        @SuppressWarnings("all")
        private SideType sideType;
        @SuppressWarnings("all")
        private PositionEffectType positionEffectType;
        @SuppressWarnings("all")
        private BusinessType businessType;

        @SuppressWarnings("all")
        OrderInsertRequestBuilder() {
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder orderXtpId(final String orderXtpId) {
            this.orderXtpId = orderXtpId;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder orderClientId(final int orderClientId) {
            this.orderClientId = orderClientId;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder marketType(final MarketType marketType) {
            this.marketType = marketType;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder price(final double price) {
            this.price = price;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder stopPrice(final double stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder quantity(final long quantity) {
            this.quantity = quantity;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder priceType(final PriceType priceType) {
            this.priceType = priceType;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder sideType(final SideType sideType) {
            this.sideType = sideType;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder positionEffectType(final PositionEffectType positionEffectType) {
            this.positionEffectType = positionEffectType;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequestBuilder businessType(final BusinessType businessType) {
            this.businessType = businessType;
            return this;
        }

        @SuppressWarnings("all")
        public OrderInsertRequest build() {
            return new OrderInsertRequest(orderXtpId, orderClientId, ticker, marketType, price, stopPrice, quantity, priceType, sideType, positionEffectType, businessType);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "OrderInsertRequest.OrderInsertRequestBuilder(orderXtpId=" + this.orderXtpId + ", orderClientId=" + this.orderClientId + ", ticker=" + this.ticker + ", marketType=" + this.marketType + ", price=" + this.price + ", stopPrice=" + this.stopPrice + ", quantity=" + this.quantity + ", priceType=" + this.priceType + ", sideType=" + this.sideType + ", positionEffectType=" + this.positionEffectType + ", businessType=" + this.businessType + ")";
        }
    }

    @SuppressWarnings("all")
    public static OrderInsertRequestBuilder builder() {
        return new OrderInsertRequestBuilder();
    }

    /**
     * XTP系统订单ID，无需用户填写，在XTP系统中唯一
     */
    @SuppressWarnings("all")
    public String getOrderXtpId() {
        return this.orderXtpId;
    }

    /**
     * 报单引用，由客户自定义
     */
    @SuppressWarnings("all")
    public int getOrderClientId() {
        return this.orderClientId;
    }

    /**
     * 合约代码 客户端请求不带空格
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 价格
     */
    @SuppressWarnings("all")
    public double getPrice() {
        return this.price;
    }

    /**
     * 止损价
     */
    @SuppressWarnings("all")
    public double getStopPrice() {
        return this.stopPrice;
    }

    /**
     * 数量(股票单位为股，逆回购单位为张)
     */
    @SuppressWarnings("all")
    public long getQuantity() {
        return this.quantity;
    }

    /**
     * XTP系统订单ID，无需用户填写，在XTP系统中唯一
     */
    @SuppressWarnings("all")
    public void setOrderXtpId(final String orderXtpId) {
        this.orderXtpId = orderXtpId;
    }

    /**
     * 报单引用，由客户自定义
     */
    @SuppressWarnings("all")
    public void setOrderClientId(final int orderClientId) {
        this.orderClientId = orderClientId;
    }

    /**
     * 合约代码 客户端请求不带空格
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 交易市场
     */
    @SuppressWarnings("all")
    public void setMarketType(final MarketType marketType) {
        this.marketType = marketType;
    }

    /**
     * 价格
     */
    @SuppressWarnings("all")
    public void setPrice(final double price) {
        this.price = price;
    }

    /**
     * 止损价
     */
    @SuppressWarnings("all")
    public void setStopPrice(final double stopPrice) {
        this.stopPrice = stopPrice;
    }

    /**
     * 数量(股票单位为股，逆回购单位为张)
     */
    @SuppressWarnings("all")
    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    /**
     * 报单价格
     */
    @SuppressWarnings("all")
    public void setPriceType(final PriceType priceType) {
        this.priceType = priceType;
    }

    /**
     * 买卖方向
     */
    @SuppressWarnings("all")
    public void setSideType(final SideType sideType) {
        this.sideType = sideType;
    }

    /**
     * 开平标志
     */
    @SuppressWarnings("all")
    public void setPositionEffectType(final PositionEffectType positionEffectType) {
        this.positionEffectType = positionEffectType;
    }

    /**
     * 业务类型
     */
    @SuppressWarnings("all")
    public void setBusinessType(final BusinessType businessType) {
        this.businessType = businessType;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OrderInsertRequest(orderXtpId=" + this.getOrderXtpId() + ", orderClientId=" + this.getOrderClientId() + ", ticker=" + this.getTicker() + ", marketType=" + this.getMarketType() + ", price=" + this.getPrice() + ", stopPrice=" + this.getStopPrice() + ", quantity=" + this.getQuantity() + ", priceType=" + this.getPriceType() + ", sideType=" + this.getSideType() + ", positionEffectType=" + this.getPositionEffectType() + ", businessType=" + this.getBusinessType() + ")";
    }

    @SuppressWarnings("all")
    public OrderInsertRequest() {
    }

    @SuppressWarnings("all")
    public OrderInsertRequest(final String orderXtpId, final int orderClientId, final String ticker, final MarketType marketType, final double price, final double stopPrice, final long quantity, final PriceType priceType, final SideType sideType, final PositionEffectType positionEffectType, final BusinessType businessType) {
        this.orderXtpId = orderXtpId;
        this.orderClientId = orderClientId;
        this.ticker = ticker;
        this.marketType = marketType;
        this.price = price;
        this.stopPrice = stopPrice;
        this.quantity = quantity;
        this.priceType = priceType;
        this.sideType = sideType;
        this.positionEffectType = positionEffectType;
        this.businessType = businessType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderInsertRequest)) return false;
        final OrderInsertRequest other = (OrderInsertRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderXtpId = this.getOrderXtpId();
        final Object other$orderXtpId = other.getOrderXtpId();
        if (this$orderXtpId == null ? other$orderXtpId != null : !this$orderXtpId.equals(other$orderXtpId)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OrderInsertRequest;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderXtpId = this.getOrderXtpId();
        result = result * PRIME + ($orderXtpId == null ? 43 : $orderXtpId.hashCode());
        return result;
    }
}
