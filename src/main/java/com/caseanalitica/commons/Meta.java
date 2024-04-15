package com.caseanalitica.commons;

import java.util.Objects;

public class Meta {

    private Integer pageIndex;
    private Integer pageSize;
    private Integer totalPages;
    private Long totalRecords;

    public Meta() {
    }

    public Meta(Integer pageIndex, Integer pageSize, Integer totalPages, Long totalRecords) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalRecords = totalRecords;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meta meta = (Meta) o;
        return Objects.equals(pageIndex, meta.pageIndex) && Objects.equals(pageSize, meta.pageSize) && Objects.equals(totalPages, meta.totalPages) && Objects.equals(totalRecords, meta.totalRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageIndex, pageSize, totalPages, totalRecords);
    }

    @Override
    public String toString() {
        return "Meta{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                ", totalRecords=" + totalRecords +
                '}';
    }
}
