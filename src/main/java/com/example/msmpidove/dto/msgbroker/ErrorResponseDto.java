package com.example.msmpidove.dto.msgbroker;

public class ErrorResponseDto {

    private final boolean success;

    private final String message;

    private final String cause;

    public ErrorResponseDto(Exception ex) {
        this.success = false;
        this.message = ex.getMessage();
        this.cause = ex.getCause().getMessage();
    }

    public boolean getSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public String getCause() {
        return this.cause;
    }

}
