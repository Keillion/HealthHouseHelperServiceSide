package keillion.github.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardExample() {
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

        public Criteria andIdLike(String value) {
            addCriterion("CAST(id AS CHAR(8)) like", value, "id");
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

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Long value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Long value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Long value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Long value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Long value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Long value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("(select name from costomer where id = owner) like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Long> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Long> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Long value1, Long value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Long value1, Long value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCclassIsNull() {
            addCriterion("cclass is null");
            return (Criteria) this;
        }

        public Criteria andCclassIsNotNull() {
            addCriterion("cclass is not null");
            return (Criteria) this;
        }

        public Criteria andCclassEqualTo(Integer value) {
            addCriterion("cclass =", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassNotEqualTo(Integer value) {
            addCriterion("cclass <>", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassGreaterThan(Integer value) {
            addCriterion("cclass >", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("cclass >=", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassLessThan(Integer value) {
            addCriterion("cclass <", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassLessThanOrEqualTo(Integer value) {
            addCriterion("cclass <=", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassLike(String value) {
            addCriterion("(select name from cardclass where id = cclass) like", value, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassIn(List<Integer> values) {
            addCriterion("cclass in", values, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassNotIn(List<Integer> values) {
            addCriterion("cclass not in", values, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassBetween(Integer value1, Integer value2) {
            addCriterion("cclass between", value1, value2, "cclass");
            return (Criteria) this;
        }

        public Criteria andCclassNotBetween(Integer value1, Integer value2) {
            addCriterion("cclass not between", value1, value2, "cclass");
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

        public Criteria andHouseLike(String value) {
            addCriterion("(select name from house where id = house) like", value, "house");
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

        public Criteria andExpiresIsNull() {
            addCriterion("expires is null");
            return (Criteria) this;
        }

        public Criteria andExpiresIsNotNull() {
            addCriterion("expires is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresEqualTo(Date value) {
            addCriterion("expires =", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotEqualTo(Date value) {
            addCriterion("expires <>", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresGreaterThan(Date value) {
            addCriterion("expires >", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresGreaterThanOrEqualTo(Date value) {
            addCriterion("expires >=", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLessThan(Date value) {
            addCriterion("expires <", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLessThanOrEqualTo(Date value) {
            addCriterion("expires <=", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresIn(List<Date> values) {
            addCriterion("expires in", values, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotIn(List<Date> values) {
            addCriterion("expires not in", values, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresBetween(Date value1, Date value2) {
            addCriterion("expires between", value1, value2, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotBetween(Date value1, Date value2) {
            addCriterion("expires not between", value1, value2, "expires");
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