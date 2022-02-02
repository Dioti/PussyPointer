package com.dioti.pussypointer.repos;

import com.dioti.pussypointer.models.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagesRepository extends MongoRepository<Image, String> {

    List<Image> getImageByXEqualsAndYEquals(Integer X, Integer Y);

    List<Image> findAll();
}
