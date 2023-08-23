package com.zb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag implements Serializable {
    private  static final long serialVersionUID=1L;

    private Integer id;
    private String name;
    private String type;
    @JsonProperty("createDate")
    private Date createdate;
}
