package com.lyzd.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
