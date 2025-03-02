package faang.school.urlshortenerservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "hash")
@NoArgsConstructor
@AllArgsConstructor
public class Hash {

    @Id
    @Column(name = "hash", nullable = false, length = 6)
    private String hash;
}
