package com.example.microcam.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("microcam")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MicroCam {

    @Id
    private String id;

    private String microCamText;
}
