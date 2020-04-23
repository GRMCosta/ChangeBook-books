package com.projeto.changebookbooks.domain;

import lombok.*;
import org.dom4j.tree.AbstractEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Book extends AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String authorName;

    @NotBlank
    private String editorName;

    @NotBlank
    private String description;

    @NotNull
    private boolean isForTrade;

    @NotBlank
    private String tradeDescription;

    @NotNull
    private boolean isForSell;

    @NotBlank
    private String userId;
}
