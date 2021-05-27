# default ErrorAttributes 변경하기

spring boot 에서 error 발생했을 때, Response  content 내용이 아래와 같다. 
```
{
  "timestamp": "2021-05-27T02:11:16.764+0000",
  "status": 500,
  "error": "Internal Server Error",
  "message": "/ by zero",
  "path": "/hello"
}
```
위 내용을 수정하고 싶을 때, 방법이다. 

아래와 같은 클래스를 생성한다. 
```
@Component
public class CustomErrorAttribute extends DefaultErrorAttributes{
    
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);


        // insert 교체하고 싶은 대상 추가
        // errorAttributes.put("message", "err");

        return errorAttributes;
    }
}
```

