package digitalinnovation.one.experts.shoppingcart.service;

import digitalinnovation.one.experts.shoppingcart.model.Cart;
import digitalinnovation.one.experts.shoppingcart.model.Item;
import digitalinnovation.one.experts.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public ResponseEntity<Cart> findById(Integer id) {
        Optional<Cart> optional = cartRepository.findById(id);
        return optional.map(cart -> ResponseEntity.ok().body(cart))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    public Cart save(Integer id, Item item) {
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart(id);
        }
        else {
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }


    public ResponseEntity<Cart> deleteById(Integer id) throws Exception {
        try {
            cartRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().build();

    }


}
