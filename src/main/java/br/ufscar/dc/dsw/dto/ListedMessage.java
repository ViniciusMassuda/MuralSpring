package br.ufscar.dc.dsw.dto;

public record ListedMessage(
        String from,
        String to,
        String message,
        String timestamp
) {}