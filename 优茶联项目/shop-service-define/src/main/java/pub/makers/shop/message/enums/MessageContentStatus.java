package pub.makers.shop.message.enums;

/**
 * Created by dy on 2017/4/17.
 * 消息内容读取状态枚举
 */
public enum MessageContentStatus {

    no("否",0),yes("是",1);

    private String name;
    private int dbData;


    private MessageContentStatus(String name,int dbData) {
        this.name = name;
        this.dbData = dbData;
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

    @Override
    public String toString() {
        return this.dbData+"";
    }

    public static int getDbDataByName(String name) {
        for (MessageContentStatus c : MessageContentStatus.values()) {
            if (c.getName().equals(name)) {
                return c.dbData;
            }
        }
        return 0;
    }

    public static String getTextByDbData(Integer status) {
        String result = "";
        if(status != null){
            for (MessageContentStatus c : MessageContentStatus.values()) {
                if (c.getDbData() == status) {
                    return c.name();
                }
            }
        }
        return result;
    }

    public static MessageContentStatus getStatusByDbData(Integer status) {
        if(status != null){
            for (MessageContentStatus c : MessageContentStatus.values()) {
                if (c.getDbData() == status) {
                    return c;
                }
            }
        }
        return null;
    }
}
