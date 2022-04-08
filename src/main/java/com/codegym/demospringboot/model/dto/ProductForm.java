package com.codegym.demospringboot.model.dto;

import com.codegym.demospringboot.model.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductForm {
    private Long id;

    @NotEmpty(message = "Không được phép để trống")
    @Size(min = 5, max = 20, message = "Tên sản phẩm phải từ 5 -> 20 ký tự")
    private String name;

    @NotNull
    private double price;

    @NotBlank
    private String description;

    private MultipartFile image;

    private Category category;
}
