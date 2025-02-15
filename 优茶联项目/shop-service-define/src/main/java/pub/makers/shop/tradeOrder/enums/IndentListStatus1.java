package pub.makers.shop.tradeOrder.enums;

/**
 * Created by dy on 2017/5/8.
 */
public enum IndentListStatus1 {

    pay("待付款", 1), ship("待发货", 2), receive("待收货", 3), return1("退货退款申请", 4), refund("退款申请", 5), exchange("换货申请", 6), evaluate("待评价", 7),
    refunded("已退款", 8), returned("已退货", 9), done("已完成", 10), received("到货确认", 11);

    private String name;
    private int dbData;

    IndentListStatus1(String name, int dbData) {
        this.name = name;
        this.dbData = dbData;
    }


    @Override
    public String toString() {
        return this.dbData + "";
    }

    public static int getDbDataByName(String name) {
        for (IndentListStatus1 c : IndentListStatus1.values()) {
            if (c.getName().equals(name)) {
                return c.dbData;
            }
        }
        return 0;
    }

    public static String getTextByDbData(Integer status) {
        String result = "";
        if(status != null){
            for (IndentListStatus1 c : IndentListStatus1.values()) {
                if (c.getDbData() == status) {
                    return c.name();
                }
            }
        }
        return result;
    }

    public static IndentListStatus1 getStatusByDbData(Integer status) {
        if(status != null){
            for (IndentListStatus1 c : IndentListStatus1.values()) {
                if (c.getDbData() == status) {
                    return c;
                }
            }
        }
        return null;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDbData() {
        return dbData;
    }

    public void setDbData(int dbData) {
        this.dbData = dbData;
    }
}
