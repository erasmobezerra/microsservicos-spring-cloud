package digitalinnovation.one.experts.shoppingcart.controller;

import digitalinnovation.one.experts.shoppingcart.model.Cart;
import digitalinnovation.one.experts.shoppingcart.model.Item;
import digitalinnovation.one.experts.shoppingcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
       return cartService.save(id, item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cart> findById(@PathVariable("id") Integer id) {
        return cartService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Cart> clear(@PathVariable("id") Integer id) throws Exception {
        return cartService.deleteById(id);
    }

}
