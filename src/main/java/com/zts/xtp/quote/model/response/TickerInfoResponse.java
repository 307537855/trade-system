// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.quote.model.response;

import com.zts.xtp.common.enums.ExchangeType;
import com.zts.xtp.common.enums.TickerType;

public class TickerInfoResponse {
    /**
     * 交易所代码
     */
    private ExchangeType exchangeType;
    /**
     * 合约代码
     */
    private String ticker;
    /**
     * 合约名称
     */
    private String tickerName;
    /**
     * 合约类型
     */
    private TickerType tickerType;
    /**
     * 昨收盘
     */
    private double preClosePrice;
    /**
     * 涨停板价
     */
    private double upperLimitPrice;
    /**
     * 跌停板价
     */
    private double lowerLimitPrice;
    /**
     * 最小变动价位
     */
    private double priceTick;
    /**
     * 合约最小交易量(买)
     */
    private int buyQtyUnit;
    /**
     * 合约最小交易量(卖)
     */
    private int sellQtyUnit;
    /**
     * 是否最后一条记录
     */
    private boolean lastResp;

    public void setExchangeType(int exchangeType) {
        if (ExchangeType.values().length < exchangeType) {
            this.exchangeType = ExchangeType.UNKNOWN;
            System.err.println("Error: TickerInfoResponse received ExchangeType value exceed ExchangeType enum size, receive=" + exchangeType);
        } else {
            this.exchangeType = ExchangeType.values()[exchangeType - 1];
        }
    }

    public void setTickerType(int tickerType) {
        if (TickerType.values().length < tickerType) {
            this.tickerType = TickerType.XTP_TICKER_TYPE_UNKNOWN;
            System.err.println("Error: TickerInfoResponse received TickerType value exceed TickerType enum size, receive=" + tickerType);
        } else {
            this.tickerType = TickerType.values()[tickerType];
        }
    }

    /**
     * 交易所代码
     */
    @SuppressWarnings("all")
    public ExchangeType getExchangeType() {
        return this.exchangeType;
    }

    /**
     * 合约代码
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 合约名称
     */
    @SuppressWarnings("all")
    public String getTickerName() {
        return this.tickerName;
    }

    /**
     * 合约类型
     */
    @SuppressWarnings("all")
    public TickerType getTickerType() {
        return this.tickerType;
    }

    /**
     * 昨收盘
     */
    @SuppressWarnings("all")
    public double getPreClosePrice() {
        return this.preClosePrice;
    }

    /**
     * 涨停板价
     */
    @SuppressWarnings("all")
    public double getUpperLimitPrice() {
        return this.upperLimitPrice;
    }

    /**
     * 跌停板价
     */
    @SuppressWarnings("all")
    public double getLowerLimitPrice() {
        return this.lowerLimitPrice;
    }

    /**
     * 最小变动价位
     */
    @SuppressWarnings("all")
    public double getPriceTick() {
        return this.priceTick;
    }

    /**
     * 合约最小交易量(买)
     */
    @SuppressWarnings("all")
    public int getBuyQtyUnit() {
        return this.buyQtyUnit;
    }

    /**
     * 合约最小交易量(卖)
     */
    @SuppressWarnings("all")
    public int getSellQtyUnit() {
        return this.sellQtyUnit;
    }

    /**
     * 是否最后一条记录
     */
    @SuppressWarnings("all")
    public boolean isLastResp() {
        return this.lastResp;
    }

    /**
     * 合约代码
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 合约名称
     */
    @SuppressWarnings("all")
    public void setTickerName(final String tickerName) {
        this.tickerName = tickerName;
    }

    /**
     * 昨收盘
     */
    @SuppressWarnings("all")
    public void setPreClosePrice(final double preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    /**
     * 涨停板价
     */
    @SuppressWarnings("all")
    public void setUpperLimitPrice(final double upperLimitPrice) {
        this.upperLimitPrice = upperLimitPrice;
    }

    /**
     * 跌停板价
     */
    @SuppressWarnings("all")
    public void setLowerLimitPrice(final double lowerLimitPrice) {
        this.lowerLimitPrice = lowerLimitPrice;
    }

    /**
     * 最小变动价位
     */
    @SuppressWarnings("all")
    public void setPriceTick(final double priceTick) {
        this.priceTick = priceTick;
    }

    /**
     * 合约最小交易量(买)
     */
    @SuppressWarnings("all")
    public void setBuyQtyUnit(final int buyQtyUnit) {
        this.buyQtyUnit = buyQtyUnit;
    }

    /**
     * 合约最小交易量(卖)
     */
    @SuppressWarnings("all")
    public void setSellQtyUnit(final int sellQtyUnit) {
        this.sellQtyUnit = sellQtyUnit;
    }

    /**
     * 是否最后一条记录
     */
    @SuppressWarnings("all")
    public void setLastResp(final boolean lastResp) {
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TickerInfoResponse)) return false;
        final TickerInfoResponse other = (TickerInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$exchangeType = this.getExchangeType();
        final Object other$exchangeType = other.getExchangeType();
        if (this$exchangeType == null ? other$exchangeType != null : !this$exchangeType.equals(other$exchangeType)) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        final Object this$tickerName = this.getTickerName();
        final Object other$tickerName = other.getTickerName();
        if (this$tickerName == null ? other$tickerName != null : !this$tickerName.equals(other$tickerName)) return false;
        final Object this$tickerType = this.getTickerType();
        final Object other$tickerType = other.getTickerType();
        if (this$tickerType == null ? other$tickerType != null : !this$tickerType.equals(other$tickerType)) return false;
        if (Double.compare(this.getPreClosePrice(), other.getPreClosePrice()) != 0) return false;
        if (Double.compare(this.getUpperLimitPrice(), other.getUpperLimitPrice()) != 0) return false;
        if (Double.compare(this.getLowerLimitPrice(), other.getLowerLimitPrice()) != 0) return false;
        if (Double.compare(this.getPriceTick(), other.getPriceTick()) != 0) return false;
        if (this.getBuyQtyUnit() != other.getBuyQtyUnit()) return false;
        if (this.getSellQtyUnit() != other.getSellQtyUnit()) return false;
        if (this.isLastResp() != other.isLastResp()) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof TickerInfoResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $exchangeType = this.getExchangeType();
        result = result * PRIME + ($exchangeType == null ? 43 : $exchangeType.hashCode());
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        final Object $tickerName = this.getTickerName();
        result = result * PRIME + ($tickerName == null ? 43 : $tickerName.hashCode());
        final Object $tickerType = this.getTickerType();
        result = result * PRIME + ($tickerType == null ? 43 : $tickerType.hashCode());
        final long $preClosePrice = Double.doubleToLongBits(this.getPreClosePrice());
        result = result * PRIME + (int) ($preClosePrice >>> 32 ^ $preClosePrice);
        final long $upperLimitPrice = Double.doubleToLongBits(this.getUpperLimitPrice());
        result = result * PRIME + (int) ($upperLimitPrice >>> 32 ^ $upperLimitPrice);
        final long $lowerLimitPrice = Double.doubleToLongBits(this.getLowerLimitPrice());
        result = result * PRIME + (int) ($lowerLimitPrice >>> 32 ^ $lowerLimitPrice);
        final long $priceTick = Double.doubleToLongBits(this.getPriceTick());
        result = result * PRIME + (int) ($priceTick >>> 32 ^ $priceTick);
        result = result * PRIME + this.getBuyQtyUnit();
        result = result * PRIME + this.getSellQtyUnit();
        result = result * PRIME + (this.isLastResp() ? 79 : 97);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "TickerInfoResponse(exchangeType=" + this.getExchangeType() + ", ticker=" + this.getTicker() + ", tickerName=" + this.getTickerName() + ", tickerType=" + this.getTickerType() + ", preClosePrice=" + this.getPreClosePrice() + ", upperLimitPrice=" + this.getUpperLimitPrice() + ", lowerLimitPrice=" + this.getLowerLimitPrice() + ", priceTick=" + this.getPriceTick() + ", buyQtyUnit=" + this.getBuyQtyUnit() + ", sellQtyUnit=" + this.getSellQtyUnit() + ", lastResp=" + this.isLastResp() + ")";
    }

    @SuppressWarnings("all")
    public TickerInfoResponse() {
    }

    @SuppressWarnings("all")
    public TickerInfoResponse(final ExchangeType exchangeType, final String ticker, final String tickerName, final TickerType tickerType, final double preClosePrice, final double upperLimitPrice, final double lowerLimitPrice, final double priceTick, final int buyQtyUnit, final int sellQtyUnit, final boolean lastResp) {
        this.exchangeType = exchangeType;
        this.ticker = ticker;
        this.tickerName = tickerName;
        this.tickerType = tickerType;
        this.preClosePrice = preClosePrice;
        this.upperLimitPrice = upperLimitPrice;
        this.lowerLimitPrice = lowerLimitPrice;
        this.priceTick = priceTick;
        this.buyQtyUnit = buyQtyUnit;
        this.sellQtyUnit = sellQtyUnit;
        this.lastResp = lastResp;
    }
}
