package com.microservice.message.dto;

/**
 * @param accountNumber
 * @param name
 * @param email
 * @param mobileNumber
 */
public record AccountMsgDTO(Long accountNumber, String name, String email, String mobileNumber) {
}
