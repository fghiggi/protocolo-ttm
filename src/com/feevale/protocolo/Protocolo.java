package com.feevale.protocolo;

/**
 * Created by slave00 on 26/10/16.
 */
public class Protocolo {
    public static MensagemCliente parseMensagemClient(String mensagem){
        String comando = mensagem.split(" ")[0];

        MensagemCliente msg = MensagemCliente.obterTipoMensagem(comando);

        return msg == null? MensagemCliente.INVALIDA : msg;
    }

    public static MensagemServer parseMensagemServer(String mensagem){
        String comando = mensagem.split(" ")[0];

        MensagemServer msg = MensagemServer.obterMensagemServer(comando);

        return msg == null? MensagemServer.INVALIDA : msg;
    }
}
