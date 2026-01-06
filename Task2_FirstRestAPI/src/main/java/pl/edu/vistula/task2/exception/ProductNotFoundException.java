package pl.edu.vistula.task2.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product not found. id=" + id);
    }
}
