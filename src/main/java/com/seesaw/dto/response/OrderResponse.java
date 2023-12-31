package com.seesaw.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Double total_amount;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdAt;
}
