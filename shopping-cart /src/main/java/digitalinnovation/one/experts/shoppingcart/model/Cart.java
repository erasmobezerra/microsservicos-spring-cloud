package digitalinnovation.one.experts.shoppingcart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;
@RedisHash("cart")
public class Cart {

    @Getter @Setter
    @Id
    private Integer id;

    public Cart(Integer id) {
        this.id = id;
    }

    @Setter
    private List<Item> items;

    //Se o item for nulo, crie um lista vazia
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

}
