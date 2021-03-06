/*
 * This file is generated by jOOQ.
 */
package com.java.src.lululu.gen.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;

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
public class LwShop implements Serializable {

    private static final long serialVersionUID = 1715122503;

    private Long          id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String        remarks;
    private UInteger      delFlag;
    private String        name;
    private String        address;
    private String        contactNumber;

    public LwShop() {}

    public LwShop(LwShop value) {
        this.id = value.id;
        this.createDate = value.createDate;
        this.updateDate = value.updateDate;
        this.remarks = value.remarks;
        this.delFlag = value.delFlag;
        this.name = value.name;
        this.address = value.address;
        this.contactNumber = value.contactNumber;
    }

    public LwShop(
        Long          id,
        LocalDateTime createDate,
        LocalDateTime updateDate,
        String        remarks,
        UInteger      delFlag,
        String        name,
        String        address,
        String        contactNumber
    ) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.remarks = remarks;
        this.delFlag = delFlag;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public UInteger getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(UInteger delFlag) {
        this.delFlag = delFlag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LwShop (");

        sb.append(id);
        sb.append(", ").append(createDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(remarks);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(name);
        sb.append(", ").append(address);
        sb.append(", ").append(contactNumber);

        sb.append(")");
        return sb.toString();
    }
}
