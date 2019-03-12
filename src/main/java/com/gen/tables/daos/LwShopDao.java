/*
 * This file is generated by jOOQ.
 */
package com.gen.tables.daos;


import com.gen.tables.LwShop;
import com.gen.tables.records.LwShopRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class LwShopDao extends DAOImpl<LwShopRecord, com.gen.tables.pojos.LwShop, Long> {

    /**
     * Create a new LwShopDao without any configuration
     */
    public LwShopDao() {
        super(LwShop.LW_SHOP, com.gen.tables.pojos.LwShop.class);
    }

    /**
     * Create a new LwShopDao with an attached configuration
     */
    public LwShopDao(Configuration configuration) {
        super(LwShop.LW_SHOP, com.gen.tables.pojos.LwShop.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.gen.tables.pojos.LwShop object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchById(Long... values) {
        return fetch(LwShop.LW_SHOP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.gen.tables.pojos.LwShop fetchOneById(Long value) {
        return fetchOne(LwShop.LW_SHOP.ID, value);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByCreateDate(LocalDateTime... values) {
        return fetch(LwShop.LW_SHOP.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>update_date IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByUpdateDate(LocalDateTime... values) {
        return fetch(LwShop.LW_SHOP.UPDATE_DATE, values);
    }

    /**
     * Fetch records that have <code>remarks IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByRemarks(String... values) {
        return fetch(LwShop.LW_SHOP.REMARKS, values);
    }

    /**
     * Fetch records that have <code>del_flag IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByDelFlag(UInteger... values) {
        return fetch(LwShop.LW_SHOP.DEL_FLAG, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByName(String... values) {
        return fetch(LwShop.LW_SHOP.NAME, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByAddress(String... values) {
        return fetch(LwShop.LW_SHOP.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>contact_number IN (values)</code>
     */
    public List<com.gen.tables.pojos.LwShop> fetchByContactNumber(String... values) {
        return fetch(LwShop.LW_SHOP.CONTACT_NUMBER, values);
    }
}
