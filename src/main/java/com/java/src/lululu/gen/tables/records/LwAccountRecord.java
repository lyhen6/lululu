/*
 * This file is generated by jOOQ.
 */
package com.java.src.lululu.gen.tables.records;


import com.java.src.lululu.gen.enums.LwAccountType;
import com.java.src.lululu.gen.tables.LwAccount;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LwAccountRecord extends UpdatableRecordImpl<LwAccountRecord> implements Record18<Long, LocalDateTime, LocalDateTime, String, UInteger, String, String, String, String, String, Integer, String, String, String, LocalDate, Long, LwAccountType, String> {

    private static final long serialVersionUID = 578530326;

    /**
     * Setter for <code>LW.lw_account.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>LW.lw_account.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>LW.lw_account.create_date</code>. 创建时间
     */
    public void setCreateDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>LW.lw_account.create_date</code>. 创建时间
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>LW.lw_account.update_date</code>. 更新时间
     */
    public void setUpdateDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>LW.lw_account.update_date</code>. 更新时间
     */
    public LocalDateTime getUpdateDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>LW.lw_account.remarks</code>. 备注信息
     */
    public void setRemarks(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>LW.lw_account.remarks</code>. 备注信息
     */
    public String getRemarks() {
        return (String) get(3);
    }

    /**
     * Setter for <code>LW.lw_account.del_flag</code>. 逻辑删除标记（0：显示；1：隐藏）
     */
    public void setDelFlag(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>LW.lw_account.del_flag</code>. 逻辑删除标记（0：显示；1：隐藏）
     */
    public UInteger getDelFlag() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>LW.lw_account.name</code>. 姓名
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>LW.lw_account.name</code>. 姓名
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>LW.lw_account.mobile</code>. 电话
     */
    public void setMobile(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>LW.lw_account.mobile</code>. 电话
     */
    public String getMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>LW.lw_account.password</code>. 密码
     */
    public void setPassword(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>LW.lw_account.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(7);
    }

    /**
     * Setter for <code>LW.lw_account.photo</code>. 照片
     */
    public void setPhoto(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>LW.lw_account.photo</code>. 照片
     */
    public String getPhoto() {
        return (String) get(8);
    }

    /**
     * Setter for <code>LW.lw_account.login_name</code>. 登录名
     */
    public void setLoginName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>LW.lw_account.login_name</code>. 登录名
     */
    public String getLoginName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>LW.lw_account.sex</code>. 性别
     */
    public void setSex(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>LW.lw_account.sex</code>. 性别
     */
    public Integer getSex() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>LW.lw_account.address</code>. 地址
     */
    public void setAddress(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>LW.lw_account.address</code>. 地址
     */
    public String getAddress() {
        return (String) get(11);
    }

    /**
     * Setter for <code>LW.lw_account.token</code>. token
     */
    public void setToken(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>LW.lw_account.token</code>. token
     */
    public String getToken() {
        return (String) get(12);
    }

    /**
     * Setter for <code>LW.lw_account.wx_openid</code>.
     */
    public void setWxOpenid(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>LW.lw_account.wx_openid</code>.
     */
    public String getWxOpenid() {
        return (String) get(13);
    }

    /**
     * Setter for <code>LW.lw_account.birthday</code>.
     */
    public void setBirthday(LocalDate value) {
        set(14, value);
    }

    /**
     * Getter for <code>LW.lw_account.birthday</code>.
     */
    public LocalDate getBirthday() {
        return (LocalDate) get(14);
    }

    /**
     * Setter for <code>LW.lw_account.shop_id</code>.
     */
    public void setShopId(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>LW.lw_account.shop_id</code>.
     */
    public Long getShopId() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>LW.lw_account.type</code>. 员工类型  店长  店员
     */
    public void setType(LwAccountType value) {
        set(16, value);
    }

    /**
     * Getter for <code>LW.lw_account.type</code>. 员工类型  店长  店员
     */
    public LwAccountType getType() {
        return (LwAccountType) get(16);
    }

    /**
     * Setter for <code>LW.lw_account.salt</code>.
     */
    public void setSalt(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>LW.lw_account.salt</code>.
     */
    public String getSalt() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, LocalDateTime, LocalDateTime, String, UInteger, String, String, String, String, String, Integer, String, String, String, LocalDate, Long, LwAccountType, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, LocalDateTime, LocalDateTime, String, UInteger, String, String, String, String, String, Integer, String, String, String, LocalDate, Long, LwAccountType, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LwAccount.LW_ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return LwAccount.LW_ACCOUNT.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return LwAccount.LW_ACCOUNT.UPDATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LwAccount.LW_ACCOUNT.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return LwAccount.LW_ACCOUNT.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LwAccount.LW_ACCOUNT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return LwAccount.LW_ACCOUNT.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return LwAccount.LW_ACCOUNT.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return LwAccount.LW_ACCOUNT.PHOTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return LwAccount.LW_ACCOUNT.LOGIN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return LwAccount.LW_ACCOUNT.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return LwAccount.LW_ACCOUNT.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return LwAccount.LW_ACCOUNT.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return LwAccount.LW_ACCOUNT.WX_OPENID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field15() {
        return LwAccount.LW_ACCOUNT.BIRTHDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
        return LwAccount.LW_ACCOUNT.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LwAccountType> field17() {
        return LwAccount.LW_ACCOUNT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return LwAccount.LW_ACCOUNT.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component2() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component3() {
        return getUpdateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component5() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPhoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLoginName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getWxOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate component15() {
        return getBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component16() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountType component17() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getUpdateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPhoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLoginName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getWxOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value15() {
        return getBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountType value17() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value2(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value3(LocalDateTime value) {
        setUpdateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value4(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value5(UInteger value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value7(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value8(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value9(String value) {
        setPhoto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value10(String value) {
        setLoginName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value11(Integer value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value12(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value13(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value14(String value) {
        setWxOpenid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value15(LocalDate value) {
        setBirthday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value16(Long value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value17(LwAccountType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord value18(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwAccountRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, UInteger value5, String value6, String value7, String value8, String value9, String value10, Integer value11, String value12, String value13, String value14, LocalDate value15, Long value16, LwAccountType value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LwAccountRecord
     */
    public LwAccountRecord() {
        super(LwAccount.LW_ACCOUNT);
    }

    /**
     * Create a detached, initialised LwAccountRecord
     */
    public LwAccountRecord(Long id, LocalDateTime createDate, LocalDateTime updateDate, String remarks, UInteger delFlag, String name, String mobile, String password, String photo, String loginName, Integer sex, String address, String token, String wxOpenid, LocalDate birthday, Long shopId, LwAccountType type, String salt) {
        super(LwAccount.LW_ACCOUNT);

        set(0, id);
        set(1, createDate);
        set(2, updateDate);
        set(3, remarks);
        set(4, delFlag);
        set(5, name);
        set(6, mobile);
        set(7, password);
        set(8, photo);
        set(9, loginName);
        set(10, sex);
        set(11, address);
        set(12, token);
        set(13, wxOpenid);
        set(14, birthday);
        set(15, shopId);
        set(16, type);
        set(17, salt);
    }
}
