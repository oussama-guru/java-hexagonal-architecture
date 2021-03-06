package guru.oussama.blog.hexarchi.domain.usecase;

import guru.oussama.blog.hexarchi.domain.entities.PhoneBook;
import guru.oussama.blog.hexarchi.domain.port.ingoing.AddPhoneNumberPort;
import guru.oussama.blog.hexarchi.domain.port.outgoing.LoadPhoneBookPort;
import guru.oussama.blog.hexarchi.domain.port.outgoing.SavePhoneBookPort;

import java.util.ArrayList;

public class PhoneBookAddService implements AddPhoneNumberPort {

    private LoadPhoneBookPort loadPhoneBookPort;
    private SavePhoneBookPort savePhoneBookPort;

    public PhoneBookAddService(LoadPhoneBookPort loadPhoneBookPort, SavePhoneBookPort savePhoneBookPort) {
        this.loadPhoneBookPort = loadPhoneBookPort;
        this.savePhoneBookPort = savePhoneBookPort;
    }

    @Override
    public void add(Long id, String number) {
        PhoneBook phoneBook = loadPhoneBookPort.load(id).orElse(new PhoneBook(id, new ArrayList<>()));

        phoneBook.addNumber(number);

        savePhoneBookPort.save(phoneBook);
    }
}
