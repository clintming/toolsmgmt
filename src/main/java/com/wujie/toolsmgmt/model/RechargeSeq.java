package com.wujie.toolsmgmt.model;

import java.util.Objects;

public class RechargeSeq {
    private String id;
    private String after_amount;
    private String amount;
    private String uid;
    private String comment;
    private String income;
    private String create_at;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RechargeSeq that = (RechargeSeq) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(after_amount, that.after_amount) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(income, that.income) &&
                Objects.equals(create_at, that.create_at);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, after_amount, amount, uid, comment, income, create_at);
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAfter_amount() {
        return after_amount;
    }

    public void setAfter_amount(String after_amount) {
        this.after_amount = after_amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
