package com.vip.saturn.job.console.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by kfchu on 08/05/2017.
 */
public class SaturnJobConsoleHttpException extends SaturnJobConsoleException {

    private int statusCode = 400;

    public SaturnJobConsoleHttpException(int statusCode, String message){
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
