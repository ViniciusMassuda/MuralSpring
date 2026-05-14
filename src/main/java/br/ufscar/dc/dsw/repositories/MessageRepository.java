package br.ufscar.dc.dsw.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class MessageRepository {

    private Logger logger = LoggerFactory.getLogger(MessageRepository.class);

    private final IMessageDAO messageDAO;

    public MessageRepository(IMessageDAO messageDAO) {
        this.messageDAO = messageDAO;
        logger.info("MessageRepository instantiated");
    }

    public void save(Message message) {
        message.setTimestamp((new Date()).toString());
        var saved = messageDAO.save(message);
        logger.info("saving message: {}", saved);
    }

    public List<Message> getMessages() {
        return messageDAO.findAllOrderedByIdDesc();
    }
}