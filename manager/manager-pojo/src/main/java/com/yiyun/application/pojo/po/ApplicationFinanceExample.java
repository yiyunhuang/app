package com.yiyun.application.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationFinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationFinanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeIsNull() {
            addCriterion("finance_type is null");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeIsNotNull() {
            addCriterion("finance_type is not null");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeEqualTo(String value) {
            addCriterion("finance_type =", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeNotEqualTo(String value) {
            addCriterion("finance_type <>", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeGreaterThan(String value) {
            addCriterion("finance_type >", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_type >=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeLessThan(String value) {
            addCriterion("finance_type <", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeLessThanOrEqualTo(String value) {
            addCriterion("finance_type <=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeLike(String value) {
            addCriterion("finance_type like", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeNotLike(String value) {
            addCriterion("finance_type not like", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeIn(List<String> values) {
            addCriterion("finance_type in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeNotIn(List<String> values) {
            addCriterion("finance_type not in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeBetween(String value1, String value2) {
            addCriterion("finance_type between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andfinanceTypeNotBetween(String value1, String value2) {
            addCriterion("finance_type not between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeIsNull() {
            addCriterion("money_change is null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeIsNotNull() {
            addCriterion("money_change is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeEqualTo(BigDecimal value) {
            addCriterion("money_change =", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeNotEqualTo(BigDecimal value) {
            addCriterion("money_change <>", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeGreaterThan(BigDecimal value) {
            addCriterion("money_change >", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_change >=", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeLessThan(BigDecimal value) {
            addCriterion("money_change <", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_change <=", value, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeIn(List<BigDecimal> values) {
            addCriterion("money_change in", values, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeNotIn(List<BigDecimal> values) {
            addCriterion("money_change not in", values, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_change between", value1, value2, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andMoneyChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_change not between", value1, value2, "moneyChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeIsNull() {
            addCriterion("shares_change is null");
            return (Criteria) this;
        }

        public Criteria andSharesChangeIsNotNull() {
            addCriterion("shares_change is not null");
            return (Criteria) this;
        }

        public Criteria andSharesChangeEqualTo(Integer value) {
            addCriterion("shares_change =", value, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeNotEqualTo(Integer value) {
            addCriterion("shares_change <>", value, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeGreaterThan(Integer value) {
            addCriterion("shares_change >", value, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shares_change >=", value, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeLessThan(Integer value) {
            addCriterion("shares_change <", value, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeLessThanOrEqualTo(Integer value) {
            addCriterion("shares_change <=", value, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeIn(List<Integer> values) {
            addCriterion("shares_change in", values, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeNotIn(List<Integer> values) {
            addCriterion("shares_change not in", values, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeBetween(Integer value1, Integer value2) {
            addCriterion("shares_change between", value1, value2, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andSharesChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("shares_change not between", value1, value2, "sharesChange");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNull() {
            addCriterion("stock_price is null");
            return (Criteria) this;
        }

        public Criteria andStockPriceIsNotNull() {
            addCriterion("stock_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockPriceEqualTo(BigDecimal value) {
            addCriterion("stock_price =", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotEqualTo(BigDecimal value) {
            addCriterion("stock_price <>", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThan(BigDecimal value) {
            addCriterion("stock_price >", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_price >=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThan(BigDecimal value) {
            addCriterion("stock_price <", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stock_price <=", value, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceIn(List<BigDecimal> values) {
            addCriterion("stock_price in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotIn(List<BigDecimal> values) {
            addCriterion("stock_price not in", values, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_price between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andStockPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stock_price not between", value1, value2, "stockPrice");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkIsNull() {
            addCriterion("finance_remark is null");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkIsNotNull() {
            addCriterion("finance_remark is not null");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkEqualTo(String value) {
            addCriterion("finance_remark =", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkNotEqualTo(String value) {
            addCriterion("finance_remark <>", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkGreaterThan(String value) {
            addCriterion("finance_remark >", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("finance_remark >=", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkLessThan(String value) {
            addCriterion("finance_remark <", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkLessThanOrEqualTo(String value) {
            addCriterion("finance_remark <=", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkLike(String value) {
            addCriterion("finance_remark like", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkNotLike(String value) {
            addCriterion("finance_remark not like", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkIn(List<String> values) {
            addCriterion("finance_remark in", values, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkNotIn(List<String> values) {
            addCriterion("finance_remark not in", values, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkBetween(String value1, String value2) {
            addCriterion("finance_remark between", value1, value2, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andfinanceRemarkNotBetween(String value1, String value2) {
            addCriterion("finance_remark not between", value1, value2, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNull() {
            addCriterion("is_sign is null");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNotNull() {
            addCriterion("is_sign is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignEqualTo(Byte value) {
            addCriterion("is_sign =", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotEqualTo(Byte value) {
            addCriterion("is_sign <>", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThan(Byte value) {
            addCriterion("is_sign >", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sign >=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThan(Byte value) {
            addCriterion("is_sign <", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThanOrEqualTo(Byte value) {
            addCriterion("is_sign <=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignIn(List<Byte> values) {
            addCriterion("is_sign in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotIn(List<Byte> values) {
            addCriterion("is_sign not in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignBetween(Byte value1, Byte value2) {
            addCriterion("is_sign between", value1, value2, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sign not between", value1, value2, "isSign");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}