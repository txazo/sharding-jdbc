package org.txazo.shardingjdbc.sample.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("user")
public class User implements Serializable {

    private static final long serialVersionUID = -1538868438388099911L;

    private Integer id;

    private String nickname;

    private String gender;

    private Integer age;

}
