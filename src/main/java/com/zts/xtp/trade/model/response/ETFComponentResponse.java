// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.response;

import com.zts.xtp.common.enums.EtfReplaceType;
import com.zts.xtp.common.enums.MarketType;

public class ETFComponentResponse {
    /**
     * 交易市场
     */
    private MarketType marketType;
    /**
     * ETF代码
     */
    private String ticker;
    /**
     * 成份股代码
     */
    private String componentTicker;
    /**
     * 成份股名称
     */
    private String componentName;
    /**
     * 成份股数量
     */
    private long quantity;
    /**
     * 成份股交易市场
     */
    private MarketType componentMarketType;
    /**
     * 成份股替代标识
     */
    private EtfReplaceType etfReplaceType;
    /**
     * 溢价比例
     */
    private double premiumRatio;
    /**
     * 成分股替代标识为必须现金替代时候的总金额
     */
    private double amount;
    /**
     * 此消息响应函数对应的请求ID
     */
    private int requestId;
    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    private boolean lastResp;

    public void setMarketType(int type) {
        marketType = MarketType.values()[type];
    }

    public void setComponentMarketType(int type) {
        componentMarketType = MarketType.values()[type];
    }

    public void setEtfReplaceType(int type) {
        etfReplaceType = EtfReplaceType.values()[type];
    }


    @SuppressWarnings("all")
    public static class ETFComponentResponseBuilder {
        @SuppressWarnings("all")
        private MarketType marketType;
        @SuppressWarnings("all")
        private String ticker;
        @SuppressWarnings("all")
        private String componentTicker;
        @SuppressWarnings("all")
        private String componentName;
        @SuppressWarnings("all")
        private long quantity;
        @SuppressWarnings("all")
        private MarketType componentMarketType;
        @SuppressWarnings("all")
        private EtfReplaceType etfReplaceType;
        @SuppressWarnings("all")
        private double premiumRatio;
        @SuppressWarnings("all")
        private double amount;
        @SuppressWarnings("all")
        private int requestId;
        @SuppressWarnings("all")
        private boolean lastResp;

        @SuppressWarnings("all")
        ETFComponentResponseBuilder() {
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder marketType(final MarketType marketType) {
            this.marketType = marketType;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder componentTicker(final String componentTicker) {
            this.componentTicker = componentTicker;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder componentName(final String componentName) {
            this.componentName = componentName;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder quantity(final long quantity) {
            this.quantity = quantity;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder componentMarketType(final MarketType componentMarketType) {
            this.componentMarketType = componentMarketType;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder etfReplaceType(final EtfReplaceType etfReplaceType) {
            this.etfReplaceType = etfReplaceType;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder premiumRatio(final double premiumRatio) {
            this.premiumRatio = premiumRatio;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder amount(final double amount) {
            this.amount = amount;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder requestId(final int requestId) {
            this.requestId = requestId;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponseBuilder lastResp(final boolean lastResp) {
            this.lastResp = lastResp;
            return this;
        }

        @SuppressWarnings("all")
        public ETFComponentResponse build() {
            return new ETFComponentResponse(marketType, ticker, componentTicker, componentName, quantity, componentMarketType, etfReplaceType, premiumRatio, amount, requestId, lastResp);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "ETFComponentResponse.ETFComponentResponseBuilder(marketType=" + this.marketType + ", ticker=" + this.ticker + ", componentTicker=" + this.componentTicker + ", componentName=" + this.componentName + ", quantity=" + this.quantity + ", componentMarketType=" + this.componentMarketType + ", etfReplaceType=" + this.etfReplaceType + ", premiumRatio=" + this.premiumRatio + ", amount=" + this.amount + ", requestId=" + this.requestId + ", lastResp=" + this.lastResp + ")";
        }
    }

    @SuppressWarnings("all")
    public static ETFComponentResponseBuilder builder() {
        return new ETFComponentResponseBuilder();
    }

    /**
     * 交易市场
     */
    @SuppressWarnings("all")
    public MarketType getMarketType() {
        return this.marketType;
    }

    /**
     * ETF代码
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 成份股代码
     */
    @SuppressWarnings("all")
    public String getComponentTicker() {
        return this.componentTicker;
    }

    /**
     * 成份股名称
     */
    @SuppressWarnings("all")
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * 成份股数量
     */
    @SuppressWarnings("all")
    public long getQuantity() {
        return this.quantity;
    }

    /**
     * 成份股交易市场
     */
    @SuppressWarnings("all")
    public MarketType getComponentMarketType() {
        return this.componentMarketType;
    }

    /**
     * 成份股替代标识
     */
    @SuppressWarnings("all")
    public EtfReplaceType getEtfReplaceType() {
        return this.etfReplaceType;
    }

    /**
     * 溢价比例
     */
    @SuppressWarnings("all")
    public double getPremiumRatio() {
        return this.premiumRatio;
    }

    /**
     * 成分股替代标识为必须现金替代时候的总金额
     */
    @SuppressWarnings("all")
    public double getAmount() {
        return this.amount;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public int getRequestId() {
        return this.requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public boolean isLastResp() {
        return this.lastResp;
    }

    /**
     * ETF代码
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    /**
     * 成份股代码
     */
    @SuppressWarnings("all")
    public void setComponentTicker(final String componentTicker) {
        this.componentTicker = componentTicker;
    }

    /**
     * 成份股名称
     */
    @SuppressWarnings("all")
    public void setComponentName(final String componentName) {
        this.componentName = componentName;
    }

    /**
     * 成份股数量
     */
    @SuppressWarnings("all")
    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    /**
     * 溢价比例
     */
    @SuppressWarnings("all")
    public void setPremiumRatio(final double premiumRatio) {
        this.premiumRatio = premiumRatio;
    }

    /**
     * 成分股替代标识为必须现金替代时候的总金额
     */
    @SuppressWarnings("all")
    public void setAmount(final double amount) {
        this.amount = amount;
    }

    /**
     * 此消息响应函数对应的请求ID
     */
    @SuppressWarnings("all")
    public void setRequestId(final int requestId) {
        this.requestId = requestId;
    }

    /**
     * 此消息响应函数是否为request_id这条请求所对应的最后一个响应，当为最后一个的时候为true，如果为false，表示还有其他后续消息响应
     */
    @SuppressWarnings("all")
    public void setLastResp(final boolean lastResp) {
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "ETFComponentResponse(marketType=" + this.getMarketType() + ", ticker=" + this.getTicker() + ", componentTicker=" + this.getComponentTicker() + ", componentName=" + this.getComponentName() + ", quantity=" + this.getQuantity() + ", componentMarketType=" + this.getComponentMarketType() + ", etfReplaceType=" + this.getEtfReplaceType() + ", premiumRatio=" + this.getPremiumRatio() + ", amount=" + this.getAmount() + ", requestId=" + this.getRequestId() + ", lastResp=" + this.isLastResp() + ")";
    }

    @SuppressWarnings("all")
    public ETFComponentResponse() {
    }

    @SuppressWarnings("all")
    public ETFComponentResponse(final MarketType marketType, final String ticker, final String componentTicker, final String componentName, final long quantity, final MarketType componentMarketType, final EtfReplaceType etfReplaceType, final double premiumRatio, final double amount, final int requestId, final boolean lastResp) {
        this.marketType = marketType;
        this.ticker = ticker;
        this.componentTicker = componentTicker;
        this.componentName = componentName;
        this.quantity = quantity;
        this.componentMarketType = componentMarketType;
        this.etfReplaceType = etfReplaceType;
        this.premiumRatio = premiumRatio;
        this.amount = amount;
        this.requestId = requestId;
        this.lastResp = lastResp;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ETFComponentResponse)) return false;
        final ETFComponentResponse other = (ETFComponentResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$marketType = this.getMarketType();
        final Object other$marketType = other.getMarketType();
        if (this$marketType == null ? other$marketType != null : !this$marketType.equals(other$marketType)) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        final Object this$componentTicker = this.getComponentTicker();
        final Object other$componentTicker = other.getComponentTicker();
        if (this$componentTicker == null ? other$componentTicker != null : !this$componentTicker.equals(other$componentTicker)) return false;
        final Object this$componentName = this.getComponentName();
        final Object other$componentName = other.getComponentName();
        if (this$componentName == null ? other$componentName != null : !this$componentName.equals(other$componentName)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof ETFComponentResponse;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $marketType = this.getMarketType();
        result = result * PRIME + ($marketType == null ? 43 : $marketType.hashCode());
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        final Object $componentTicker = this.getComponentTicker();
        result = result * PRIME + ($componentTicker == null ? 43 : $componentTicker.hashCode());
        final Object $componentName = this.getComponentName();
        result = result * PRIME + ($componentName == null ? 43 : $componentName.hashCode());
        return result;
    }
}
