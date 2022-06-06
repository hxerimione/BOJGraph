package BOJGraph.core.grade;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(value = "TestCollection")
@Getter
@Setter
public class UserEntity {
    @Id
    private ObjectId id;

    private String name;
    private Long[] level;
    private Long[] exp;

    @Builder
    public UserEntity(String name, Long[] level, Long[] exp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
    }


}
