package com.redis.common.utils.status;

public interface ResponseStatus {
    int getCode();
    int getStatus();
    String getMessage();
}