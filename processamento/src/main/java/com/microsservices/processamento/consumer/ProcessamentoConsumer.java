package com.microsservices.processamento.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.microsservices.processamento.model.dto.PedidoDTO;

@Component
public class ProcessamentoConsumer {

	@RabbitListener(queues = "${broker.queue.procesamento.name}")
	public void listenerProcessamentoQueue(PedidoDTO pedidoDTO) {
		System.out.println(pedidoDTO.getDescricao());
	}
}
