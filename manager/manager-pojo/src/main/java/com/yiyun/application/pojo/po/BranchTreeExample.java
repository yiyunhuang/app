package com.yiyun.application.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BranchTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BranchTreeExample() {
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

        public Criteria andParentsIdIsNull() {
            addCriterion("parents_id is null");
            return (Criteria) this;
        }

        public Criteria andParentsIdIsNotNull() {
            addCriterion("parents_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentsIdEqualTo(Long value) {
            addCriterion("parents_id =", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdNotEqualTo(Long value) {
            addCriterion("parents_id <>", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdGreaterThan(Long value) {
            addCriterion("parents_id >", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parents_id >=", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdLessThan(Long value) {
            addCriterion("parents_id <", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdLessThanOrEqualTo(Long value) {
            addCriterion("parents_id <=", value, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdIn(List<Long> values) {
            addCriterion("parents_id in", values, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdNotIn(List<Long> values) {
            addCriterion("parents_id not in", values, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdBetween(Long value1, Long value2) {
            addCriterion("parents_id between", value1, value2, "parentsId");
            return (Criteria) this;
        }

        public Criteria andParentsIdNotBetween(Long value1, Long value2) {
            addCriterion("parents_id not between", value1, value2, "parentsId");
            return (Criteria) this;
        }

        public Criteria andTreeLocationIsNull() {
            addCriterion("tree_location is null");
            return (Criteria) this;
        }

        public Criteria andTreeLocationIsNotNull() {
            addCriterion("tree_location is not null");
            return (Criteria) this;
        }

        public Criteria andTreeLocationEqualTo(String value) {
            addCriterion("tree_location =", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationNotEqualTo(String value) {
            addCriterion("tree_location <>", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationGreaterThan(String value) {
            addCriterion("tree_location >", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationGreaterThanOrEqualTo(String value) {
            addCriterion("tree_location >=", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationLessThan(String value) {
            addCriterion("tree_location <", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationLessThanOrEqualTo(String value) {
            addCriterion("tree_location <=", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationLike(String value) {
            addCriterion("tree_location like", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationNotLike(String value) {
            addCriterion("tree_location not like", value, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationIn(List<String> values) {
            addCriterion("tree_location in", values, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationNotIn(List<String> values) {
            addCriterion("tree_location not in", values, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationBetween(String value1, String value2) {
            addCriterion("tree_location between", value1, value2, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeLocationNotBetween(String value1, String value2) {
            addCriterion("tree_location not between", value1, value2, "treeLocation");
            return (Criteria) this;
        }

        public Criteria andTreeTitleIsNull() {
            addCriterion("tree_title is null");
            return (Criteria) this;
        }

        public Criteria andTreeTitleIsNotNull() {
            addCriterion("tree_title is not null");
            return (Criteria) this;
        }

        public Criteria andTreeTitleEqualTo(String value) {
            addCriterion("tree_title =", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleNotEqualTo(String value) {
            addCriterion("tree_title <>", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleGreaterThan(String value) {
            addCriterion("tree_title >", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tree_title >=", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleLessThan(String value) {
            addCriterion("tree_title <", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleLessThanOrEqualTo(String value) {
            addCriterion("tree_title <=", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleLike(String value) {
            addCriterion("tree_title like", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleNotLike(String value) {
            addCriterion("tree_title not like", value, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleIn(List<String> values) {
            addCriterion("tree_title in", values, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleNotIn(List<String> values) {
            addCriterion("tree_title not in", values, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleBetween(String value1, String value2) {
            addCriterion("tree_title between", value1, value2, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeTitleNotBetween(String value1, String value2) {
            addCriterion("tree_title not between", value1, value2, "treeTitle");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionIsNull() {
            addCriterion("tree_description is null");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionIsNotNull() {
            addCriterion("tree_description is not null");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionEqualTo(String value) {
            addCriterion("tree_description =", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionNotEqualTo(String value) {
            addCriterion("tree_description <>", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionGreaterThan(String value) {
            addCriterion("tree_description >", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("tree_description >=", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionLessThan(String value) {
            addCriterion("tree_description <", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("tree_description <=", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionLike(String value) {
            addCriterion("tree_description like", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionNotLike(String value) {
            addCriterion("tree_description not like", value, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionIn(List<String> values) {
            addCriterion("tree_description in", values, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionNotIn(List<String> values) {
            addCriterion("tree_description not in", values, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionBetween(String value1, String value2) {
            addCriterion("tree_description between", value1, value2, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeDescriptionNotBetween(String value1, String value2) {
            addCriterion("tree_description not between", value1, value2, "treeDescription");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNull() {
            addCriterion("tree_type is null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIsNotNull() {
            addCriterion("tree_type is not null");
            return (Criteria) this;
        }

        public Criteria andTreeTypeEqualTo(Integer value) {
            addCriterion("tree_type =", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotEqualTo(Integer value) {
            addCriterion("tree_type <>", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThan(Integer value) {
            addCriterion("tree_type >", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tree_type >=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThan(Integer value) {
            addCriterion("tree_type <", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tree_type <=", value, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeIn(List<Integer> values) {
            addCriterion("tree_type in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotIn(List<Integer> values) {
            addCriterion("tree_type not in", values, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeBetween(Integer value1, Integer value2) {
            addCriterion("tree_type between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tree_type not between", value1, value2, "treeType");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkIsNull() {
            addCriterion("tree_remark is null");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkIsNotNull() {
            addCriterion("tree_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkEqualTo(String value) {
            addCriterion("tree_remark =", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkNotEqualTo(String value) {
            addCriterion("tree_remark <>", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkGreaterThan(String value) {
            addCriterion("tree_remark >", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tree_remark >=", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkLessThan(String value) {
            addCriterion("tree_remark <", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkLessThanOrEqualTo(String value) {
            addCriterion("tree_remark <=", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkLike(String value) {
            addCriterion("tree_remark like", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkNotLike(String value) {
            addCriterion("tree_remark not like", value, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkIn(List<String> values) {
            addCriterion("tree_remark in", values, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkNotIn(List<String> values) {
            addCriterion("tree_remark not in", values, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkBetween(String value1, String value2) {
            addCriterion("tree_remark between", value1, value2, "treeRemark");
            return (Criteria) this;
        }

        public Criteria andTreeRemarkNotBetween(String value1, String value2) {
            addCriterion("tree_remark not between", value1, value2, "treeRemark");
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