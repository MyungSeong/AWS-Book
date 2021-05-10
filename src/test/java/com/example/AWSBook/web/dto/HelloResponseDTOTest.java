package com.example.AWSBook.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloResponseDTOTest {

    @Test
    public void lombokTest() throws Exception {
        String name = "Test";
        int amount = 1000;

        HelloResponseDTO dto = new HelloResponseDTO(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}