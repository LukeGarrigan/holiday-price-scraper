package com.daledev.holidaypricescrapper.service;

import com.daledev.holidaypricescrapper.domain.PriceHistory;

/**
 * @author dale.ellis
 * @since 27/01/2019
 */
public interface MailService {

    /**
     *
     * @param priceHistory
     */
    void sendPriceDropMail(PriceHistory priceHistory);

    /**
     *
     * @param priceHistory
     */
    void sendPriceIncreaseMail(PriceHistory priceHistory);
}
