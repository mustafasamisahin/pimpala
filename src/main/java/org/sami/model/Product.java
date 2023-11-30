package org.sami.model;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

  @Serial
  private static final long serialVersionUID = 8341428056599472307L;

  private String name;

  private Integer price;
}
