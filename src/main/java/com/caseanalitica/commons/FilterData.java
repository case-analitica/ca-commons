package com.caseanalitica.commons;

import java.util.Objects;

public class FilterData {

    private String filterName;
    private String filterValue;
    private Integer pageIndex;
    private String sort;
    private String direction;
    private Integer pageSize;

    public FilterData() {
    }

    public FilterData(String filterName, String filterValue, Integer pageIndex, String sort, String direction, Integer pageSize) {
        this.filterName = filterName;
        this.filterValue = filterValue;
        this.pageIndex = pageIndex;
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

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
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
        FilterData that = (FilterData) o;
        return Objects.equals(filterName, that.filterName) && Objects.equals(filterValue, that.filterValue) && Objects.equals(pageIndex, that.pageIndex) && Objects.equals(sort, that.sort) && Objects.equals(direction, that.direction) && Objects.equals(pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterName, filterValue, pageIndex, sort, direction, pageSize);
    }

    @Override
    public String toString() {
        return "PageInformationRequest{" +
                "filterName='" + filterName + '\'' +
                ", filterValue='" + filterValue + '\'' +
                ", page=" + pageIndex +
                ", sort='" + sort + '\'' +
                ", direction='" + direction + '\'' +
                ", pageSize=" + pageSize +
                '}';
    }
}
