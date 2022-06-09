package com.example.msmpidove.dto.msgbroker;

public class SuccessResponseDto {

    private final boolean success;
    private final Object content;

    public SuccessResponseDto(Object content) {
        this.success = true;
        this.content = content;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public Object getContent() {
        return this.content;
    }

}