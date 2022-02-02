package com.dioti.pussypointer.repos;

import com.dioti.pussypointer.models.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ImagesRepository extends MongoRepository<Image, String> {

    //List<Image> getImageByXEqualsAndYEquals();

    List<Image> findAll();
}
