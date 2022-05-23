package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

    private MessageService messageService = new MessageService() {
        @Override
        public String send(String message, String receiver) {
            return null;
        }
    };

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}