package br.ufscar.dc.dsw.dto;

import jakarta.validation.constraints.NotBlank;

public class SendMessageForm {

    @NotBlank(message = "O remetente é obrigatório")
    private String from;

    @NotBlank(message = "O destinatário é obrigatório")
    private String to;

    @NotBlank(message = "A mensagem não pode estar vazia")
    private String message;

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    @Override
    public String toString() {
        return String.format("SendMessageForm[from='%s', to='%s', message='%s']", from, to, message);
    }
}
