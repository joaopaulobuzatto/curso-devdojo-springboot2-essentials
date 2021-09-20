package academy.devdojo.springboot2.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidationDetails {
    private final String field;
    private final String message;
}
