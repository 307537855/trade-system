// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.request;

import com.zts.xtp.common.enums.MarketType;

public class OptionAuctionInfoRequest {
    private MarketType marketType;
    private String ticker;

    public int getMarketType() {
        return marketType.ordinal();
    }


    @SuppressWarnings("all")
    public static class OptionAuctionInfoRequestBuilder {
        @SuppressWarnings("all")
        private MarketType marketType;
        @SuppressWarnings("all")
        private String ticker;

        @SuppressWarnings("all")
        OptionAuctionInfoRequestBuilder() {
        }

        @SuppressWarnings("all")
        public OptionAuctionInfoRequestBuilder marketType(final MarketType marketType) {
            this.marketType = marketType;
            return this;
        }

        @SuppressWarnings("all")
        public OptionAuctionInfoRequestBuilder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        @SuppressWarnings("all")
        public OptionAuctionInfoRequest build() {
            return new OptionAuctionInfoRequest(marketType, ticker);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "OptionAuctionInfoRequest.OptionAuctionInfoRequestBuilder(marketType=" + this.marketType + ", ticker=" + this.ticker + ")";
        }
    }

    @SuppressWarnings("all")
    public static OptionAuctionInfoRequestBuilder builder() {
        return new OptionAuctionInfoRequestBuilder();
    }

    @SuppressWarnings("all")
    public String getTicker() {
        return this.ticker;
    }

    @SuppressWarnings("all")
    public void setMarketType(final MarketType marketType) {
        this.marketType = marketType;
    }

    @SuppressWarnings("all")
    public void setTicker(final String ticker) {
        this.ticker = ticker;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OptionAuctionInfoRequest)) return false;
        final OptionAuctionInfoRequest other = (OptionAuctionInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getMarketType() != other.getMarketType()) return false;
        final Object this$ticker = this.getTicker();
        final Object other$ticker = other.getTicker();
        if (this$ticker == null ? other$ticker != null : !this$ticker.equals(other$ticker)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof OptionAuctionInfoRequest;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getMarketType();
        final Object $ticker = this.getTicker();
        result = result * PRIME + ($ticker == null ? 43 : $ticker.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "OptionAuctionInfoRequest(marketType=" + this.getMarketType() + ", ticker=" + this.getTicker() + ")";
    }

    @SuppressWarnings("all")
    public OptionAuctionInfoRequest() {
    }

    @SuppressWarnings("all")
    public OptionAuctionInfoRequest(final MarketType marketType, final String ticker) {
        this.marketType = marketType;
        this.ticker = ticker;
    }
}
