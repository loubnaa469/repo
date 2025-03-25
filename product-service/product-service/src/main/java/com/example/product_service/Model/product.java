package com.example.product_service.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(value = "product")
public class product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
