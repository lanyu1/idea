package com.hand.idea.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNull() {
            addCriterion("teamId is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("teamId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("teamId =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("teamId <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("teamId >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamId >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("teamId <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("teamId <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("teamId in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("teamId not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("teamId between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("teamId not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("workTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("workTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterion("workTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterion("workTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterion("workTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("workTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterion("workTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterion("workTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterion("workTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterion("workTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterion("workTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterion("workTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andIssendemailIsNull() {
            addCriterion("isSendEmail is null");
            return (Criteria) this;
        }

        public Criteria andIssendemailIsNotNull() {
            addCriterion("isSendEmail is not null");
            return (Criteria) this;
        }

        public Criteria andIssendemailEqualTo(Boolean value) {
            addCriterion("isSendEmail =", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotEqualTo(Boolean value) {
            addCriterion("isSendEmail <>", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailGreaterThan(Boolean value) {
            addCriterion("isSendEmail >", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSendEmail >=", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailLessThan(Boolean value) {
            addCriterion("isSendEmail <", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailLessThanOrEqualTo(Boolean value) {
            addCriterion("isSendEmail <=", value, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailIn(List<Boolean> values) {
            addCriterion("isSendEmail in", values, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotIn(List<Boolean> values) {
            addCriterion("isSendEmail not in", values, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailBetween(Boolean value1, Boolean value2) {
            addCriterion("isSendEmail between", value1, value2, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendemailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSendEmail not between", value1, value2, "issendemail");
            return (Criteria) this;
        }

        public Criteria andIssendIsNull() {
            addCriterion("isSend is null");
            return (Criteria) this;
        }

        public Criteria andIssendIsNotNull() {
            addCriterion("isSend is not null");
            return (Criteria) this;
        }

        public Criteria andIssendEqualTo(Boolean value) {
            addCriterion("isSend =", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotEqualTo(Boolean value) {
            addCriterion("isSend <>", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThan(Boolean value) {
            addCriterion("isSend >", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSend >=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThan(Boolean value) {
            addCriterion("isSend <", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThanOrEqualTo(Boolean value) {
            addCriterion("isSend <=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendIn(List<Boolean> values) {
            addCriterion("isSend in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotIn(List<Boolean> values) {
            addCriterion("isSend not in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendBetween(Boolean value1, Boolean value2) {
            addCriterion("isSend between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSend not between", value1, value2, "issend");
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