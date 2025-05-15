package com.example.act2.Model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "coches")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Coches implements Serializable {
	@Id
    private String id;
    private String matricula;
    private String marca;
    private String model;
    private Float preu;

}

