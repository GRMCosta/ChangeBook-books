package com.projeto.changebookbooks.integration.user.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projeto.changebookbooks.config.Messages;
import lombok.*;
import org.dom4j.tree.AbstractEntity;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class UserResponse {

    @JsonProperty("user_name")
    @NotBlank(message = Messages.NAME_IS_REQUIRED)
    private String userName;

    @CPF(message = Messages.CPF_IS_INVALID)
    @NotBlank(message = Messages.CPF_IS_REQUIRED)
    private String cpf;

    @NotBlank(message = Messages.CITY_IS_REQUIRED)
    private String city;

    @Id
    @Email
    @NotBlank(message = Messages.EMAIL_IS_REQUIRED)
    private String email;

    @NotBlank(message = Messages.PHONE_IS_REQUIRED)
    private String phone;
}
