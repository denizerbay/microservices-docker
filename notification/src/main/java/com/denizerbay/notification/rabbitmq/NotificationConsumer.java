package com.denizerbay.notification.rabbitmq;

import com.denizerbay.clients.notification.NotificationRequest;
import com.denizerbay.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationService notificanService;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public  void consumer(NotificationRequest notificationRequest){
        log.info("Consumed {} from queue", notificationRequest);
        notificanService.send(notificationRequest);
    }

}
