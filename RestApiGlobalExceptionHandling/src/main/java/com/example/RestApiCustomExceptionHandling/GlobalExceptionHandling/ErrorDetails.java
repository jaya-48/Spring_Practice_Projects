package com.example.RestApiCustomExceptionHandling.GlobalExceptionHandling;

import java.time.LocalDateTime;

public class ErrorDetails {
    private String statuscode;
    private String msg;
    private LocalDateTime dateTime;

    public ErrorDetails(String statuscode, String msg, LocalDateTime dateTime) {
        this.statuscode = statuscode;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "statuscode='" + statuscode + '\'' +
                ", msg='" + msg + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
