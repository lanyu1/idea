package com.hand.idea.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andFounderidIsNull() {
            addCriterion("founderId is null");
            return (Criteria) this;
        }

        public Criteria andFounderidIsNotNull() {
            addCriterion("founderId is not null");
            return (Criteria) this;
        }

        public Criteria andFounderidEqualTo(Integer value) {
            addCriterion("founderId =", value, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidNotEqualTo(Integer value) {
            addCriterion("founderId <>", value, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidGreaterThan(Integer value) {
            addCriterion("founderId >", value, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("founderId >=", value, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidLessThan(Integer value) {
            addCriterion("founderId <", value, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidLessThanOrEqualTo(Integer value) {
            addCriterion("founderId <=", value, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidIn(List<Integer> values) {
            addCriterion("founderId in", values, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidNotIn(List<Integer> values) {
            addCriterion("founderId not in", values, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidBetween(Integer value1, Integer value2) {
            addCriterion("founderId between", value1, value2, "founderid");
            return (Criteria) this;
        }

        public Criteria andFounderidNotBetween(Integer value1, Integer value2) {
            addCriterion("founderId not between", value1, value2, "founderid");
            return (Criteria) this;
        }

        public Criteria andEventidIsNull() {
            addCriterion("eventId is null");
            return (Criteria) this;
        }

        public Criteria andEventidIsNotNull() {
            addCriterion("eventId is not null");
            return (Criteria) this;
        }

        public Criteria andEventidEqualTo(Integer value) {
            addCriterion("eventId =", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotEqualTo(Integer value) {
            addCriterion("eventId <>", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThan(Integer value) {
            addCriterion("eventId >", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eventId >=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThan(Integer value) {
            addCriterion("eventId <", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThanOrEqualTo(Integer value) {
            addCriterion("eventId <=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidIn(List<Integer> values) {
            addCriterion("eventId in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotIn(List<Integer> values) {
            addCriterion("eventId not in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidBetween(Integer value1, Integer value2) {
            addCriterion("eventId between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotBetween(Integer value1, Integer value2) {
            addCriterion("eventId not between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNull() {
            addCriterion("teamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("teamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("teamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("teamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("teamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("teamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("teamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("teamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("teamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("teamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("teamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("teamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("teamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("teamName not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberIsNull() {
            addCriterion("teammateNumber is null");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberIsNotNull() {
            addCriterion("teammateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberEqualTo(Integer value) {
            addCriterion("teammateNumber =", value, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberNotEqualTo(Integer value) {
            addCriterion("teammateNumber <>", value, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberGreaterThan(Integer value) {
            addCriterion("teammateNumber >", value, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("teammateNumber >=", value, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberLessThan(Integer value) {
            addCriterion("teammateNumber <", value, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberLessThanOrEqualTo(Integer value) {
            addCriterion("teammateNumber <=", value, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberIn(List<Integer> values) {
            addCriterion("teammateNumber in", values, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberNotIn(List<Integer> values) {
            addCriterion("teammateNumber not in", values, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberBetween(Integer value1, Integer value2) {
            addCriterion("teammateNumber between", value1, value2, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andTeammatenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("teammateNumber not between", value1, value2, "teammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberIsNull() {
            addCriterion("maxTeammateNumber is null");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberIsNotNull() {
            addCriterion("maxTeammateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberEqualTo(Integer value) {
            addCriterion("maxTeammateNumber =", value, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberNotEqualTo(Integer value) {
            addCriterion("maxTeammateNumber <>", value, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberGreaterThan(Integer value) {
            addCriterion("maxTeammateNumber >", value, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxTeammateNumber >=", value, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberLessThan(Integer value) {
            addCriterion("maxTeammateNumber <", value, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberLessThanOrEqualTo(Integer value) {
            addCriterion("maxTeammateNumber <=", value, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberIn(List<Integer> values) {
            addCriterion("maxTeammateNumber in", values, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberNotIn(List<Integer> values) {
            addCriterion("maxTeammateNumber not in", values, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberBetween(Integer value1, Integer value2) {
            addCriterion("maxTeammateNumber between", value1, value2, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andMaxteammatenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("maxTeammateNumber not between", value1, value2, "maxteammatenumber");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("notice like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("notice not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("notice not between", value1, value2, "notice");
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

        public Criteria andPhotonameIsNull() {
            addCriterion("photoName is null");
            return (Criteria) this;
        }

        public Criteria andPhotonameIsNotNull() {
            addCriterion("photoName is not null");
            return (Criteria) this;
        }

        public Criteria andPhotonameEqualTo(String value) {
            addCriterion("photoName =", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotEqualTo(String value) {
            addCriterion("photoName <>", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameGreaterThan(String value) {
            addCriterion("photoName >", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameGreaterThanOrEqualTo(String value) {
            addCriterion("photoName >=", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLessThan(String value) {
            addCriterion("photoName <", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLessThanOrEqualTo(String value) {
            addCriterion("photoName <=", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLike(String value) {
            addCriterion("photoName like", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotLike(String value) {
            addCriterion("photoName not like", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameIn(List<String> values) {
            addCriterion("photoName in", values, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotIn(List<String> values) {
            addCriterion("photoName not in", values, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameBetween(String value1, String value2) {
            addCriterion("photoName between", value1, value2, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotBetween(String value1, String value2) {
            addCriterion("photoName not between", value1, value2, "photoname");
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