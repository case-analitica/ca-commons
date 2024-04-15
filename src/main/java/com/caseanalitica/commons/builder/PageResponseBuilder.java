package com.caseanalitica.commons.builder;

import com.caseanalitica.commons.PaginationData;

public class PageResponseBuilder {
    private Long totalRecords;
    private int totalPages;
    private int pageIndex;
    private int pageSize;

    public PageResponseBuilder totalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    public PageResponseBuilder totalPages(int totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public PageResponseBuilder pageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public PageResponseBuilder pageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public PaginationData build() {
        return new PaginationData(totalRecords, totalPages, pageIndex, pageSize);
    }
}