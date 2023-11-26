package com.caseanalitica.commons;

import java.util.Objects;

public class PageInformationRequest {

    private String filterName;
    private String filterValue;
    private Integer page;
    private String sort;
    private String direction;
    private Integer pageSize;

    public PageInformationRequest() {}

    public PageInformationRequest(String filterName, String filterValue, Integer page, String sort, String direction, Integer pageSize) {
        this.filterName = filterName;
        this.filterValue = filterValue;
        this.page = page;
        this.sort = sort;
        this.direction = direction;
        this.pageSize = pageSize;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageInformationRequest that = (PageInformationRequest) o;
        return Objects.equals(filterName, that.filterName) && Objects.equals(filterValue, that.filterValue) && Objects.equals(page, that.page) && Objects.equals(sort, that.sort) && Objects.equals(direction, that.direction) && Objects.equals(pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterName, filterValue, page, sort, direction, pageSize);
    }

    @Override
    public String toString() {
        return "PageInformationRequest{" +
                "filterName='" + filterName + '\'' +
                ", filterValue='" + filterValue + '\'' +
                ", page=" + page +
                ", sort='" + sort + '\'' +
                ", direction='" + direction + '\'' +
                ", pageSize=" + pageSize +
                '}';
    }
}
