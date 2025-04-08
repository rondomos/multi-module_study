package com.redis.common.utils.exception;


import com.redis.common.utils.status.ResponseStatus;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final ResponseStatus exceptionStatus;


    public BaseException(ResponseStatus exceptionStatus) {
        super(exceptionStatus.getMessage());
        this.exceptionStatus = exceptionStatus;
    }

    public BaseException(String exceptionMessage, ResponseStatus exceptionStatus) {
        super(exceptionMessage);
        this.exceptionStatus = exceptionStatus;
    }
}
