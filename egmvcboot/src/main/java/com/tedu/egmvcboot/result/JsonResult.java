package com.tedu.egmvcboot.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {
    private Integer statusCode;
    private String message;
    private Object data;
    public JsonResult(Status status){
        this.statusCode=status.getStatusCode();
        this.message=status.getMessage();
    }
    public JsonResult(Status status,Object data) {
        this(status);
        this.data = data;
    }
    public static JsonResult success(){
        return success(null);
    }
    public static JsonResult success(Object data){
        return new JsonResult(Status.OPERATION_SUCCESS,data);
    }
}
