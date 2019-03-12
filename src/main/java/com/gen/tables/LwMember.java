/*
 * This file is generated by jOOQ.
 */
package com.gen.tables;


import com.gen.Indexes;
import com.gen.Keys;
import com.gen.Lw;
import com.gen.tables.records.LwMemberRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class LwMember extends TableImpl<LwMemberRecord> {

    private static final long serialVersionUID = -162898873;

    /**
     * The reference instance of <code>LW.lw_member</code>
     */
    public static final LwMember LW_MEMBER = new LwMember();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LwMemberRecord> getRecordType() {
        return LwMemberRecord.class;
    }

    /**
     * The column <code>LW.lw_member.id</code>.
     */
    public final TableField<LwMemberRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>LW.lw_member.create_date</code>. 创建时间
     */
    public final TableField<LwMemberRecord, LocalDateTime> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>LW.lw_member.update_date</code>. 更新时间
     */
    public final TableField<LwMemberRecord, LocalDateTime> UPDATE_DATE = createField("update_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "更新时间");

    /**
     * The column <code>LW.lw_member.remarks</code>. 备注信息
     */
    public final TableField<LwMemberRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注信息");

    /**
     * The column <code>LW.lw_member.del_flag</code>. 逻辑删除标记（0：显示；1：隐藏）
     */
    public final TableField<LwMemberRecord, UInteger> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "逻辑删除标记（0：显示；1：隐藏）");

    /**
     * The column <code>LW.lw_member.name</code>. 姓名
     */
    public final TableField<LwMemberRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "姓名");

    /**
     * The column <code>LW.lw_member.mobile</code>. 电话
     */
    public final TableField<LwMemberRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(64), this, "电话");

    /**
     * The column <code>LW.lw_member.photo</code>. 照片
     */
    public final TableField<LwMemberRecord, String> PHOTO = createField("photo", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "照片");

    /**
     * The column <code>LW.lw_member.sex</code>. 性别
     */
    public final TableField<LwMemberRecord, Integer> SEX = createField("sex", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "性别");

    /**
     * The column <code>LW.lw_member.address</code>. 地址
     */
    public final TableField<LwMemberRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "地址");

    /**
     * The column <code>LW.lw_member.birthday</code>.
     */
    public final TableField<LwMemberRecord, LocalDate> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>LW.lw_member.shop_id</code>.
     */
    public final TableField<LwMemberRecord, Long> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>LW.lw_member</code> table reference
     */
    public LwMember() {
        this(DSL.name("lw_member"), null);
    }

    /**
     * Create an aliased <code>LW.lw_member</code> table reference
     */
    public LwMember(String alias) {
        this(DSL.name(alias), LW_MEMBER);
    }

    /**
     * Create an aliased <code>LW.lw_member</code> table reference
     */
    public LwMember(Name alias) {
        this(alias, LW_MEMBER);
    }

    private LwMember(Name alias, Table<LwMemberRecord> aliased) {
        this(alias, aliased, null);
    }

    private LwMember(Name alias, Table<LwMemberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LwMember(Table<O> child, ForeignKey<O, LwMemberRecord> key) {
        super(child, key, LW_MEMBER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Lw.LW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LW_MEMBER_MEMBERNM, Indexes.LW_MEMBER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LwMemberRecord> getPrimaryKey() {
        return Keys.KEY_LW_MEMBER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LwMemberRecord>> getKeys() {
        return Arrays.<UniqueKey<LwMemberRecord>>asList(Keys.KEY_LW_MEMBER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwMember as(String alias) {
        return new LwMember(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LwMember as(Name alias) {
        return new LwMember(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LwMember rename(String name) {
        return new LwMember(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LwMember rename(Name name) {
        return new LwMember(name, null);
    }
}
