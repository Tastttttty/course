package com.course.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Boolean success;
    private String errorMsg;
    private Object data;
    private Long total;

    public static com.course.dto.Result ok(){
        return new com.course.dto.Result(true, null, null, null);
    }
    public static com.course.dto.Result ok(Object data){
        return new com.course.dto.Result(true, null, data, null);
    }
    public static com.course.dto.Result ok(List<?> data, Long total){
        return new com.course.dto.Result(true, null, data, total);
    }
    public static com.course.dto.Result fail(String errorMsg){
        return new com.course.dto.Result(false, errorMsg, null, null);
    }
}
