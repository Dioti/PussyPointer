package com.dioti.pussypointer.dto;

import java.util.List;

public class APIResponse {
    private List<?> images;
    private Integer status_code;

    public APIResponse(List<?> images, Integer status_code) {
        this.images = images;
        this.status_code = status_code;
    }

    public List<?> getImages() {
        return images;
    }

    public void setImages(List<?> images) {
        this.images = images;
    }

    public Integer getStatus_code() {
        return status_code;
    }

    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }
}
