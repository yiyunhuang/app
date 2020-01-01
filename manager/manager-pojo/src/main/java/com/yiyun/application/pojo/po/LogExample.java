package com.yiyun.application.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldIsNull() {
            addCriterion("dataJsonOld is null");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldIsNotNull() {
            addCriterion("dataJsonOld is not null");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldEqualTo(String value) {
            addCriterion("dataJsonOld =", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldNotEqualTo(String value) {
            addCriterion("dataJsonOld <>", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldGreaterThan(String value) {
            addCriterion("dataJsonOld >", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldGreaterThanOrEqualTo(String value) {
            addCriterion("dataJsonOld >=", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldLessThan(String value) {
            addCriterion("dataJsonOld <", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldLessThanOrEqualTo(String value) {
            addCriterion("dataJsonOld <=", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldLike(String value) {
            addCriterion("dataJsonOld like", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldNotLike(String value) {
            addCriterion("dataJsonOld not like", value, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldIn(List<String> values) {
            addCriterion("dataJsonOld in", values, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldNotIn(List<String> values) {
            addCriterion("dataJsonOld not in", values, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldBetween(String value1, String value2) {
            addCriterion("dataJsonOld between", value1, value2, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonoldNotBetween(String value1, String value2) {
            addCriterion("dataJsonOld not between", value1, value2, "datajsonold");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewIsNull() {
            addCriterion("dataJsonNew is null");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewIsNotNull() {
            addCriterion("dataJsonNew is not null");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewEqualTo(String value) {
            addCriterion("dataJsonNew =", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewNotEqualTo(String value) {
            addCriterion("dataJsonNew <>", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewGreaterThan(String value) {
            addCriterion("dataJsonNew >", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewGreaterThanOrEqualTo(String value) {
            addCriterion("dataJsonNew >=", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewLessThan(String value) {
            addCriterion("dataJsonNew <", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewLessThanOrEqualTo(String value) {
            addCriterion("dataJsonNew <=", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewLike(String value) {
            addCriterion("dataJsonNew like", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewNotLike(String value) {
            addCriterion("dataJsonNew not like", value, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewIn(List<String> values) {
            addCriterion("dataJsonNew in", values, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewNotIn(List<String> values) {
            addCriterion("dataJsonNew not in", values, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewBetween(String value1, String value2) {
            addCriterion("dataJsonNew between", value1, value2, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDatajsonnewNotBetween(String value1, String value2) {
            addCriterion("dataJsonNew not between", value1, value2, "datajsonnew");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(Integer value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(Integer value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(Integer value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(Integer value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(Integer value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<Integer> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<Integer> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(Integer value1, Integer value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(Integer value1, Integer value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andTabidIsNull() {
            addCriterion("tabId is null");
            return (Criteria) this;
        }

        public Criteria andTabidIsNotNull() {
            addCriterion("tabId is not null");
            return (Criteria) this;
        }

        public Criteria andTabidEqualTo(Integer value) {
            addCriterion("tabId =", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidNotEqualTo(Integer value) {
            addCriterion("tabId <>", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidGreaterThan(Integer value) {
            addCriterion("tabId >", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tabId >=", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidLessThan(Integer value) {
            addCriterion("tabId <", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidLessThanOrEqualTo(Integer value) {
            addCriterion("tabId <=", value, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidIn(List<Integer> values) {
            addCriterion("tabId in", values, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidNotIn(List<Integer> values) {
            addCriterion("tabId not in", values, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidBetween(Integer value1, Integer value2) {
            addCriterion("tabId between", value1, value2, "tabid");
            return (Criteria) this;
        }

        public Criteria andTabidNotBetween(Integer value1, Integer value2) {
            addCriterion("tabId not between", value1, value2, "tabid");
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