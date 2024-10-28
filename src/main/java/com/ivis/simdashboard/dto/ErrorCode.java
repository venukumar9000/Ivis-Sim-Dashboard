package com.ivis.simdashboard.dto;

public enum ErrorCode {
    RESOURCE_NOT_FOUND("E001", "Resource not found"),
    INVALID_INPUT("E002", "Invalid input provided"),
    INTERNAL_SERVER_ERROR("E500", "Internal server error");

    private final String code;
    private final String description;

    ErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
