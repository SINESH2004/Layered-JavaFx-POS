package dao.custom;

import dto.ProductsDto;

import java.sql.SQLException;
import java.util.List;

public interface ProductsDao {
    boolean productSaveBtn(ProductsDto dto) throws SQLException, ClassNotFoundException;
    boolean productUpdateBtn(ProductsDto  dto) throws SQLException, ClassNotFoundException;
    boolean deleteProduct(String id) throws SQLException, ClassNotFoundException;
    List<ProductsDto> allProducts() throws SQLException, ClassNotFoundException;
    ProductsDto getProductByCode(String code) throws SQLException, ClassNotFoundException;
}