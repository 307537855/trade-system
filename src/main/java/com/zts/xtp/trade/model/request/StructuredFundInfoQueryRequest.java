// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.request;

import com.zts.xtp.common.enums.ExchangeType;

public class StructuredFundInfoQueryRequest {
    /**
     * 交易所代码，不可为空
     */
    private ExchangeType exchangeType;
    /**
     * 分级基金母基金代码，可以为空，如果为空，则默认查询所有的分级基金
     */
    private String ticker;

    public int getExchangeType() {
        return exchangeType.getType();
    }


    @SuppressWarnings("all")
    public static class StructuredFundInfoQueryRequestBuilder {
        @SuppressWarnings("all")
        private ExchangeType exchangeType;
        @SuppressWarnings("all")
        private String ticker;

        @SuppressWarnings("all")
        StructuredFundInfoQueryRequestBuilder() {
        }

        @SuppressWarnings("all")
        public StructuredFundInfoQueryRequestBuilder exchangeType(final ExchangeType exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }

        @SuppressWarnings("all")
        public StructuredFundInfoQueryRequestBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public StructuredFundInfoQueryRequest build() {
            return new StructuredFundInfoQueryRequest(exchangeType, ticker);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "StructuredFundInfoQueryRequest.StructuredFundInfoQueryRequestBuilder(exchangeType=" + this.exchangeType + ", ticker=" + this.ticker + ")";
        }
    }

    @SuppressWarnings("all")
    public static StructuredFundInfoQueryRequestBuilder builder() {
        return new StructuredFundInfoQueryRequestBuilder();
    }

    /**
     * 分级基金母基金代码，可以为空，如果为空，则默认查询所有的分级基金
     */
    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    /**
     * 交易所代码，不可为空
     */
    @SuppressWarnings("all")
    public void setExchangeType(final ExchangeType exchangeType) {
        this.exchangeType = exchangeType;
    }

    /**
     * 分级基金母基金代码，可以为空，如果为空，则默认查询所有的分级基金
     */
    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "StructuredFundInfoQueryRequest(exchangeType=" + this.getExchangeType() + ", ticker=" + this.getTicker() + ")";
    }

    @SuppressWarnings("all")
    public StructuredFundInfoQueryRequest() {
    }

    @SuppressWarnings("all")
    public StructuredFundInfoQueryRequest(final ExchangeType exchangeType, final String ticker) {
        this.exchangeType = exchangeType;
        this.ticker = ticker;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StructuredFundInfoQueryRequest)) return false;
        final StructuredFundInfoQueryRequest other = (StructuredFundInfoQueryRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getExchangeType() != other.getExchangeType()) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof StructuredFundInfoQueryRequest;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getExchangeType();
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        return result;
    }
}
