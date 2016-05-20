package keillion.github.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellRecordExample() {
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

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(Integer value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(Integer value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(Integer value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(Integer value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(Integer value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<Integer> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<Integer> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(Integer value1, Integer value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(Integer value1, Integer value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andHouseIsNull() {
            addCriterion("house is null");
            return (Criteria) this;
        }

        public Criteria andHouseIsNotNull() {
            addCriterion("house is not null");
            return (Criteria) this;
        }

        public Criteria andHouseEqualTo(Integer value) {
            addCriterion("house =", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotEqualTo(Integer value) {
            addCriterion("house <>", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThan(Integer value) {
            addCriterion("house >", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("house >=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThan(Integer value) {
            addCriterion("house <", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThanOrEqualTo(Integer value) {
            addCriterion("house <=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseIn(List<Integer> values) {
            addCriterion("house in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotIn(List<Integer> values) {
            addCriterion("house not in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseBetween(Integer value1, Integer value2) {
            addCriterion("house between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotBetween(Integer value1, Integer value2) {
            addCriterion("house not between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(Long value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(Long value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(Long value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(Long value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(Long value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(Long value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<Long> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<Long> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(Long value1, Long value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(Long value1, Long value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(Long value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(Long value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(Long value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(Long value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(Long value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(Long value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<Long> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<Long> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(Long value1, Long value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(Long value1, Long value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("isNew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("isNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(Integer value) {
            addCriterion("isNew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(Integer value) {
            addCriterion("isNew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(Integer value) {
            addCriterion("isNew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(Integer value) {
            addCriterion("isNew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(Integer value) {
            addCriterion("isNew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(Integer value) {
            addCriterion("isNew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<Integer> values) {
            addCriterion("isNew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<Integer> values) {
            addCriterion("isNew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(Integer value1, Integer value2) {
            addCriterion("isNew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(Integer value1, Integer value2) {
            addCriterion("isNew not between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Integer value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Integer value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Integer value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Integer value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Integer value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Integer> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Integer> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Integer value1, Integer value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Integer value1, Integer value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andCorrectIsNull() {
            addCriterion("correct is null");
            return (Criteria) this;
        }

        public Criteria andCorrectIsNotNull() {
            addCriterion("correct is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectEqualTo(Long value) {
            addCriterion("correct =", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotEqualTo(Long value) {
            addCriterion("correct <>", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectGreaterThan(Long value) {
            addCriterion("correct >", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectGreaterThanOrEqualTo(Long value) {
            addCriterion("correct >=", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectLessThan(Long value) {
            addCriterion("correct <", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectLessThanOrEqualTo(Long value) {
            addCriterion("correct <=", value, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectIn(List<Long> values) {
            addCriterion("correct in", values, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotIn(List<Long> values) {
            addCriterion("correct not in", values, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectBetween(Long value1, Long value2) {
            addCriterion("correct between", value1, value2, "correct");
            return (Criteria) this;
        }

        public Criteria andCorrectNotBetween(Long value1, Long value2) {
            addCriterion("correct not between", value1, value2, "correct");
            return (Criteria) this;
        }

        public Criteria andIsdisableIsNull() {
            addCriterion("isDisable is null");
            return (Criteria) this;
        }

        public Criteria andIsdisableIsNotNull() {
            addCriterion("isDisable is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisableEqualTo(Integer value) {
            addCriterion("isDisable =", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableNotEqualTo(Integer value) {
            addCriterion("isDisable <>", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableGreaterThan(Integer value) {
            addCriterion("isDisable >", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDisable >=", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableLessThan(Integer value) {
            addCriterion("isDisable <", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableLessThanOrEqualTo(Integer value) {
            addCriterion("isDisable <=", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableIn(List<Integer> values) {
            addCriterion("isDisable in", values, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableNotIn(List<Integer> values) {
            addCriterion("isDisable not in", values, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableBetween(Integer value1, Integer value2) {
            addCriterion("isDisable between", value1, value2, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableNotBetween(Integer value1, Integer value2) {
            addCriterion("isDisable not between", value1, value2, "isdisable");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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