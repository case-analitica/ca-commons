package com.caseanalitica.commons;

public class PageResponse {

    private final Long totalRecords;
    private final int totalPages;
    private final int pageIndex;
    private final int pageSize;
    private final int code;
    private final String status;
    private final String message;

    public PageResponse(Long totalRecords, int totalPages, int pageIndex, int pageSize, int code, String status, String message) {
        this.totalRecords = totalRecords;
        this.totalPages = totalPages;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
