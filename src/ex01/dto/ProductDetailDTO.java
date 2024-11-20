package ex01.dto;

import lombok.Data;
import ex01.model.ProductOption;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDetailDTO {

    private int productId;
    private String productName;

    private List<ProductOptionDTO> options = new ArrayList<>();

    public ProductDetailDTO(List<ProductOption> options) {

        // 0번째 인덱스가 없다면 NullPoingException 예외가 발생할 수 있기 때문에
        // 예외 처리를 해야 하나, 해당 과정에서는 생략하였음
        this.productId = options.get(0).getId();
        this.productName = options.get(0).getProduct().getName();

        for (ProductOption option : options) {
            this.options.add(new ProductOptionDTO(option));
        }
    }

    @Data
    class ProductOptionDTO {
        private int id;
        private String name;
        private int price;
        private int qty;

        public ProductOptionDTO(ProductOption option) {
            this.id = option.getId();
            this.name = option.getName();
            this.price = option.getPrice();
            this.qty = option.getQty();
        }
    }
}
