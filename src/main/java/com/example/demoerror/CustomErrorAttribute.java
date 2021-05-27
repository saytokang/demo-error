package com.example.demoerror;

import java.util.Map;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

@Component
public class CustomErrorAttribute extends DefaultErrorAttributes{
    
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);


        // insert a new key
        errorAttributes.put("version", "1.2");
        errorAttributes.put("message", "err");
        errorAttributes.put("path", "");

        return errorAttributes;
    }
}
