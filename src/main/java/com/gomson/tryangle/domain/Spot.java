package com.gomson.tryangle.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Spot {

    private long id;
    private String name;
    private double lat;
    private double lon;
    private List<String> imageUrlList;

}
