package com.data.data.hmly.service.base;


import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @description 解决Date类型返回json格式为自定义格式 
 * @author aokunsang 
 * @date 2013-5-28 
 */  
public class CustomObjectMapper extends ObjectMapper {
  
    /*public CustomObjectMapper(){  
        CustomSerializerFactory factory = new CustomSerializerFactory();  
        factory.addGenericMapping(Date.class, new JsonSerializer<Date>(){  
            @Override  
            public void serialize(Date value,   
                    JsonGenerator jsonGenerator,   
                    SerializerProvider provider)  
                    throws IOException, JsonProcessingException {  
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                jsonGenerator.writeString(sdf.format(value));  
            }  
        });  
        this.setSerializerFactory(factory);  
    }  */
}  