package ai.techfin.tradesystem.web.rest.vm;

import ai.techfin.tradesystem.domain.enums.MarketType;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ModelOrderVM {

    private String stock;

    private MarketType market;

    private BigDecimal price;

    private BigInteger quantity;

    public ModelOrderVM(String stock, MarketType market, BigDecimal price, BigInteger quantity) {
        this.stock = stock;
        this.market = market;
        this.price = price;
        this.quantity = quantity;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public MarketType getMarket() {
        return market;
    }

    public void setMarket(MarketType market) {
        this.market = market;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

}