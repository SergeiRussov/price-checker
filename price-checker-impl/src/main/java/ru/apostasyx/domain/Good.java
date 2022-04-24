package ru.apostasyx.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Table
@Entity(name = "good")
@NoArgsConstructor
public class Good {

    @Id
    private UUID id;
    private String name;
    private String url;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "good_id")
    private List<Request> request;
}
