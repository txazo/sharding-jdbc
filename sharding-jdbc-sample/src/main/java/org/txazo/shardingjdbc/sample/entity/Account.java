package org.txazo.shardingjdbc.sample.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("account")
public class Account implements Serializable {

    private static final long serialVersionUID = -1538868438388099911L;

    private Integer id;

    private String username;

    private String password;

}
