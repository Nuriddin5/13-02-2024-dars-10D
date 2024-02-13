package org.nuriddin;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * User:t.me/supermatematikuz
 * Date:13.02.2024 17:09
 */
public class TestBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "@abrortelegram_bot";
    }

    @Override
    public String getBotToken() {
        return "6907046896:AAE3JBlHyHRk9EFbgUW0316QbrzAbg6v1Lc";
    }

}
