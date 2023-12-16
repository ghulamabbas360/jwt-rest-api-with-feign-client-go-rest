package com.abbas.restusersoathtest.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ThirdPartyApiNotAvailbleException extends Exception{


    public ThirdPartyApiNotAvailbleException(String message) {
        super(message);
    }


}
