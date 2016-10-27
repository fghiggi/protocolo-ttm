package com.feevale.protocolo;

import java.util.Map;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;

/**
 * Created by slave00 on 26/10/16.
 */
public enum MensagemCliente {
    LISTA ("/lista"),
    MENSAGEM ("/mensagem"),
    PRIVADO ("/privado"),
    SAIR ("/sair"),
    INVALIDA;

    public final String mensagem;

    MensagemCliente(final String msg) {
        mensagem = msg;
    }

    MensagemCliente() {
        mensagem = "";
    }

    private final static Map<String, MensagemCliente> map =
            stream(MensagemCliente.values()).collect(toMap(msg -> msg.mensagem, msg -> msg));

    public static MensagemCliente obterTipoMensagem(String msg) {
        return map.get(msg);
    }
}