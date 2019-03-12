/*
 * This file is generated by jOOQ.
 */
package com.gen;


import com.gen.tables.LwAccount;
import com.gen.tables.LwGoods;
import com.gen.tables.LwMember;
import com.gen.tables.LwMemberCard;
import com.gen.tables.LwOrder;
import com.gen.tables.LwShop;
import com.gen.tables.records.LwAccountRecord;
import com.gen.tables.records.LwGoodsRecord;
import com.gen.tables.records.LwMemberCardRecord;
import com.gen.tables.records.LwMemberRecord;
import com.gen.tables.records.LwOrderRecord;
import com.gen.tables.records.LwShopRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>LW</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<LwAccountRecord, Long> IDENTITY_LW_ACCOUNT = Identities0.IDENTITY_LW_ACCOUNT;
    public static final Identity<LwOrderRecord, Long> IDENTITY_LW_ORDER = Identities0.IDENTITY_LW_ORDER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<LwAccountRecord> KEY_LW_ACCOUNT_PRIMARY = UniqueKeys0.KEY_LW_ACCOUNT_PRIMARY;
    public static final UniqueKey<LwGoodsRecord> KEY_LW_GOODS_PRIMARY = UniqueKeys0.KEY_LW_GOODS_PRIMARY;
    public static final UniqueKey<LwMemberRecord> KEY_LW_MEMBER_PRIMARY = UniqueKeys0.KEY_LW_MEMBER_PRIMARY;
    public static final UniqueKey<LwMemberCardRecord> KEY_LW_MEMBER_CARD_PRIMARY = UniqueKeys0.KEY_LW_MEMBER_CARD_PRIMARY;
    public static final UniqueKey<LwOrderRecord> KEY_LW_ORDER_PRIMARY = UniqueKeys0.KEY_LW_ORDER_PRIMARY;
    public static final UniqueKey<LwShopRecord> KEY_LW_SHOP_PRIMARY = UniqueKeys0.KEY_LW_SHOP_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<LwAccountRecord, Long> IDENTITY_LW_ACCOUNT = Internal.createIdentity(LwAccount.LW_ACCOUNT, LwAccount.LW_ACCOUNT.ID);
        public static Identity<LwOrderRecord, Long> IDENTITY_LW_ORDER = Internal.createIdentity(LwOrder.LW_ORDER, LwOrder.LW_ORDER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<LwAccountRecord> KEY_LW_ACCOUNT_PRIMARY = Internal.createUniqueKey(LwAccount.LW_ACCOUNT, "KEY_lw_account_PRIMARY", LwAccount.LW_ACCOUNT.ID);
        public static final UniqueKey<LwGoodsRecord> KEY_LW_GOODS_PRIMARY = Internal.createUniqueKey(LwGoods.LW_GOODS, "KEY_lw_goods_PRIMARY", LwGoods.LW_GOODS.ID);
        public static final UniqueKey<LwMemberRecord> KEY_LW_MEMBER_PRIMARY = Internal.createUniqueKey(LwMember.LW_MEMBER, "KEY_lw_member_PRIMARY", LwMember.LW_MEMBER.ID);
        public static final UniqueKey<LwMemberCardRecord> KEY_LW_MEMBER_CARD_PRIMARY = Internal.createUniqueKey(LwMemberCard.LW_MEMBER_CARD, "KEY_lw_member_card_PRIMARY", LwMemberCard.LW_MEMBER_CARD.ID);
        public static final UniqueKey<LwOrderRecord> KEY_LW_ORDER_PRIMARY = Internal.createUniqueKey(LwOrder.LW_ORDER, "KEY_lw_order_PRIMARY", LwOrder.LW_ORDER.ID);
        public static final UniqueKey<LwShopRecord> KEY_LW_SHOP_PRIMARY = Internal.createUniqueKey(LwShop.LW_SHOP, "KEY_lw_shop_PRIMARY", LwShop.LW_SHOP.ID);
    }
}
