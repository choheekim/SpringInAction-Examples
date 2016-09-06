package com.chohee.service;

import com.chohee.model.Circle;
import com.chohee.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Chohee on 8/29/16.
 */

@Component
public class ShapeService {

    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    @Autowired
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    @Autowired
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
