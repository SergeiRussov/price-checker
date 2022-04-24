package ru.apostasyx.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Table
@Entity(name = "request")
@NoArgsConstructor
public class Request {

    @Id
    private UUID id;
    private BigDecimal price;
    private OffsetDateTime requestDate;
}
