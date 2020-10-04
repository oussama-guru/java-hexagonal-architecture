package guru.oussama.blog.hexarchi.domain.port.outgoing;

import guru.oussama.blog.hexarchi.domain.entities.PhoneBook;

public interface SavePhoneBookPort {
    void save(PhoneBook phoneBook);
}
