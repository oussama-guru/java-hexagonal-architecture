package guru.oussama.blog.hexarchi.infra.adapters;

import guru.oussama.blog.hexarchi.domain.entities.PhoneBook;
import guru.oussama.blog.hexarchi.domain.port.outgoing.SavePhoneBookPort;
import guru.oussama.blog.hexarchi.infra.respository.PhoneBookRepository;

public class SavePhoneBookAdapter implements SavePhoneBookPort {

    private PhoneBookRepository phoneBookRepository;

    public SavePhoneBookAdapter(PhoneBookRepository phoneBookRepository) {
        this.phoneBookRepository = phoneBookRepository;
    }

    @Override
    public void save(PhoneBook phoneBook) {
        phoneBookRepository.save(phoneBook);
    }
}