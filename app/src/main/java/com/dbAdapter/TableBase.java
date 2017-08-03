package com.dbAdapter;

/**
 * Created by Admin on 03-August-3-2017.
 */

public class TableBase {

    /*
        *base Table Class
     */

    public static class Tables{
        public static String employee="employee";
        public static String employee_role_mapping="employee_role_mapping";
        public static String facebook_like="facebook_like";
        public static String item="item";
        public static String item_detail="item_detail";
        public static String item_size="item_size";
        public static String item_type="item_type";
        public static String purchase_order="purchase_order";
        public static String purchase_order_detail="purchase_order_detail";
        public static String rating="rating";
        public static String seq="seq";
        public static String sales_bill_detail="sales_bill_detail";
        public static String stock="stock";
        public static String uom="uom";
        public static String vendor="vendor";
    }
    public static class create_table{
        public static String employee="CREATE TABLE `employee` (\n" +
                "\t`EMP_ID`\tTEXT,\n" +
                "\t`EMP_NAME`\tTEXT,\n" +
                "\t`EMP_MOBILE`\tTEXT,\n" +
                "\t`USER_NAME`\tTEXT,\n" +
                "\t`PASSWORD`\tTEXT,\n" +
                "\t`APPLICATION_ROLE_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(EMP_ID)\n" +
                ");";
        public static String employee_role_mapping="CREATE TABLE `employee_role_mapping` (\n" +
                "\t`APPLICATION_ROLE_ID`\tTEXT,\n" +
                "\t`ROLE`\tTEXT,\n" +
                "\tPRIMARY KEY(APPLICATION_ROLE_ID)\n" +
                ");";
        public static String facebook_like="CREATE TABLE `facebook_like` (\n" +
                "\t`FACEBOOK_LIKE_ID`\tTEXT,\n" +
                "\t`FACEBOOK_LIKE`\tTEXT,\n" +
                "\t`ITEM_ID`\tTEXT,\n" +
                "\t`USER_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(FACEBOOK_LIKE_ID)\n" +
                ");";
        public static String item="CREATE TABLE `item` (\n" +
                "\t`ITEM_ID`\tTEXT,\n" +
                "\t`NAME`\tTEXT,\n" +
                "\t`UOM_ID`\tTEXT,\n" +
                "\t`ITEM_TYPE_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(ITEM_ID)\n" +
                ");";


        public static String item_detail="CREATE TABLE `item_detail` (\n" +
                "\t`ITEM_DETAIL_ID`\tTEXT,\n" +
                "\t`ITEM_ID`\tTEXT,\n" +
                "\t`MRP`\tTEXT,\n" +
                "\t`SALES_PRICE`\tTEXT,\n" +
                "\t`WEIGHT`\tTEXT,\n" +
                "\t`DISCOUNT`\tTEXT,\n" +
                "\t`ITEM_SIZE_ID`\tTEXT,\n" +
                "\t`COLOR`\tTEXT,\n" +
                "\t`SLEEVE_TYPE`\tTEXT,\n" +
                "\t`FABRIC`\tTEXT,\n" +
                "\t`PATTERN`\tTEXT,\n" +
                "\t`IMAGE1`\tTEXT,\n" +
                "\t`IMAGE2`\tTEXT,\n" +
                "\t`IMAGE3`\tTEXT,\n" +
                "\t`IMAGE4`\tTEXT,\n" +
                "\t`IMAGE5`\tTEXT,\n" +
                "\tPRIMARY KEY(ITEM_DETAIL_ID)\n" +
                ");";
        public static String item_size="CREATE TABLE `item_size` (\n" +
                "\t`ITEM_SIZE_ID`\tTEXT,\n" +
                "\t`ITEM_SIZE_NAME`\tTEXT,\n" +
                "\t`ITEM_DETAIL_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(ITEM_SIZE_ID)\n" +
                ");";
        public static String item_type="CREATE TABLE `item_type` (\n" +
                "\t`ITEM_TYPE_ID`\tINTEGER,\n" +
                "\t`ITEM_NAME`\tTEXT,\n" +
                "\tPRIMARY KEY(ITEM_TYPE_ID)\n" +
                ");";
        public static String purchase_order="CREATE TABLE `purchase_order` (\n" +
                "\t`PURCHASE_ORDER_ID`\tTEXT,\n" +
                "\t`ORDER_DATE`\tTEXT,\n" +
                "\t`TOTAL_AMOUNT`\tTEXT,\n" +
                "\t`CREATED_BY`\tTEXT,\n" +
                "\t`VENDOR_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(PURCHASE_ORDER_ID)";
        public static String purchase_order_detail="CREATE TABLE `purchase_order_detail` (\n" +
                "\t`POD_ID`\tTEXT,\n" +
                "\t`ITEM_ID`\tTEXT,\n" +
                "\t`QUANTITY`\tTEXT,\n" +
                "\t`UNIT`\tTEXT,\n" +
                "\t`PRICE`\tTEXT,\n" +
                "\t`TOTAL_AMOUNT`\tTEXT,\n" +
                "\t`PURCHASE_ORDER_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(POD_ID)\n" +
                ");";
        public static  String rating="CREATE TABLE `rating` (\n" +
                "\t`RATE_ID`\tTEXT,\n" +
                "\t`RATE_VALUE`\tTEXT,\n" +
                "\t`ITEM_ID`\tTEXT,\n" +
                "\t`USER_ID`\tTEXT,\n" +
                "\tPRIMARY KEY(RATE_ID)\n" +
                ");";
        public static  String seq="CREATE TABLE `seq` (\n" +
                "\t`NAME`\tTEXT,\n" +
                "\t`YEAR`\tTEXT,\n" +
                "\t`COUNT`\tTEXT,\n" +
                "\t`ID`\tTEXT,\n" +
                "\t`SEQ_NAME`\tTEXT,\n" +
                "\tPRIMARY KEY(NAME)\n" +
                ");";
        public static  String sales_bill_detail="CREATE TABLE `sales_bill_detail` (\n" +
                "\t`SALES_BILL_DETAIL_ID`\tINTEGER,\n" +
                "\t`QUANTITY`\tINTEGER,\n" +
                "\t`PRICE`\tINTEGER,\n" +
                "\t`TOTAL_PRICE`\tINTEGER,\n" +
                "\t`SALES_BILL_ID`\tINTEGER,\n" +
                "\t`ITEM_ID`\tINTEGER\n" +
                ");";
        public static  String stock="CREATE TABLE `stock` (\n" +
                "\t`STOCK_ID`\tTEXT,\n" +
                "\t`ITEM_DETAIL_ID`\tTEXT,\n" +
                "\t`QUANTITY`\tTEXT,\n" +
                "\t`UOM_ID`\tTEXT,\n" +
                "\t`RECORD_TIME`\tTEXT,\n" +
                "\t`STATUS`\tTEXT,\n" +
                "\t`STORAGE_ID`\tTEXT,\n" +
                "\t`MIN_STOCK`\tTEXT,\n" +
                "\t`MAX_STOCK`\tTEXT,\n" +
                "\tPRIMARY KEY(STOCK_ID)\n" +
                ");";
        public static String uom="CREATE TABLE `` (\n" +
                "\t`UOM_ID`\tTEXT,\n" +
                "\t`UOM_NAME`\tTEXT,\n" +
                "\tPRIMARY KEY(UOM_ID)\n" +
                ");";
        public static String vendor="CREATE TABLE `vendor` (\n" +
                "\t`VENDOR_ID`\tTEXT,\n" +
                "\t`VENDOR_NAME`\tTEXT,\n" +
                "\t`CONTACT_NO`\tTEXT,\n" +
                "\t`VENDOR_ADDRESS`\tTEXT,\n" +
                "\tPRIMARY KEY(VENDOR_ID)\n" +
                ");";
    }
}
