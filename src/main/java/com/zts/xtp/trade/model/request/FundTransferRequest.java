// Generated by delombok at Sun Sep 22 21:37:45 CST 2019
package com.zts.xtp.trade.model.request;

import com.zts.xtp.common.enums.FundTransferType;

public class FundTransferRequest {
    /**
     * 资金内转编号，无需用户填写，类似于xtp_id
     */
    private String serialId;
    /**
     * 资金账户代码
     */
    private String fundAccount;
    /**
     * 资金账户密码
     */
    private String password;
    /**
     * 金额
     */
    private double amount;
    /**
     * 内转类型
     */
    private FundTransferType fundTransferType;

    public int getFundTransferType() {
        return fundTransferType.ordinal();
    }


    @SuppressWarnings("all")
    public static class FundTransferRequestBuilder {
        @SuppressWarnings("all")
        private String serialId;
        @SuppressWarnings("all")
        private String fundAccount;
        @SuppressWarnings("all")
        private String password;
        @SuppressWarnings("all")
        private double amount;
        @SuppressWarnings("all")
        private FundTransferType fundTransferType;

        @SuppressWarnings("all")
        FundTransferRequestBuilder() {
        }

        @SuppressWarnings("all")
        public FundTransferRequestBuilder serialId(final String serialId) {
            this.serialId = serialId;
            return this;
        }

        @SuppressWarnings("all")
        public FundTransferRequestBuilder fundAccount(final String fundAccount) {
            this.fundAccount = fundAccount;
            return this;
        }

        @SuppressWarnings("all")
        public FundTransferRequestBuilder password(final String password) {
            this.password = password;
            return this;
        }

        @SuppressWarnings("all")
        public FundTransferRequestBuilder amount(final double amount) {
            this.amount = amount;
            return this;
        }

        @SuppressWarnings("all")
        public FundTransferRequestBuilder fundTransferType(final FundTransferType fundTransferType) {
            this.fundTransferType = fundTransferType;
            return this;
        }

        @SuppressWarnings("all")
        public FundTransferRequest build() {
            return new FundTransferRequest(serialId, fundAccount, password, amount, fundTransferType);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "FundTransferRequest.FundTransferRequestBuilder(serialId=" + this.serialId + ", fundAccount=" + this.fundAccount + ", password=" + this.password + ", amount=" + this.amount + ", fundTransferType=" + this.fundTransferType + ")";
        }
    }

    @SuppressWarnings("all")
    public static FundTransferRequestBuilder builder() {
        return new FundTransferRequestBuilder();
    }

    /**
     * 资金内转编号，无需用户填写，类似于xtp_id
     */
    @SuppressWarnings("all")
    public String getSerialId() {
        return this.serialId;
    }

    /**
     * 资金账户代码
     */
    @SuppressWarnings("all")
    public String getFundAccount() {
        return this.fundAccount;
    }

    /**
     * 资金账户密码
     */
    @SuppressWarnings("all")
    public String getPassword() {
        return this.password;
    }

    /**
     * 金额
     */
    @SuppressWarnings("all")
    public double getAmount() {
        return this.amount;
    }

    /**
     * 资金内转编号，无需用户填写，类似于xtp_id
     */
    @SuppressWarnings("all")
    public void setSerialId(final String serialId) {
        this.serialId = serialId;
    }

    /**
     * 资金账户代码
     */
    @SuppressWarnings("all")
    public void setFundAccount(final String fundAccount) {
        this.fundAccount = fundAccount;
    }

    /**
     * 资金账户密码
     */
    @SuppressWarnings("all")
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * 金额
     */
    @SuppressWarnings("all")
    public void setAmount(final double amount) {
        this.amount = amount;
    }

    /**
     * 内转类型
     */
    @SuppressWarnings("all")
    public void setFundTransferType(final FundTransferType fundTransferType) {
        this.fundTransferType = fundTransferType;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FundTransferRequest)) return false;
        final FundTransferRequest other = (FundTransferRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$serialId = this.getSerialId();
        final Object other$serialId = other.getSerialId();
        if (this$serialId == null ? other$serialId != null : !this$serialId.equals(other$serialId)) return false;
        final Object this$fundAccount = this.getFundAccount();
        final Object other$fundAccount = other.getFundAccount();
        if (this$fundAccount == null ? other$fundAccount != null : !this$fundAccount.equals(other$fundAccount)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        if (this.getFundTransferType() != other.getFundTransferType()) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof FundTransferRequest;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $serialId = this.getSerialId();
        result = result * PRIME + ($serialId == null ? 43 : $serialId.hashCode());
        final Object $fundAccount = this.getFundAccount();
        result = result * PRIME + ($fundAccount == null ? 43 : $fundAccount.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        result = result * PRIME + this.getFundTransferType();
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "FundTransferRequest(serialId=" + this.getSerialId() + ", fundAccount=" + this.getFundAccount() + ", password=" + this.getPassword() + ", amount=" + this.getAmount() + ", fundTransferType=" + this.getFundTransferType() + ")";
    }

    @SuppressWarnings("all")
    public FundTransferRequest() {
    }

    @SuppressWarnings("all")
    public FundTransferRequest(final String serialId, final String fundAccount, final String password, final double amount, final FundTransferType fundTransferType) {
        this.serialId = serialId;
        this.fundAccount = fundAccount;
        this.password = password;
        this.amount = amount;
        this.fundTransferType = fundTransferType;
    }
}
