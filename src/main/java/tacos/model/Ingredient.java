package tacos.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Data
@Table
public class Ingredient implements Persistable<String>, Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    private final String id;

    private final String name;
    private final Type type;

    @Override
    public boolean isNew() {
        return true;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
