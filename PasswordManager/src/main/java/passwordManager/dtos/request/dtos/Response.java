package passwordManager.dtos.request.dtos;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Response {
    private String password;
}
