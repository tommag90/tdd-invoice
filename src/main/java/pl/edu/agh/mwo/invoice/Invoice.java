package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {


	private Collection<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		//this.products.add(product);
		this.addProduct(product, 1);
	}

	public void addProduct(Product product, Integer quantity) {
		for (int i = 0; i < quantity; i++) {
			this.products.add(product);
		}
	}

	public BigDecimal getTotalNetPrice() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : this.products) {
			sum = sum.add(product.getPrice());
		}
		return sum;
	}

	public BigDecimal getTax() {
		if (products.size() == 0) {
			return BigDecimal.ZERO;
		}
		else {
			return null;
		}
	}

	public BigDecimal getTotalGrossPrice() {
		if (products.size() == 0) {
			return BigDecimal.ZERO;
		}
		else {
			return null;
		}
	}
}
