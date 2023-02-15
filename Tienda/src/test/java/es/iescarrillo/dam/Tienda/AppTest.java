package es.iescarrillo.dam.Tienda;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iescarrillo.dam.Tienda.Product;
import es.iescarrillo.dam.Tienda.ProductNotFoundException;
import es.iescarrillo.dam.Tienda.ShoppingCart;

class AppTest {
	
	private ShoppingCart cart;
	private Product product1;
	private Product product2;
	
	@BeforeEach
	void setUp() {
		cart = new ShoppingCart();
		product1 = new Product("Product 1", 10.00);
		product2 = new Product("Product 2", 20.00);
		 cart = new ShoppingCart();
	}
	
	@Test
	void testGetBalance() {
		assertEquals(0.00, cart.getBalance(), 0.001);
		
		cart.addItem(product1);
		assertEquals(10.00, cart.getBalance(), 0.001);
		
		cart.addItem(product2);
		assertEquals(30.00, cart.getBalance(), 0.001);
	}
	
	@Test
	void testAddItem() {
		assertEquals(0, cart.getItemCount());
		
		cart.addItem(product1);
		assertEquals(1, cart.getItemCount());
		
		cart.addItem(product2);
		assertEquals(2, cart.getItemCount());
	}
	
	@Test
	void testRemoveItem() throws ProductNotFoundException {
		assertEquals(0, cart.getItemCount());
		
		cart.addItem(product1);
		cart.addItem(product2);
		
		assertThrows(ProductNotFoundException.class, () -> {
			cart.removeItem(new Product("Product 3", 30.00));
		});
		assertEquals(2, cart.getItemCount());
		
		assertThrows(ProductNotFoundException.class, () -> {
			cart.removeItem(product1);
			cart.removeItem(product1);
		});
		assertEquals(1, cart.getItemCount());
		
		cart.removeItem(product2);
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	void testEmpty() {
		assertEquals(0, cart.getItemCount());
		
		cart.addItem(product1);
		cart.addItem(product2);
		assertEquals(2, cart.getItemCount());
		
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}
	
	 @Test
	    public void testEmptyCartHasZeroItems() {
	        assertThat(cart.getItemCount(), is(0));
	    }
	    
	    @Test
	    public void testEmptyCartHasZeroBalance() {
	        assertThat(cart.getBalance(), is(0.00));
	    }
	    
	    @Test
	    public void testAddItemIncreasesItemCount() {
	        cart.addItem(product1);
	        assertThat(cart.getItemCount(), is(1));
	    }
	    
	    @Test
	    public void testAddItemIncreasesBalance() {
	        cart.addItem(product1);
	        assertThat(cart.getBalance(), is(closeTo(10.00, 0.001)));
	    }
	    
	    @Test
	    public void testRemoveItemDecreasesItemCount() throws ProductNotFoundException {
	        cart.addItem(product1);
	        cart.removeItem(product1);
	        assertThat(cart.getItemCount(), is(0));
	    }
	    
	    @Test
	    public void testRemoveItemDecreasesBalance() throws ProductNotFoundException {
	        cart.addItem(product1);
	        cart.removeItem(product1);
	        assertThat(cart.getBalance(), is(closeTo(0.00, 0.001)));
	    }
	    
	    @Test
	    public void testRemoveNonexistentItemThrowsException() {
	        try {
	            cart.removeItem(product1);
	        } catch (ProductNotFoundException e) {
	            assertThat(e, instanceOf(ProductNotFoundException.class));
	            return;
	        }
	        fail("La excepción ProductNotFoundException esperada no fue lanzada");
	    }
}
