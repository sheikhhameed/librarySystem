package org.example.util;

import org.example.dto.ResponseData;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CommonResponseUtils {


    public static ResponseData responseObj(String respCode, Integer respId, String msg){

        ResponseData responseObj = new ResponseData();
        responseObj.setRespCode(respCode);
        responseObj.setRespMessage(msg);
        responseObj.setRespId(respId);
        responseObj.setLocalDateTime(LocalDateTime.now());

        return responseObj;
    }
}
