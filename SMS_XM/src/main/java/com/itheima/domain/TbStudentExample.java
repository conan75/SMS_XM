package com.itheima.domain;

import java.util.ArrayList;
import java.util.List;

public class TbStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andTbClassIdIsNull() {
            addCriterion("tb_class_id is null");
            return (Criteria) this;
        }

        public Criteria andTbClassIdIsNotNull() {
            addCriterion("tb_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbClassIdEqualTo(String value) {
            addCriterion("tb_class_id =", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdNotEqualTo(String value) {
            addCriterion("tb_class_id <>", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdGreaterThan(String value) {
            addCriterion("tb_class_id >", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("tb_class_id >=", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdLessThan(String value) {
            addCriterion("tb_class_id <", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdLessThanOrEqualTo(String value) {
            addCriterion("tb_class_id <=", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdLike(String value) {
            addCriterion("tb_class_id like", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdNotLike(String value) {
            addCriterion("tb_class_id not like", value, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdIn(List<String> values) {
            addCriterion("tb_class_id in", values, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdNotIn(List<String> values) {
            addCriterion("tb_class_id not in", values, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdBetween(String value1, String value2) {
            addCriterion("tb_class_id between", value1, value2, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassIdNotBetween(String value1, String value2) {
            addCriterion("tb_class_id not between", value1, value2, "tbClassId");
            return (Criteria) this;
        }

        public Criteria andTbClassNameIsNull() {
            addCriterion("tb_class_name is null");
            return (Criteria) this;
        }

        public Criteria andTbClassNameIsNotNull() {
            addCriterion("tb_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbClassNameEqualTo(String value) {
            addCriterion("tb_class_name =", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameNotEqualTo(String value) {
            addCriterion("tb_class_name <>", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameGreaterThan(String value) {
            addCriterion("tb_class_name >", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("tb_class_name >=", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameLessThan(String value) {
            addCriterion("tb_class_name <", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameLessThanOrEqualTo(String value) {
            addCriterion("tb_class_name <=", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameLike(String value) {
            addCriterion("tb_class_name like", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameNotLike(String value) {
            addCriterion("tb_class_name not like", value, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameIn(List<String> values) {
            addCriterion("tb_class_name in", values, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameNotIn(List<String> values) {
            addCriterion("tb_class_name not in", values, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameBetween(String value1, String value2) {
            addCriterion("tb_class_name between", value1, value2, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andTbClassNameNotBetween(String value1, String value2) {
            addCriterion("tb_class_name not between", value1, value2, "tbClassName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andStatsIsNull() {
            addCriterion("stats is null");
            return (Criteria) this;
        }

        public Criteria andStatsIsNotNull() {
            addCriterion("stats is not null");
            return (Criteria) this;
        }

        public Criteria andStatsEqualTo(Integer value) {
            addCriterion("stats =", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotEqualTo(Integer value) {
            addCriterion("stats <>", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsGreaterThan(Integer value) {
            addCriterion("stats >", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats >=", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLessThan(Integer value) {
            addCriterion("stats <", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLessThanOrEqualTo(Integer value) {
            addCriterion("stats <=", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsIn(List<Integer> values) {
            addCriterion("stats in", values, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotIn(List<Integer> values) {
            addCriterion("stats not in", values, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsBetween(Integer value1, Integer value2) {
            addCriterion("stats between", value1, value2, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotBetween(Integer value1, Integer value2) {
            addCriterion("stats not between", value1, value2, "stats");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("idcard_no is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("idcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("idcard_no =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("idcard_no <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("idcard_no >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_no >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("idcard_no <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("idcard_no <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("idcard_no like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("idcard_no not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("idcard_no in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("idcard_no not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("idcard_no between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("idcard_no not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("mobile_no is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("mobile_no is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("mobile_no =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("mobile_no <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("mobile_no >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("mobile_no <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("mobile_no <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("mobile_no like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("mobile_no not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("mobile_no in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("mobile_no not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("mobile_no between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("mobile_no not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateIsNull() {
            addCriterion("class_open_date is null");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateIsNotNull() {
            addCriterion("class_open_date is not null");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateEqualTo(String value) {
            addCriterion("class_open_date =", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateNotEqualTo(String value) {
            addCriterion("class_open_date <>", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateGreaterThan(String value) {
            addCriterion("class_open_date >", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("class_open_date >=", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateLessThan(String value) {
            addCriterion("class_open_date <", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateLessThanOrEqualTo(String value) {
            addCriterion("class_open_date <=", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateLike(String value) {
            addCriterion("class_open_date like", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateNotLike(String value) {
            addCriterion("class_open_date not like", value, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateIn(List<String> values) {
            addCriterion("class_open_date in", values, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateNotIn(List<String> values) {
            addCriterion("class_open_date not in", values, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateBetween(String value1, String value2) {
            addCriterion("class_open_date between", value1, value2, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andClassOpenDateNotBetween(String value1, String value2) {
            addCriterion("class_open_date not between", value1, value2, "classOpenDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateIsNull() {
            addCriterion("normal_graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateIsNotNull() {
            addCriterion("normal_graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateEqualTo(String value) {
            addCriterion("normal_graduate_date =", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateNotEqualTo(String value) {
            addCriterion("normal_graduate_date <>", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateGreaterThan(String value) {
            addCriterion("normal_graduate_date >", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateGreaterThanOrEqualTo(String value) {
            addCriterion("normal_graduate_date >=", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateLessThan(String value) {
            addCriterion("normal_graduate_date <", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateLessThanOrEqualTo(String value) {
            addCriterion("normal_graduate_date <=", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateLike(String value) {
            addCriterion("normal_graduate_date like", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateNotLike(String value) {
            addCriterion("normal_graduate_date not like", value, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateIn(List<String> values) {
            addCriterion("normal_graduate_date in", values, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateNotIn(List<String> values) {
            addCriterion("normal_graduate_date not in", values, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateBetween(String value1, String value2) {
            addCriterion("normal_graduate_date between", value1, value2, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andNormalGraduateDateNotBetween(String value1, String value2) {
            addCriterion("normal_graduate_date not between", value1, value2, "normalGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateIsNull() {
            addCriterion("actual_graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateIsNotNull() {
            addCriterion("actual_graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateEqualTo(String value) {
            addCriterion("actual_graduate_date =", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateNotEqualTo(String value) {
            addCriterion("actual_graduate_date <>", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateGreaterThan(String value) {
            addCriterion("actual_graduate_date >", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateGreaterThanOrEqualTo(String value) {
            addCriterion("actual_graduate_date >=", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateLessThan(String value) {
            addCriterion("actual_graduate_date <", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateLessThanOrEqualTo(String value) {
            addCriterion("actual_graduate_date <=", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateLike(String value) {
            addCriterion("actual_graduate_date like", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateNotLike(String value) {
            addCriterion("actual_graduate_date not like", value, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateIn(List<String> values) {
            addCriterion("actual_graduate_date in", values, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateNotIn(List<String> values) {
            addCriterion("actual_graduate_date not in", values, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateBetween(String value1, String value2) {
            addCriterion("actual_graduate_date between", value1, value2, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andActualGraduateDateNotBetween(String value1, String value2) {
            addCriterion("actual_graduate_date not between", value1, value2, "actualGraduateDate");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressIsNull() {
            addCriterion("idcard_address is null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressIsNotNull() {
            addCriterion("idcard_address is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressEqualTo(String value) {
            addCriterion("idcard_address =", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotEqualTo(String value) {
            addCriterion("idcard_address <>", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressGreaterThan(String value) {
            addCriterion("idcard_address >", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_address >=", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressLessThan(String value) {
            addCriterion("idcard_address <", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressLessThanOrEqualTo(String value) {
            addCriterion("idcard_address <=", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressLike(String value) {
            addCriterion("idcard_address like", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotLike(String value) {
            addCriterion("idcard_address not like", value, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressIn(List<String> values) {
            addCriterion("idcard_address in", values, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotIn(List<String> values) {
            addCriterion("idcard_address not in", values, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressBetween(String value1, String value2) {
            addCriterion("idcard_address between", value1, value2, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andIdcardAddressNotBetween(String value1, String value2) {
            addCriterion("idcard_address not between", value1, value2, "idcardAddress");
            return (Criteria) this;
        }

        public Criteria andActualAdderssIsNull() {
            addCriterion("actual_adderss is null");
            return (Criteria) this;
        }

        public Criteria andActualAdderssIsNotNull() {
            addCriterion("actual_adderss is not null");
            return (Criteria) this;
        }

        public Criteria andActualAdderssEqualTo(String value) {
            addCriterion("actual_adderss =", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssNotEqualTo(String value) {
            addCriterion("actual_adderss <>", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssGreaterThan(String value) {
            addCriterion("actual_adderss >", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssGreaterThanOrEqualTo(String value) {
            addCriterion("actual_adderss >=", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssLessThan(String value) {
            addCriterion("actual_adderss <", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssLessThanOrEqualTo(String value) {
            addCriterion("actual_adderss <=", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssLike(String value) {
            addCriterion("actual_adderss like", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssNotLike(String value) {
            addCriterion("actual_adderss not like", value, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssIn(List<String> values) {
            addCriterion("actual_adderss in", values, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssNotIn(List<String> values) {
            addCriterion("actual_adderss not in", values, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssBetween(String value1, String value2) {
            addCriterion("actual_adderss between", value1, value2, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andActualAdderssNotBetween(String value1, String value2) {
            addCriterion("actual_adderss not between", value1, value2, "actualAdderss");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneIsNull() {
            addCriterion("family_phone is null");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneIsNotNull() {
            addCriterion("family_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneEqualTo(String value) {
            addCriterion("family_phone =", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneNotEqualTo(String value) {
            addCriterion("family_phone <>", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneGreaterThan(String value) {
            addCriterion("family_phone >", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("family_phone >=", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneLessThan(String value) {
            addCriterion("family_phone <", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneLessThanOrEqualTo(String value) {
            addCriterion("family_phone <=", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneLike(String value) {
            addCriterion("family_phone like", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneNotLike(String value) {
            addCriterion("family_phone not like", value, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneIn(List<String> values) {
            addCriterion("family_phone in", values, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneNotIn(List<String> values) {
            addCriterion("family_phone not in", values, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneBetween(String value1, String value2) {
            addCriterion("family_phone between", value1, value2, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andFamilyPhoneNotBetween(String value1, String value2) {
            addCriterion("family_phone not between", value1, value2, "familyPhone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("graduate_school =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("graduate_school <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("graduate_school >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_school >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("graduate_school <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduate_school <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("graduate_school like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("graduate_school not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("graduate_school in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("graduate_school not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("graduate_school between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("graduate_school not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNull() {
            addCriterion("graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNotNull() {
            addCriterion("graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateEqualTo(String value) {
            addCriterion("graduate_date =", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotEqualTo(String value) {
            addCriterion("graduate_date <>", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThan(String value) {
            addCriterion("graduate_date >", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_date >=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThan(String value) {
            addCriterion("graduate_date <", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThanOrEqualTo(String value) {
            addCriterion("graduate_date <=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLike(String value) {
            addCriterion("graduate_date like", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotLike(String value) {
            addCriterion("graduate_date not like", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIn(List<String> values) {
            addCriterion("graduate_date in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotIn(List<String> values) {
            addCriterion("graduate_date not in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateBetween(String value1, String value2) {
            addCriterion("graduate_date between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotBetween(String value1, String value2) {
            addCriterion("graduate_date not between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("student_no is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("student_no is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(String value) {
            addCriterion("student_no =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(String value) {
            addCriterion("student_no <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(String value) {
            addCriterion("student_no >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("student_no >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(String value) {
            addCriterion("student_no <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(String value) {
            addCriterion("student_no <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLike(String value) {
            addCriterion("student_no like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotLike(String value) {
            addCriterion("student_no not like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<String> values) {
            addCriterion("student_no in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<String> values) {
            addCriterion("student_no not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(String value1, String value2) {
            addCriterion("student_no between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(String value1, String value2) {
            addCriterion("student_no not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(String value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(String value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(String value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(String value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLike(String value) {
            addCriterion("last_update_time like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotLike(String value) {
            addCriterion("last_update_time not like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<String> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<String> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(String value1, String value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsableFlagIsNull() {
            addCriterion("usable_flag is null");
            return (Criteria) this;
        }

        public Criteria andUsableFlagIsNotNull() {
            addCriterion("usable_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUsableFlagEqualTo(Integer value) {
            addCriterion("usable_flag =", value, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagNotEqualTo(Integer value) {
            addCriterion("usable_flag <>", value, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagGreaterThan(Integer value) {
            addCriterion("usable_flag >", value, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("usable_flag >=", value, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagLessThan(Integer value) {
            addCriterion("usable_flag <", value, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagLessThanOrEqualTo(Integer value) {
            addCriterion("usable_flag <=", value, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagIn(List<Integer> values) {
            addCriterion("usable_flag in", values, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagNotIn(List<Integer> values) {
            addCriterion("usable_flag not in", values, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagBetween(Integer value1, Integer value2) {
            addCriterion("usable_flag between", value1, value2, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andUsableFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("usable_flag not between", value1, value2, "usableFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
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