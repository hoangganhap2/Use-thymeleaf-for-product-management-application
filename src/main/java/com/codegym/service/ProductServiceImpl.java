package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Rau Muong",9000,"Rau sạch sẽ không thuốc","Vũ Đại village"));
        products.put(2, new Product(2,"Rau Cần",20000,"Cần nước chứ không phải cần hút","Vũ Đại village"));
        products.put(3, new Product(3,"Rau Mồng Tơi",10000,"Đảm bảo rớt ","Vũ Đại village"));
        products.put(4, new Product(4,"Rau Rền Đỏ",12000,"Đỏ như phụ nữ đến tháng","Vũ Đại village"));
        products.put(5, new Product(5,"Rau Rền Xanh",9500,"Xanh như da bạn khi bọ vợ chửi","Vũ Đại village"));
        products.put(6, new Product(6,"Rau Đắng",25000,"Đắng vãi cứt","Vũ Đại village"));
        products.put(7, new Product(7,"Xà Lách",11000,"Ăn lẩu ngon lắm","Vũ Đại village"));
        products.put(8, new Product(8,"Rau Răm",10000,"Nên ăn kèm với trứng lộn","Vũ Đại village"));
        products.put(9, new Product(9,"Rau Ngót",18000,"Ngót hết chỉ còn nước","Vũ Đại village"));
        products.put(10, new Product(10,"Khoai tây",12000,"Tây hơn khoai ta","Vũ Đại village"));
        products.put(11, new Product(11,"Cà rốt",11000,"Cà ngu","Vũ Đại village"));
        products.put(12, new Product(12,"Bông cải",32000,"Xù như tóc","Vũ Đại village"));
        products.put(13, new Product(13,"Cà chua ",12000,"Chua hơn chanh","Vũ Đại village"));
        products.put(14, new Product(14,"Bí đỏ",9000,"Bí không xanh","Vũ Đại village"));
        products.put(15, new Product(15,"Dưa leo",14500,":) Vloger phản động","Vũ Đại village"));
        products.put(16, new Product(16,"Khoai lang",21000,"Khoai làm thầy thuốc","Vũ Đại village"));
        products.put(17, new Product(17,"Nấm rơm",80000,"Nấm chí phèo","Vũ Đại village"));
        products.put(18, new Product(18,"Mướp hương",11500,"Xệ như ....","Vũ Đại village"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
