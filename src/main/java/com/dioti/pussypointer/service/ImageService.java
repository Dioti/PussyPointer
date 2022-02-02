package com.dioti.pussypointer.service;

import com.dioti.pussypointer.dto.APIMessageResponse;
import com.dioti.pussypointer.dto.APIResponse;
import com.dioti.pussypointer.models.Image;
import com.dioti.pussypointer.repos.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    private ImagesRepository imagesRepository;

    @Autowired
    public ImageService(ImagesRepository imagesRepository) {
        this.imagesRepository = imagesRepository;
    }

    public ResponseEntity<?> getImageWhereXAndYEquals(Integer x, Integer y) {
        try {
            List<Image> images = imagesRepository.getImageByXEqualsAndYEquals(x,y);
            if (images.isEmpty()) {
                return new ResponseEntity<>(new APIResponse(images, 200), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(new APIResponse(images, 200), HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new APIMessageResponse("Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
