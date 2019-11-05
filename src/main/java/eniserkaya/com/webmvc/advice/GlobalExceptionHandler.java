package eniserkaya.com.webmvc.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class})
    public ResponseEntity handleIllegalArgumentException(RuntimeException ex, WebRequest webRequest){
        return handleExceptionInternal(ex,"Yollanan istekte problem bulunmaktadır.", null, HttpStatus.BAD_REQUEST,webRequest);
    }

}
