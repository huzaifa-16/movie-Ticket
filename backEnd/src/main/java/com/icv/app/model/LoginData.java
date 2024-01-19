package com.icv.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

//@JsonTypeName("LoginData")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LoginData implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("UserName")
    private String UserName;

    @JsonProperty("passWord")
    private String passWord;




}
