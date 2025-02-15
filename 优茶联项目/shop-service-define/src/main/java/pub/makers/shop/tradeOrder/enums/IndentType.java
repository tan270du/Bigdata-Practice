package pub.makers.shop.tradeOrder.enums;

/**
 * 订单类型枚举
 * @author zhuzd
 *
 */
public enum IndentType {

	normal("正常交易",1),ticket("兑换券",2);
	
	private String name;
    private int dbData;
    
    
    private IndentType(String name,int dbData) {
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
        for (IndentType c : IndentType.values()) {
            if (c.getName().equals(name)) {
                return c.dbData;
            }
        }
        return 0;
    }

	public static String getTextByDbData(Integer status) {
		String result = "";
		if(status != null){
			for (IndentType c : IndentType.values()) {
	            if (c.getDbData() == status) {
	                return c.name();
	            }
	        }
		}
		return result;
	}

	public static String getDbDataByName(Integer status) {
		for (IndentType c : IndentType.values()) {
			if (c.getDbData() == status) {
				return c.name;
			}
		}
		return "";
	}
	
	public static IndentType getStatusByDbData(Integer status) {
		if(status != null){
			for (IndentType c : IndentType.values()) {
	            if (c.getDbData() == status) {
	                return c;
	            }
	        }
		}
		return null;
	}
}
