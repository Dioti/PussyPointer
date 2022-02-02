package com.dioti.pussypointer.controller;

import com.dioti.pussypointer.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PussyController {
    private ImageService imageService;

    @Autowired
    PussyController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/")
    public String getImage() {
        return "Testing";
    }

    @GetMapping(value = "/find", params = {"x", "y"})
    public ResponseEntity<?> getImageByCoord(@RequestParam Integer x, @RequestParam Integer y) {
        return imageService.getImageWhereXAndYEquals(x, y);
    }
}
