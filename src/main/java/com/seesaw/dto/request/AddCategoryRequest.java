package com.seesaw.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryRequest {
    private String id;
    @NotEmpty(message = "Category is required")
    private String name;
    private String description;
    private MultipartFile image;
}
